package tp5_uml;

// Clase Titular (Relación de Asociación Bidireccional con CuentaBancariaEj10) - Ejercicio 10
class TitularEj10 {
    private String nombre;
    private String dni;
    private CuentaBancariaEj10 cuenta; // Asociación bidireccional

    public TitularEj10(String nombre, String dni) {
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

    public CuentaBancariaEj10 getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancariaEj10 cuenta) {
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "TitularEj10{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", cuenta=" + (cuenta != null ? cuenta.getCbu() : "null") +
                '}';
    }
}