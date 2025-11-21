package tp5_uml;

// Clase Main para probar el Ejercicio 2: Celular - Batería - Usuario
public class MainEj2 {

    public static void main(String[] args) {
        UsuarioEj2 usuario = new UsuarioEj2("Carlos López", "25.678.901");
        BateriaEj2 bateria = new BateriaEj2("Li-Ion", 4000);

        CelularEj2 celular = new CelularEj2("123456789012345", "Samsung", "Galaxy S23", bateria, usuario);

        System.out.println("Celular: " + celular);
        System.out.println("Usuario: " + usuario);
    }
}