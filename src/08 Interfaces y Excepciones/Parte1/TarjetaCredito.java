public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de Crédito (****" + numeroTarjeta.substring(numeroTarjeta.length() - 4) + "): $" + monto);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Descuento del " + porcentaje + "% aplicado al pago con Tarjeta de Crédito.");
    }
}