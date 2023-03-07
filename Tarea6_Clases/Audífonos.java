import java.awt.*;
public class Audífonos {
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;
    private Color color;

    //Constructor por defecto

    public Audífonos(String marca) {
        this.marca = marca;
    }


    //Constructor cargado

    public Audífonos(String marca, String modelo, String tipo, double precio, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
        this.color = color;
    }


// Get and set

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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


// To string

    @Override
    public String toString() {
        return "Audífonos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", color=" + color +
                '}';
    }


//3 Métodos

    public boolean encender() {
        System.out.println("Encendiendo los audífonos marca " + marca);
        return true;
    }

    public boolean reproducir() {
        System.out.println("Se está reproduciendo musica en los " + modelo);
        return true;
    }

    public boolean apagar() {
        System.out.println("Apagando los audífonos " + marca);
        return true;
    }
}
