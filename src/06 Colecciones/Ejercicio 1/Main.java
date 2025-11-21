// Main.java (Ejercicio 1: Sistema de Stock)
public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- PARTE 1: Sistema de Stock ---");

        // Crear inventario
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("P001", "Arroz", 150.0, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Laptop", 150000.0, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camisa", 8000.0, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 35000.0, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Teclado", 12000.0, 30, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos mostrando su información y categoría.
        System.out.println("\n--- Listado de Productos ---");
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n--- Buscar Producto por ID (P002) ---");
        Producto encontrado = inventario.buscarProductoPorId("P002");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica (ELECTRONICA).
        System.out.println("\n--- Filtrar por Categoría (ELECTRONICA) ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n--- Eliminar Producto (P003) ---");
        inventario.eliminarProducto("P003");
        System.out.println("\n--- Listado de Productos después de eliminar P003 ---");
        inventario.listarProductos();

        // 6. Actualizar el stock de un producto existente (P001).
        System.out.println("\n--- Actualizar Stock de Producto (P001) ---");
        inventario.actualizarStock("P001", 90);

        // 7. Mostrar el total de stock disponible.
        System.out.println("\n--- Total de Stock ---");
        System.out.println("Stock total en inventario: " + inventario.obtenerTotalStock());

        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("\n--- Producto con Mayor Stock ---");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n--- Filtrar Productos por Precio ($1000 - $3000) ---");
        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);

        // 10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\n--- Categorías Disponibles ---");
        inventario.mostrarCategoriasDisponibles();
    }
}