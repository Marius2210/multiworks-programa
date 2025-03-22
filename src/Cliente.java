import java.time.LocalDate;
public class Cliente extends Persona {
    private String tipoCliente;
    // Constructor
    public Cliente(String id, String nombre, String documentoIdentificacion, String tipoPersona, String telefono,
                   String correo, String direccion, String estado, String creadoPor, LocalDate fechaCreacion, String tipoCliente) {
        super(id, nombre, documentoIdentificacion, tipoPersona, telefono, correo, direccion, estado, creadoPor, fechaCreacion);
        this.tipoCliente = tipoCliente;
    }

    // Constructor 2: Sobrecargado con menos parámetros
    public Cliente(String id, String nombre, String documentoIdentificacion, String tipoPersona) {
        super(id, nombre, documentoIdentificacion, tipoPersona, "", "", "", "Activo", "Sistema", LocalDate.now());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + getId() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", documento de identificacion='" + getDocumentoIdentificacion() + '\'' +
                ", tipoPersona='" + getTipoPersona() + '\'' +
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
