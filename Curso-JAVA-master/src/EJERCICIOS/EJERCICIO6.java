package EJERCICIOS;
import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Metros\tPulgadas");
        System.out.println("----------------");

        for(int pulgadas = 1; pulgadas <= 144; pulgadas++){

            double metros = convertirPulgadasAMetros(pulgadas);
            System.out.printf("%.2f\t%d\n", metros, pulgadas);

            if (pulgadas % 12 == 0) {
                System.out.println();
            }
        }
    }

    private static double convertirPulgadasAMetros(int pulgadas) {
        return pulgadas * 0.0254;

    }
}