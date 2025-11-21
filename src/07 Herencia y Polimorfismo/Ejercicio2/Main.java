package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo("Círculo 1", 5.0);
        figuras[1] = new Rectangulo("Rectángulo 1", 10.0, 4.0);

        for (Figura figura : figuras) {
            System.out.println("Área del " + figura.nombre + ": " + figura.calcularArea());
        }
    }
}