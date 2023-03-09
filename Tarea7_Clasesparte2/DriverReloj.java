package ICO.fes;

import java.time.LocalTime;

public class DriverReloj {
    public static void main(String[] args) {
        LocalTime local = LocalTime.now();
        Reloj wacho = new Reloj(local.getHour(),local.getMinute(), local.getSecond());
        wacho.mostrar();
        wacho.programarAlarma(12,28,0);
        for (int i = 0; i < 10; i++) {
            wacho.avanzar();
            wacho.mostrar();
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }

}
