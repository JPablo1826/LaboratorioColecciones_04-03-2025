package SextoPunto;

import java.util.ArrayList;
import java.util.Comparator;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }

    public void eliminarProductoPorCodigo(String codigo) {
        productos.removeIf(p -> p.getCodigo().equals(codigo));
        System.out.println("Producto con código " + codigo + " eliminado.");
    }

    public Producto buscarProducto(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public void listarProductosPorNombre() {
        productos.sort(Comparator.comparing(Producto::getNombre));
        System.out.println("Inventario ordenado por nombre: " + productos);
    }

    public void listarProductosPorPrecio() {
        productos.sort(Comparator.comparingDouble(Producto::getPrecio));
        System.out.println("Inventario ordenado por precio: " + productos);
    }
}
