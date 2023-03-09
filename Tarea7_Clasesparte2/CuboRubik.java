package ICO.fes;

import java.awt.*;

public class CuboRubik {
    private double tamanio;
    private double precio;
    private String marca;
    private String tipo;

    //Constructor por defecto
    public CuboRubik(double tamanio) {
        this.tamanio = tamanio;
    }

    //Constructor cargado

    public CuboRubik(double tamanio, double precio, String marca, String tipo) {
        this.tamanio = tamanio;
        this.precio = precio;
        this.marca = marca;
        this.tipo = tipo;
    }

    //Get and set

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //To string

    @Override
    public String toString() {
        return "CuboRubik{" +
                "tamanio=" + tamanio +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    //Métodos
    public boolean girar(){
        System.out.println("El cubo rubik" + marca + "está girando a la derecha");
        return true;
    }

}
