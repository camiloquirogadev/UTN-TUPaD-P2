
package poo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido +
                           " | Curso: " + curso +
                           " | Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        if (this.calificacion < 0) this.calificacion = 0;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCurso() { return curso; }
    public double getCalificacion() { return calificacion; }

    // Salida Prueba
    public static void main(String[] args) {
        System.out.println("PRUEBA: Registro de Estudiantes ");
        Estudiante est = new Estudiante("Ana", "Gonzalez", "Matematicas", 7.5);
        est.mostrarInfo();
        est.subirCalificacion(1.0);
        est.bajarCalificacion(0.5);
        est.mostrarInfo();
    }
} 
