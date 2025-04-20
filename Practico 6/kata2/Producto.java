public class Producto {
    private String id;
    private String nombre;
    private Double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    //Getter and Setter:


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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }


    //Enum:

    enum CategoriaProducto {
        ALIMENTOS,ELECTRONICA,ROPA,HOGAR;
    }



    //Metodos:

    public Producto() {
    }


    public Producto(String id, String nombre, int cantidad, Double precio, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.categoria = categoria;
    }




    public void mostrarInfo(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Categoria: " + categoria);

    }

    public void mostrarInfoSinCategoria(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);


    }


}
