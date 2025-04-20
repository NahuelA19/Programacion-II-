import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("1","Fideos", Producto.CategoriaProducto.ALIMENTOS,10,100);
        Producto p2 = new Producto("2","Jean", Producto.CategoriaProducto.ROPA,1000,10);
        Producto p3 = new Producto("3","Heladera", Producto.CategoriaProducto.ELECTRONICA,10000,5);

        ArrayList<Producto> productos = new ArrayList<Producto>();



        Inventario ia = new Inventario(productos);

        ia.agregarProducto(p1);
        ia.agregarProducto(p2);
        ia.agregarProducto(p3);

        ia.listarProductos();



    }
}
