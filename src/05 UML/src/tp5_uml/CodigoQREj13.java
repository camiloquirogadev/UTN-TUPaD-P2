package tp5_uml;

// Clase CodigoQR (Relación de Asociación Unidireccional con UsuarioEj13) - Ejercicio 13
class CodigoQREj13 {
    private String valor;
    private UsuarioEj13 usuario; // Asociación unidireccional

    public CodigoQREj13(String valor, UsuarioEj13 usuario) {
        this.valor = valor;
        this.usuario = usuario; // Se almacena una referencia al usuario existente
    }

    // Getters y Setters
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public UsuarioEj13 getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEj13 usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQREj13{" +
                "valor='" + valor + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}