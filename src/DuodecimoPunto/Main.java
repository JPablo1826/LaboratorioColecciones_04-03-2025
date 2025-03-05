package DuodecimoPunto;

import java.util.Scanner;

/*
En una universidad, los nombres de los estudiantes deben
mantenerse ordenados alfabéticamente para facilitar su
búsqueda. Para ello, se utilizará un TreeSet, que automáticamente
organizará los nombres de los estudiantes a medida que se agregan
y permitirá obtener fácilmente el primer y el último nombre de la lista.
*/

public class Main {
    public static void main(String[] args) {
        ListaEstudiantes lista = new ListaEstudiantes();
        Scanner scanner = new Scanner(System.in);

        // Permitir ingreso manual de estudiantes
        System.out.println("Ingrese nombres de estudiantes (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            lista.agregarEstudiante(nombre);
        }

        // Mostrar lista ordenada
        lista.mostrarEstudiantes();

        // Mostrar el primer y último estudiante
        lista.mostrarPrimerYUltimo();

        scanner.close();
    }
}
