public class Main {
    public static void main(String[] args) {

        Mascota mascota = new Mascota("Tito","Boxer",10);

        mascota.mostrarInfo();


        System.out.println("////////////////////////////////////");

        mascota.cumplirAnios();

        System.out.println("//////////////////////////////////");

        mascota.mostrarInfo();


    }
}