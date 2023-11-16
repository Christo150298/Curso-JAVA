package EJERCICIOS.EJERCICIO_14;

public class triangulo extends figura {

    private double lado1;
    private double lado2;
    private double lado3;

    public triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //Metodo de Herón
    @Override public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
