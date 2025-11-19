package introduccionJava;

import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: "); // ingresa el nombre
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");  // ingresa la edad
        int edad = scanner.nextInt();

        // Imprime: 
        System.out.println("\nDatos ingresados son: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");

        scanner.close();
    }
}
