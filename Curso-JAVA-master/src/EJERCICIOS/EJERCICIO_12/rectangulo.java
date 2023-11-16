package EJERCICIOS.EJERCICIO_12;
import java.util.Scanner;

public class rectangulo {

    private int base;
    private int altura;

    public rectangulo(int base, int altura) {
        this.base = Math.abs(base);
        this.altura = Math.abs(altura);
    }

    public rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public int getBase() { return base; }
    public void setBase(int base) { this.base = Math.abs(base); }

    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = Math.abs(altura); }

    public boolean esCuadrado() {
        return base == altura;
    }
    public int areaRectangulo () {
        return base * altura;
    }
    public int perimetroRectangulo () {
        return 2 * (base + altura);
    }

    public void giroRectangulo() {
        int temp = base;
        base = altura;
        altura = temp;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la base del rectangulo: ");
        int base = entrada.nextInt();
        System.out.println("Ingresa la altura del rectangulo: ");
        int altura = entrada.nextInt();

        rectangulo rectangulo1 = new rectangulo(base, altura);

        System.out.println(rectangulo1.esCuadrado() ? "Es un cuadrado" : "No es un cuadrado");
        System.out.println("El area del rectangulo es " + rectangulo1.areaRectangulo());
        System.out.println("El perimetro del rectangulo es " + rectangulo1.perimetroRectangulo());
        rectangulo1.giroRectangulo();
        System.out.println("Despues de girar 90 grados: " + "Base = " + rectangulo1.getBase() + " Altura = " + rectangulo1.getAltura());

        System.out.println("----------------------------------");

        rectangulo rectangulo2 = new rectangulo();

        rectangulo2.setBase(2);
        rectangulo2.setAltura(1);

        System.out.println(rectangulo2.esCuadrado() ? "Es un cuadrado" : "No es un cuadrado");
        System.out.println("El área del rectangulo es: " + rectangulo2.areaRectangulo());
        System.out.println("El perímetro del cuadrado es: " + rectangulo2.perimetroRectangulo());
        rectangulo2.giroRectangulo();
        System.out.println("Despues de girar 90 grados: " + "Base = " + rectangulo2.getBase() + " Altura = " + rectangulo2.getAltura());
    }
}