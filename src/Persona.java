import java.time.LocalDate;

public abstract class Persona {
    private String id;
    private String nombre;
    private String documentoIdentificacion;
    private String tipoPersona;
    private String telefono;
    private String correo;
    private String direccion;
    private String estado;
    private String creadoPor;
    private LocalDate fechaCreacion;
    private LocalDate fechaActualizacion;
    private LocalDate fechaInactivacion;

    // Constructor
    public Persona(String id, String nombre, String documentoIdentificacion, String tipoPersona, String telefono,
                   String correo, String direccion, String estado, String creadoPor, LocalDate fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.documentoIdentificacion = documentoIdentificacion;
        this.tipoPersona = tipoPersona;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.estado = estado;
        this.creadoPor = creadoPor;

        this.fechaCreacion = fechaCreacion;
        //las fechas por defecto
        this.fechaActualizacion = LocalDate.now();
        this.fechaInactivacion = LocalDate.now();
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(String documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public LocalDate getFechaInactivacion() {
        return fechaInactivacion;
    }

    public void setFechaInactivacion(LocalDate fechaInactivacion) {
        this.fechaInactivacion = fechaInactivacion;
    }
}
