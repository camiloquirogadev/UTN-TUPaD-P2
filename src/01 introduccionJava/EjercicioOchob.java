
package introduccionJava;
import java.util.Scanner;

public class EjercicioOchob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        
        double resultado = num1 / num2;
        System.out.println("Division (double): " + num1 + " / " + num2 + " = " + resultado);
        
        scanner.close();
    }
}
