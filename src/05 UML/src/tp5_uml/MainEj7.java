package tp5_uml;

// Clase Main para probar el Ejercicio 7: Vehículo - Motor - Conductor
public class MainEj7 {

    public static void main(String[] args) {
        ConductorEj7 conductor = new ConductorEj7("Roberto Gómez", "A01234567");
        MotorEj7 motor = new MotorEj7("Gasolina", "MTR-7890");

        VehiculoEj7 auto = new VehiculoEj7("ABC123", "Toyota Corolla", motor, conductor);

        System.out.println("Vehículo: " + auto);
        System.out.println("Conductor: " + conductor);
    }
}