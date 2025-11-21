package tp5_uml;

// Clase Conductor (Relación de Asociación Bidireccional con VehiculoEj7) - Ejercicio 7
class ConductorEj7 {
    private String nombre;
    private String licencia;
    private VehiculoEj7 vehiculo; // Asociación bidireccional

    public ConductorEj7(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public VehiculoEj7 getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoEj7 vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }

    @Override
    public String toString() {
        return "ConductorEj7{" +
                "nombre='" + nombre + '\'' +
                ", licencia='" + licencia + '\'' +
                ", vehiculo=" + (vehiculo != null ? vehiculo.getModelo() : "null") +
                '}';
    }
}