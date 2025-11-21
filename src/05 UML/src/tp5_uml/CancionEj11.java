package tp5_uml;

// Clase CancionEj11 (Relación de Asociación Unidireccional con ArtistaEj11) - Ejercicio 11
class CancionEj11 {
    private String titulo;
    private ArtistaEj11 artista; // Asociación unidireccional

    public CancionEj11(String titulo, ArtistaEj11 artista) {
        this.titulo = titulo;
        this.artista = artista; // Se almacena una referencia al artista existente
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArtistaEj11 getArtista() {
        return artista;
    }

    public void setArtista(ArtistaEj11 artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "CancionEj11{" +
                "titulo='" + titulo + '\'' +
                ", artista=" + artista +
                '}';
    }
}