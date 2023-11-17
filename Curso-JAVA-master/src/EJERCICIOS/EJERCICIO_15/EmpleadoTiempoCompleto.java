package EJERCICIOS.EJERCICIO_15;

public class EmpleadoTiempoCompleto extends Empleado {

    private String cargo;

    public EmpleadoTiempoCompleto(String nombre, int edad, double salario, String cargo) {
        super(nombre,edad,salario);
        this.cargo = cargo;
    }

    public double calcularSalarioTotal() {
        double bono = 1.10;
        return getSalario() * bono;
    }

    public String getCargo() {
        return cargo;
    }
}