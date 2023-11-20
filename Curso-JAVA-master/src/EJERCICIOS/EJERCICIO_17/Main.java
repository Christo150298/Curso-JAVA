package EJERCICIOS.EJERCICIO_17;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario: ");
        String nombreUsuario = entrada.nextLine();

        Usuario usuario = new Usuario("Christopher", "User123456");

        if (!usuario.nameUser.equals(nombreUsuario)) {
            if (usuario.autenticar()) {
                System.out.println("Error en la autenticación de usuario.");
            }
        } else {
            System.out.println("Bienvenido " + usuario.nameUser);
        }

        System.out.println("Ingrese su nombre de administrador: ");
        String nombreAdmin = entrada.nextLine();

        Administrador administrador = new Administrador("Gonzalo", "Admin12345");

        if (!administrador.nameAdmin.equals(nombreAdmin)) {
            if (administrador.autenticar()) {
                System.out.println("Error en la autenticación de administrador.");
            }
        } else {
            System.out.println("Bienvenido " + administrador.nameAdmin);
        }
    }
}