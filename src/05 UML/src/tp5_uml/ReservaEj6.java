package tp5_uml;

// Clase ReservaEj6
class ReservaEj6 {
    private String fecha;
    private String hora;
    private ClienteEj6 cliente; // Asociación unidireccional
    private MesaEj6 mesa; // Agregación

    public ReservaEj6(String fecha, String hora, ClienteEj6 cliente, MesaEj6 mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente; // Se almacena una referencia al cliente existente
        this.mesa = mesa; // Se almacena una referencia a la mesa existente
    }

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public ClienteEj6 getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEj6 cliente) {
        this.cliente = cliente;
    }

    public MesaEj6 getMesa() {
        return mesa;
    }

    public void setMesa(MesaEj6 mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "ReservaEj6{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", cliente=" + cliente +
                ", mesa=" + mesa +
                '}';
    }
}