import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Vehículo----------------");
        Vehiculo ve = new Vehiculo("privado","2017",0);
        System.out.println(ve);

        System.out.println("---------------Automovil---------------");
        Automovil auto = new Automovil("Dodge","Challenger","2019", Color.black,"V8");
        System.out.println(auto);
        auto.chocar();

        System.out.println("---------------Taxi---------------------");
        Taxi ta = new Taxi("Nissan","Sentra","2012",Color.PINK,"4 cilindros","CDMX", "M0T0M4M1",45687);
        System.out.println(ta);
        ta.extender();
        ta.marcar();
    }
}