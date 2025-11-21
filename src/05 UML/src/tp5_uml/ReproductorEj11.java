package tp5_uml;

// Clase ReproductorEj11 (Dependencia de Uso) - Ejercicio 11
class ReproductorEj11 {

    // Método que depende de CancionEj11 (Dependencia de Uso)
    public void reproducir(CancionEj11 cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " de " + cancion.getArtista().getNombre());
    }
}