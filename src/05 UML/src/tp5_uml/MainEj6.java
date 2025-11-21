package tp5_uml;

// Clase Main para probar el Ejercicio 6: Reserva - Cliente - Mesa
public class MainEj6 {

    public static void main(String[] args) {
        ClienteEj6 cliente = new ClienteEj6("Sofía Martínez", "11-2345-6789");
        MesaEj6 mesa = new MesaEj6(5, 4);

        ReservaEj6 reserva = new ReservaEj6("2024-06-15", "20:00", cliente, mesa);

        System.out.println("Reserva: " + reserva);
    }
}