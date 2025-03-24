public class NaveEspacial {
    private String nombre;
    private int combustible;

    //Constructor:
    public NaveEspacial() {
    }

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    //Getter and Setter:

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    //Metodos:

    public void despegar(){
        if(combustible <10){
            System.out.println("El combustible es demasiado bajo para realizar el despegue");
        } else{
            System.out.println("La nave despego");
            this.combustible -= 10;
        }
    }


    public void avanzar(int distancia){
        int auxiliar = distancia%10;
        if(auxiliar>this.combustible){
            System.out.println("No hay suficiente combustible");
        } else{
            this.combustible -= auxiliar;
        }
    }

    public void recargarCombustible(int cantidad){
       this.combustible += cantidad;
       if(this.combustible>100){
           this.combustible = 100;
           System.out.println("El combustible no puede ser mayor que 100");
       }
    }

    public void mostrarEstado(){
        System.out.println("El nombre  de la nave es: " + this.nombre);
        System.out.println("El combustible actual es de: " + this.combustible);
    }



}
