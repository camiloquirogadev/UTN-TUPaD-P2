package tp5_uml;

// Clase Batería (Relación de Agregación con CelularEj2) - Ejercicio 2
class BateriaEj2 {
    private String modelo;
    private int capacidad; // en mAh

    public BateriaEj2(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "BateriaEj2{" +
                "modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad + "mAh" +
                '}';
    }
}