package tp5_uml;

// Clase Profesional (Relación de Asociación Unidireccional con CitaMedicaEj9) - Ejercicio 9
class ProfesionalEj9 {
    private String nombre;
    private String especialidad;

    public ProfesionalEj9(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "ProfesionalEj9{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}