package EJERCICIOS.EJERCICIO_21;

public class Temperatura {

    public double calcularTemperaturaMedia(double[] temperaturas) {
        double suma = 0;
        for (double temperatura : temperaturas) {
            suma += temperatura;
        }
        return suma / temperaturas.length;
    }

    public double encontrarTemperaturaMaxima(double[] temperaturas, int[] diaMaxima) {
        double maxima = temperaturas[0];
        int dia = 1;
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i];
                dia = i + 1;
            }
        }
        diaMaxima[0] = dia;
        return maxima;
    }
}