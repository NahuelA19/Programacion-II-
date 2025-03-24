public class Gallina {

    private int idGallina;
    private int edad;
    private int huevosPuestos;


    public Gallina() {
    }

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }


    //Getter and Setter:


    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    //Metodo:

    public void ponerHuevo(){
        this.huevosPuestos++;
    }

   public void envejecer(){
        this.edad++;

   }

   public void mostrarEstado(){
        System.out.println("IdGallina: " + this.idGallina);
        System.out.println("Edad: " + this.edad);
        System.out.println("HuevosPuestos: " + this.huevosPuestos);

   }



}
