package tp5_uml;

// Clase Usuario (Relación de Asociación Unidireccional con CodigoQREj13) - Ejercicio 13
class UsuarioEj13 {
    private String nombre;
    private String email;

    public UsuarioEj13(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuarioEj13{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}