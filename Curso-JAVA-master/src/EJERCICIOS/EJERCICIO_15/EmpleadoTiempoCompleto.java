package EJERCICIOS.EJERCICIO_15;

public class EmpleadoTiempoCompleto extends Empleado {

    private String cargo;

    public EmpleadoTiempoCompleto(String nombre, int edad, double salario, String cargo) {
        super(nombre,edad,salario);
        this.cargo = cargo;
    }

    public double calcularSalarioTotal() {
        return getSalario() * 1.10;
    }

    public String getCargo() {
        return cargo;
    }
}
