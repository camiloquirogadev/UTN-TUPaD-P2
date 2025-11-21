package Ejercicio4;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void describirAnimal() {
        System.out.println("Este animal se llama " + nombre);
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
}