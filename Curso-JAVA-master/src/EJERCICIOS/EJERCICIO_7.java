package EJERCICIOS;
import java.util.Scanner;

public class EJERCICIO_7 {

    public static int[] candyCalculator(int cupones) {

        final int CUPONES_POR_BARRA = 10;
        final int CUPONES_POR_CHICLE = 3;

        int barrasDeCaramelo = 0;
        int chicles = 0;

        barrasDeCaramelo = cupones / CUPONES_POR_BARRA;
        int cuponesRestantes = cupones % CUPONES_POR_BARRA;

        chicles = cuponesRestantes / CUPONES_POR_CHICLE;
        cuponesRestantes = cuponesRestantes % CUPONES_POR_CHICLE;

        int[] resultados = {barrasDeCaramelo, chicles, cuponesRestantes};
        return resultados;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de cupones: ");
        int cuponesTotales = entrada.nextInt();

        int[] resultados = candyCalculator(cuponesTotales);

        System.out.println("Barras de caramelo: " + resultados[0]);
        System.out.println("Chicles: " + resultados[1]);
        System.out.println("Cupones restantes: " + resultados[2]);
    }
}