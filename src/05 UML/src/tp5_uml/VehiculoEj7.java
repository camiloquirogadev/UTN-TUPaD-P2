package tp5_uml;

// Clase VehiculoEj7
class VehiculoEj7 {
    private String patente;
    private String modelo;
    private MotorEj7 motor; // Agregación
    private ConductorEj7 conductor; // Asociación bidireccional

    public VehiculoEj7(String patente, String modelo, MotorEj7 motor, ConductorEj7 conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; // Se almacena una referencia al motor existente
        this.conductor = conductor;
        // Establecer la asociación bidireccional
        if (conductor != null && conductor.getVehiculo() == null) {
            conductor.setVehiculo(this);
        }
    }

    // Getters y Setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public MotorEj7 getMotor() {
        return motor;
    }

    public void setMotor(MotorEj7 motor) {
        this.motor = motor;
    }

    public ConductorEj7 getConductor() {
        return conductor;
    }

    public void setConductor(ConductorEj7 conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "VehiculoEj7{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", conductor=" + conductor +
                '}';
    }
}