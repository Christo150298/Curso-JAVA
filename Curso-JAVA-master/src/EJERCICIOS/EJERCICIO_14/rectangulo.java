package EJERCICIOS.EJERCICIO_14;

public class rectangulo extends figura{

    private double base;
    private double altura;

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override public double calcularArea() {
        return  base * altura;
    }

    @Override public double calcularPerimetro() {
        return 2 * (base + altura);
    }

}
