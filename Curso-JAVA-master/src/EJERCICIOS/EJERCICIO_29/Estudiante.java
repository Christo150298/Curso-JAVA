package EJERCICIOS.EJERCICIO_29;

public abstract class Estudiante {
    private String nombre;
    private int numEstudiante;

    public Estudiante(String nombre, int numEstudiante) {
        this.nombre = nombre;
        this.numEstudiante = numEstudiante;
    }

    public String getNombre() {return nombre;}

    public int getNumEstudiante() {return numEstudiante;}

    public abstract String obtenerAsignatura();
}
