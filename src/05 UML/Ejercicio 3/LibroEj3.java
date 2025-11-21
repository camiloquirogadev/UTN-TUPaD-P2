package tp5_uml;

// Clase LibroEj3
class LibroEj3 {
    private String titulo;
    private String isbn;
    private AutorEj3 autor; // Asociación unidireccional
    private EditorialEj3 editorial; // Agregación

    public LibroEj3(String titulo, String isbn, AutorEj3 autor, EditorialEj3 editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor; // Se almacena una referencia al autor existente
        this.editorial = editorial; // Se almacena una referencia a la editorial existente
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public AutorEj3 getAutor() {
        return autor;
    }

    public void setAutor(AutorEj3 autor) {
        this.autor = autor;
    }

    public EditorialEj3 getEditorial() {
        return editorial;
    }

    public void setEditorial(EditorialEj3 editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "LibroEj3{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor=" + autor +
                ", editorial=" + editorial +
                '}';
    }
}