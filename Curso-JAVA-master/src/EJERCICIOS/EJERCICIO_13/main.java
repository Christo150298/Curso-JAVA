package EJERCICIOS.EJERCICIO_13;

public class main {
    public static void main(String[] args) {
        perro bombon = new perro("Bombon", 7, 4,"Jack Russell");
        gato freya = new gato("Freya", 10,5,"Marron");

        System.out.println("Caracteristicas del perro => " + bombon.getCaracteristicas());
        System.out.println("Caracteristicas del gato => " + freya.getCaracteristicas());
    }
}