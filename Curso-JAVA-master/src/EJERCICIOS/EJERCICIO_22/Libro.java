package EJERCICIOS.EJERCICIO_22;

public class Libro {
    public String titulo;
    public String autor;
    public int anioPublicacion;
    public double precio;

    public Libro(String titulo, String autor, int anioPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }

    public String getTitulo() { return "Título: " + titulo; }
    public String getAutor() { return "Autor: " + autor; }
    public String getAnioPublicacion() { return "Año publicación: " +  anioPublicacion; }
    public String getPrecio() { return "Precio: " + precio + "$"; }

    public void setPrecio(double precio) { this.precio = precio; }
}