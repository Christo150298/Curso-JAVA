package EJERCICIOS.EJERCICIO_16;

public class Lector {

    private String nombre;
    private String id;
    private int librosPrestadosCount;
    private Libro [] librosPrestados;

    public Lector(String nombre, String id, int maxLibrosPrestados) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new Libro[maxLibrosPrestados];
        this.librosPrestadosCount = 0;
    }

    public String getNombre() { return nombre; }
    public String getId() { return id; }

}
