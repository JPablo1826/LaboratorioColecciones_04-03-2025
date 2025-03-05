package DecimoseptimoPunto;

import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private TreeMap<String, String> eventos;

    public AgendaEventos() {
        this.eventos = new TreeMap<>();
    }

    public void agregarEvento(String fecha, String evento) {
        eventos.put(fecha, evento);
        System.out.println("Evento agregado: " + fecha + " - " + evento);
    }

    public void mostrarEventos() {
        System.out.println("Agenda de eventos:");
        for (Map.Entry<String, String> entry : eventos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void mostrarEventoMasProximo() {
        if (!eventos.isEmpty()) {
            Map.Entry<String, String> proximo = eventos.firstEntry();
            System.out.println("Próximo evento: " + proximo.getKey() + " - " + proximo.getValue());
        } else {
            System.out.println("No hay eventos en la agenda.");
        }
    }
}
