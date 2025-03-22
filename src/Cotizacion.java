import java.time.LocalDate;

public class Cotizacion {
    private String numeroCotizacion;
    private Cliente cliente;
    private int cantidadHorasProyecto;
    private LocalDate fechaInicioTentativa;
    private LocalDate fechaFinTentativa;
    private double costoAsignaciones;
    private double costosAdicionales;
    private double total;
    private String estado; // "En proceso" o "Finalizada"

    // Constructor
    public Cotizacion(String numeroCotizacion, Cliente cliente, int cantidadHorasProyecto, LocalDate fechaInicioTentativa,
                      LocalDate fechaFinTentativa, double costoAsignaciones, double costosAdicionales, String estado) {
        this.numeroCotizacion = numeroCotizacion;
        this.cliente = cliente;
        this.cantidadHorasProyecto = cantidadHorasProyecto;
        this.fechaInicioTentativa = fechaInicioTentativa;
        this.fechaFinTentativa = fechaFinTentativa;
        this.costoAsignaciones = costoAsignaciones;
        this.costosAdicionales = costosAdicionales;
        this.estado = estado;
        this.total = calcularTotal();
        validarDatos();
    }

    // Método para calcular el total
    private double calcularTotal() {
        return this.costoAsignaciones + this.costosAdicionales;
    }

    // Validaciones
    public void validarDatos() {
        if (fechaFinTentativa.isBefore(fechaInicioTentativa)) {
            throw new IllegalArgumentException("La fecha de fin no puede ser anterior a la fecha de inicio.");
        }
        if (cantidadHorasProyecto < 0 || costoAsignaciones < 0 || costosAdicionales < 0) {
            throw new IllegalArgumentException("Los valores no pueden ser negativos.");
        }
        if (!estado.equals("En proceso") && !estado.equals("Finalizada")) {
            throw new IllegalArgumentException("El estado debe ser 'En proceso' o 'Finalizada'.");
        }
    }

    // Getters y setters
    public String getNumeroCotizacion() {
        return numeroCotizacion;
    }

    public void setNumeroCotizacion(String numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidadHorasProyecto() {
        return cantidadHorasProyecto;
    }

    public void setCantidadHorasProyecto(int cantidadHorasProyecto) {
        this.cantidadHorasProyecto = cantidadHorasProyecto;
    }

    public LocalDate getFechaInicioTentativa() {
        return fechaInicioTentativa;
    }

    public void setFechaInicioTentativa(LocalDate fechaInicioTentativa) {
        this.fechaInicioTentativa = fechaInicioTentativa;
    }

    public LocalDate getFechaFinTentativa() {
        return fechaFinTentativa;
    }

    public void setFechaFinTentativa(LocalDate fechaFinTentativa) {
        this.fechaFinTentativa = fechaFinTentativa;
    }

    public double getCostoAsignaciones() {
        return costoAsignaciones;
    }

    public void setCostoAsignaciones(double costoAsignaciones) {
        this.costoAsignaciones = costoAsignaciones;
        this.total = calcularTotal(); // Recalcula el total al modificar los costos
    }

    public double getCostosAdicionales() {
        return costosAdicionales;
    }

    public void setCostosAdicionales(double costosAdicionales) {
        this.costosAdicionales = costosAdicionales;
        this.total = calcularTotal(); // Recalcula el total al modificar los costos
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cotizacion{" +
                "numeroCotizacion='" + numeroCotizacion + '\'' +
                ", cliente=" + cliente.getNombre() +
                ", cantidadHorasProyecto=" + cantidadHorasProyecto +
                ", fechaInicioTentativa=" + fechaInicioTentativa +
                ", fechaFinTentativa=" + fechaFinTentativa +
                ", costoAsignaciones=" + costoAsignaciones +
                ", costosAdicionales=" + costosAdicionales +
                ", total=" + total +
                ", estado='" + estado + '\'' +
                '}';
    }
}