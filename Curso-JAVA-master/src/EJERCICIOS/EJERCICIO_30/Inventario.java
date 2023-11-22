package EJERCICIOS.EJERCICIO_30;
import java.util.HashMap;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {

        HashMap<String,Integer> inventario = new HashMap<String,Integer>();

        System.out.println("Lista de productos: ");

        inventario.put("Camisetas", 20);
        inventario.put("Pantalones", 20);
        inventario.put("Chaquetas", 10);
        inventario.put("Calcetines", 30);
        inventario.put("Accesorios", 40);
        inventario.put("Accesorios", 25);

        productoRepetido(inventario);
        System.out.println(inventario);

        System.out.println();

        actualizarProductos(inventario);
        System.out.println(inventario);
    }
    private static void actualizarProductos(HashMap<String, Integer> inventario) {
        System.out.println("Lista de productos actualizados: ");
        inventario.put("Camisetas", 80);
        inventario.replace("Chaquetas", 50);
        inventario.put("Pantalones", 60);
        inventario.put("Calcetines", 100);
        inventario.put("Accesorios", 120);
    }

    private static void productoRepetido(HashMap<String, Integer> inventario) {
        if (inventario.containsKey("Accesorios")) {
            if (inventario.containsValue(25)) {
                inventario.remove("Accesorios",25);
            }
        }
    }
}