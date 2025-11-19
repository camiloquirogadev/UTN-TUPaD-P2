package pkg04.poo;

public class EmpleadoTest {
    public static void main(String[] args) {
        System.out.println("--- Creando Empleados ---");

        // Instancia usando el constructor con todos los parámetros
        Empleado emp1 = new Empleado(1, "Ana García", "Desarrolladora", 75000.0);
        System.out.println("Empleado 1 creado: " + emp1);
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());

        // Instancia usando el constructor con nombre y puesto (salario por defecto)
        Empleado emp2 = new Empleado("Luis Rodríguez", "Analista");
        System.out.println("Empleado 2 creado: " + emp2);
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());

        // Instancia usando el constructor con todos los parámetros
        Empleado emp3 = new Empleado(3, "María López", "Gerente", 85000.0);
        System.out.println("Empleado 3 creado: " + emp3);
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());

        System.out.println("\n--- Actualizando Salarios ---");

        // Actualizar salario de emp1 con un porcentaje
        emp1.actualizarSalario(5.5); // Aumento del 5.5%
        System.out.println("Salario de emp1 después del aumento (%): " + emp1.getSalario());

        // Actualizar salario de emp2 con una cantidad fija
        emp2.actualizarSalario(10000); // Aumento fijo de 10000
        System.out.println("Salario de emp2 después del aumento (fijo): " + emp2.getSalario());

        System.out.println("\n--- Información Final de Empleados ---");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("\n--- Total Final de Empleados ---");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
