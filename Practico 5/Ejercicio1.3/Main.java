
    public class Main {
        public static void main(String[] args) {
            // Crear usuario
            Usuario usuario1 = new Usuario(1, "Ana López", "ana@example.com");
            Usuario usuario2 = new Usuario(2, "Carlos Ruiz", "carlos@example.com");

            // Crear técnico
            Tecnico tecnico1 = new Tecnico(1, "María García", "Hardware");
            Tecnico tecnico2 = new Tecnico(2, "Pedro Martínez", "Software");


            SistemaSoporte sistema = new SistemaSoporte();

            // Crear tickets
            sistema.crearTicket("Monitor no enciende", usuario1);
            sistema.crearTicket("Error al iniciar la aplicación", usuario2);
            TicketSoporte ticket3 = sistema.crearTicket("Teclado no funciona");

            // Asignar técnicos
            sistema.asignarTecnico(1, tecnico1);
            sistema.asignarTecnico(2, tecnico2);

            // Cerrar un ticket
            sistema.cerrarTicket(2);

            // Mostrar los datos del reporte
            sistema.generarReporte();

            // Mostrar información de un ticket x
            System.out.println("\nInformación del Ticket #3:");
            System.out.println(ticket3);
        }
    }

