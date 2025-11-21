
package programacion.estructurada.tp;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();
        
        // Validar que la zona sea correcta 
        if (!zona.equals("Nacional") && !zona.equals("Internacional")) {
            System.out.println("Zona inválida. Use 'Nacional' o 'Internacional'.");
        } else {
            double costoEnvio = calcularCostoEnvio(peso, zona);
            double total = calcularTotalCompra(precioProducto, costoEnvio);
            
            System.out.println("El costo de envío es: " + costoEnvio);
            System.out.println("El total a pagar es: " + total);
        }
        
        scanner.close();
    }
    
    // Calcula el costo de envío según peso y zona
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equals("Nacional")) {
            return peso * 5.0;
        } else { // Internacional
            return peso * 10.0;
        }
    }
    
    // Calcula el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}