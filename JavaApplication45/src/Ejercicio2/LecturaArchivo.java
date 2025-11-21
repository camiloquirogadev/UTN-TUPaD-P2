package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
    public static void main(String[] args) {
        String filePath = "archivo_no_existente.txt"; // Cambia por un archivo real para probar lectura
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Archivo leído exitosamente.");
        } catch (IOException e) { // Captura general para IOException (incluye FileNotFoundException)
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        // El try-with-resources cierra el archivo automáticamente
    }
}