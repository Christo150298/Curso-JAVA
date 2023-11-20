package EJERCICIOS;
import java.util.Scanner;

public class EJERCICIO_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c ;

        System.out.println("Introduce un numero:");
        a = Integer.parseInt(entrada.nextLine());

        System.out.println("Introduce el segundo numero:");
        b = Integer.parseInt(entrada.nextLine());

        System.out.println("Introduce el tercer numero:");
        c = Integer.parseInt(entrada.nextLine());

        System.out.println("Resultado de la primera operacion a*b/c = " + a*b/c);
        System.out.println("Resultado de la segunda operacion (a*c)%b = " + (a*c)%b);
        System.out.println("Resultado de la tercera operacion 2*(a+c-b)/b*c = " + 2*(a+c-b)/b*c);
        System.out.println("Resultado de la cuarta operacion ((a*c)+(b%a))/a-c = " + ((a*c)+(b%a))/c);

    }
}
