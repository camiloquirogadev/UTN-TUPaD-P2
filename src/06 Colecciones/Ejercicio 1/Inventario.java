// Inventario.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Producto p) {
        if (p != null && !productos.contains(p)) {
            productos.add(p);
            System.out.println("Producto agregado: " + p.getNombre());
        } else if (productos.contains(p)) {
            System.out.println("El producto con ID " + p.getId() + " ya existe en el inventario.");
        } else {
            System.out.println("No se puede agregar un producto nulo.");
        }
    }

    // Método para listar todos los productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Listado de Productos:");
            for (Producto producto : productos) { // Uso de for-each
                producto.mostrarInfo();
            }
        }
    }

    // Método para buscar un producto por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto; // Devuelve el producto encontrado
            }
        }
        return null; // Devuelve null si no se encuentra
    }

    // Método para eliminar un producto por ID
    public boolean eliminarProducto(String id) {
        Producto productoAEliminar = buscarProductoPorId(id);
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            System.out.println("Producto con ID " + id + " eliminado del inventario.");
            return true;
        } else {
            System.out.println("Producto con ID " + id + " no encontrado para eliminar.");
            return false;
        }
    }

    // Método para actualizar la cantidad en stock de un producto
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            if (nuevaCantidad >= 0) {
                producto.setCantidad(nuevaCantidad);
                System.out.println("Stock del producto con ID " + id + " actualizado a " + nuevaCantidad + ".");
                return true;
            } else {
                System.out.println("La cantidad no puede ser negativa.");
                return false;
            }
        } else {
            System.out.println("Producto con ID " + id + " no encontrado para actualizar stock.");
            return false;
        }
    }

    // Método para filtrar productos por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("Productos en la categoría " + categoria + ":");
        boolean encontrado = false;
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) { // Comparación con == es válida para enums
                producto.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en esta categoría.");
        }
    }

    // Método para obtener el total de stock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad();
        }
        return total;
    }

    // Método para obtener el producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return null;
        }
        Producto productoMayorStock = productos.get(0);
        for (int i = 1; i < productos.size(); i++) {
            if (productos.get(i).getCantidad() > productoMayorStock.getCantidad()) {
                productoMayorStock = productos.get(i);
            }
        }
        return productoMayorStock;
    }

    // Método para filtrar productos por rango de precio
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("Productos con precio entre $" + min + " y $" + max + ":");
        boolean encontrado = false;
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                producto.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en este rango de precio.");
        }
    }

    // Método para mostrar las categorías disponibles con sus descripciones
    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto cat : CategoriaProducto.values()) { // Uso de values()
            System.out.println("- " + cat + ": " + cat.getDescripcion());
        }
    }
}