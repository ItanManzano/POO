package org.example;

import org.example.controlador.ControladorSumas;
import org.example.vista.VentanasSumas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        VentanasSumas ventanasSumas = new VentanasSumas("Suma");
        ControladorSumas controller = new ControladorSumas(ventanasSumas);
    }
}