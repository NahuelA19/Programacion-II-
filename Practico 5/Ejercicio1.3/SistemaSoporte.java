import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private final List<TicketSoporte> tickets;

    public SistemaSoporte() {
        this.tickets = new ArrayList<>();
    }

    // Métodos principales
    public TicketSoporte crearTicket(String descripcion) {
        TicketSoporte ticket = new TicketSoporte(descripcion);
        tickets.add(ticket);
        return ticket;
    }

    public TicketSoporte crearTicket(String descripcion, Usuario usuario) {
        TicketSoporte ticket = new TicketSoporte(descripcion, usuario);
        tickets.add(ticket);
        return ticket;
    }

    //Asignar un tecnico
    public void asignarTecnico(int idTicket, Tecnico tecnico) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == idTicket) {
                ticket.asignarTecnico(tecnico);
                return;
            }
        }
        System.out.println("No se encontró el ticket con ID: " + idTicket);
    }

    //Cerrar el ticket
    public void cerrarTicket(int idTicket) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == idTicket) {
                ticket.cerrarTicket();
                return;
            }
        }
        System.out.println("No se encontró el ticket con ID: " + idTicket);
    }

    // Métodos para la  consulta
    public List<TicketSoporte> getTodosLosTickets() {
        return new ArrayList<>(tickets);
    }

    public List<TicketSoporte> getTicketsAbiertos() {
        List<TicketSoporte> abiertos = new ArrayList<>();
        for (TicketSoporte ticket : tickets) {
            if ("abierto".equals(ticket.getEstado()) || "en proceso".equals(ticket.getEstado())) {
                abiertos.add(ticket);
            }
        }
        return abiertos;
    }

    public List<TicketSoporte> getTicketsCerrados() {
        List<TicketSoporte> cerrados = new ArrayList<>();
        for (TicketSoporte ticket : tickets) {
            if ("cerrado".equals(ticket.getEstado())) {
                cerrados.add(ticket);
            }
        }
        return cerrados;
    }


    //Generar el reporte
    public void generarReporte() {
        System.out.println("\n=== REPORTE DE TICKETS ===");
        System.out.println("Total tickets creados: " + TicketSoporte.getContadorTickets());
        System.out.println("Tickets abiertos/en proceso: " + getTicketsAbiertos().size());
        System.out.println("Tickets cerrados: " + getTicketsCerrados().size());

        System.out.println("\n=== DETALLE DE TICKETS ===");
        for (TicketSoporte ticket : tickets) {
            System.out.println(ticket);
            System.out.println("---------------------");
        }
    }
}
