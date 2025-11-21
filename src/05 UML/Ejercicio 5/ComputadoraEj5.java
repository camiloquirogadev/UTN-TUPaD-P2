package tp5_uml;

// Clase ComputadoraEj5
class ComputadoraEj5 {
    private String marca;
    private String numeroSerie;
    private PlacaMadreEj5 placaMadre; // Composición
    private PropietarioEj5 propietario; // Asociación bidireccional

    public ComputadoraEj5(String marca, String numeroSerie, PlacaMadreEj5 placaMadre, PropietarioEj5 propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre; // Se crea como parte de la computadora
        this.propietario = propietario;
        // Establecer la asociación bidireccional
        if (propietario != null && propietario.getComputadora() == null) {
            propietario.setComputadora(this);
        }
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadreEj5 getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadreEj5 placaMadre) {
        this.placaMadre = placaMadre;
    }

    public PropietarioEj5 getPropietario() {
        return propietario;
    }

    public void setPropietario(PropietarioEj5 propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "ComputadoraEj5{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", placaMadre=" + placaMadre +
                ", propietario=" + propietario +
                '}';
    }
}