package OctavoPunto;

/*Un editor de texto necesita registrar los cambios
recientes para que el usuario pueda deshacerlos cuando
sea necesario. Para este caso, se utilizará un Vector,
ya que permite almacenar los cambios de forma segura en
entornos concurrentes. Se deberá implementar una función
de "deshacer" que elimine el último cambio realizado,
asegurando que se mantenga un historial de modificaciones.*/

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        // Realizar cambios en el texto
        editor.realizarCambio("Dios");
        editor.realizarCambio("Castro");
        editor.realizarCambio("Vanegas");
        editor.mostrarHistorial();

        // Deshacer cambios
        editor.deshacerCambio();
        editor.mostrarHistorial();
        editor.deshacerCambio();
        editor.mostrarHistorial();
        editor.deshacerCambio(); // No hay más cambios
    }
}
