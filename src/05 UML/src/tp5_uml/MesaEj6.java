package tp5_uml;

// Clase Mesa (Relación de Agregación con ReservaEj6) - Ejercicio 6
class MesaEj6 {
    private int numero;
    private int capacidad;

    public MesaEj6(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "MesaEj6{" +
                "numero=" + numero +
                ", capacidad=" + capacidad +
                '}';
    }
}