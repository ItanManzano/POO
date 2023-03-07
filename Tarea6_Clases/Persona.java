public class Persona {
    private int edad;
    private String nombre;
    private double peso;
    private double estatura;
    private String genero;
//Constructor por defecto
    public Persona(int edad) {
        this.edad = edad;
    }
//Constructor cargado
    public Persona(int edad, String nombre, double peso, double estatura, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.genero = genero;
    }
// Get and set
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
//To string
    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", estatura=" + estatura +
                ", genero='" + genero + '\'' +
                '}';
    }
// 3 Métodos
    public void comer(){
        System.out.println("Comiendo ");
    }
    public void tomar(){
        System.out.println("Tomando ");

    }public void baniar(){
        System.out.println("Bañando ");
    }

}
