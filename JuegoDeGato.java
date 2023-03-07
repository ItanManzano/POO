import java.util.Scanner;
public class JuegoDeGato {

    public static void main(String[] args) {

        int ancho = 5;
        int alto = 5;

        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Ingresa solo los caracteres X, O: ");
        String entrada = entradaUsuario.nextLine();

        while (entrada.length() % 3 != 0) {
            entrada += "_";
        }

        // Imprime el recuadro con los x y o
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                char caracterActual;
                if (i == 0 || i == alto - 1) {
                    caracterActual = '-';
                } else if (j == 0 || j == ancho - 1) {
                    caracterActual = '|';
                } else {
                    caracterActual = entrada.charAt((i - 1) * 3 + j - 1);
                }
                System.out.print(caracterActual);
            }
            System.out.println();
        }
    }

}