public class Pelota extends Toy{
    private double diametro;
    private String textura;

    public Pelota() {
    }

    public Pelota(String marca, String tamanio, String sonido, double diametro, String textura) {
        super(marca, tamanio, sonido);
        this.diametro = diametro;
        this.textura = textura;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "diametro=" + diametro +
                ", textura='" + textura + '\'' +
                ", marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", sonido='" + sonido + '\'' +
                '}';
    }
    @Override
    public void play(){
        System.out.println("cuiky CUIKY cuiky");
    }
}
