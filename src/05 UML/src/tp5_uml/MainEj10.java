package tp5_uml;

// Clase Main para probar el Ejercicio 10: CuentaBancaria - ClaveSeguridad - Titular
public class MainEj10 {

    public static void main(String[] args) {
        TitularEj10 titular = new TitularEj10("Elena Ríos", "26.543.210");
        ClaveSeguridadEj10 clave = new ClaveSeguridadEj10("1234", "2024-01-01");

        CuentaBancariaEj10 cuenta = new CuentaBancariaEj10("1234567890123456789012", 50000.0, clave, titular);

        System.out.println("Cuenta Bancaria: " + cuenta);
        System.out.println("Titular: " + titular);
    }
}