package EJERCICIOS.EJERCICIO_18;

public class EmpleadoPorHoras  implements Empleado{

    private String nombre;
    private double tarifaPorHora;
    private double horasTrabajadas;

    public EmpleadoPorHoras(String nombre, double tarifaPorHora, double horasTrabajadas) {
        this.nombre = nombre;
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado por Horas: " + nombre);
        System.out.println("Tarifa por Hora: $" + tarifaPorHora);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
    }
}