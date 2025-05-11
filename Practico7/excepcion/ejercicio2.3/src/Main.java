import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = null;

        try {
            File archivo = new File("datos.txt");
            scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }


    }
        }
}