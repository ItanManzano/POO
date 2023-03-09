package ICO.fes;

import java.util.ArrayList;

public class Giroscopio {
    private String tipo;
    private String materiales;
    private double precio;

    //constructor por defecto

    public Giroscopio(String tipo) {
        this.tipo = tipo;
    }

    //constructor cargado

    public Giroscopio(String tipo, String materiales, double precio) {
        this.tipo = tipo;
        this.materiales = materiales;
        this.precio = precio;
    }
    //get and set

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        ArrayList<String> materialess = new ArrayList<>();
        materialess.add("Oro");
        materialess.add("Hierro");
        materialess.add("Titaneo");
        materialess.add("Platino");

        if(materialess.contains(materiales.toUpperCase())){
            this.materiales = materiales;
        } else{
            System.out.println("De ese material no se hacen los giroscopios");
        }
        this.materiales = materiales;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //To string

    @Override
    public String toString() {
        return "Giroscopio{" +
                "tipo='" + tipo + '\'' +
                ", materiales='" + materiales + '\'' +
                ", precio=" + precio +
                '}';
    }

    //metodos
    public void nivelar(){
        System.out.println("Nivelando...");
    }

    public void orientar(){
        System.out.println("Orientando...");
    }

}
