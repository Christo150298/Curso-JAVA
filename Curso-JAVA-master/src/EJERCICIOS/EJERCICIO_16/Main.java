package EJERCICIOS.EJERCICIO_16;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Harry Potter", "J.K. Rowling", 1997);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        Lector lector1 = new Lector("Juan", 123, 3);
        Lector lector2 = new Lector("Maria", 456, 2);

        Biblioteca biblioteca = new Biblioteca(5, 5);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.registrarLector(lector1);
        biblioteca.registrarLector(lector2);

        biblioteca.prestarLibro(lector1, libro1);
        biblioteca.prestarLibro(lector2, libro2);
        biblioteca.devolverLibro(lector1, libro1);

        biblioteca.mostrarInformacion();
    }
}