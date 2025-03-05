package CuatoPunto;

public class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int prioridad; // Menor número = Mayor prioridad

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea{descripcion='" + descripcion + "', prioridad=" + prioridad + "}";
    }
}
