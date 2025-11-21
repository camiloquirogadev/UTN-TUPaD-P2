package tp5_uml;

// Clase GeneradorQR (Dependencia de Creación) - Ejercicio 13
class GeneradorQREj13 {

    // Método que crea un CodigoQREj13 (Dependencia de Creación)
    public void generar(String valor, UsuarioEj13 usuario) {
        CodigoQREj13 qr = new CodigoQREj13(valor, usuario); // Se crea el objeto aquí
        System.out.println("Código QR generado: " + qr.getValor() + " para el usuario " + qr.getUsuario().getNombre());
        // Lógica para generar el código QR...
    }
}