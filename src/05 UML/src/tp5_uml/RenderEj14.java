package tp5_uml;

// Clase Render - Ejercicio 14
class RenderEJ14 {
    private String formato;

    public RenderEJ14(String formato) {
        this.formato = formato;
    }

    // Getter
    public String getFormato() {
        return formato;
    }

    // Setter
    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "RenderEJ14{" +
                "formato='" + formato + '\'' +
                '}';
    }
}