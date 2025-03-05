package SextoPunto;

/*En una tienda se necesita una aplicación para gestionar
 el inventario de productos(codigo, nombre, precio),
 permitiendo agregar nuevos artículos, eliminar los que
 están agotados, buscar productos específicos y listar
 todo el inventario en orden alfabetico y por orden de
 precio. Para ello, se utilizara una ArrayList, que
 ofrece acceso rapido a los elementos y permite su
 manipulacion de manera eficiente.
 */

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregamos productos
        inventario.agregarProducto(new Producto("01", "Arroz", 2200));
        inventario.agregarProducto(new Producto("02", "Frijol", 6400));
        inventario.agregarProducto(new Producto("03", "Lenteja", 3400));
        inventario.agregarProducto(new Producto("04", "Aceite", 9600));

        // Buscar un producto
        System.out.println("Buscando producto con código 02: " + inventario.buscarProducto("02"));

        // Eliminar un producto
        inventario.eliminarProductoPorCodigo("03");

        // Listar productos ordenados
        inventario.listarProductosPorNombre();
        inventario.listarProductosPorPrecio();
    }
}
