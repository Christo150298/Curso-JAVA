package EJERCICIOS;
import java.util.Scanner;
import java.lang.Math;

public class EJERCICIO_5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un numero:");
        int numero = entrada.nextInt();

        int numDigitos = contarDigitos(numero);

        int suma = sumarDigitosElevados(numero, numDigitos);

        if (suma == numero) {
            System.out.println(numero + " es un numero Amstrong.");
        } else {
            System.out.println(numero + " no es un numero Amstrong.");
        }
    }

    private static int contarDigitos(int num) {
        return(int) Math.floor(Math.log10(num) + 1);
    }

    private static int sumarDigitosElevados(int num, int potencia) {
        int suma = 0;
        int originalNum = num;

        while (num != 0) {
            int digito = num % 10;
            suma += Math.pow(digito, potencia);
            num /= 10;
        }

        return suma;
    }
}
