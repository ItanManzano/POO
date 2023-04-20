public class Perro {
    protected String raza;
    protected int edad;

    public Perro() {
    }

    public Perro(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void ladrar(){
        System.out.println("guf guf!");
    }
    public void comer(){
        System.out.println("El perro está comiendo...");
    }
}
