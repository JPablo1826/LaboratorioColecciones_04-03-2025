package QuintoPunto;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*Crear una lista de productos de tipo HashMap,
otra lista de tipo LinkedHashMap y otra de tipo
TreeMap y explicar las diferencias de cada una.*/

public class ComparacionMaps {
    public static void main(String[] args) {
        // HashMap: No garantiza orden, Guarda los datos sin orden. Son rápidos, pero los elementos
        // pueden aparecer en cualquier posición
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Perro", 4);
        hashMap.put("Gato", 1);
        hashMap.put("Raton", 3);
        System.out.println("HashMap (Sin orden garantizado): " + hashMap);

        // LinkedHashMap: Mantiene el orden con el que se ingreso
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Perro", 4);
        linkedHashMap.put("Gato", 1);
        linkedHashMap.put("Raton", 3);
        System.out.println("LinkedHashMap (Orden de inserción): " + linkedHashMap);

        // TreeMap: Ordena automáticamente las claves, de menor a mayor
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Perro", 4);
        treeMap.put("Gato", 1);
        treeMap.put("Raton", 3);
        System.out.println("TreeMap (Ordenado por clave): " + treeMap);
    }
}
