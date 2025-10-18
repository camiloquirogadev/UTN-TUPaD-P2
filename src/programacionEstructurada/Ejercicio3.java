
package programacion.estructurada.tp;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        String etapa = clasificarEdad(edad);
        System.out.println("Eres un " + etapa + ".");
        
        scanner.close();
    }
    
    // Método que clasifica la etapa de vida según la edad
    public static String clasificarEdad(int edad) {
        if (edad < 12) {
            return "Niño";
        } else if (edad >= 12 && edad <= 17) {
            return "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            return "Adulto";
        } else {
            return "Adulto mayor";
        }
    }
}