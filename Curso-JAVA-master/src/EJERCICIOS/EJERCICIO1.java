package EJERCICIOS;
import java.util.Scanner;


public class EJERCICIO1 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       int peso;
       double gravity = 1.7;
       double newPeso;

       System.out.println("Introduce tu peso:");
       peso = Integer.parseInt(entrada.nextLine());

       newPeso = peso / gravity;

       System.out.println("Un peso de " + peso + " kilos en la tierra equivalen a " + newPeso + " en la luna.");
    }
}
