public class MainParte1 {
    public static void main(String[] args) {
        // Crear cliente y pedido
        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@example.com");
        Pedido pedido = new Pedido(cliente);

        // Agregar productos al pedido
        Producto producto1 = new Producto("Laptop", 1200.0);
        Producto producto2 = new Producto("Mouse", 25.0);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);

        // Calcular total
        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // Cambiar estado del pedido (esto notifica al cliente)
        pedido.setCambiarEstado("En preparación");

        // Simular diferentes pagos
        Pago pagoTarjeta = new TarjetaCredito("1234567890123456");
        PagoConDescuento pagoTarjetaConDesc = (TarjetaCredito) pagoTarjeta; // Casting para acceder al descuento
        pagoTarjetaConDesc.aplicarDescuento(10.0);
        pagoTarjetaConDesc.procesarPago(pedido.calcularTotal());

        Pago pagoPayPal = new PayPal("juan.perez@example.com");
        pagoPayPal.procesarPago(pedido.calcularTotal());

        // Cambiar estado nuevamente
        pedido.setCambiarEstado("En camino");
    }
}