package EJERCICIOS;
import java.util.Scanner;
public class EJERCICIO6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double metros, pulgadas;

        System.out.println("Ingrese el valor en metros: ");
        metros = entrada.nextDouble();
        entrada.nextLine();
        pulgadas=metros/0.0254;
        System.out.println("El resultado son " + pulgadas + " pulgadas.");
    }
}