package Ejercicio3;

public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double valorPorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double valorPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorPorHora;
    }
}