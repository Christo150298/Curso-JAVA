package EJERCICIOS.EJERCICIO_16;

public class Lector {

    private String nombre;
    private int id;
    private Libro[] librosPrestados;
    private int numLibrosPrestados;

    public Lector(String nombre, int id, int maxLibrosPrestados) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new Libro[maxLibrosPrestados];
        this.numLibrosPrestados = 0;
    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }
    public Libro [] getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(Libro libro) {
        if (libro.isDisponible() && numLibrosPrestados < librosPrestados.length) {
            librosPrestados[numLibrosPrestados] = libro;
            libro.prestar();
            numLibrosPrestados++;
            System.out.println("Libro prestado a " + nombre + ": " + libro.getTitulo());
        } else {
            System.out.println("El libro no está disponible para préstamo o el límite de libros prestados se alcanzó.");
        }
    }

    public void devolverLibro(Libro libro) {
        int index = encontrarLibro(libro);
        if (index != -1) {
            librosPrestados[index] = null;
            libro.devolver();
            numLibrosPrestados--;
            System.out.println("Libro devuelto por " + nombre + ": " + libro.getTitulo());
        } else {
            System.out.println("Este libro no fue prestado a " + nombre + ".");
        }
    }

    private int encontrarLibro(Libro libro) {
        for (int i = 0; i < librosPrestados.length; i++) {
            if (librosPrestados[i] != null && librosPrestados[i].equals(libro)) {
                return i;
            }
        }
        return -1;
    }
}