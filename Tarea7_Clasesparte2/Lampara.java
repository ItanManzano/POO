package ICO.fes;

import java.awt.*;

public class Lampara {
    private String marca;
    private double precio;
    private Color color;
    private String tamanio;

    //Constructor por defecto
    public Lampara(String marca) {
        this.marca = marca;
    }

    //Constructor cargado
    public Lampara(String marca, double precio, Color color, String tamanio) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.tamanio = tamanio;
    }

    //Get and set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    //To String
    @Override
    public String toString() {
        return "Lampara{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color=" + color +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }

    //Métodos
    public boolean prender(){
        System.out.println("Prendiendo la lámpara" + marca);
        return true;
    }
    public boolean apagar(){
        System.out.println("Apagando la lámpara" + marca);
        return true;
    }

}
