package PrimerPunto;
import java.util.Scanner;
import java.util.TreeSet;

/* Crear la lista de productos en una clase empresa utilizando
treeset, se debe realizar un metodo que busque un producto por su código.*/
public class Main {

    public static void main(String[] args) {

        TreeSet<Producto> ListaProductos = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        Producto producto1 = new Producto("Shampooh", "1231");
        Producto producto2 = new Producto("Acondicionador", "1232");
        Producto producto3 = new Producto("Crema corporal", "1233");
        Producto producto4 = new Producto("Talco", "1234");
        Producto producto5 = new Producto("Perfume", "1235");

        ListaProductos.add(producto1);
        ListaProductos.add(producto2);
        ListaProductos.add(producto3);
        ListaProductos.add(producto4);
        ListaProductos.add(producto5);

        Empresa empresa = new Empresa(ListaProductos);

        // Solicitar al usuario el código a buscar
        System.out.print("Ingrese el código del producto a buscar: ");
        String codigoBuscar = scanner.nextLine();

        // Buscar un producto
        Producto encontrado = empresa.buscarProducto(codigoBuscar);

        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado.getNombre());
        } else {
            System.out.println("Producto no encontrado.");
        }

        scanner.close(); // Cerrar el scanner
    }
}


