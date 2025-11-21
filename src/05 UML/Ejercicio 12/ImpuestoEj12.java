package tp5_uml;

// Clase ImpuestoEj12 (Relación de Asociación Unidireccional con ContribuyenteEj12) - Ejercicio 12
class ImpuestoEj12 {
    private double monto;
    private ContribuyenteEj12 contribuyente; // Asociación unidireccional

    public ImpuestoEj12(double monto, ContribuyenteEj12 contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente; // Se almacena una referencia al contribuyente existente
    }

    // Getters y Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public ContribuyenteEj12 getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(ContribuyenteEj12 contribuyente) {
        this.contribuyente = contribuyente;
    }

    @Override
    public String toString() {
        return "ImpuestoEj12{" +
                "monto=" + monto +
                ", contribuyente=" + contribuyente +
                '}';
    }
}