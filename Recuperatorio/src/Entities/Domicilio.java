package Entities;

public class Domicilio {
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;

    public Domicilio(String calle, String numero, String provincia, String localidad) {
        this.calle = calle;
        this.numero = numero;
        this.provincia = provincia;
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
