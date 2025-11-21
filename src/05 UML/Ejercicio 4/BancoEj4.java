package tp5_uml;

// Clase Banco (Relación de Agregación con TarjetaDeCreditoEj4) - Ejercicio 4
class BancoEj4 {
    private String nombre;
    private String cuit;

    public BancoEj4(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "BancoEj4{" +
                "nombre='" + nombre + '\'' +
                ", cuit='" + cuit + '\'' +
                '}';
    }
}