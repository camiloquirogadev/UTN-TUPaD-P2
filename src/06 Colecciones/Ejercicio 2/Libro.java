// Libro.java
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Relación con Autor

    // Constructor interno (puede ser package-private o private si solo Biblioteca lo crea)
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    // Setters (excepto para isbn, que debería ser inmutable)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Método para mostrar la información del libro y su autor
    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Año de Publicación: " + anioPublicacion);
        if (autor != null) {
            System.out.println("Autor:");
            autor.mostrarInfo(); // Llama al mostrarInfo del autor
        } else {
            System.out.println("Autor: No asignado");
        }
        System.out.println("--------------------");
    }
}