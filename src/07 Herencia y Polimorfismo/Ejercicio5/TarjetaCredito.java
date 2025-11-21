package Ejercicio5;

public class TarjetaCredito implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Procesando pago con Tarjeta de Crédito...");
        System.out.println("Pago con Tarjeta de Crédito realizado exitosamente.");
    }
}
