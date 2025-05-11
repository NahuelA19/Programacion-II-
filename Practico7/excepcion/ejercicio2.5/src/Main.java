import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String archivotexto = "texto.txt"; //

        try (BufferedReader br = new BufferedReader(new FileReader(archivotexto))) {
            String linea;
            int numeroLinea = 1;

            while ((linea = br.readLine()) != null) {
                System.out.println(numeroLinea + ": " + linea);
                numeroLinea++;
            }
        } catch (IOException e) {
            System.out.println("Error al intentar leer el archivo: " + e.getMessage());
        }
    }
}
