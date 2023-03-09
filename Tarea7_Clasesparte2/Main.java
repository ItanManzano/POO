package ICO.fes;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        //Clase balón
        Balón balón = new Balón("Rugby", "mediano", Color.black, "Puma");
        System.out.println(balón);
        balón.rebotar();
        balón.girar();

        //Clase computadora
        Computadora computadora = new Computadora("Huawei","MatebookD16",23000,512);
        System.out.println(computadora);
        computadora.apagar();
        computadora.encender();
        computadora.encender();

        //Clase Cubo
        CuboRubik cubo = new CuboRubik(10,50,"Libre", "Clasico");
        System.out.println(cubo);
        cubo.girar();

        //Clase gato
        Gato gato = new Gato (Byte.parseByte("12"), "Luka","Siamés",15,"Masculino");
        System.out.println(gato);
        gato.dormir();
        gato.maullar();
        gato.trepar();

        //Clase giroscopio
        Giroscopio giroscopio = new Giroscopio("Mecanico", "titaneo", 5000);
        System.out.println(giroscopio);
        giroscopio.nivelar();
        giroscopio.orientar();

        //Clase lampara
        Lampara lampara = new Lampara("Libre", 250, Color.CYAN, "Estandar");
        System.out.println(lampara);
        lampara.prender();
        lampara.apagar();

        //Clase libro
        Libro libro = new Libro("Claudia Celis",136,"Novela", Color.green);
        System.out.println(libro);
        libro.leer();
        libro.cerrar();

        //Clase pagina web
        PaginaWeb paginaweb = new PaginaWeb("Compras","Nike","www.nike.com","Ropa", "El día de hoy");
        System.out.println(paginaweb);
        paginaweb.visitar();
        paginaweb.cerrar();

        //Clasepais
        Pais pais = new Pais("Noruega", "Europa", 50000, 4000, "Harald V");
        System.out.println(pais);
        pais.representar();
        pais.medir();


    }
}
