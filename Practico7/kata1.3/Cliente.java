public class Cliente implements Notificable {
    private String nombre;
    private String email;
    private Pedido pedido;

    public Cliente() {
    }

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {

        System.out.println( mensaje);

    }
}
