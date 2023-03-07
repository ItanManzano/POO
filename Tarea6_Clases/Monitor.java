public class Monitor {
    private double pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;

    public double getPulgadas() {
        return pulgadas;
    }
//Constructor por defecto
    public Monitor(double pulgadas) {
        this.pulgadas = pulgadas;
    }
//Constructor cargado
    public Monitor(double pulgadas, String marca, String modelo, String tipo, double precio) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }
//Get and set
    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

//To string
    @Override
    public String toString() {
        return "Monitor{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
// 3 Métodos
    public boolean encender(){
        System.out.println("Encendiendo el monitor marca "+marca );
        return true;

    }public boolean apagar(){
        System.out.println("Apagando el monitor marca "+marca );
        return true;

    }public boolean proyectar(){
        System.out.println("Proyectar el monitor marca "+marca );
        return true;
    }
}
