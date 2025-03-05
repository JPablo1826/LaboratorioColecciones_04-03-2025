package DecimosextoPunto;

import java.util.Scanner;

/*En un supermercado, se desea registrar los productos comprados
en el orden en que fueron escaneados y calcular el total de la
compra. Para lograr esto, se empleará un LinkedHashMap, asegurando
que los productos y sus precios se almacenen en el mismo orden en
que se añadieron, facilitando el procesamiento de la factura final.*/

public class Main {
    public static void main(String[] args) {
        Compra carrito = new Compra();
        Scanner scanner = new Scanner(System.in);

        // Agregar productos manualmente
        System.out.println("Ingrese productos al carrito (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Nombre del producto: ");
            String producto = scanner.nextLine();
            if (producto.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer
            carrito.agregarProducto(producto, precio);
        }

        // Mostrar productos en el carrito
        carrito.mostrarFactura();

        // Calcular total de la compra
        carrito.calcularTotal();

        scanner.close();
    }
}

