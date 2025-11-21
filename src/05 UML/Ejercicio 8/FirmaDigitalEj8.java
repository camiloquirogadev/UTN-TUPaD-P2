package tp5_uml;

// Clase FirmaDigitalEj8 (Relación de Composición con DocumentoEj8 y Agregación con UsuarioEj8) - Ejercicio 8
class FirmaDigitalEj8 {
    private String codigoHash;
    private String fecha;
    private UsuarioEj8 usuario; // Agregación

    public FirmaDigitalEj8(String codigoHash, String fecha, UsuarioEj8 usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; // Se almacena una referencia al usuario existente
    }

    // Getters y Setters
    public String getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public UsuarioEj8 getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEj8 usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigitalEj8{" +
                "codigoHash='" + codigoHash + '\'' +
                ", fecha='" + fecha + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}