package NovenoPunto;

/*
En la navegación web, los usuarios necesitan poder retroceder
a páginas anteriores. Para este propósito, se usará un
Stack, que funciona como una pila LIFO (Last In, First Out).
Cada vez que el usuario visite una nueva página, esta se añadirá a la pila,
y cuando decida volver atrás, se eliminará la última página visitada para
regresar a la anterior.
 */

public class Main {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();

        // Visitar páginas
        navegador.visitarPagina("https://uniquindio.com.co");
        navegador.visitarPagina("https://sac");
        navegador.visitarPagina("https://instagram.com");
        navegador.mostrarHistorial();

        // Retroceder en la navegación
        navegador.retroceder();
        navegador.retroceder();
        navegador.retroceder(); // No puede retroceder más
    }
}
