package DuodecimoPunto;

import java.util.TreeSet;

public class ListaEstudiantes {
    private TreeSet<String> estudiantes;

    public ListaEstudiantes() {
        this.estudiantes = new TreeSet<>();
    }

    public void agregarEstudiante(String nombre) {
        if (estudiantes.add(nombre)) {
            System.out.println("Estudiante agregado: " + nombre);
        } else {
            System.out.println("El estudiante '" + nombre + "' ya está en la lista.");
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("Lista de estudiantes ordenados: " + estudiantes);
    }

    public void mostrarPrimerYUltimo() {
        if (!estudiantes.isEmpty()) {
            System.out.println("Primer estudiante: " + estudiantes.first());
            System.out.println("Último estudiante: " + estudiantes.last());
        } else {
            System.out.println("La lista de estudiantes está vacía.");
        }
    }
}
