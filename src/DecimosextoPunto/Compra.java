package DecimosextoPunto;

import java.util.LinkedHashMap;
import java.util.Map;

public class Compra {
    private Map<String, Double> Factura;

    public Compra() {
        this.Factura = new LinkedHashMap<>();
    }

    public void agregarProducto(String producto, double precio) {
        Factura.put(producto, precio);
        System.out.println("Producto agregado: " + producto + " - Precio: $" + precio);
    }

    public void calcularTotal() {
        double total = 0;
        for (double precio : Factura.values()) {
            total += precio;
        }
        System.out.println("Total de la compra: $" + total);
    }

    public void mostrarFactura() {
        System.out.println("Productos en el carrito:");
        for (Map.Entry<String, Double> entry : Factura.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }
    }
}
