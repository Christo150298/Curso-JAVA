package EJERCICIOS.EJERCICIO_18;

public class Main {
    public static void main(String[] args) {

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Christopher", 3000);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Carlos",15,40);
        EmpleadoComision empleadoComision = new EmpleadoComision("Maria",50000,0.10);

        Empleado[] empleados = { empleadoAsalariado, empleadoPorHoras, empleadoComision};

        for(Empleado empleado : empleados){
            empleado.mostrarInformacion();
            System.out.println("Salario: $" + empleado.calcularSalario());
            System.out.println("--------------------------");
        }
    }
}