package EJERCICIOS.EJERCICIO_24;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Ingresar numero para calcular Logaritmo Neperiano: ");
            double numero1 = entrada.nextDouble();
            System.out.println("Ingresar numero para calcular raiz cuadrada: ");
            double numero2 = entrada.nextDouble();

            CalculosNumericos calculosNumericos = new CalculosNumericos(numero1, numero2);

            System.out.println("El logaritmo neperiano de " + numero1 + " es " + calculosNumericos.calcularLogaritmoNeperiano());
            System.out.println("La raiz cuadrada de " + numero2 + " es " + calculosNumericos.calcularRaizcuadrada());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
        }
    }
}