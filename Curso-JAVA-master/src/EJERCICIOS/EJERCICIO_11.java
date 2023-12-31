package EJERCICIOS;
import java.util.Scanner;

public class EJERCICIO_11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numero2 = entrada.nextInt();

        int suma = sumarNumeros(numero1,numero2);
        int resta = restarNumeros(numero1,numero2);
        int producto = multiplicarNumeros(numero1,numero2);
        String cociente = dividirNumeros(numero1,numero2);

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("El producto de los numeros es: " + producto);

        if (!cociente.equals("")) {
            System.out.println(cociente);
        } else {
            System.out.println("El cociente de los numeros es: " + cociente);
        }
    }

    private static int sumarNumeros(int num1, int num2) {
        return num1 + num2;
    }
    private static int restarNumeros(int num1, int num2) {
        return num1 - num2;
    }
    private static int multiplicarNumeros(int num1, int num2) {
        return num1 * num2;
    }
    private static String dividirNumeros(int num1, int num2) {
        if (num2 != 0){
            return String.valueOf(num1/num2);
        }
        return "No es posible dividir por 0.";
    }
}