package EJERCICIOS.EJERCICIO_29;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Carlos",150398);
        estudiante1.agregarAsignatura("Matematicas");
        estudiante1.agregarAsignatura("Historia");
        estudiante1.mostrarAsignaturasInscritas();

        Estudiante estudiante2 = new Estudiante("Bryan",696969);
        estudiante2.agregarAsignatura("Matematicas");
        estudiante2.agregarAsignatura("Inglés");
        estudiante2.mostrarAsignaturasInscritas();

        estudiante1.eliminarAsignatura("Matematicas");
        estudiante1.mostrarAsignaturasInscritas();
    }
}
