public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Harry Potter",2001,"JK Rowling");

        //Datos previos al cambio:

        libro1.mostrar();

        System.out.println("/////////////////////////////////////////////");

        //Prueba1:
        libro1.setAnioPublicacion(1700);

        //Prueba2:

        libro1.setAnioPublicacion(2026);


        //Prueba3:
        libro1.setAnioPublicacion(2002);


        System.out.println("/////////////////////////////////////////////");

        //Mostrar los datos con el cambio:
        libro1.mostrar();

    }
}