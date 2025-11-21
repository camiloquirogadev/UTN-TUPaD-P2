package tp5_uml;

// Clase Render (Relación de Asociación Unidireccional con Proyecto) - Ejercicio 14
public class RenderEJ14 { // Debe ser 'public class RenderEJ14'
    private String formato;
    private ProyectoEJ14 proyecto; // Asociación unidireccional

    public RenderEJ14(String formato, ProyectoEJ14 proyecto) {
        this.formato = formato;
        this.proyecto = proyecto; // Se almacena una referencia al proyecto existente
    }

    // Getters y Setters
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public ProyectoEJ14 getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoEJ14 proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "RenderEJ14{" +
                "formato='" + formato + '\'' +
                ", proyecto=" + proyecto +
                '}';
    }
}