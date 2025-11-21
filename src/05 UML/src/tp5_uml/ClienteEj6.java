package tp5_uml;

// Clase Cliente (Relación de Asociación Unidireccional con ReservaEj6) - Ejercicio 6
class ClienteEj6 {
    private String nombre;
    private String telefono;

    public ClienteEj6(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ClienteEj6{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}