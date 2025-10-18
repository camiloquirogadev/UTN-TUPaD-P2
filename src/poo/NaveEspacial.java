
package poo;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private static final int MAX_COMBUSTIBLE = 100;
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.max(0, Math.min(combustibleInicial, MAX_COMBUSTIBLE));
    }
    public void despegar() {
        System.out.println(nombre + " ha despegado.");
    }
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + ": Combustible insuficiente (" + combustible + ") para avanzar " + distancia + " unidades.");
        }
    }
    public void recargarCombustible(int cantidad) {
        if (cantidad < 0) {
            System.out.println("No se puede recargar combustible negativo.");
            return;
        }
        combustible = Math.min(combustible + cantidad, MAX_COMBUSTIBLE);
        System.out.println(nombre + ": Combustible recargado. Total: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
    // Getters
    public String getNombre() { return nombre; }
    public int getCombustible() { return combustible; }

    //Salida Prueba
    public static void main(String[] args) {
        System.out.println(" PRUEBA: Simulación de Nave Espacial ");
        NaveEspacial nave = new NaveEspacial("X-Wing", 50);
        nave.mostrarEstado();
        nave.avanzar(60); // Falla
        nave.recargarCombustible(30); // Ahora tiene 80
        nave.avanzar(60); // Ahora sí
        nave.mostrarEstado();
    }
}
