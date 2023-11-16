package EJERCICIOS.EJERCICIO_14;

public class circulo extends figura{

    private double radio;
    private double pi = 3.14;

    public circulo(double area, double perimetro, double pi, double radio){
        super(area, perimetro);
        this.pi = pi;
        this.radio = radio;
    }
}
