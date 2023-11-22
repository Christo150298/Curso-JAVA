package EJERCICIOS.EJERCICIO_28;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaPersonas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {

            System.out.println("Ingrese los datos de la persona " + i + ":");
            Persona persona = new Persona();

            System.out.println("Nombre: ");
            String nombre = entrada.next();
            persona.setNombre(nombre);
            listaPersonas.add(nombre);

            System.out.println("Apellido: ");
            String apellido = entrada.next();
            persona.setApellido(apellido);
            listaPersonas.add(apellido);

            System.out.println("Género: ");
            String genero = entrada.next();
            persona.setGenero(genero);
            listaPersonas.add(genero);

            System.out.println("Edad: ");
            int edad = entrada.nextInt();
            persona.setEdad(edad);
            listaPersonas.add(String.valueOf(edad));
            entrada.nextLine();
        }
        System.out.println(listaPersonas);
    }
    public static void retornarNombreGenero(List<String> listaPersonas) {

    }

    public static void promedioEdades(List<String> listaPersonas) {
    }
    private static void retormarMasculino(List<String> listaPersonas) {
        int countMasculino = 0;
    }
    public static void retornarFemenino(List<String> listaPersonas) {

    }
}
