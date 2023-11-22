package EJERCICIOS.EJERCICIO_26;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("-----------------------------------");
            System.out.println("Menú: ");
            System.out.println("1. Agregar un nombre a la lista.");
            System.out.println("2. Eliminar  un nombre a la lista.");
            System.out.println("3. Imprimir la lista de nombres.");
            System.out.println("4. Buscar un nombre en la lista.");
            System.out.println("5. Salir del programa.");
            System.out.println("Seleccione una opción: ");


            try {
                opcion = Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    agregarNombre(listaNombres, entrada);
                    break;
                case 2:
                    eliminarNombre(listaNombres, entrada);
                    break;
                case 3:
                    imprimirLista(listaNombres);
                    break;
                case 4:
                    buscarNombre(listaNombres, entrada);
                    break;
                case 5:
                    System.out.println("!Nos Vemos¡");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 5.");
            }
        } while (opcion != 5);

        entrada.close();
    }

    private static void agregarNombre(ArrayList<String> listaNombres, Scanner entrada) {
        System.out.println("Ingrese el nombre a agregar: ");
        String nombre = entrada.nextLine();
        listaNombres.add(nombre);
        System.out.println("Nombre agregado con éxito.");
    }
    private static void eliminarNombre(ArrayList<String> listaNombres, Scanner entrada) {
        System.out.println("Ingrese el nombre a eliminar: ");
        String nombre = entrada.nextLine();
        if (listaNombres.remove(nombre)) {
            System.out.println("Nombre eliminado con éxito.");
        } else {
            System.out.println("El nombre no se encontró en la lista.");
        }
    }
    private static void imprimirLista(ArrayList<String> listaNombres) {
        if (listaNombres.isEmpty()) {
            System.out.println("La lista de nombres está vacía.");
        } else {
            System.out.println("Lista de nombre: ");
            for (String nombre : listaNombres) {
                System.out.println(nombre);
            }
        }
    }
    private static void buscarNombre(ArrayList<String> listaNombres, Scanner entrada) {
        System.out.println("Ingrese el nombre a buscar: ");
        String nombre = entrada.nextLine();
        if (listaNombres.contains(nombre)) {
            System.out.print("El nombre " + nombre + " está en la lista.");
        } else {
            System.out.print("El nombre " + nombre + " no está en la lista.");
        }
    }
}