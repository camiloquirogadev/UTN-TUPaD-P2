package tp5_uml;

// Clase CelularEj2
class CelularEj2 {
    private String imei;
    private String marca;
    private String modelo;
    private BateriaEj2 bateria; // Agregación
    private UsuarioEj2 usuario; // Asociación bidireccional

    public CelularEj2(String imei, String marca, String modelo, BateriaEj2 bateria, UsuarioEj2 usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // Se inyecta la batería existente
        this.usuario = usuario;
        // Establecer la asociación bidireccional
        if (usuario != null && usuario.getCelular() == null) {
            usuario.setCelular(this);
        }
    }

    // Getters y Setters
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BateriaEj2 getBateria() {
        return bateria;
    }

    public void setBateria(BateriaEj2 bateria) {
        this.bateria = bateria;
    }

    public UsuarioEj2 getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEj2 usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    @Override
    public String toString() {
        return "CelularEj2{" +
                "imei='" + imei + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria +
                ", usuario=" + usuario +
                '}';
    }
}