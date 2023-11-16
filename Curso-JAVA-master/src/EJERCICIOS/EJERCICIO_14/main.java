package EJERCICIOS.EJERCICIO_14;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //DATOS DEL CIRCULO
        System.out.println("Introduce el radio del circulo: ");
        double radioCirculo = entrada.nextDouble();

        circulo circulo = new circulo(radioCirculo);

        //DATOS DEL RECTANGULO
        System.out.println("Introduce la base del rectangulo: ");
        double baseRectangulo = entrada.nextDouble();
        System.out.println("Introduce la altura del rectangulo: ");
        double alturaRectangulo = entrada.nextDouble();

        rectangulo rectangulo = new rectangulo(baseRectangulo,alturaRectangulo);

        //DATOS DEL TRIANGULO
        System.out.println("Introduce el lado 1 del triangulo: ");
        double lado1Triangulo = entrada.nextDouble();
        System.out.println("Introduce el lado 2 del triangulo: ");
        double lado2Triangulo = entrada.nextDouble();
        System.out.println("Introduce el lado 3 del triangulo: ");
        double lado3Triangulo = entrada.nextDouble();

        triangulo triangulo = new triangulo(lado1Triangulo,lado2Triangulo,lado3Triangulo);

        mostrarResultados("Circulo",circulo);
        mostrarResultados("Rectangulo",rectangulo);
        mostrarResultados("Triangulo",triangulo);

        entrada.close();
    }
    private static void mostrarResultados(String nombreFigura, figura figura) {
        System.out.println("Resultados para " + nombreFigura + ":");
        System.out.println("Área: " + figura.calcularArea());
        System.out.println("Perímetro: " + figura.calcularPerimetro());
        System.out.println("------------------------");
    }
}