package EJERCICIOS.EJERCICIO_13;

public class perro extends animal{

    private String raza;
    public perro(String nombre, int edad, int numPatas, String raza) {
        super(nombre, edad, numPatas);
        this.raza = raza;
    }
    @Override
    public String getCaracteristicas() {return super.getCaracteristicas() + " Raza: " + raza;}

}
