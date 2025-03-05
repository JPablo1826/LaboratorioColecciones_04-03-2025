package DecimoquintoPunto;

import java.util.Scanner;

/*Un directorio telefónico necesita almacenar nombres
junto con sus respectivos números de teléfono y permitir
búsquedas eficientes. Para este caso, se usará un HashMap,
el cual asociará cada nombre con su número telefónico, posibilitando
consultas rápidas y evitando duplicados.*/

public class Main {
    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();
        Scanner scanner = new Scanner(System.in);

        // Agregar contactos manualmente
        System.out.println("Ingrese contactos (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Número de teléfono: ");
            String telefono = scanner.nextLine();
            directorio.agregarContacto(nombre, telefono);
        }

        // Buscar un contacto
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombreBuscar = scanner.nextLine();
        directorio.buscarContacto(nombreBuscar);

        // Mostrar todos los contactos
        directorio.mostrarContactos();

        scanner.close();
    }
}
