package tp5_uml;

// Clase Main para probar el Ejercicio 11: Reproductor - Canción - Artista
public class MainEj11 {

    public static void main(String[] args) {
        ArtistaEj11 artista = new ArtistaEj11("Luis Miguel", "Bolero");
        CancionEj11 cancion = new CancionEj11("La Media Vuelta", artista);

        ReproductorEj11 reproductor = new ReproductorEj11();
        reproductor.reproducir(cancion); // Uso de la canción como parámetro
    }
}