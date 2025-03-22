import java.util.ArrayList; // Para usar ArrayList
import java.util.List; // Para usar List

public class Sistema {
    private List<Cliente> clientes;
    private List<Empleado> empleados;
    private List<Actividad> actividades;
    private List<Asignacion> asignaciones;
    private List<Cotizacion> cotizaciones;

    public Sistema() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
        actividades = new ArrayList<>();
        asignaciones = new ArrayList<>();
        cotizaciones = new ArrayList<>();
    }

    // Métodos para agregar clientes, empleados, actividades, asignaciones y cotizaciones
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    public void agregarAsignacion(Asignacion asignacion) {
        asignaciones.add(asignacion);
    }

    public void agregarCotizacion(Cotizacion cotizacion) {
        cotizaciones.add(cotizacion);
    }

    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }

    public void mostrarActividades() {
        if (actividades.isEmpty()) {
            System.out.println("No hay actividades registradas.");
        } else {
            System.out.println("Lista de actividades:");
            for (Actividad actividad : actividades) {
                System.out.println(actividad);
            }
        }
    }

    public void mostrarCotizaciones() {
        if (cotizaciones.isEmpty()) {
            System.out.println("No hay cotizaciones registradas.");
        } else {
            System.out.println("Lista de cotizaciones:");
            for (Cotizacion cotizacion : cotizaciones) {
                System.out.println(cotizacion);
            }
        }
    }

    public void mostrarAsignaciones() {
        if (asignaciones.isEmpty()) {
            System.out.println("No hay asignaciones registradas.");
        } else {
            System.out.println("Lista de asignaciones:");
            for (Asignacion asignacion : asignaciones) {
                System.out.println(asignacion);
            }
        }
    }

}

