package OctavoPunto;

import java.util.Vector;

public class EditorTexto {
    private Vector<String> historialCambios;

    public EditorTexto() {
        this.historialCambios = new Vector<>();
    }

    public void realizarCambio(String cambio) {
        historialCambios.add(cambio);
        System.out.println("Cambio realizado: " + cambio);
    }

    public void deshacerCambio() {
        if (!historialCambios.isEmpty()) {
            System.out.println("Deshaciendo cambio: " + historialCambios.remove(historialCambios.size() - 1));
        } else {
            System.out.println("No hay cambios para deshacer.");
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial de cambios: " + historialCambios);
    }
}
