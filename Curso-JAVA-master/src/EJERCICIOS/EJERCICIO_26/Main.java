package EJERCICIOS.EJERCICIO_26;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un nombre para añadir a la lista: ");
        String nombre1 = entrada.nextLine();
        System.out.println("Ingresar otro nombre para añadir a la lista: ");
        String nombre2 = entrada.nextLine();

        List<String> listNombres = new ArrayList<>();
        listNombres.add("Kylian");
        listNombres.add("Erika");
        listNombres.add(nombre1);
        listNombres.add(nombre2);
        System.out.println(listNombres);

        System.out.println("Ingresa el nombrie que quieres buscar: ");
        String buscarNombre = entrada.nextLine();
        int posicion = listNombres.indexOf(buscarNombre);
        if ( posicion >= 0) {
            System.out.println("El elemento " + buscarNombre + " está en la lista en la posición " + posicion);
        } else {
            System.out.println("El elemento " + buscarNombre + " NO está en la lista.");
        }

        System.out.println("Ingresa el nombre que quieres borrar de la lista: ");
        String nombreBorrar = entrada.nextLine();
        listNombres.remove(nombreBorrar);
        System.out.println(listNombres);
    }
}