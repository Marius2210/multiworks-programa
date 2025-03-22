import java.time.LocalDate;

public class Empleado extends Persona {
    private String tipoContratacion; // "Permanente" o "Por Horas"

    // Constructor
    public Empleado(String id, String nombre, String documentoIdentificacion, String tipoPersona, String telefono,
                    String correo, String direccion, String estado, String creadoPor, LocalDate fechaCreacion, String tipoContratacion) {
        super(id, nombre, documentoIdentificacion, tipoPersona, telefono, correo, direccion, estado, creadoPor, fechaCreacion);
        this.tipoContratacion = tipoContratacion;
    }

    // Getters y setters específicos de Empleado
    public String getTipoContratacion() {
        return tipoContratacion;
    }

    public void setTipoContratacion(String tipoContratacion) {
        this.tipoContratacion = tipoContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + getId() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", documento de identificacion='" + getDocumentoIdentificacion() + '\'' +
                ", tipoPersona='" + getTipoPersona() + '\'' +
                ", tipoContratacion='" + getTipoContratacion() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", estado='" + getEstado() + '\'' +
                ", creado por='" + getCreadoPor() + '\'' +
                ", fecha de creacion='" + getFechaCreacion() + '\'' +
                ", fecha de actualizacion='" + getFechaActualizacion() + '\'' +
                ", fecha de inactivacion='" + getFechaInactivacion() + '\'' +
                '}';
    }
}
