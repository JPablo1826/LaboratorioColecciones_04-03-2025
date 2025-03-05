package PrimerPunto;

import java.util.TreeSet;

public class Empresa {

    TreeSet<Producto> ListaProductos;

    public Empresa(TreeSet<Producto> ListaProductos) {
        this.ListaProductos = ListaProductos;
    }

    public Producto buscarProducto(String codigo) {
        for(Producto producto : ListaProductos) {
            if(producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }


}