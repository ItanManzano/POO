import java.awt.*;
import java.util.Scanner;

public class Automovil extends Vehiculo{
    protected String marca;
    protected String modelo;
    protected String anio;
    protected Color color;
    protected String motor;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, String anio, Color color, String motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.motor = motor;
    }

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

    @Override
    public String getAnio() {
        return anio;
    }

    @Override
    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", color=" + color +
                ", motor='" + motor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", anio='" + anio + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
    public void chocar(){
        System.out.println("El automovil está chocandoOoOo");
    }
    public void avanzar(){
        System.out.println("El automovil está avanzando");
    }

}
