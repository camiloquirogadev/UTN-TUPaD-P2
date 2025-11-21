package tp5_uml;

// Clase Main para probar el Ejercicio 8: Documento - FirmaDigital - Usuario
public class MainEj8 {

    public static void main(String[] args) {
        UsuarioEj8 usuario = new UsuarioEj8("Carlos Díaz", "carlos.diaz@example.com");
        FirmaDigitalEj8 firma = new FirmaDigitalEj8("a1b2c3d4e5f6", "2024-01-20", usuario);

        DocumentoEj8 doc = new DocumentoEj8("Contrato de Servicio", "Este es el contenido del contrato...", firma);

        System.out.println("Documento: " + doc);
    }
}