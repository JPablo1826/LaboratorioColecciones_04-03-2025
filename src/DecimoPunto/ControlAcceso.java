package DecimoPunto;

import java.util.HashSet;

public class ControlAcceso {
    private HashSet<String> empleadosAutorizados;

    public ControlAcceso() {
        this.empleadosAutorizados = new HashSet<>();
    }

    public void registrarEmpleado(String id) {
        if (empleadosAutorizados.add(id)) {
            System.out.println("Empleado registrado con ID: " + id);
        } else {
            System.out.println("Error: El ID " + id + " ya está registrado.");
        }
    }

    public boolean verificarAcceso(String id) {
        if (empleadosAutorizados.contains(id)) {
            System.out.println("Acceso permitido para ID: " + id);
        } else {
            System.out.println("Acceso denegado para ID: " + id);
        }
        return false;
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados registrados: " + empleadosAutorizados);
    }
}
