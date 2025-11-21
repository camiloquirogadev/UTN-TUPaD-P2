package tp5_uml;

// Clase Main para probar el Ejercicio 9: CitaMédica - Paciente - Profesional
public class MainEj9 {

    public static void main(String[] args) {
        PacienteEj9 paciente = new PacienteEj9("Julia Pérez", "OSDE");
        ProfesionalEj9 medico = new ProfesionalEj9("Dr. Juan Silva", "Cardiología");

        CitaMedicaEj9 cita = new CitaMedicaEj9("2024-02-10", "10:30", paciente, medico);

        System.out.println("Cita Médica: " + cita);
    }
}