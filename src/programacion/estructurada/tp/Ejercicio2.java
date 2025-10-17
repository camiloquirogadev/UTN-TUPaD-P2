
package programacion.estructurada.tp;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        int mayor = encontrarMayor(num1, num2, num3);
        System.out.println("El mayor es: " + mayor);
        
        scanner.close();
    }
    
    // Método que devuelve el mayor de tres números enteros
    public static int encontrarMayor(int a, int b, int c) {
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        return mayor;
    }
}