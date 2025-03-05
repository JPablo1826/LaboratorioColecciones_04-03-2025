package UndecimoPunto;
import java.util.Scanner;

/*
En una aplicación de música, los usuarios pueden marcar canciones
como favoritas. Para garantizar que las canciones favoritas se
mantengan en el orden en que fueron añadidas sin permitir duplicados,
se empleará un LinkedHashSet, el cual conservará la secuencia de inserción
y asegurará que no haya repeticiones.
*/

public class Main {
    public static void main(String[] args) {
        ListaFavoritos favoritos = new ListaFavoritos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese sus canciones favoritas (escriba 'salir' para terminar):");
        while (true) {
            System.out.print("Ingrese una canción: ");
            String cancion = scanner.nextLine();

            if (cancion.equalsIgnoreCase("salir")) {
                break;
            }

            favoritos.agregarCancion(cancion);
        }

        // Mostrar lista de favoritos
        favoritos.mostrarCanciones();

        scanner.close();
    }
}
