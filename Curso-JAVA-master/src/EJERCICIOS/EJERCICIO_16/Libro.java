package EJERCICIOS.EJERCICIO_16;

public class Libro {
    private String titulo;
    private String autor;
    private int fechaPublicacion;
    private boolean disponible;

    public Libro (String titulo, String autor, int fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.disponible = true;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getFechaPublicacion() { return fechaPublicacion;}
    public boolean isDisponible() { return disponible; }
    public void prestar() {
        disponible = false;
    }
    public void devolver() {
        disponible = true;
    }
}