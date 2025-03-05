package UndecimoPunto;

import java.util.LinkedHashSet;

public class ListaFavoritos {
    private LinkedHashSet<String> cancionesFavoritas;

    public ListaFavoritos() {
        this.cancionesFavoritas = new LinkedHashSet<>();
    }

    public void agregarCancion(String cancion) {
        if (cancionesFavoritas.add(cancion)) {
            System.out.println("Canción agregada a favoritos: " + cancion);
        } else {
            System.out.println("La canción '" + cancion + "' ya está en la lista de favoritos.");
        }
    }

    public void mostrarCanciones() {
        System.out.println("Lista de canciones favoritas: " + cancionesFavoritas);
    }
}
