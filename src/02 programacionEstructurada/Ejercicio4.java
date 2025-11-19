
package programacion.estructurada.tp;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().charAt(0);
        
        // Validar que la categoría sea válida
        if (categoria != 'A' && categoria != 'B' && categoria != 'C') {
            System.out.println("Categoría inválida. Use A, B o C.");
        } else {
            double descuentoPorcentaje = obtenerDescuento(categoria);
            double descuento = precio * (descuentoPorcentaje / 100);
            double precioFinal = precio - descuento;
            
            System.out.println("Descuento aplicado: " + (int)descuentoPorcentaje + "%");
            System.out.println("Precio final: " + precioFinal);
        }
        
        scanner.close();
    }
    
    // Devuelve el porcentaje de descuento según la categoría
    public static double obtenerDescuento(char categoria) {
        switch (categoria) {
            case 'A': return 10.0;
            case 'B': return 15.0;
            case 'C': return 20.0;
            default: return 0.0;
        }
    }
}