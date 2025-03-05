package SegundoPunto;

import java.util.Stack;

public class Pila {
    private Stack<Animal> animales;

    public Pila() {
        this.animales = new Stack<>();
    }

    public void agregarElemento(Animal animal) {
        if (animales.empty()) {
            animales.push(animal);
        } else {
            if (animales.peek().getEspecie().equals(animal.getEspecie())) {
                animales.push(animal);
            } else {
                System.out.println("Error: Solo se pueden agregar elementos del mismo tipo que el tope de la pila.");
            }
        }
    }
    public void eliminarElemento() { // Elimina solo el último elemento (LIFO)
        if (!animales.isEmpty()) {
            System.out.println("Elemento eliminado: " + animales.pop());
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    public void mostrarPila() {
        System.out.println("Contenido de la pila:");
        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }




}