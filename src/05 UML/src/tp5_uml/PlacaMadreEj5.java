package tp5_uml;

// Clase PlacaMadre (Relación de Composición con ComputadoraEj5) - Ejercicio 5
class PlacaMadreEj5 {
    private String modelo;
    private String chipset;

    public PlacaMadreEj5(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    // Getters y Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadreEj5{" +
                "modelo='" + modelo + '\'' +
                ", chipset='" + chipset + '\'' +
                '}';
    }
}