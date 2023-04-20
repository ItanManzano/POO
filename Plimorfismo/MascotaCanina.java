public class MascotaCanina extends Perro{
    private String nombre;
    private boolean collar;
    private String alimentoFav;
    //Juguete
    private Toy juguete;

    public MascotaCanina() {
    }

    public MascotaCanina(String raza, int edad, String nombre, boolean collar, String alimentoFav, Toy juguete) {
        super(raza, edad);
        this.nombre = nombre;
        this.collar = collar;
        this.alimentoFav = alimentoFav;
        this.juguete = juguete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCollar() {
        return collar;
    }

    public void setCollar(boolean collar) {
        this.collar = collar;
    }

    public String getAlimentoFav() {
        return alimentoFav;
    }

    public void setAlimentoFav(String alimentoFav) {
        this.alimentoFav = alimentoFav;
    }

    public Toy getJuguete() {
        return juguete;
    }

    public void setJuguete(Toy juguete) {
        this.juguete = juguete;
    }

    @Override
    public String toString() {
        return "MascotaCanina{" +
                "nombre='" + nombre + '\'' +
                ", collar=" + collar +
                ", alimentoFav='" + alimentoFav + '\'' +
                ", juguete=" + juguete +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void jugar(){
        System.out.println(this.nombre + " está jugando con un " + juguete);
        juguete.play();
    }
}
