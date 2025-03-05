package DecimoseptimoPunto;

import java.util.Scanner;

/*En una agenda de eventos, es fundamental organizar
las actividades según su fecha de realización. Para
cumplir con este requerimiento, se usará un TreeMap,
que almacenará los eventos con sus respectivas fechas
como clave, garantizando que siempre se mantengan ordenados
cronológicamente y permitiendo acceder de manera eficiente
al evento más próximo.*/


public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        Scanner scanner = new Scanner(System.in);

        // Agregar eventos manualmente
        System.out.println("Ingrese eventos en la agenda (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Fecha del evento (YYYY-MM-DD): ");
            String fecha = scanner.nextLine();
            if (fecha.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Descripción del evento: ");
            String evento = scanner.nextLine();
            agenda.agregarEvento(fecha, evento);
        }

        // Mostrar todos los eventos ordenados
        agenda.mostrarEventos();

        // Mostrar el evento más próximo
        agenda.mostrarEventoMasProximo();

        scanner.close();
    }
}
