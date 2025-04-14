import java.time.LocalDate;

public class TicketSoporte {
    private static int contadorTickets = 0;

    private final int id;
    private String descripcion;
    private String estado;
    private final LocalDate fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnicoAsignado;

    public TicketSoporte(String descripcion) {
        this.id = ++contadorTickets;
        this.descripcion = descripcion;
        this.estado = "abierto";
        this.fechaCreacion = LocalDate.now();
    }

    public TicketSoporte(String descripcion, Usuario usuario) {
        this(descripcion);
        this.usuario = usuario;
    }

    // Metodos principales:


    //Para cerrar el ticket
    public void cerrarTicket() {
        this.estado = "cerrado";
    }


    //Asignar tecnico:

    public void asignarTecnico(Tecnico tecnico) {
        this.tecnicoAsignado = tecnico;
        if (!"cerrado".equals(this.estado)) {
            this.estado = "en proceso";
        }
    }

    // Getters
    public static int getContadorTickets() {
        return contadorTickets;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    // Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        String infoUsuario = (usuario != null) ? "\nUsuario: " + usuario : "";
        String infoTecnico = (tecnicoAsignado != null) ? "\nTécnico: " + tecnicoAsignado : "";

        return "Ticket #" + id +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estado +
                "\nFecha creación: " + fechaCreacion +
                infoUsuario +
                infoTecnico;
    }
}