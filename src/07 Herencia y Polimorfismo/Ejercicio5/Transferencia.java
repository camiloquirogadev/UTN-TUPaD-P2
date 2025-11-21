package Ejercicio5;

public class Transferencia implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Procesando pago por Transferencia Bancaria...");
        System.out.println("Pago por Transferencia Bancaria realizado exitosamente.");
    }
}
