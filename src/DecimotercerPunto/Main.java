package DecimotercerPunto;

import java.util.Scanner;


/*
En un hospital, los pacientes deben ser atendidos según
la gravedad de su condición, con los más urgentes siendo
tratados primero. Para manejar esto, se implementará una
PriorityQueue, donde cada paciente será ingresado con un
nivel de prioridad y el sistema garantizará que aquellos
con mayor urgencia sean atendidos antes que los demás.
*/

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        // Permitir ingreso manual de pacientes
        System.out.println("Ingrese los pacientes (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Nombre del paciente: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Nivel de gravedad (menor número = mayor prioridad): ");
            int gravedad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            hospital.agregarPaciente(new Paciente(nombre, gravedad));
        }

        // Atender pacientes en orden de prioridad
        System.out.println("Atendiendo pacientes...");
        while (!hospital.colaPacientes.isEmpty()) {
            hospital.atenderPaciente();
        }

        scanner.close();
    }
}
