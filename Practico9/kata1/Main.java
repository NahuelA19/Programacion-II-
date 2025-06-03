import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection conn = ConexionBD.conectar();
        if (conn == null) return;

        GestorCategorias gestor = new GestorCategorias(conn);
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- GESTIÓN DE CATEGORÍAS ---");
            System.out.println("1. Agregar categoría");
            System.out.println("2. Mostrar categoría por ID");
            System.out.println("3. Listar categorías");
            System.out.println("4. Actualizar categoría");
            System.out.println("5. Eliminar categoría");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();
                    gestor.agregarCategoria(nombre, descripcion);
                    break;
                case 2:
                    System.out.print("ID: ");
                    int idMostrar = sc.nextInt();
                    Categoria cat = gestor.mostrarCategoria(idMostrar);
                    if (cat != null)
                        System.out.println(cat);
                    else
                        System.out.println("❌ Categoría no encontrada.");
                    break;
                case 3:
                    List<Categoria> categorias = gestor.listarCategorias();
                    for (Categoria c : categorias) {
                        System.out.println(c);
                    }
                    break;
                case 4:
                    System.out.print("ID a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva descripción: ");
                    String nuevaDesc = sc.nextLine();
                    gestor.actualizarCategoria(idActualizar, nuevoNombre, nuevaDesc);
                    break;
                case 5:
                    System.out.print("ID a eliminar: ");
                    int idEliminar = sc.nextInt();
                    gestor.eliminarCategoria(idEliminar);
                    break;
                case 0:
                    System.out.println("👋 Saliendo...");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 0);

        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar conexión.");
        }
    }
}
