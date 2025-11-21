// Main.java (Ejercicio 2: Biblioteca y Libros)
public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- PARTE 2: Biblioteca y Libros ---");

        // 1. Creamos una biblioteca.
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A001", "Isabel Allende", "Chilena");
        Autor a2 = new Autor("A002", "Stephen King", "Estadounidense");
        Autor a3 = new Autor("A003", "María Dueñas", "Española");

        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.agregarLibro("978-0-06-085052-4", "La Casa de los Espíritus", 1982, a1);
        biblioteca.agregarLibro("978-0-7432-7356-5", "It", 1986, a2);
        biblioteca.agregarLibro("978-84-08-12345-6", "El Tiempo Entre Costuras", 2009, a3);
        biblioteca.agregarLibro("978-0-7432-7357-2", "The Shining", 1977, a2);
        biblioteca.agregarLibro("978-84-08-12346-3", "Sira", 2012, a3);

        // 4. Listar todos los libros con su información y la del autor.
        System.out.println("\n--- Listar Libros ---");
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n--- Buscar Libro por ISBN (978-0-7432-7356-5) ---");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("978-0-7432-7356-5");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 6. Filtrar y mostrar los libros publicados en un año específico (1986).
        System.out.println("\n--- Filtrar Libros por Año (1986) ---");
        biblioteca.filtrarLibrosPorAnio(1986);

        // 7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\n--- Eliminar Libro (ISBN: 978-0-06-085052-4) ---");
        biblioteca.eliminarLibro("978-0-06-085052-4");
        System.out.println("\n--- Listar Libros después de eliminar ---");
        biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\n--- Cantidad Total de Libros ---");
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n--- Autores Disponibles ---");
        biblioteca.mostrarAutoresDisponibles();
    }
}