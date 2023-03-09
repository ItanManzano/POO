package ICO.fes;

import java.util.ArrayList;

public class Computadora {
    private String marca;
    private String modelo;
    private double precio;
    private double capacidad;

    //Constructor por defecto
    public Computadora(String marca, String matebookD16, String s, String s1) {
        this.marca = marca;
    }

    //Constructor cargado
    public Computadora(String marca, String modelo, double precio, double capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.capacidad = capacidad;
    }
    //Get and set

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        ArrayList<String> marcas =new ArrayList<>();
        marcas.add("Samsung");
        marcas.add("Huawei");
        marcas.add("Acer");
        marcas.add("Mac");
        marcas.add("HP");
        marcas.add("Asus");
        marcas.add("Dell");

        if(marcas.contains(modelo.toUpperCase())){
            this.marca=marca;
        } else{
            System.out.println("Esa marca no existe");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    //To string

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", capacidad=" + capacidad +
                '}';
    }
    //Métodos
    public boolean encender(){
        System.out.println("La computadora" + marca + "se está encendiendo");
        return true;
    }
    public boolean apagar(){
        System.out.println("La computadora" + modelo +"se apagará");
        return true;
    }
    public boolean llenar(){
        System.out.println("A la computadora" + modelo + "Se le acabaron los" + capacidad + "gb");
        return true;
    }

}
