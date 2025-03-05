package DecimoPunto;
import java.util.Scanner;

/*
En un edificio con control de acceso, los empleados deben
identificarse mediante un código único para poder ingresar.
Para gestionar estos accesos sin permitir duplicados,
se utilizará un HashSet, donde cada ID de empleado será almacenado
y verificado antes de permitir la entrada.
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlAcceso control = new ControlAcceso();

        // Registrar empleados
        control.registrarEmpleado("1234");
        control.registrarEmpleado("1032");
        control.registrarEmpleado("4352");
        control.registrarEmpleado("1234"); // Intento de registro duplicado

        // Verificar acceso

        // Verificar acceso
        System.out.print("Ingrese su ID para acceder: ");
        String idIngresado = scanner.nextLine();
        control.verificarAcceso(idIngresado);

        // Mostrar empleados registrados
        control.mostrarEmpleados();

        scanner.close();

        scanner.close();
    }

}
