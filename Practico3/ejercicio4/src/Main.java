public class Main {
    public static void main(String[] args) {

        Gallina gallina1 = new Gallina(00001,10,10);
        Gallina gallina2 = new Gallina(00002,20,20);


        System.out.println("Mostrando datos de las gallinas");

        gallina1.mostrarEstado();

        System.out.println("////////////////////////");

        gallina2.mostrarEstado();

        System.out.println("////////////////////////");



        gallina1.ponerHuevo();
        gallina2.ponerHuevo();

        gallina1.envejecer();

        gallina2.envejecer();


        System.out.println("Mostrando datos de las gallinas: ");


        gallina1.mostrarEstado();

        System.out.println("////////////////////////");


        gallina2.mostrarEstado();


    }
}