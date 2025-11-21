import java.util.Scanner;

public class ConversionNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresa un número entero: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("Número: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. No es un número entero.");
        } finally {
            sc.close();
        }
    }
}