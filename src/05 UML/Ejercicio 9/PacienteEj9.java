package tp5_uml;

// Clase Paciente (Relación de Asociación Unidireccional con CitaMedicaEj9) - Ejercicio 9
class PacienteEj9 {
    private String nombre;
    private String obraSocial;

    public PacienteEj9(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return "PacienteEj9{" +
                "nombre='" + nombre + '\'' +
                ", obraSocial='" + obraSocial + '\'' +
                '}';
    }
}