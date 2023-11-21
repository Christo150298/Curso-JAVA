package EJERCICIOS.EJERCICIO_23;

public class DVD implements ItemBiblioteca {
    private String titulo;
    private String director;
    private int duracion;
    private boolean prestado;

    public DVD(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.prestado = false;
    }
    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("DVD prestado: " + titulo);
        } else {
            System.out.println("El DVD ya está prestado.");
        }
    }
    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("DVD devuelto: " + titulo);
        } else {
            System.out.println("El DVD no está prestado.");
        }
    }
    @Override
    public boolean estaPrestado() {
        return prestado;
    }
}