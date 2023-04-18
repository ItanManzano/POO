public class Vehiculo {
    protected String tipo;
    protected String anio;
    protected int kilometraje;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String anio, int kilometraje) {
        this.tipo = tipo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", anio='" + anio + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }

    public void arrancar(){
        System.out.println("El vehículo está arrancando");
    }
    public void frenar(){
        System.out.println("El vehículo está frenando");
    }
}
