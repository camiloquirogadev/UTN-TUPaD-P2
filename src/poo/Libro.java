
package poo;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    // Setter con validación
    public void setAñoPublicacion(int año) {
        int añoActual = java.time.Year.now().getValue();
        if (año > 0 && año <= añoActual) {
            this.añoPublicacion = año;
        } else {
            System.out.println("Año inválido: " + año + ". Debe estar entre 1 y " + añoActual);
        }
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo +
                           " | Autor: " + autor +
                           " | Año: " + añoPublicacion);
    }

    // Salida prueba
    public static void main(String[] args) {
        System.out.println("PRUEBA: Encapsulamiento con Libro");
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        libro.mostrarInfo();
        libro.setAñoPublicacion(-50); // Inválido
        libro.setAñoPublicacion(2025); // Válido si ≤ año actual
        libro.mostrarInfo();
    }
}

