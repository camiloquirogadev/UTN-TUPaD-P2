package Ejercicio3;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double descuentos;

    public EmpleadoPlanta(String nombre, double sueldoBase, double descuentos) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.descuentos = descuentos;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase - descuentos;
    }
}