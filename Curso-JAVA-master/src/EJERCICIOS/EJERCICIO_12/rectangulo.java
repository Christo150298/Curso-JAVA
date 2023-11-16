package EJERCICIOS.EJERCICIO_12;
import java.util.Scanner;

public class rectangulo {

    public int base;
    public int altura;

    private  static String esCuadrado(int base, int altura){
        if (base == altura) {
            return "Es un cuadrado";
        }
        return "No es un cuadrado";
    }
    private static int areaRectangulo (int base, int altura) {
        return base * altura;
    }

    private static int perimetroRectangulo (int base, int altura) {
        return 2 * (base + altura);
    }

    public static String giroRectangulo(int base, int altura){
        int temp = base;
        base = altura;
        altura = temp;
        return "La nueva base es " + base + " y la nueva altura es " + altura;
    }

    public int getBase() { return base; }
    public void setBase(int base) { this.base = this.base; }

    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = this.altura; }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        rectangulo rectangulo1 = new rectangulo();
        rectangulo rectangulo2 = new rectangulo();

        System.out.println("Ingresar la base del rectangulo: ");
        int base = entrada.nextInt();
        rectangulo1.setBase(base);
        System.out.println("Inresar la altura del rectangulo: ");
        int altura = entrada.nextInt();
        rectangulo1.setAltura(altura);

        String cuadrado = esCuadrado(base,altura);
        System.out.println(cuadrado);
        int area = areaRectangulo(base,altura);
        System.out.println("El area del rectangulo es: " + area);
        int perimetro = perimetroRectangulo(base,altura);
        System.out.println("El perimetro del cuadradoes: " + perimetro);
        String giro = giroRectangulo(base,altura);
        System.out.println(giro);

        System.out.println("---------------------------------");

        int baseRectangulo2 = 2;
        int alturaRectangulo2 = 1;
        rectangulo2.setBase(baseRectangulo2);
        rectangulo2.setAltura(alturaRectangulo2);

        String cuadrado2 = esCuadrado(baseRectangulo2,alturaRectangulo2);
        System.out.println(cuadrado2);
        int area2 = areaRectangulo(baseRectangulo2,alturaRectangulo2);
        System.out.println("El area del rectangulo es: " + area2);
        int perimetro2 = perimetroRectangulo(baseRectangulo2,alturaRectangulo2);
        System.out.println("El perimetro del cuadradoes: " + perimetro2);
        String giro2 = giroRectangulo(baseRectangulo2,alturaRectangulo2);
        System.out.println(giro2);
    }
}
