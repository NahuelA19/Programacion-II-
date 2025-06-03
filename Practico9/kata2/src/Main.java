import model.Categoria;
import service.CategoriaServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CategoriaServiceImpl service = new CategoriaServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== GESTOR DE CATEGORÍAS ===");
            System.out.println("1. Crear categoría");
            System.out.println("2. Listar categorías");
            System.out.println("3. Leer categoría por ID");
            System.out.println("4. Actualizar categoría");
            System.out.println("5. Eliminar categoría");
            System.out.println("0. Salir");
            System.out.print("Elegí una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();
                    Categoria nueva = new Categoria(nombre, descripcion);
                    if (service.crear(nueva)) {
                        System.out.println("✅ Categoría creada con éxito.");
                    }
                    break;

                case 2:
                    List<Categoria> lista = service.listar();
                    if (lista.isEmpty()) {
                        System.out.println("No hay categorías.");
                    } else {
                        for (Categoria c : lista) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 3:
                    System.out.print("ID de la categoría: ");
                    int idLeer = scanner.nextInt();
                    Categoria encontrada = service.leer(idLeer);
                    if (encontrada != null) {
                        System.out.println(encontrada);
                    } else {
                        System.out.println("❌ Categoría no encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("ID a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nueva descripción: ");
                    String nuevaDesc = scanner.nextLine();
                    Categoria catAct = new Categoria(idActualizar, nuevoNombre, nuevaDesc);
                    if (service.actualizar(catAct)) {
                        System.out.println("✅ Categoría actualizada.");
                    } else {
                        System.out.println("❌ No se pudo actualizar.");
                    }
                    break;

                case 5:
                    System.out.print("ID a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    if (service.eliminar(idEliminar)) {
                        System.out.println("✅ Categoría eliminada.");
                    } else {
                        System.out.println("❌ No se pudo eliminar.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
