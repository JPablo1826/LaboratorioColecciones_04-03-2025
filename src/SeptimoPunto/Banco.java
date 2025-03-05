package SeptimoPunto;

import java.util.LinkedList;

public class Banco {
    private LinkedList<String> colaClientes;

    public Banco() {
        this.colaClientes = new LinkedList<>();
    }

    public void agregarCliente(String cliente) {
        colaClientes.addLast(cliente);
        System.out.println("Cliente agregado a la cola: " + cliente);
    }

    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            System.out.println("Atendiendo a: " + colaClientes.removeFirst());
        } else {
            System.out.println("No hay clientes en la cola.");
        }
    }

    public void agregarClienteUrgente(String cliente) {
        colaClientes.addFirst(cliente);
        System.out.println("Cliente urgente agregado al inicio: " + cliente);
    }

    public void mostrarCola() {
        System.out.println("Clientes en espera: " + colaClientes);
    }
}
