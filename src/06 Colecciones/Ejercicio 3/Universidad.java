// Universidad.java
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Métodos para Profesores
    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }

    // Métodos para Cursos
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        }
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    // Método para asignar un profesor a un curso
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor); // Este método maneja la bidireccionalidad
            System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre() + ".");
            return true;
        } else {
            System.out.println("Curso o Profesor no encontrado.");
            return false;
        }
    }

    // Listar
    public void listarProfesores() {
        System.out.println("Profesores en " + nombre + ":");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("Cursos en " + nombre + ":");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }

    // Eliminar Curso (debe romper la relación con su profesor si la hubiera)
    public boolean eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        if (cursoAEliminar != null) {
            // Rompe la relación si el curso tenía un profesor
            if (cursoAEliminar.getProfesor() != null) {
                // Al llamar setProfesor(null), el profesor anterior automáticamente
                // se encargará de remover este curso de su lista.
                cursoAEliminar.setProfesor(null);
            }
            cursos.remove(cursoAEliminar);
            System.out.println("Curso con código " + codigo + " eliminado.");
            return true;
        } else {
            System.out.println("Curso con código " + codigo + " no encontrado para eliminar.");
            return false;
        }
    }

    // Eliminar Profesor (antes de remover, dejar profesor=null en los cursos que dictaba)
    public boolean eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        if (profesorAEliminar != null) {
            // Recorremos una copia de la lista para evitar problemas de modificación concurrente
            List<Curso> cursosDelProfesor = new ArrayList<>(profesorAEliminar.getCursos());
            for (Curso curso : cursosDelProfesor) {
                // Al llamar setProfesor(null), el curso automáticamente
                // se encargará de removerse de la lista del profesor.
                curso.setProfesor(null);
            }
            profesores.remove(profesorAEliminar);
            System.out.println("Profesor con ID " + id + " eliminado.");
            return true;
        } else {
            System.out.println("Profesor con ID " + id + " no encontrado para eliminar.");
            return false;
        }
    }

    // Reporte: cantidad de cursos por profesor
    public void reporteCursosPorProfesor() {
        System.out.println("Reporte: Cantidad de Cursos por Profesor en " + nombre + ":");
        for (Profesor profesor : profesores) {
            System.out.println("- " + profesor.getNombre() + ": " + profesor.getCursos().size() + " curso(s)");
        }
    }
}