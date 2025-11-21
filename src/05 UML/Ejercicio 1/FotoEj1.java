
package tp5_uml;

public class FotoEj1 {
    private String imagen;
    private String formato;

    public FotoEj1(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return "Foto{" +
                "imagen='" + imagen + '\'' +
                ", formato='" + formato + '\'' +
                '}';
    }
}