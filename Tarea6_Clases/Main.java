import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        String entrada = "";
        entrada = teclado.nextLine();
        System.out.println(entrada);
        String[] separado = entrada.split("");
        for (int i = 0; i < separado.length; i++) {
            //System.out.println(separado[i]);
            for (int j = 0; j < 3; j++) {
                System.out.print(separado[j]);

            }
        }
    }
}