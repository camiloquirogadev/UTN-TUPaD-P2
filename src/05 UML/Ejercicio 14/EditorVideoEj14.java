package tp5_uml;

// Clase EditorVideo (Dependencia de Creación) - Ejercicio 14
class EditorVideoEJ14 {

    // Método que crea un Render (Dependencia de Creación)
    public void exportar(String formato, Proyecto proyecto) {
        RenderEJ14 render = new RenderEJ14(formato); // Se crea el objeto aquí
        System.out.println("Exportando proyecto '" + proyecto.getNombre() + "' en formato " + render.getFormato());
        // Lógica para exportar el video...
    }
}