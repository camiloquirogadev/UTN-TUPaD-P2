package tp5_uml;

// Clase Proyecto (Relación de Asociación Unidireccional con Render) - Ejercicio 14
public class ProyectoEJ14 { // Debe ser 'public class ProyectoEJ14'
    private String nombre;
    private int duracionMin;

    public ProyectoEJ14(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    @Override
    public String toString() {
        return "ProyectoEJ14{" +
                "nombre='" + nombre + '\'' +
                ", duracionMin=" + duracionMin +
                '}';
    }
}