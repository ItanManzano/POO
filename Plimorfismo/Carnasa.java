import java.awt.*;

public class Carnasa extends Toy{
    private String sabor;
    private Color color;

    public Carnasa() {
    }

    public Carnasa(String marca, String tamanio, String sonido, String sabor, Color color) {
        super(marca, tamanio, sonido);
        this.sabor = sabor;
        this.color = color;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carnasa{" +
                "sabor='" + sabor + '\'' +
                ", color=" + color +
                ", marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", sonido='" + sonido + '\'' +
                '}';
    }
    @Override
    public void play(){
        System.out.println("El perro esta jugando con la carnasa");
    }
}
