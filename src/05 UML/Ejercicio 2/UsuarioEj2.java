package tp5_uml;

// Clase Usuario (Relación de Asociación Bidireccional con CelularEj2) - Ejercicio 2
class UsuarioEj2 {
    private String nombre;
    private String dni;
    private CelularEj2 celular; // Asociación bidireccional

    public UsuarioEj2(String nombre, String dni) {
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

    public CelularEj2 getCelular() {
        return celular;
    }

    public void setCelular(CelularEj2 celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "UsuarioEj2{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", celular=" + (celular != null ? celular.getModelo() : "null") +
                '}';
    }
}