package tp5_uml;

// Clase Main para probar el Ejercicio 5: Computadora - PlacaMadre - Propietario
public class MainEj5 {

    public static void main(String[] args) {
        PropietarioEj5 propietario = new PropietarioEj5("Luis Fernández", "29.876.543");
        PlacaMadreEj5 placa = new PlacaMadreEj5("MSI B450M PRO-VDH", "AMD B450");

        ComputadoraEj5 pc = new ComputadoraEj5("Dell", "SERIE123456", placa, propietario);

        System.out.println("Computadora: " + pc);
        System.out.println("Propietario: " + propietario);
    }
}