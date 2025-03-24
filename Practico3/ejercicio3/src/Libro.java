public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;


    //Constructor:

    public Libro() {
    }

    public Libro(String titulo, int anioPublicacion, String autor) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }


    //Getter and Setter:


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoanio) {

        if(nuevoanio< 1900 || nuevoanio > 2025) {
            System.out.println("El anio de publicacion no puede ser menor a 1900 ni mayor que el actual.");
        } else {
            this.anioPublicacion = nuevoanio;
        }


    }

    //Metodos:

    public void mostrar() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Anio de publicacion: " + this.getAnioPublicacion());

    }




}
