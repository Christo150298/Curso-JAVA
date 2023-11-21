package EJERCICIOS.EJERCICIO_27;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Javier",25));
        listaPersonas.add(new Persona("Mario",30));
        listaPersonas.add(new Persona("Asier",22));

        System.out.println("Lista de personas antes de ordenar por edad: ");
        imprimirListaPersonas(listaPersonas);

        Collections.sort(listaPersonas);

        System.out.println("\nLista de persona después de ordenar por edad: ");
        imprimirListaPersonas(listaPersonas);
    }

    private static void imprimirListaPersonas(List<Persona> listaPersonas) {
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }
    }
}