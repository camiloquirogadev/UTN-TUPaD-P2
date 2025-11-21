import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::calcularTotal).sum();
    }

    public void setCambiarEstado(String estado) {
        System.out.println("El pedido ahora está: " + estado);
        if (cliente != null) {
            cliente.notificar("Tu pedido ahora está: " + estado);
        }
    }
}