package tp5_uml;

// Clase Main para probar el Ejercicio 4: TarjetaDeCrédito - Cliente - Banco
public class MainEj4 {

    public static void main(String[] args) {
        BancoEj4 banco = new BancoEj4("Banco Nación", "30-50000000-0");
        ClienteEj4 cliente = new ClienteEj4("María García", "27.123.456");

        TarjetaDeCreditoEj4 tarjeta = new TarjetaDeCreditoEj4("1234567890123456", "12/28", cliente, banco);

        System.out.println("Tarjeta: " + tarjeta);
        System.out.println("Cliente: " + cliente);
    }
}