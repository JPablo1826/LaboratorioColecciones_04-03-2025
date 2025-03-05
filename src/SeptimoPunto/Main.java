package SeptimoPunto;

/*En un banco, el sistema de atención al cliente debe manejar
 los turnos de manera ordenada. Para lograrlo, se empleará una
 LinkedList (String), la cual permitirá agregar clientes en la
  cola de espera, atender al primero en la lista y ofrecer una funcionalidad
  especial para insertar clientes con urgencia al inicio de la cola sin afectar el rendimiento.*/

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Agregar clientes a la cola
        banco.agregarCliente("Pablo");
        banco.agregarCliente("Dios");
        banco.agregarCliente("CastroV");
        banco.mostrarCola();

        // Agregar cliente urgente
        banco.agregarClienteUrgente("Juan");
        banco.mostrarCola();

        // Atender clientes
        banco.atenderCliente();
        banco.atenderCliente();
        banco.atenderCliente();
        banco.mostrarCola();
    }
}
