package EJERCICIOS;
import java.util.Scanner;
public class EJERCICIO4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int cantidadEspacios = 0;

        while (true) {
            System.out.println("Introduce un texto: ");
            String texto = entrada.nextLine();
            if (texto.equals(".")){
                break;
            }
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == ' ')
                    cantidadEspacios++;
            }
            System.out.println("El numero total de espacios es " + cantidadEspacios);
        }
    }
}