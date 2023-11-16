package EJERCICIOS.EJERCICIO_13;

public class gato extends animal{

    private String colorPelaje;
    public gato(String nombre, int edad, int numPatas, String colorPelaje) {
        super(nombre, edad, numPatas);
        this.colorPelaje = colorPelaje;
    }
    @Override
    public String getCaracteristicas() { return super.getCaracteristicas() + " ColorPelaje: " + colorPelaje; }
}
