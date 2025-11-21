package tp5_uml;

// Clase EditorVideo (Dependencia de Creación) - Ejercicio 14
public class EditorVideoEJ14 { // Debe ser 'public class EditorVideoEJ14'

    // Método que crea un Render (Dependencia de Creación)
    public void exportar(String formato, ProyectoEJ14 proyecto) { // Cambiado el tipo del parámetro
        // El constructor de RenderEJ14 requiere String y ProyectoEJ14
        RenderEJ14 render = new RenderEJ14(formato, proyecto); // Pasar ambos argumentos
        System.out.println("Exportando proyecto '" + render.getProyecto().getNombre() + // Acceder al proyecto asociado
                           "' en formato " + render.getFormato());
        // Lógica para exportar el video...
    }
}