public class Asignacion {
    private String id;
    private String tituloSubtarea;
    private String descripcionSubtarea;

    // Constructor
    public Asignacion(String id, String tituloSubtarea, String descripcionSubtarea) {
        this.id = id;
        this.tituloSubtarea = tituloSubtarea;
        this.descripcionSubtarea = descripcionSubtarea;
        validarDatos(); // Valida los datos ingresados
    }

    // Validaciones
    public void validarDatos() {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID no puede estar vacío.");
        }
        if (tituloSubtarea == null || tituloSubtarea.trim().isEmpty()) {
            throw new IllegalArgumentException("El título de la subtarea no puede estar vacío.");
        }
        if (descripcionSubtarea == null || descripcionSubtarea.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción de la subtarea no puede estar vacía.");
        }
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTituloSubtarea() {
        return tituloSubtarea;
    }

    public void setTituloSubtarea(String tituloSubtarea) {
        this.tituloSubtarea = tituloSubtarea;
    }

    public String getDescripcionSubtarea() {
        return descripcionSubtarea;
    }

    public void setDescripcionSubtarea(String descripcionSubtarea) {
        this.descripcionSubtarea = descripcionSubtarea;
    }

    // Método toString
    @Override
    public String toString() {
        return "Asignacion{" +
                "id='" + id + '\'' +
                ", tituloSubtarea='" + tituloSubtarea + '\'' +
                ", descripcionSubtarea='" + descripcionSubtarea + '\'' +
                '}';
    }
}
