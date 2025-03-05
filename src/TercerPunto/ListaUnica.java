package TercerPunto;

import java.util.HashSet;
import java.util.Iterator;

public class ListaUnica {
    private HashSet<String> Elements;

    public ListaUnica() {
        this.Elements = new HashSet<>();
    }

    public void agregarElemento(String elemento) {
        if (Elements.add(elemento)) {
            System.out.println("Elemento agregado: " + elemento);
        } else {
            System.out.println("El elemento ya existe y no se puede duplicar.");
        }
    }

    public void mostrarElementos() {
        Iterator<String> iterador = Elements.iterator();
        System.out.println("Elementos en la lista única:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
