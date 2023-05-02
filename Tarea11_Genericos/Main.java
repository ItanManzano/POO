package org.example;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
       Caja <String> miCaja = new Caja <>(new String[10]);
       miCaja.add(0,"hola");
       miCaja.add(1,"adios");
       miCaja.add(2,"hi");
        System.out.println(miCaja);

        String tem = miCaja.get(0);

        System.out.println("_____________________");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0,"hola");
        cajaSin.add(1,"adioss");
        cajaSin.add(2,"hi");
        System.out.println(cajaSin);
        String temp2 =(String) cajaSin.get(0);
        System.out.println("___Comida_______");

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0,new Comida("Yogurth", true));
        System.out.println(cajaComida.get(0));
        System.out.println("___________________");

        ArrayList<Comida> comidas= new ArrayList<>();
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Manzana",false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(10));

        ArrayList<Comida> comida2 = new ArrayList<>();
        comida2.add(new Comida("Zanahoria", false));
        comida2.add(new Comida("Danonino", true));
        comida2.add(new Comida("Yogurth", true));
        comida2.add(new Comida("Manzana", false));
        comida2.add(new Comida("Bistec", false));

        System.out.println(comida2.get(3));
        comida2.set(3, new Comida("Fresa",false));
        comida2.add(3,new Comida("Naranja",false));
        System.out.println("__________FINAL_______");
        for (Comida comida: comida2) {
            System.out.println(comida);
        }

    }
}