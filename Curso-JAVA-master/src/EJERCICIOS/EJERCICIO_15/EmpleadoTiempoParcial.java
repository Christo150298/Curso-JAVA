package EJERCICIOS.EJERCICIO_15;

public class EmpleadoTiempoParcial extends Empleado {

    private int horasTrabajadas;

    public EmpleadoTiempoParcial(String nombre, int edad, double salario, int horasTrabajadas) {
        super(nombre,edad,salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioTotal() {
        return horasTrabajadas * getSalario();
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
}
