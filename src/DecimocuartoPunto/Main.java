package DecimocuartoPunto;

import java.util.Scanner;

/*En una aplicación de mensajería, se requiere un historial
de los últimos mensajes enviados. Para lograrlo, se utilizará
un ArrayDeque, que permitirá agregar nuevos mensajes al final
de la estructura y recuperar los últimos diez mensajes enviados
de manera rápida y eficiente.*/

public class Main {
    public static void main(String[] args) {
        HistorialMensajes historial = new HistorialMensajes();
        Scanner scanner = new Scanner(System.in);

        // Permitir ingreso manual de mensajes
        System.out.println("Ingrese mensajes (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Mensaje: ");
            String mensaje = scanner.nextLine();
            if (mensaje.equalsIgnoreCase("fin")) {
                break;
            }
            historial.agregarMensaje(mensaje);
        }

        // Mostrar historial de mensajes
        historial.mostrarHistorial();

        scanner.close();
    }
}
