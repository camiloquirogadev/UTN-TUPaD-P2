
package tp5_uml;

// Clase ClaveSeguridad (Relación de Composición con CuentaBancariaEj10) - Ejercicio 10
class ClaveSeguridadEj10 {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridadEj10(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridadEj10{" +
                "codigo='" + codigo + '\'' +
                ", ultimaModificacion='" + ultimaModificacion + '\'' +
                '}';
    }
}