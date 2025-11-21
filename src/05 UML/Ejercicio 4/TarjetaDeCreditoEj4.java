package tp5_uml;

// Clase TarjetaDeCreditoEj4
class TarjetaDeCreditoEj4 {
    private String numero;
    private String fechaVencimiento;
    private ClienteEj4 cliente; // Asociación bidireccional
    private BancoEj4 banco; // Agregación

    public TarjetaDeCreditoEj4(String numero, String fechaVencimiento, ClienteEj4 cliente, BancoEj4 banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco; // Se almacena una referencia al banco existente
        // Establecer la asociación bidireccional
        if (cliente != null && cliente.getTarjeta() == null) {
            cliente.setTarjeta(this);
        }
    }

    // Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public ClienteEj4 getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEj4 cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public BancoEj4 getBanco() {
        return banco;
    }

    public void setBanco(BancoEj4 banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCreditoEj4{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", cliente=" + cliente +
                ", banco=" + banco +
                '}';
    }
}