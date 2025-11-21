// Biblioteca.java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set; // Para obtener autores únicos

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro (composición: se crea el libro aquí)
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        if (!libros.contains(nuevoLibro)) {
            libros.add(nuevoLibro);
            System.out.println("Libro agregado: " + titulo + " (" + isbn + ")");
        } else {
            System.out.println("El libro con ISBN " + isbn + " ya existe en la biblioteca.");
        }
    }

    // Método para listar todos los libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca '" + nombre + "' está vacía.");
        } else {
            System.out.println("Listado de Libros en '" + nombre + "':");
            for (Libro libro : libros) { // Uso de for-each
                libro.mostrarInfo();
            }
        }
    }

    // Método para buscar un libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Método para eliminar un libro por ISBN
    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("Libro con ISBN " + isbn + " eliminado de la biblioteca.");
            return true;
        } else {
            System.out.println("Libro con ISBN " + isbn + " no encontrado para eliminar.");
            return false;
        }
    }

    // Método para obtener la cantidad total de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // Método para filtrar libros por año de publicación
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("Libros publicados en " + anio + " en '" + nombre + "':");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros publicados en este año.");
        }
    }

    // Método para mostrar autores disponibles (sin duplicados)
    public void mostrarAutoresDisponibles() {
        Set<Autor> autoresUnicos = new HashSet<>(); // HashSet evita duplicados
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (autor != null) {
                autoresUnicos.add(autor);
            }
        }

        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay autores registrados en la biblioteca.");
        } else {
            System.out.println("Autores disponibles en '" + nombre + "':");
            for (Autor autor : autoresUnicos) {
                autor.mostrarInfo();
            }
        }
    }
}