import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<Producto>();


        Producto p1 = new Producto("1","Campera",100,49999.99, Producto.CategoriaProducto.ROPA);
        Producto p2 = new Producto("2","Heladera",5,684999.99, Producto.CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("3","Arroz",500,14599.99, Producto.CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("4","Sabanas 2 Plazas",7,44999.99, Producto.CategoriaProducto.HOGAR);


        Inventario inventario = new Inventario(productos);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);

        inventario.buscarProductoPorId("1");



        inventario.filtrarPorCategoria(Producto.CategoriaProducto.ELECTRONICA);

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");

        inventario.eliminarProductoPorId("2");


        inventario.listarProductos();



    }

}
