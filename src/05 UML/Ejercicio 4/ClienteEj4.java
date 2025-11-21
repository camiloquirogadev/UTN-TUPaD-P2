package tp5_uml;

// Clase Cliente (Relación de Asociación Bidireccional con TarjetaDeCreditoEj4) - Ejercicio 4
class ClienteEj4 {
    private String nombre;
    private String dni;
    private TarjetaDeCreditoEj4 tarjeta; // Asociación bidireccional

    public ClienteEj4(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TarjetaDeCreditoEj4 getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCreditoEj4 tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "ClienteEj4{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tarjeta=" + (tarjeta != null ? tarjeta.getNumero() : "null") +
                '}';
    }
}