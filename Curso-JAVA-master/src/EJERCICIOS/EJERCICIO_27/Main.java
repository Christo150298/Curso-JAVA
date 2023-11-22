package EJERCICIOS.EJERCICIO_27;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Carlos",25));
        listaPersonas.add(new Persona("Mario",30));
        listaPersonas.add(new Persona("Asier",22));
        listaPersonas.add(new Persona("Borja",19));
        listaPersonas.add(new Persona("David",33));
        listaPersonas.add(new Persona("Enrique",33));

        System.out.println("Lista de personas antes de ordenar por edad: ");
        imprimirListaPersonas(listaPersonas);

        listaPersonas.sort(Comparator.comparingInt(Persona::getEdad));

        System.out.println("\nLista de persona después de ordenar por edad: ");
        imprimirListaPersonas(listaPersonas);

        System.out.println();

        System.out.println("Lista de personas antes de ordenar por Nombre: ");
        imprimirListaPersonas(listaPersonas);

        listaPersonas.sort(Comparator.comparing(Persona::getNombre));

        System.out.println("Lista de personas despues de ordenar por Nombre: ");
        imprimirListaPersonas(listaPersonas);

    }
    private static void imprimirListaPersonas(List<Persona> listaPersonas) {
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }
    }
}