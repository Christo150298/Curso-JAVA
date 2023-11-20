package EJERCICIOS.EJERCICIO_16;

public class Biblioteca {
    private Libro[] librosDisponibles;
    private Libro[] librosPrestados;
    private Lector[] lectoresRegistrados;
    private int numLibrosDisponibles;
    private int numLibrosPrestados;
    private int numLectoresRegistrados;

    public Biblioteca(int maxLibros, int maxLectores) {
        this.librosDisponibles = new Libro[maxLibros];
        this.librosPrestados = new Libro[maxLibros];
        this.lectoresRegistrados = new Lector[maxLectores];
        this.numLibrosDisponibles = 0;
        this.numLibrosPrestados = 0;
        this.numLectoresRegistrados = 0;
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles[numLibrosDisponibles] = libro;
        numLibrosDisponibles++;
    }

    public void registrarLector(Lector lector) {
        lectoresRegistrados[numLectoresRegistrados] = lector;
        numLectoresRegistrados++;
    }

    public void prestarLibro(Lector lector, Libro libro) {
        int indexLibro = encontrarLibro(libro, librosDisponibles, numLibrosDisponibles);
        int indexLector = encontrarLector(lector, lectoresRegistrados, numLectoresRegistrados);

        if (indexLibro != -1 && indexLector != -1) {
            librosPrestados[numLibrosPrestados] = libro;
            libro.prestar();
            lector.prestarLibro(libro);
            numLibrosPrestados++;
        } else {
            System.out.println("No se pudo realizar el préstamo.");
        }
    }

    public void devolverLibro(Lector lector, Libro libro) {
        int indexLibroPrestado = encontrarLibro(libro, librosPrestados, numLibrosPrestados);
        int indexLector = encontrarLector(lector, lectoresRegistrados, numLectoresRegistrados);

        if (indexLibroPrestado != -1 && indexLector != -1) {
            librosPrestados[indexLibroPrestado] = null;
            libro.devolver();
            lector.devolverLibro(libro);
            numLibrosPrestados--;
        } else {
            System.out.println("No se pudo realizar la devolución.");
        }
    }

    private int encontrarLibro(Libro libro, Libro[] array, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] != null && array[i].equals(libro)) {
                return i;
            }
        }
        return -1;
    }

    private int encontrarLector(Lector lector, Lector[] array, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] != null && array[i].equals(lector)) {
                return i;
            }
        }
        return -1;
    }

    public void mostrarInformacion() {
        System.out.println("Libros disponibles:");
        for (int i = 0; i < numLibrosDisponibles; i++) {
            System.out.println(librosDisponibles[i].getTitulo());
        }

        System.out.println("\nLibros prestados:");
        for (int i = 0; i < numLibrosPrestados; i++) {
            System.out.println(librosPrestados[i].getTitulo());
        }

        System.out.println("\nLectores registrados:");
        for (int i = 0; i < numLectoresRegistrados; i++) {
            System.out.println(lectoresRegistrados[i].getNombre());
        }
    }
}