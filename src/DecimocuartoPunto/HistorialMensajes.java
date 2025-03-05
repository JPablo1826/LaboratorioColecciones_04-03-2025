package DecimocuartoPunto;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistorialMensajes {
    private Deque<String> mensajes;
    private static final int LIMITE = 10;

    public HistorialMensajes() {
        this.mensajes = new ArrayDeque<>();
    }

    public void agregarMensaje(String mensaje) {
        if (mensajes.size() == LIMITE) {
            mensajes.removeFirst(); // Elimina el mensaje más antiguo si se alcanza el límite
        }
        mensajes.addLast(mensaje);
        System.out.println("Mensaje agregado: " + mensaje);
    }

    public void mostrarHistorial() {
        System.out.println("Últimos mensajes enviados: " + mensajes);
    }
}
