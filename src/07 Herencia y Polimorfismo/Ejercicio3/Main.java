package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana Gómez", 150000.0, 15000.0));
        empleados.add(new EmpleadoTemporal("Carlos Ruiz", 80, 3000.0));

        for (Empleado emp : empleados) {
            System.out.println("Empleado: " + emp.nombre + ", Sueldo: $" + emp.calcularSueldo());

            if (emp instanceof EmpleadoPlanta) {
                System.out.println("  -> Tipo: Empleado de Planta");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("  -> Tipo: Empleado Temporal");
            }
        }
    }
}