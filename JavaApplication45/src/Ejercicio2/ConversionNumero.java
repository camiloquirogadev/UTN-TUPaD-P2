package Ejercicio2;

import java.util.Scanner;

public class ConversionNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresa un numero entero: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("Numero: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. No es un numero entero.");
        } finally {
            sc.close();
        }
    }
}