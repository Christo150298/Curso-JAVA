package EJERCICIOS.EJERCICIO_19;

public class CalculosNumericos {

    private double numLogNeperiano;
    private double numRaizCuadrada;

    public CalculosNumericos(double numLogNeperiano, double numRaizCuadrada){
        this.numLogNeperiano = numLogNeperiano;
        this.numRaizCuadrada = numRaizCuadrada;
    }
    public double calcularLogaritmoNeperiano() {
        return Math.log(numLogNeperiano);
    }

    public double calcularRaizcuadrada() {
        return Math.sqrt(numRaizCuadrada);
    }
}