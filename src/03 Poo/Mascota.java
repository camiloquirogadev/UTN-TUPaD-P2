
package poo;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre +
                           " | Especie: " + especie +
                           " | Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        this.edad++;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getEspecie() { return especie; }
    public int getEdad() { return edad; }

    // Salida Prueba 
    public static void main(String[] args) {
        System.out.println("PRUEBA: Registro de Mascotas");
        Mascota mascota = new Mascota("Pochi", "Perro", 3);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();
    }
}   
