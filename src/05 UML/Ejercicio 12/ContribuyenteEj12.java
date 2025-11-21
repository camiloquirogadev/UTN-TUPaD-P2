package tp5_uml;

// Clase Contribuyente (Relación de Asociación Unidireccional con ImpuestoEj12) - Ejercicio 12
class ContribuyenteEj12 {
    private String nombre;
    private String cuil;

    public ContribuyenteEj12(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "ContribuyenteEj12{" +
                "nombre='" + nombre + '\'' +
                ", cuil='" + cuil + '\'' +
                '}';
    }
}