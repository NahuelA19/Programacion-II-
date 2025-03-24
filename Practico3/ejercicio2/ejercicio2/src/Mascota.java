public class Mascota {


    private String nombre;
    private String especie;
    private int edad;


    //Constructor:

    public Mascota() {
    }

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }


    //Getter and Setter:


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo:

    public void mostrarInfo(){
        System.out.println("Nombre de la mascota: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad);
    }


    public void cumplirAnios(){
        System.out.println("Hoy es el cumpleanio de : " + this.nombre);

        this.edad = this.edad + 1;

        System.out.println("Cumple: " + this.edad);
    }


}
