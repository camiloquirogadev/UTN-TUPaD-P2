package tp5_uml;

// Clase CalculadoraEj12 (Dependencia de Uso) - Ejercicio 12
class CalculadoraEj12 {

    // Método que depende de ImpuestoEj12 (Dependencia de Uso)
    public void calcular(ImpuestoEj12 impuesto) {
        double monto = impuesto.getMonto();
        System.out.println("Calculando impuesto para " + impuesto.getContribuyente().getNombre() + ". Monto base: " + monto);
        // Lógica de cálculo...
    }
}