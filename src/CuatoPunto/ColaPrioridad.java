package CuatoPunto;

import java.util.PriorityQueue;

public class ColaPrioridad {
    private PriorityQueue<Tarea> cola;

    public ColaPrioridad() {
        this.cola = new PriorityQueue<>();
    }

    public void agregarTarea(Tarea tarea) {
        cola.add(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }

    public void procesarTarea() {
        if (!cola.isEmpty()) {
            System.out.println("Procesando: " + cola.poll());
        } else {
            System.out.println("No hay tareas en la cola.");
        }
    }

    public void mostrarTareas() {
        System.out.println("Tareas en la cola: " + cola);
    }
}
