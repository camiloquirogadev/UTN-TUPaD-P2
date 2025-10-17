
package programacion.estructurada.tp;

public class Ejercicio13 {
    public static void main(String[] args) {
        // a. Declarar e inicializar el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar precios originales con recursión
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);
        
        // c. Modificar el tercer precio (índice 2)
        precios[2] = 129.99;
        
        // d. Mostrar precios modificados con recursión
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }
    
    // Función recursiva para imprimir un array de precios
    public static void imprimirArrayRecursivo(double[] arr, int indice) {
        // Caso base: si el índice supera el último elemento, terminar
        if (indice >= arr.length) {
            return;
        }
        
        // Imprimir el precio actual
        System.out.println("Precio: $" + arr[indice]);
        
        // Llamada recursiva al siguiente índice
        imprimirArrayRecursivo(arr, indice + 1);
    }
}