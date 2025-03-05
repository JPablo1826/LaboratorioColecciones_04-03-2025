package SegundoPunto;


/*Cree una pila (Stack) que pueda almacenar objetos de
diferentes tipos y que solo permite insertar elementos
si el tipo del objeto coincide con el tipo del elemento
en la cima de la pila.*/

public class Main {
    public static void main(String[] args) {
        Pila pilaAnimales = new Pila();

        Animal perro1 = new Animal("Perro");
        Animal perro2 = new Animal("Perro");
        Animal perro3 = new Animal("Perro");
        Animal gato1 = new Animal("Gato");
        Animal gato2 = new Animal("Gato");
        Animal gato3 = new Animal("Gato");

        // Agregamos perros a la pila
        pilaAnimales.agregarElemento(perro1);
        pilaAnimales.agregarElemento(perro2);
        pilaAnimales.agregarElemento(perro3);

        pilaAnimales.mostrarPila();

        // Eliminamos un perro
        pilaAnimales.eliminarElemento();
        pilaAnimales.mostrarPila();

        // Intentamos agregar un gato (debería dar error)
        pilaAnimales.agregarElemento(gato1);

        // Vaciamos la pila
        pilaAnimales.eliminarElemento();
        pilaAnimales.eliminarElemento();

        // Ahora sí podemos agregar gatos
        pilaAnimales.agregarElemento(gato1);
        pilaAnimales.agregarElemento(gato2);
        pilaAnimales.agregarElemento(gato3);

        pilaAnimales.mostrarPila();
    }
}
