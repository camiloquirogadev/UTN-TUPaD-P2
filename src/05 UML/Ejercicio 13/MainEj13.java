package tp5_uml;

// Clase Main para probar el Ejercicio 13: GeneradorQR - Usuario - CódigoQR
public class MainEj13 {

    public static void main(String[] args) {
        UsuarioEj13 usuario = new UsuarioEj13("Pedro Sánchez", "pedro@example.com");

        GeneradorQREj13 gen = new GeneradorQREj13();
        gen.generar("https://miweb.com/perfil/pedro", usuario); // Creación de CodigoQREj13 dentro del método
    }
}