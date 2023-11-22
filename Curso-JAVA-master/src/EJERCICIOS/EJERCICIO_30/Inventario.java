package EJERCICIOS.EJERCICIO_30;
import java.util.HashMap;

public class Inventario {
    private HashMap<String, Integer> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }

    public void agregarProducto(String codigo, int cantidad) {
        inventario.put(codigo, cantidad);
    }

    public void actualizarExistencias(String codigo, int nuevaCantidad) {
        inventario.put(codigo, nuevaCantidad);
    }

    public int obtenerCantidadExistencias(String codigo) {
        return inventario.getOrDefault(codigo, 0);
    }

    public void mostrarInventario() {
        for (String codigo : inventario.keySet()) {
            System.out.println("Código: " + codigo + ", Cantidad: " + inventario.get(codigo));
        }
    }

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        System.out.println("Inventario: ");
        inventario.agregarProducto("001", 10);
        inventario.agregarProducto("002", 20);
        inventario.agregarProducto("003", 60);
        inventario.agregarProducto("004", 80);
        inventario.agregarProducto("005", 18);
        inventario.mostrarInventario();

        System.out.println();
        inventario.actualizarExistencias("001", 25);
        System.out.println("Inventario Actualizado: ");
        inventario.mostrarInventario();

        System.out.println();
        int cantidadExistencias = inventario.obtenerCantidadExistencias("002");
        System.out.println("Cantidad de existencias para el producto 002: " + cantidadExistencias);
    }
}