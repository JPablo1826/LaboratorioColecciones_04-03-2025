package DecimotercerPunto;

import java.util.PriorityQueue;

public class Hospital {
    PriorityQueue<Paciente> colaPacientes;

    public Hospital() {
        this.colaPacientes = new PriorityQueue<>();
    }

    public void agregarPaciente(Paciente paciente) {
        colaPacientes.add(paciente);
        System.out.println("Paciente agregado: " + paciente);
    }

    public void atenderPaciente() {
        if (!colaPacientes.isEmpty()) {
            System.out.println("Atendiendo a: " + colaPacientes.poll());
        } else {
            System.out.println("No hay pacientes en espera.");
        }
    }

    public void mostrarPacientes() {
        System.out.println("Pacientes en espera: " + colaPacientes);
    }
}
