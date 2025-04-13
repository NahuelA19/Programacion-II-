public class TicketSoporte {

    private int id ;

    private String descripcion;

    private String estado = "Abierto";

    private String fechaCreacion;

    private Usuario usuario;

    private String aux;

    public TicketSoporte() {
    }

    

    public TicketSoporte(int id, String descripcion, String fechaCreacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public TicketSoporte(int id, String descripcion, String fechaCreacion,Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;

    }

     

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getDescripcion() {
        return descripcion;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public String getEstado() {
        return estado;
    }



    public void setEstado(String estado) {
        this.estado = estado;
    }



    public String getFechaCreacion() {
        return fechaCreacion;
    }



    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }



    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public void cerrarTicket(){
        System.out.println("Cerrando el ticket...............");
        setEstado("Cerrado");
        System.out.println("El estado actual del ticket es: " +this.estado);

    }



    public void asignarTecnico(String tecnico){
    
       System.out.println("Asignando un tecnico..........");

       aux = tecnico;
    }



    public void mostrarDetalle(){
                
        System.out.println("Id del ticket: " +this.id);
        System.out.println("Descripcion: " +this.descripcion);
        System.out.println("Fecha: " + this.fechaCreacion);
        System.out.println("Estado actual: " + this.estado);
        System.out.println("El tecnico designado para este caso es: " + aux);

    }



   
    
    public void mostrarDetalle(Usuario usuario){
        
        System.out.println("El ticket fue creado por: " +this.usuario.getNombre());
        
        System.out.println("Id del ticket: " +this.id);
        System.out.println("Descripcion: " +this.descripcion);
        System.out.println("Fecha: " + this.fechaCreacion);
        System.out.println("Estado actual: " + this.estado);
        System.out.println("El tecnico designado para este caso es: " + aux);


    }


   

}
