package EJERCICIOS;
import java.util.Scanner;

public class EJERCICIO_3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double matematicas , fisica , quimica , lenguaje, historia, media;

        System.out.println("Introduce la nota de matematicas: ");
        matematicas = Double.parseDouble(entrada.nextLine());
        System.out.println("Introduce la nota de fisica: ");
        fisica = Double.parseDouble(entrada.nextLine());
        System.out.println("Introduce la nota de quimica: ");
        quimica = Double.parseDouble(entrada.nextLine());
        System.out.println("Introduce la nota de lenguaje: ");
        lenguaje = Double.parseDouble(entrada.nextLine());
        System.out.println("Introduce la nota de historia: ");
        historia = Double.parseDouble(entrada.nextLine());

        media = (matematicas + fisica + quimica + lenguaje + historia) / 5;

        if(matematicas > 10) {
            System.out.println("La nota no puede ser mayor que 10");
        } else if (fisica > 10) {
            System.out.println("La nota no puede ser mayor que 10");
        } else if (quimica > 10) {
            System.out.println("La nota no puede ser mayor que 10");
        } else if (lenguaje > 10) {
            System.out.print("La nota no puede ser mayor que 10");
        } else if (historia > 10) {
            System.out.print("La nota no puede ser mayor qur e 10");
        } else {
            System.out.println("La media de las notas es:" + media);
        }

        if (media <= 3) {
            System.out.println("La nota media es Muy deficiente");
        } else if (media <= 5) {
            System.out.println("La nota media es Insuficiente");
        } else if (media <= 6) {
            System.out.println("La nota media es suficiente");
        } else if (media <= 7) {
            System.out.println("La nota media es Bien");
        } else if (media <= 9) {
            System.out.println("La nota media es Notable");
        } else if (media <= 10) {
            System.out.println("La nota media es Sobresaliente");
        } else {
            System.out.println("Error");
        }
    }
}
