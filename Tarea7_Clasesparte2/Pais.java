package ICO.fes;

import java.util.ArrayList;

public class Pais {
    private String Nombre;
    private String enContinente;
    private double extension;
    private double poblacion;
    private String presidente;

    //Constructor por defecto
    public Pais(String nombre) {
        Nombre = nombre;
    }

    //Constructor cargado

    public Pais(String nombre, String enContinente, double extension, double poblacion, String presidente) {
        Nombre = nombre;
        this.enContinente = enContinente;
        this.extension = extension;
        this.poblacion = poblacion;
        this.presidente = presidente;
    }

    //Get and set

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        ArrayList<String> Nombres = new ArrayList<>();
        Nombres.add("Canada");
        Nombres.add("Islandia");
        Nombres.add("Portugal");
        Nombres.add("Brasil");
        Nombres.add("Argentina");
        Nombres.add("Noruega");
        if (Nombres.contains(nombre.toUpperCase())){
            Nombre=nombre;
        } else{
            System.out.println("Ese país no nos gusta");
        }
        Nombre = nombre;
    }

    public String getEnContinente() {
        return enContinente;
    }

    public void setEnContinente(String enContinente) {
        this.enContinente = enContinente;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    //To string

    @Override
    public String toString() {
        return "Pais{" +
                "Nombre='" + Nombre + '\'' +
                ", enContinente='" + enContinente + '\'' +
                ", extension=" + extension +
                ", poblacion=" + poblacion +
                ", presidente='" + presidente + '\'' +
                '}';
    }

    //Métodos
    public boolean representar(){
        System.out.println("El presidente" + presidente + "es el representante del país" + Nombre);
        return true;
    }
    public boolean medir(){
        System.out.println("La extensión territorial de" + Nombre + "es de" + extension + "km");
        return true;
    }
}
