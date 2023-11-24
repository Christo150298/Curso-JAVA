package EJERCICIOS.EJERCICIO_32;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList(10);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);

        List<ArrayList<Integer>> numerosPares = numeros.stream()
                .filter(num -> (num%2 == 0))
                .map(num -> numeros)
                .collect(Collectors.toList());

        System.out.println(numerosPares);
    }

    public double potencia(int a) {
        return Math.sqrt(a);
    }
}