package EJERCICIOS.EJERCICIO_18;

public class EmpleadoAsalariado implements Empleado {
    private String nombre;
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado asalariado: " + nombre);
        System.out.println("Salario Mensual: $" + salarioMensual);
    }
}