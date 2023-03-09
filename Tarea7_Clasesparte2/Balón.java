package ICO.fes;

import java.awt.*;
import java.util.ArrayList;

public class Balón {
    public String deporte;
    public String tamanio;
    public Color color;
    public String marca;

    //constructor por defecto

    public Balón(String deporte) {
        this.deporte = deporte;
    }

    //constructor cargado

    public Balón(String deporte, String tamanio, Color color, String marca) {
        this.deporte = deporte;
        this.tamanio = tamanio;
        this.color = color;
        this.marca = marca;
    }

    //get and set

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        ArrayList<String> Deporte = new ArrayList<>();
        Deporte.add("Basquetbol");
        Deporte.add("Voleibol");
        Deporte.add("Futbol");
        Deporte.add("Rugby");

        if(Deporte.contains(marca.toUpperCase())){
            this.deporte=deporte;
        }else{
            System.out.println("Ese deporte no usa balón");
        }
        this.deporte = deporte;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //To string

    @Override
    public String toString() {
        return "Balón{" +
                "deporte='" + deporte + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", color=" + color +
                ", marca='" + marca + '\'' +
                '}';
    }

    //Metodos
    public void girar(){
        System.out.println("El balón" + color + "está girando");
    }
    public void rebotar(){
        System.out.println("El balón de" + deporte + "rebotó");
    }
}
