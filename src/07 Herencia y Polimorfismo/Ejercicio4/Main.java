package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Mishi"));
        animales.add(new Vaca("Lola"));

        for (Animal animal : animales) {
            System.out.print("Sonido de " + animal.nombre + ": ");
            animal.hacerSonido();
        }
    }
}