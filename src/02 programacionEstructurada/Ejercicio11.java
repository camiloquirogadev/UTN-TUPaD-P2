package programacion.estructurada.tp;


import java.util.Scanner;

public class Ejercicio11 {
    // Variable "global" 
    static double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        calcularDescuentoEspecial(precio);
        
        scanner.close();
    }
    
    // Método que usa la variable global y una variable local
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL; // variable local
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}