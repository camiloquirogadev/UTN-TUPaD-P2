package Ejercicio2;

public class ValidadorEdad {
    public static void main(String[] args) {
        int edad = -5; // Cambia este valor para probar
        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad invAlida: " + edad + ". Debe estar entre 0 y 120.");
            }
            System.out.println("Edad valida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error de edad: " + e.getMessage());
        }
    }
}