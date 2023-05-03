package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        try{
            int a = 10;
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("División: " + (a/b));

        } catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        } catch (NumberFormatException nfe){
            System.out.println("No capturaste el dato correctamente");
        } finally {
            System.out.println("Siempre se ejecuta...");
        }

        System.out.println("Fin del programa!!");

    }
}