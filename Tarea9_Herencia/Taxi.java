import java.awt.*;

public class Taxi extends Automovil{
    private String ciudad;
    private String matricula;
    private int nLicencia;

    public Taxi() {
    }

    public Taxi(String marca, String modelo, String anio, Color color, String motor, String ciudad, String matricula, int nLicencia) {
        super(marca, modelo, anio, color, motor);
        this.ciudad = ciudad;
        this.matricula = matricula;
        this.nLicencia = nLicencia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getnLicencia() {
        return nLicencia;
    }

    public void setnLicencia(int nLicencia) {
        this.nLicencia = nLicencia;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "ciudad='" + ciudad + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nLicencia=" + nLicencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", color=" + color +
                ", motor='" + motor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", anio='" + anio + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
    public void marcar(){
        System.out.println("El taximetro marca: " + kilometraje);
    }
    public void extender(){
        System.out.println("La zona de circulación se ha extendido ilegalmente");
    }
}
