package pkg04.poo;

public class Empleado {
 // Atributos de instancia
 private int id;
 private String nombre;
 private String puesto;
 private double salario;
 private static int totalEmpleados = 0;
 public Empleado(int id, String nombre, String puesto, double salario) {
 this.id = id;
 this.nombre = nombre;
 this.puesto = puesto;
 this.salario = salario;
 Empleado.totalEmpleados++;
 } 
 public Empleado(String nombre, String puesto) {
 this.id = Empleado.totalEmpleados + 1;
 this.nombre = nombre;
 this.puesto = puesto;
 this.salario = 50000.0; 
6
 Empleado.totalEmpleados++;
 } 
 public void actualizarSalario(double porcentaje) {
 if (porcentaje > 0) {
 this.salario = this.salario * (1 + (porcentaje / 100));
 }
 } 
 public void actualizarSalario(int cantidad) {
 if (cantidad > 0) {
 this.salario += cantidad;
 }
 }
 public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
 public String getNombre() {
 return nombre;
 }
 public void setNombre(String nombre) {
 this.nombre = nombre;
 }
 public String getPuesto() {
 return puesto;
 }
 public void setPuesto(String puesto) {
 this.puesto = puesto;
 }
 public double getSalario() {
7
 return salario;
 }
 public void setSalario(double salario) {
 this.salario = salario;
 }
 public static int mostrarTotalEmpleados() {
 return Empleado.totalEmpleados;
 }
 @Override
 public String toString() {
 return "Empleado{" +
 "id=" + id +
 ", nombre='" + nombre + '\'' +
 ", puesto='" + puesto + '\'' +
 ", salario=" + salario +
 '}';
 }
}