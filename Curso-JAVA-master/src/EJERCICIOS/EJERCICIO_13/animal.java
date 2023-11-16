package EJERCICIOS.EJERCICIO_13;

public class animal {
    private String nombre;
    private int edad;

    private int numPatas;

    public animal(String nombre, int edad, int numPatas){
        this.nombre = nombre;
        this.edad = edad;
        this.numPatas = numPatas;
    }
    public String getCaracteristicas() {return "Nombre: " + nombre + " Edad: " + edad + " NumPatas: " + numPatas;}
}
