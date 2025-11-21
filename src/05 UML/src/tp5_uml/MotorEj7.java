package tp5_uml;

// Clase Motor (Relación de Agregación con VehiculoEj7) - Ejercicio 7
class MotorEj7 {
    private String tipo; // e.g., "Gasolina", "Diésel", "Eléctrico"
    private String numeroSerie;

    public MotorEj7(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "MotorEj7{" +
                "tipo='" + tipo + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}