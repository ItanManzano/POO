public class DriverVehiculo {
    public static void main(String[] args) {
     Camion camion =new Camion("Disel",4);
        System.out.println(camion);

        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("------------MOTOCICLETA-----------");
        Motocicleta moto = new Motocicleta(150,"Kawasaki");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();
    }
}
