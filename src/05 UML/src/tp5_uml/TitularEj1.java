
package tp5_uml;

import tp5_uml.PasaporteEj1;

public class TitularEj1 {
    private String nombre;
    private String dni;
    private PasaporteEj1 pasaporte;

    public TitularEj1(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public PasaporteEj1 getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(PasaporteEj1 pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
}