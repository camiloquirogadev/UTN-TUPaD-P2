package tp5_uml;

// Clase CitaMedicaEj9
class CitaMedicaEj9 {
    private String fecha;
    private String hora;
    private PacienteEj9 paciente; // Asociación unidireccional
    private ProfesionalEj9 profesional; // Asociación unidireccional

    public CitaMedicaEj9(String fecha, String hora, PacienteEj9 paciente, ProfesionalEj9 profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente; // Se almacena una referencia al paciente existente
        this.profesional = profesional; // Se almacena una referencia al profesional existente
    }

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public PacienteEj9 getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEj9 paciente) {
        this.paciente = paciente;
    }

    public ProfesionalEj9 getProfesional() {
        return profesional;
    }

    public void setProfesional(ProfesionalEj9 profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedicaEj9{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", paciente=" + paciente +
                ", profesional=" + profesional +
                '}';
    }
}