import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //Creamos un objeto sistema para agregar y mostrar los otros objetos que creemos más adelante
        Sistema sistema = new Sistema();

        // Crear un cliente
        Cliente cliente1 = new Cliente(
                "c1", "Mario Melendez", "123456789", "Jurídica", "74356789",
                "mario@gmail.com", "Calle 123, Ciudad", "Activo", "Admin", LocalDate.now(), "Activo"
        );
        sistema.agregarCliente(cliente1);
        //Obtener una propiedad del objeto
        System.out.println(cliente1.getNombre());

        //segundo cliente con menos parametros
        Cliente cliente2 = new Cliente("c2","Carlos Gomez","233566","juridica");
        sistema.agregarCliente(cliente2);


        // Crear un empleado
        Empleado empleado1 = new Empleado(
                "E1", "Danilo Martinez", "987654321", "Natural", "987654321",
                "danilo@gmail.com", "Avenida 456, Ciudad", "Activo", "Admin", LocalDate.now(), "Por Horas"
        );
        sistema.agregarEmpleado(empleado1);

        //Cotizacion
        LocalDate fechaInicio = LocalDate.of(2023, 10, 25);
        LocalDate fechaFin = LocalDate.parse("2023-11-01");

        Cotizacion cotizacion1 = new Cotizacion("1",cliente1,35,fechaInicio,fechaFin,100.00,50.00,"En proceso");
        sistema.agregarCotizacion(cotizacion1);

        Cotizacion cotizacion2 = new Cotizacion("2",cliente2,35,fechaInicio,fechaFin,100.00,50.00,"Finalizada");
        sistema.agregarCotizacion(cotizacion2);


        //Actividad
        LocalDateTime fechaHoraInicio = LocalDateTime.of(2023, 10, 25, 9, 0); // Fecha y hora específica
        LocalDateTime fechaHoraFin = LocalDateTime.parse("2023-10-25T17:00:00");
        Actividad actividad1 = new Actividad("programar en java",empleado1,"computacion",20,fechaHoraInicio,fechaHoraFin,100, 100, 50);
        sistema.agregarActividad(actividad1);

        //Asignacion
        Asignacion asignacion1 = new Asignacion("a1","programar en js","hacer aplicacion web js");
        sistema.agregarAsignacion(asignacion1);

        sistema.mostrarClientes();
        sistema.mostrarEmpleados();
        sistema.mostrarCotizaciones();
        sistema.mostrarActividades();
        sistema.mostrarAsignaciones();

    }
}