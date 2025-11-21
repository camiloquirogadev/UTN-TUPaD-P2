package tp5_uml;

// Clase Propietario (Relación de Asociación Bidireccional con ComputadoraEj5) - Ejercicio 5
class PropietarioEj5 {
    private String nombre;
    private String dni;
    private ComputadoraEj5 computadora; // Asociación bidireccional

    public PropietarioEj5(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ComputadoraEj5 getComputadora() {
        return computadora;
    }

    public void setComputadora(ComputadoraEj5 computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    @Override
    public String toString() {
        return "PropietarioEj5{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", computadora=" + (computadora != null ? computadora.getNumeroSerie() : "null") +
                '}';
    }
}