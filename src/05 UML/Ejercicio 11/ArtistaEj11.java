package tp5_uml;

// Clase Artista (Relación de Asociación Unidireccional con CancionEj11) - Ejercicio 11
class ArtistaEj11 {
    private String nombre;
    private String genero;

    public ArtistaEj11(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ArtistaEj11{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}