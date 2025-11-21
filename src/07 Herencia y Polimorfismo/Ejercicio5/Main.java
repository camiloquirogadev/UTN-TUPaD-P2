package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        // Creamos objetos de las distintas clases de pago
        TarjetaCredito tarjeta = new TarjetaCredito();
        Transferencia transferencia = new Transferencia();
        Efectivo efectivo = new Efectivo();

        // Llamamos al método procesarPago con cada uno
        procesarPago(tarjeta);
        System.out.println();
        procesarPago(transferencia);
        System.out.println();
        procesarPago(efectivo);
    }

    public static void procesarPago(Pagable medio) {
        System.out.println("Iniciando proceso de pago...");
        medio.pagar();
        System.out.println("Finalizado proceso de pago.\n");
    }
}