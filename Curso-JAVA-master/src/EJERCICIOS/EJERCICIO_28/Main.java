package EJERCICIOS.EJERCICIO_28;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Persona> listaPersonas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            String nombre = obtenerEntrada("Nombre: ");
            String apellido = obtenerEntrada("Apellido: ");
            String genero = obtenerEntrada("Género: ");
            int edad = obtenerEdad("Edad: ");

            Persona persona = new Persona(nombre, apellido, genero, edad);
            listaPersonas.add(persona);
        }

        retornarNombreGenero(listaPersonas);
        retornarPromedioEdades(listaPersonas);
        retormarMasculino(listaPersonas);
        retornarFemenino(listaPersonas);

        entrada.close();

    }
    private static void retornarNombreGenero(List<Persona> personas) {
        System.out.println("\nNombres, apellidos y géneros de las personas: ");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getGenero());
        }
    }
    private static void retornarPromedioEdades(List<Persona> personas) {
        if (!personas.isEmpty()) {
            int sumaEdades = 0;
            for (Persona persona : personas) {
                sumaEdades += persona.getEdad();
            }
            double promedio = (double) sumaEdades / personas.size();
            System.out.println("\nPromedio de edades: " + promedio);
        } else {
            System.out.println("\nNo hay personas en la lista para calcular el prmoedio.");
        }
    }
    private static void retormarMasculino(List<Persona> personas) {
        int countMasculino = 0;
        for (Persona persona : personas) {
            if ("masculino".equalsIgnoreCase(persona.getGenero())) {
                countMasculino++;
            }
        }
        System.out.print("\nCantidad de personas masculinas: " + countMasculino);
    }
    private static void retornarFemenino(List<Persona> personas) {
        int countFemenino = 0;
        for (Persona persona : personas) {
            if("femenino".equalsIgnoreCase(persona.getGenero())) {
                countFemenino++;
            }
        }
        System.out.println("\nCantidad de personas femeninas: " + countFemenino);
    }
    private static String obtenerEntrada(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextLine();
    }
    private static int obtenerEdad(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        int edad = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensaje);
                edad = Integer.parseInt(entrada.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número valido para edad.");
            }
        }
        return  edad;
    }
}
