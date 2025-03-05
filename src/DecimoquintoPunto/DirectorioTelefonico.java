package DecimoquintoPunto;

import java.util.HashMap;
import java.util.Map;

public class DirectorioTelefonico {
    private Map<String, String> directorio;

    public DirectorioTelefonico() {
        this.directorio = new HashMap<>();
    }

    public void agregarContacto(String nombre, String telefono) {
        directorio.put(nombre, telefono);
        System.out.println("Contacto agregado: " + nombre + " - " + telefono);
    }

    public void buscarContacto(String nombre) {
        if (directorio.containsKey(nombre)) {
            System.out.println("Número de " + nombre + ": " + directorio.get(nombre));
        } else {
            System.out.println("El contacto " + nombre + " no existe.");
        }
    }

    public void mostrarContactos() {
        System.out.println("Directorio telefónico:");
        for (Map.Entry<String, String> entry : directorio.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
