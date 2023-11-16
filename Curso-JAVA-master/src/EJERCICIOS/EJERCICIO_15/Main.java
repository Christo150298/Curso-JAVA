package EJERCICIOS.EJERCICIO_15;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de EmpleadoTiempoCompleto
        EmpleadoTiempoCompleto empleadoCompleto = new EmpleadoTiempoCompleto("Juan", 30, 50000, "Desarrollador");

        // Mostrar información detallada
        System.out.println("Empleado a tiempo completo:");
        System.out.println("Nombre: " + empleadoCompleto.getNombre());
        System.out.println("Edad: " + empleadoCompleto.getEdad());
        System.out.println("Cargo: " + empleadoCompleto.getCargo());
        System.out.println("Salario Total: $" + String.format("%.2f", empleadoCompleto.calcularSalarioTotal()));
        System.out.println();

        // Crear instancia de EmpleadoTiempoParcial
        EmpleadoTiempoParcial empleadoParcial = new EmpleadoTiempoParcial("Maria", 25, 10, 15);

        // Mostrar información detallada
        System.out.println("Empleado a tiempo parcial:");
        System.out.println("Nombre: " + empleadoParcial.getNombre());
        System.out.println("Edad: " + empleadoParcial.getEdad());
        System.out.println("Horas Trabajadas: " + empleadoParcial.getHorasTrabajadas());
        System.out.println("Salario Total: $" + empleadoParcial.calcularSalarioTotal());
    }
}
