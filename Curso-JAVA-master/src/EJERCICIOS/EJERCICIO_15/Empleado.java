package EJERCICIOS.EJERCICIO_15;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre(){ return nombre; }
    public int getEdad(){ return edad; }
    public double getSalario(){ return salario; }
}
