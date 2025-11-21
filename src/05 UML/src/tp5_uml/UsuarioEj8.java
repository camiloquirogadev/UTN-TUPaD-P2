package tp5_uml;

// Clase Usuario (Relación de Agregación con FirmaDigitalEj8) - Ejercicio 8
class UsuarioEj8 {
    private String nombre;
    private String email;

    public UsuarioEj8(String nombre, String email) {
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
        return "UsuarioEj8{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}