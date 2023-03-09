package ICO.fes;

import java.util.ArrayList;

public class Gato {
    private int edad;
    private String nombre;
    private String raza;
    private double peso;
    private String sexo;

    //Constructor por defecto

    public Gato(int edad) {
        this.edad = edad;
    }
    //Constructor cargado

    public Gato(int edad, String nombre, String raza, double peso, String sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.sexo = sexo;
    }
    //Get and set

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        ArrayList<String> razas = new ArrayList<>();
            razas.add("Siamés");
            razas.add("Persa");
            razas.add("Bombay");
            if (razas.contains(raza.toUpperCase())){
                this.raza=raza;
        } else {
                System.out.println("Esa raza no existe");
            }
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //To String

    @Override
    public String toString() {
        return "Gato{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", peso=" + peso +
                ", sexo='" + sexo + '\'' +
                '}';
    }
    //Metodos
    public void maullar(){
        System.out.println("Maullando ");
    }
    public void trepar(){
        System.out.println("Trepando ");
    }
    public void dormir(){
        System.out.println("Durmiendo ...zZz ");
    }
}
