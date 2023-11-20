package EJERCICIOS.EJERCICIO_24;

public class CalculosNumericos {

    private double numLogNeperiano;
    private double numRaizCuadrada;

    public CalculosNumericos(double numLogNeperiano, double numRaizCuadrada){
        this.numLogNeperiano = numLogNeperiano;
        this.numRaizCuadrada = numRaizCuadrada;
    }
    public double calcularLogaritmoNeperiano() throws ArithmeticException {
        if (numLogNeperiano <= 0) {
            throw new ArithmeticException("Error: El valor para el logaritmo neperiano debe ser positivo.");
        }
        return Math.log(numLogNeperiano);
    }

    public double calcularRaizcuadrada() throws ArithmeticException {
        if (numRaizCuadrada < 0) {
            throw new ArithmeticException("Error: El valor para calcular la raiz cuadrada debe ser positivo.");
        }
        return Math.sqrt(numRaizCuadrada);
    }
}