package tp5_uml;


public class PasaporteEj1 {
    private String numero;
    private String fechaEmision;
    private FotoEj1 foto;
    private TitularEj1 titular;

    public PasaporteEj1(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new FotoEj1(imagen, formato);
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public FotoEj1 getFoto() {
        return foto;
    }

    public TitularEj1 getTitular() {
        return titular;
    }

    public void setTitular(TitularEj1 titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision='" + fechaEmision + '\'' +
                ", foto=" + foto +
                ", titular=" + (titular != null ? titular.getNombre() : "null") +
                '}';
    }
}