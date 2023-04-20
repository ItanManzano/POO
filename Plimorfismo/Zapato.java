public class Zapato extends Toy{
    private double talla;
    private String material;

    public Zapato() {
    }

    public Zapato(String marca, String tamanio, String sonido, double talla, String material) {
        super(marca, tamanio, sonido);
        this.talla = talla;
        this.material = material;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Zapato{" +
                "talla=" + talla +
                ", material='" + material + '\'' +
                ", marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", sonido='" + sonido + '\'' +
                '}';
    }
    @Override
    public void play(){
        System.out.println("Ei suelta el ZapatoOoooOOo...");
    }
}
