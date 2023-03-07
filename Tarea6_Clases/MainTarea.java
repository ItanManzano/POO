import java.awt.*;

public class MainTarea {
    public static void main(String[] args){
        Monitor mon =new Monitor(27.4, "Samsung", "SM10", "LED", 6500.0);
        System.out.println(mon);
        mon.encender();

        Persona per = new Persona(20, "José", 1.76, 56.0, "M");
        System.out.println(per);
        per.baniar();

        Audífonos au = new Audífonos("Skullcandy", "Dime", "Inalambricos", 650.0, Color.BLUE);
        System.out.println(au);
        au.apagar();
    }
}
