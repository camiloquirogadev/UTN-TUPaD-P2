package introduccionJava;

import java.util.Scanner;

public class EjercicioOcho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero entero: ");
        int num2 = scanner.nextInt();

        int resultado = num1 / num2;
System.out.println("Division (enteros): " + num1 + " / " + num2 + " = " + resultado);

        scanner.close();
    }
}
