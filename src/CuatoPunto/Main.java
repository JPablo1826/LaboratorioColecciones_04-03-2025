package CuatoPunto;

/*Cree una cola (Queue) que almacene objetos de tipo "Tarea" que tengan una prioridad asociada.
Implemente la cola usando un PriorityQueue y
defina la prioridad de cada tarea según su importancia.*/

public class Main {
    public static void main(String[] args) {
        ColaPrioridad colaTareas = new ColaPrioridad();

        // Agregamos tareas con diferentes prioridades
        colaTareas.agregarTarea(new Tarea("Cepillarse", 2));
        colaTareas.agregarTarea(new Tarea("Bañarse", 3));
        colaTareas.agregarTarea(new Tarea("Cambiarse", 4));
        colaTareas.agregarTarea(new Tarea("Levantarse", 1));


        // Mostramos las tareas en la cola
        colaTareas.mostrarTareas();

        // Procesamos las tareas en orden de prioridad
        colaTareas.procesarTarea();
        colaTareas.procesarTarea();
        colaTareas.procesarTarea();
        colaTareas.procesarTarea();
        colaTareas.procesarTarea(); // No hay más tareas
    }
}
