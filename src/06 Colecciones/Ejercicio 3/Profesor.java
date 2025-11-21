// Profesor.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Relación bidireccional

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    // Importante: Devolver una vista inmutable para encapsulamiento
    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método para agregar un curso a la lista del profesor
    // Este método es interno o lo llama Curso.setProfesor para mantener coherencia
    void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    // Método para eliminar un curso de la lista del profesor
    // Este método es interno o lo llama Curso.setProfesor para mantener coherencia
    void eliminarCurso(Curso c) {
        if (c != null) {
            cursos.remove(c);
        }
    }

    // Método para listar los cursos que dicta
    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  Ninguno asignado.");
        } else {
            for (Curso curso : cursos) {
                System.out.println("  - Código: " + curso.getCodigo() + ", Nombre: " + curso.getNombre());
            }
        }
        System.out.println("--------------------");
    }

    // Método para mostrar información del profesor
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de Cursos: " + cursos.size());
        System.out.println("--------------------");
    }
}