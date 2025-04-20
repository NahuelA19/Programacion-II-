public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;

    private CategoriaProducto categoria;

    enum CategoriaProducto {
        ALIMENTOS,ELECTRONICA,ROPA,HOGAR;
    }

    //Getter and Setter:

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


    //Metodos:

    public Producto() {
    }

    public Producto(String id, String nombre, CategoriaProducto categoria, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }




}
