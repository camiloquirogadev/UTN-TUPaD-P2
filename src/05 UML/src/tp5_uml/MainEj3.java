package tp5_uml;

// Clase Main para probar el Ejercicio 3: Libro - Autor - Editorial
public class MainEj3 {

    public static void main(String[] args) {
        AutorEj3 autor = new AutorEj3("Gabriel García Márquez", "Colombiana");
        EditorialEj3 editorial = new EditorialEj3("Sudamericana", "Buenos Aires, Argentina");

        LibroEj3 libro = new LibroEj3("Cien años de soledad", "978-958-42-0444-1", autor, editorial);

        System.out.println("Libro: " + libro);
    }
}