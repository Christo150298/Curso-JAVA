package EJERCICIOS.EJERCICIO_23;

public class Libro implements ItemBiblioteca {
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean prestado;

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.prestado = false;
    }
    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado: " + titulo);
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }
    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto: " + titulo);
        } else {
            System.out.println("El libro no está prestado.");
        }
    }
    @Override
    public boolean estaPrestado() {
        return prestado;
    }
}