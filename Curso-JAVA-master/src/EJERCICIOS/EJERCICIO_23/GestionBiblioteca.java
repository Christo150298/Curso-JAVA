package EJERCICIOS.EJERCICIO_23;

public class GestionBiblioteca {
    public static void main(String[] args) {
        // Crear instancias de libros y DVDs
        Libro libro1 = new Libro("Java for Beginners", "John Doe", 300);
        DVD dvd1 = new DVD("The Matrix", "Wachowski Brothers", 120);
        Libro libro2 = new Libro("Data Structures in Python", "Jane Smith", 250);

        // Crear una instancia de la biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros y DVDs a la biblioteca
        biblioteca.agregarItem(libro1);
        biblioteca.agregarItem(dvd1);
        biblioteca.agregarItem(libro2);

        // Realizar operaciones de préstamo y devolución
        libro1.prestar();
        dvd1.prestar();
        libro2.prestar();
        libro1.devolver();
        dvd1.devolver();

        // Mostrar estado actual de la biblioteca
        biblioteca.mostrarEstadoBiblioteca();
    }
}
