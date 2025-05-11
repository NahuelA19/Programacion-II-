import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        int num = sc.nextInt();

        try{
            System.out.println("Introduzca el segundo numero");
            int num2 = new Scanner(System.in).nextInt();

            int resultado = num / num2;
            System.out.println("El resultado es: " + resultado);
        } catch(Exception ex){

            System.out.println("Error: " +ex.getMessage());
            ex.printStackTrace(System.out);
        }

        System.out.println("Adios....");





    }



}
