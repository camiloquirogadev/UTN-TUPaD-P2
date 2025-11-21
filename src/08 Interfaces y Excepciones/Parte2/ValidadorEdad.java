public class ValidadorEdad {
    public static void main(String[] args) {
        int edad = -5; // Cambia este valor para probar
        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error de edad: " + e.getMessage());
        }
    }
}