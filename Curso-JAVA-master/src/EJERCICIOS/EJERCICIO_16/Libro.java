package EJERCICIOS.EJERCICIO_16;

public class Libro {
    private String titulo;
    private String autor;
    private int fechaPublicacion;
    private boolean disponibilidd;

    public Libro (String titulo, String autor, int fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.disponibilidd = true;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isDisponibilidd() { return disponibilidd; }

}
