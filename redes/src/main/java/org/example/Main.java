package org.example;
import org.example.controlador.ControladorRedes;
import org.example.vista.VentanaRedes;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello world!");
        VentanaRedes ven1 = new VentanaRedes("Redes Sociales");
        ControladorRedes conroller = new ControladorRedes(ven1);
    }
}