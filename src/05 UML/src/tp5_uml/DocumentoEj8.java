package tp5_uml;

// Clase DocumentoEj8
class DocumentoEj8 {
    private String titulo;
    private String contenido;
    private FirmaDigitalEj8 firmaDigital; // Composición

    public DocumentoEj8(String titulo, String contenido, FirmaDigitalEj8 firmaDigital) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital; // Se crea como parte del documento
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigitalEj8 getFirmaDigital() {
        return firmaDigital;
    }

    public void setFirmaDigital(FirmaDigitalEj8 firmaDigital) {
        this.firmaDigital = firmaDigital;
    }

    @Override
    public String toString() {
        return "DocumentoEj8{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido.substring(0, Math.min(20, contenido.length())) + "...'" +
                ", firmaDigital=" + firmaDigital +
                '}';
    }
}