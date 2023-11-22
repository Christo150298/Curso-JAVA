package EJERCICIOS.EJERCICIO_29;
import java.util.HashSet;
import java.util.Set;

public class Estudiante {
    private String nombre;
    private int numeroEstudiante;
    private Set<String> asignaturasInscritas;

    public Estudiante(String nombre, int numeroEstudiante) {
        this.nombre = nombre;
        this.numeroEstudiante = numeroEstudiante;
        this.asignaturasInscritas = new HashSet<>();
    }

    public void agregarAsignatura(String asignatura) {
        asignaturasInscritas.add(asignatura);
    }
    public void eliminarAsignatura(String asignatura) {
        asignaturasInscritas.remove(asignatura);
    }
    public void mostrarAsignaturasInscritas() {
        System.out.println("Asignaturas inscritas por: " + nombre + ":");
        for (String asignatura : asignaturasInscritas) {
            System.out.println(asignatura);
        }
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNumeroEstudiante() { return numeroEstudiante; }

    public void setNumeroEstudiante(int numeroEstudiante) { this.numeroEstudiante = numeroEstudiante; }
}
