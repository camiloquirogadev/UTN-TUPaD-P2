package Ejercicio5;

public class Efectivo implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Procesando pago en Efectivo...");
        System.out.println("Pago en Efectivo realizado exitosamente.");
    }
}