package tp5_uml;

// Clase Main para probar el Ejercicio 14: EditorVideo - Proyecto - Render
public class MainEj14 {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video de Presentación", 120);

        EditorVideoEJ14 editor = new EditorVideoEJ14(); // <-- Cambiado a EditorVideoEJ14
        editor.exportar("MP4", proyecto); // <-- Creación de RenderEJ14 dentro del método
    }
}