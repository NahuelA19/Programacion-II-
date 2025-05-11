import java.util.Scanner;

class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();


            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad ingresada no es válida. Debe estar entre 0 y 120.");
            }

            System.out.println("Edad ingresada correctamente: " + edad + " años.");

        } catch (EdadInvalidaException e) {

            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
        }

        scanner.close();
    }
}
