package EJERCICIOS.EJERCICIO_21;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        double[] temperaturasSemana = {22.5, 24.0, 23.8, 26.5, 21.0, 20.5, 25.3};

        Temperatura temperatura = new Temperatura();

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Temperatura Media: " + df.format(temperatura.calcularTemperaturaMedia(temperaturasSemana)));

        int[] diaMaxima = new int[1];
        System.out.println("Temperatura Máxima: " + temperatura.encontrarTemperaturaMaxima(temperaturasSemana, diaMaxima) + " (Día " + diaMaxima[0] + ")" );
    }
}