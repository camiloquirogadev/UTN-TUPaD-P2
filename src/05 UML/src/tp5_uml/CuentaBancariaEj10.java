package tp5_uml;

// Clase CuentaBancariaEj10
class CuentaBancariaEj10 {
    private String cbu;
    private double saldo;
    private ClaveSeguridadEj10 claveSeguridad; // Composición
    private TitularEj10 titular; // Asociación bidireccional

    public CuentaBancariaEj10(String cbu, double saldo, ClaveSeguridadEj10 claveSeguridad, TitularEj10 titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad; // Se crea como parte de la cuenta
        this.titular = titular;
        // Establecer la asociación bidireccional
        if (titular != null && titular.getCuenta() == null) {
            titular.setCuenta(this);
        }
    }

    // Getters y Setters
    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridadEj10 getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(ClaveSeguridadEj10 claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    public TitularEj10 getTitular() {
        return titular;
    }

    public void setTitular(TitularEj10 titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancariaEj10{" +
                "cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                ", claveSeguridad=" + claveSeguridad +
                ", titular=" + titular +
                '}';
    }
}