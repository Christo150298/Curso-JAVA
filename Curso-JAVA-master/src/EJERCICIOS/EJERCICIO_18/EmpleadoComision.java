package EJERCICIOS.EJERCICIO_18;

public class EmpleadoComision implements Empleado{

    private String nombre;
    private double ventasRealizadas;
    private double tarifaComision;

    public EmpleadoComision(String nombre, double ventasRealizadas, double tarifaComision) {
        this.nombre = nombre;
        this.ventasRealizadas = ventasRealizadas;
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double calcularSalario() {
        return ventasRealizadas * tarifaComision;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado por comision: " + nombre);
        System.out.println("Ventas realizadas: " + ventasRealizadas);
        System.out.println("Tarifa por comision: $ " + tarifaComision);
    }
}
