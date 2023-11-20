package EJERCICIOS.EJERCICIO_25;

public class EquipoProgramacion {

    String nombreEquipo;
    String universidad;
    String lenguaje;
    int tamanoEquipo;
    Programador[] programadores;
    int numProgramadores;

    public EquipoProgramacion(String nombreEquipo, String universidad, String lenguaje, int tamanoEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguaje = lenguaje;
        this.tamanoEquipo = tamanoEquipo;
        this.programadores = new Programador[tamanoEquipo];
        this.numProgramadores = 0;
    }

    public boolean estaCompleto() {
        return  numProgramadores == tamanoEquipo;
    }
    public void agregarProgramador(String nombre, String apellidos) {
        if(estaCompleto()){
            System.out.println("El quipo está completo. No se puede agregar mas programadores.");
        } else {
            programadores[numProgramadores] = new Programador(nombre,apellidos);
            numProgramadores++;
        }
    }

    public static void validarTexto(String texto) throws IllegalArgumentException {
        if (texto.matches(".*\\d.*") || texto.length() >= 20) {
            throw new IllegalArgumentException("El texto no es válido. Debe contener solo letras y menos de 20 caracteres.");
        }
    }
}