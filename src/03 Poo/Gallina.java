
package poo;

public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        this.huevosPuestos++;
    }

    public void envejecer() {
        this.edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina +
                           " | Edad: " + edad +
                           " | Huevos puestos: " + huevosPuestos);
    }

    // Getters
    public String getIdGallina() { return idGallina; }
    public int getEdad() { return edad; }
    public int getHuevosPuestos() { return huevosPuestos; }

    // Salida Prueba
    public static void main(String[] args) {
        System.out.println("PRUEBA: Gestión de Gallinas");
        Gallina g1 = new Gallina("G001", 2);
        Gallina g2 = new Gallina("G002", 1);
        g1.ponerHuevo(); g1.ponerHuevo();
        g2.envejecer(); g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}

