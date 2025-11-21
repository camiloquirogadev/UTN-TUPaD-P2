package tp5_uml;

// Clase Main para probar el Ejercicio 12: Impuesto - Contribuyente - Calculadora
public class MainEj12 {

    public static void main(String[] args) {
        ContribuyenteEj12 contribuyente = new ContribuyenteEj12("Empresa SA", "30-12345678-9");
        ImpuestoEj12 impuesto = new ImpuestoEj12(15000.0, contribuyente);

        CalculadoraEj12 calc = new CalculadoraEj12();
        calc.calcular(impuesto); // Uso del impuesto como parámetro
    }
}