package introduccionJava;

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        // solicita el primer numero 
        int num1 = scanner.nextInt();
        System.out.print("Ingrese un numero entero: ");
        // solicita el segundo numero entero
        int num2 = scanner.nextInt();

        // operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        // Resultados:
        System.out.println("\nLos Resultados son:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        scanner.close();
    }
}