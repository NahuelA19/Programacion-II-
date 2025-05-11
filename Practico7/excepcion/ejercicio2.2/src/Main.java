import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                try {
                    System.out.print("Por favor ingrese un número entero: ");
                    String entero = scanner.nextLine();

                    int numero = Integer.parseInt(entero);
                    System.out.println("El numero ingresado es: " + numero);
                } catch (NumberFormatException e) {
                    System.out.println("El numero ingresado no es valido.");
                } finally {
                    scanner.close();
                }



    }
}