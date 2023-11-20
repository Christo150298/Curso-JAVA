package EJERCICIOS.EJERCICIO_19;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero entero de mas de una cifra: ");
        int numero = entrada.nextInt();

        if (esCapicua(numero)) {
            System.out.println("El numero " + numero + " es capicua.");
        } else {
            System.out.println("El numero " + numero + " no es capicua.");
        }
    }

    private static boolean esCapicua(int numero) {

        String numeroStr = String.valueOf(numero);

        String numeroInvertidoStr = new StringBuilder(numeroStr).reverse().toString();

        return numeroStr.equals(numeroInvertidoStr);
    }
}