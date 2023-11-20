package EJERCICIOS;
import java.util.Scanner;

public class EJERCICIO_9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = entrada.nextLine();
        int resultado = contarVocales(frase);
        System.out.println("Número de vocales: " + resultado);
    }

    public static int contarVocales(String frase) {

        frase = frase.toLowerCase();
        String vocales = "aeiou";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            // Verificamos si el caracter es una vocal
            if (vocales.indexOf(caracter) != -1) {
                contador++;
            }
        }
        return contador;
    }
}