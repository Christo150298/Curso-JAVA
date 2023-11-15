package EJERCICIOS;
import java.util.Scanner;

public class EJERCICIO9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numVocales = 0;

        System.out.println("Ingrese una frase: ");
        String frase = entrada.nextLine();

        for (int i=0; i < frase.length() ;i++){
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' ||
                    frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                numVocales++;
            }
        }
        System.out.print("El numero de vocales es: " + numVocales);
    }
}