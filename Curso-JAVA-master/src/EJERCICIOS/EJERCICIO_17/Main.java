package EJERCICIOS.EJERCICIO_17;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Christopher");
        Administrador administrador = new Administrador("Gonzalo");

        if (usuario.autenticar()) {
            System.out.println("Bienvenido " + usuario.nameUser);
        } else {
            System.out.println("Error en la autenticacion de usuario.");
        }

        if (administrador.autenticar()) {
            System.out.println("Bienvenido " + administrador.nameAdmin);
        } else {
            System.out.println("Error en la autenticacion de administrador.");
        }
    }
}