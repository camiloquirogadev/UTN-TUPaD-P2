
package programacion.estructurada.tp;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int sumaPares = 0;
        
        // Primera lectura antes del while
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = scanner.nextInt();
        
        // Ciclo while: se ejecuta mientras el número no sea 0
        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
        }
        
        System.out.println("La suma de los números pares es: " + sumaPares);
        
        scanner.close();
    }
}