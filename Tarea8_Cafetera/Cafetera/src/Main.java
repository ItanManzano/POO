public class Main {
    public static void main(String[] args)
    {
        Cafetera maquinaCafe = new Cafetera();

        while (maquinaCafe.servirAmericano()){
            System.out.println("Sirviendo americano");
        }
        while (maquinaCafe.servirExpreso()){
            System.out.println("Sirviendo expreso");
        }
        while (maquinaCafe.servirCapuchino()){
            System.out.println("Sirviendo capuchino");
        }
        maquinaCafe.mostrarEstado();
    }
}