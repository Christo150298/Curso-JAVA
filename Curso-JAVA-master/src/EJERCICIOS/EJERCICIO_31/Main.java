package EJERCICIOS.EJERCICIO_31;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int edadFiltrar = 25;

        Persona persona1 = new Persona("Juan",33,"Lisboa");
        Persona persona2 = new Persona("Maria",23,"Barcelona");
        Persona persona3 = new Persona("Carlos",26,"Caracas");
        Persona persona4 = new Persona("Alicia",21,"Sevilla");

        List<Persona> listaPersonas = Arrays.asList(persona1,persona2,persona3,persona4);

        List<String> personasMayores25 = listaPersonas.stream()
                .filter(p -> p.getEdad() > edadFiltrar)
                .map(p -> p.getNombre() + "-" + p.getCiudad())
                .collect(Collectors.toList());

        System.out.println("Personas mayores a 25: " + personasMayores25);
    }
}