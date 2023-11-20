package EJERCICIOS.EJERCICIO_25;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo: ");
        String nombreEquipo = entrada.nextLine();
        System.out.println("Ingrese el nombre de la universidad: ");
        String universidad = entrada.nextLine();
        System.out.println("Ingrese el lenguaje de programación: ");
        String lenguaje = entrada.nextLine();
        System.out.println("Ingrese el tamaño del equipo (2 o 3): ");
        int tamanoEquipo = entrada.nextInt();

        EquipoProgramacion equipoProgramacion = new EquipoProgramacion(nombreEquipo, universidad, lenguaje, tamanoEquipo);

        for (int i = 0; i < tamanoEquipo; i++) {
            System.out.println("Ingrese los datos del programador " + (i + 1) + ":");
            System.out.println("Nombre: ");
            String nombre = entrada.nextLine();
            try {
                EquipoProgramacion.validarTexto(nombre);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                i--;
                continue;
            }

            System.out.println("Apellidos: ");
            String apellidos = entrada.nextLine();
            try {
                EquipoProgramacion.validarTexto(apellidos);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                i--;
                continue;
            }
            equipoProgramacion.agregarProgramador(nombre, apellidos);
        }

        System.out.println("\nInformación del equipo:");
        System.out.println("Nombre del equipo: " + equipoProgramacion.nombreEquipo);
        System.out.println("Universidad: " + equipoProgramacion.universidad);
        System.out.println("Lenguaje de programación: " + equipoProgramacion.lenguaje);
        System.out.println("Programadores: ");

        for(int i = 0; i < equipoProgramacion.numProgramadores; i++) {
            Programador programador = equipoProgramacion.programadores[i];
            System.out.println("  " + (i + 1) + "." + programador.nombre + " " + programador.apellidos);
        }

        entrada.close();
    }
}