package EJERCICIOS.EJERCICIO_29;

public class Asignaturas extends Estudiante {
    private String Lengua;
    private String Matematicas;
    private String Fisica;
    private String Ingles;

    public Asignaturas(String nombre, int numEstudiante,String Lengua, String Matematicas, String Fisica, String Ingles) {
        super(nombre,numEstudiante);
        this.Lengua = Lengua;
        this.Matematicas = Matematicas;
        this.Fisica = Fisica;
        this.Ingles = Ingles;
    }

    @Override
    public String obtenerAsignatura() {
        return Lengua;
    }
}