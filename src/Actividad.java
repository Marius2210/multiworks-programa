import java.time.LocalDateTime;

public class Actividad {
    private String titulo;
    private Empleado trabajadorAsignado;
    private String areaAsignada;
    private double costoPorHora;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private int cantidadHoras;
    private double costoBase;
    private double incrementoExtra; // Porcentaje
    private double total;

    // Constructor
    public Actividad(String titulo, Empleado trabajadorAsignado, String areaAsignada, double costoPorHora,
                     LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, int cantidadHoras,
                     double costoBase, double incrementoExtra) {
        this.titulo = titulo;
        this.trabajadorAsignado = trabajadorAsignado;
        this.areaAsignada = areaAsignada;
        this.costoPorHora = costoPorHora;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.cantidadHoras = cantidadHoras;
        this.costoBase = costoBase;
        this.incrementoExtra = incrementoExtra;
        this.total = calcularTotal(); // Calcula el total automáticamente
        validarDatos(); // Valida los datos ingresados
    }

    // Método para calcular el total
    private double calcularTotal() {
        return this.costoBase + (this.costoBase * this.incrementoExtra / 100);
    }

    // Validaciones
    public void validarDatos() {
        if (fechaHoraFin.isBefore(fechaHoraInicio)) {
            throw new IllegalArgumentException("La fecha y hora de fin no pueden ser anteriores a la fecha y hora de inicio.");
        }
        if (costoBase < 0 || incrementoExtra < 0 || cantidadHoras < 0 || costoPorHora < 0) {
            throw new IllegalArgumentException("Los valores no pueden ser negativos.");
        }
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Empleado getTrabajadorAsignado() {
        return trabajadorAsignado;
    }

    public void setTrabajadorAsignado(Empleado trabajadorAsignado) {
        this.trabajadorAsignado = trabajadorAsignado;
    }

    public String getAreaAsignada() {
        return areaAsignada;
    }

    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = areaAsignada;
    }

    public double getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(double costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
        this.total = calcularTotal(); // Recalcula el total al modificar el costo base
    }

    public double getIncrementoExtra() {
        return incrementoExtra;
    }

    public void setIncrementoExtra(double incrementoExtra) {
        this.incrementoExtra = incrementoExtra;
        this.total = calcularTotal(); // Recalcula el total al modificar el incremento extra
    }

    public double getTotal() {
        return total;
    }

    // Método toString
    @Override
    public String toString() {
        return "Actividad{" +
                "titulo='" + titulo + '\'' +
                ", trabajadorAsignado=" + trabajadorAsignado.getNombre() +
                ", areaAsignada='" + areaAsignada + '\'' +
                ", costoPorHora=" + costoPorHora +
                ", fechaHoraInicio=" + fechaHoraInicio +
                ", fechaHoraFin=" + fechaHoraFin +
                ", cantidadHoras=" + cantidadHoras +
                ", costoBase=" + costoBase +
                ", incrementoExtra=" + incrementoExtra +
                ", total=" + total +
                '}';
    }
}
