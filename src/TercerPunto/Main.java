package TercerPunto;

import java.util.Scanner;

/*Crear una lista de elementos que no permite duplicados
e imprima el contenido de la lista usando iteradores.*/

public class Main {
    public static void main(String[] args) {
        ListaUnica lista = new ListaUnica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese elementos a la lista (escriba 'salir' para terminar):");
        while (true) {
            System.out.print("Ingrese un elemento: ");
            String elemento = scanner.nextLine();
            if (elemento.equalsIgnoreCase("salir")) {
                break;
            }
            lista.agregarElemento(elemento);
        }

        // Mostramos los elementos usando un iterador
        System.out.println("Elementos en la lista:");
        lista.mostrarElementos();

        scanner.close();


    }
}
