// Main.java (Ejercicio 3: Universidad, Profesor y Curso)
public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- PARTE 3: Universidad, Profesor y Curso ---");

        // 1. Crear una Universidad
        Universidad universidad = new Universidad("Universidad de Ejemplo");

        // 2. Crear al menos 3 profesores y 5 cursos.
        Profesor prof1 = new Profesor("PR001", "Dr. Ana Gómez", "Matemáticas");
        Profesor prof2 = new Profesor("PR002", "Dra. Lucía Fernández", "Historia");
        Profesor prof3 = new Profesor("PR003", "Ing. Carlos Díaz", "Programación");

        Curso c1 = new Curso("CS101", "Introducción a la Computación");
        Curso c2 = new Curso("CS102", "Programación I");
        Curso c3 = new Curso("CS103", "Matemática Discreta");
        Curso c4 = new Curso("HS101", "Historia del Arte");
        Curso c5 = new Curso("MA101", "Álgebra Lineal");

        // 3. Agregar profesores y cursos a la universidad.
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        // 4. Asignar profesores a cursos usando asignarProfesorACurso(...).
        universidad.asignarProfesorACurso("CS101", "PR003"); // Ing. Carlos Díaz -> Introducción a la Computación
        universidad.asignarProfesorACurso("CS102", "PR003"); // Ing. Carlos Díaz -> Programación I
        universidad.asignarProfesorACurso("MA101", "PR001"); // Dr. Ana Gómez -> Álgebra Lineal
        universidad.asignarProfesorACurso("HS101", "PR002"); // Dra. Lucía Fernández -> Historia del Arte
        universidad.asignarProfesorACurso("CS103", "PR001"); // Dr. Ana Gómez -> Matemática Discreta

        // 5. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n--- Listar Cursos (con Profesor) ---");
        universidad.listarCursos();

        System.out.println("\n--- Listar Profesores (con Cursos) ---");
        universidad.listarProfesores();
        // Mostrar también los cursos desde el lado del profesor
        for (Profesor p : universidad.getProfesores()) {
            p.listarCursos();
        }

        // 6. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\n--- Cambiar Profesor del Curso CS102 (de PR003 a PR001) ---");
        universidad.asignarProfesorACurso("CS102", "PR001"); // Ahora Dr. Ana Gómez -> Programación I

        System.out.println("Cursos de Ing. Carlos Díaz (PR003) después del cambio:");
        prof3.listarCursos(); // Debe mostrar solo CS101
        System.out.println("Cursos de Dr. Ana Gómez (PR001) después del cambio:");
        prof1.listarCursos(); // Debe mostrar MA101, CS103 y CS102

        // 7. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n--- Remover Curso CS101 ---");
        universidad.eliminarCurso("CS101");

        System.out.println("Cursos de Ing. Carlos Díaz (PR003) después de eliminar CS101:");
        prof3.listarCursos(); // Debe mostrar ahora que no tiene cursos

        // 8. Remover un profesor y dejar profesor=null en los cursos que dictaba.
        System.out.println("\n--- Remover Profesor Dr. Ana Gómez (PR001) ---");
        universidad.eliminarProfesor("PR001");

        System.out.println("Info del Curso MA101 después de eliminar al profesor:");
        Curso cursoMA101 = universidad.buscarCursoPorCodigo("MA101");
        if (cursoMA101 != null) {
            cursoMA101.mostrarInfo(); // Profesor debería ser null
        }

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("\n--- Reporte: Cantidad de Cursos por Profesor ---");
        universidad.reporteCursosPorProfesor();
    }
}