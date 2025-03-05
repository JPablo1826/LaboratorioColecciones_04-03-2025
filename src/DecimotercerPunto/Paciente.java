package DecimotercerPunto;

public class Paciente  implements Comparable<Paciente>  {
    private String nombre;
    private int gravedad; // Menor número = Mayor prioridad

    public Paciente(String nombre, int gravedad) {
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.gravedad, otro.gravedad);
    }

    @Override
    public String toString() {
        return "Paciente{nombre='" + nombre + "', gravedad=" + gravedad + "}";
    }
}
