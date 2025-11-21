package tp5_uml;

// Clase Main para probar el Ejercicio 14: EditorVideo - Proyecto - Render
public class MainEj14 {

    public static void main(String[] args) {
        // Usar ProyectoEJ14 en lugar de Proyecto
        ProyectoEJ14 proyecto = new ProyectoEJ14("Video de Presentación", 120);

        EditorVideoEJ14 editor = new EditorVideoEJ14();
        // El método exportar de EditorVideoEJ14 requiere un String y un ProyectoEJ14
        editor.exportar("MP4", proyecto);
    }
}