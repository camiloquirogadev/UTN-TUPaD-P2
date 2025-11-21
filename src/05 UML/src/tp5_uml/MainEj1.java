
package tp5_uml;

import tp5_uml.PasaporteEj1;

public class MainEj1 {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1: Pasaporte - Foto - Titular ---");
        TitularEj1 titular = new TitularEj1("Juan Pérez", "12345678");
        PasaporteEj1 pasaporte = new PasaporteEj1("P12345678", "2023-01-15", "foto_juan.jpg", "JPEG");
        titular.setPasaporte(pasaporte);

        System.out.println("Titular: " + titular.getNombre() + ", DNI: " + titular.getDni());
        System.out.println("Pasaporte Nro: " + pasaporte.getNumero());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen() + " (" + pasaporte.getFoto().getFormato() + ")");
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
    }
}
