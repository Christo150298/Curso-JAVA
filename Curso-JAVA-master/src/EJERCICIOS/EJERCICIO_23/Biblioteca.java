package EJERCICIOS.EJERCICIO_23;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<ItemBiblioteca> items;
    public Biblioteca() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemBiblioteca item) {
        items.add(item);
    }
    public void mostrarEstadoBiblioteca() {
        System.out.println("Estado actual de la biblioteca:");
        for (ItemBiblioteca item : items) {
            System.out.println(item.getClass().getSimpleName() + ": " + (item.estaPrestado() ? "Prestado" : "Disponible"));
        }
    }
}