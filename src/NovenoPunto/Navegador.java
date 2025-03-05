package NovenoPunto;

import java.util.Stack;

public class Navegador {
    private Stack<String> historial;

    public Navegador() {
        this.historial = new Stack<>();
    }

    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("Visitaste: " + url);
    }

    public void retroceder() {
        if (historial.size() > 1) {
            historial.pop();
            System.out.println("Retrocediendo a: " + historial.peek());
        } else {
            System.out.println("No hay más páginas a las que retroceder.");
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial de navegación: " + historial);
    }
}
