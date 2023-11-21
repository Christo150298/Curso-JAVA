package EJERCICIOS.EJERCICIO_21;

public class Semana {
    private int temperatura;

    int [] temperaturas ={30,25,17,5,11};

    public Semana(int temperatura) {
        this.temperatura = temperatura;
    }

    public double temperaturaMedia() {
        double media;
        int sum = 0;
        for(double i = 0; i< temperaturas.length; i++){
            sum += temperaturas[(int) i];
        }
        media = (double)sum / temperaturas.length;
        return media;
    }
}