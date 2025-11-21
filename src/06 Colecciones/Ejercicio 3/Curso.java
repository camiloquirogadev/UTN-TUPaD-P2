// Curso.java
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // Relación bidireccional

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        // profesor inicia como null
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método setProfesor: MUY IMPORTANTE para mantener la bidireccionalidad
    public void setProfesor(Profesor p) {
        // Si el profesor actual es el mismo que el nuevo, no hacer nada
        if (this.profesor == p) {
            return;
        }

        // Si ya tenía un profesor anterior, notificarle que ya no lo imparte
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this); // Quita este curso de la lista del viejo profesor
        }

        // Asignar el nuevo profesor
        this.profesor = p;

        // Si el nuevo profesor no es null, agregar este curso a su lista
        if (p != null && !p.getCursos().contains(this)) { // Verificar si ya está en la lista
            p.agregarCurso(this); // Agrega este curso a la lista del nuevo profesor
        }
    }

    // Método para mostrar la información del curso
    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado");
        }
        System.out.println("--------------------");
    }
}