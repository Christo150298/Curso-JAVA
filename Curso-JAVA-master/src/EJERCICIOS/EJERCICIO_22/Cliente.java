package EJERCICIOS.EJERCICIO_22;

public class Cliente {

    public String nombre;
    public String direccion;
    public int telefono;

    public Cliente(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() { return "Nombre: " + nombre; }
    public String getDireccion() { return "Dirección: " + direccion; }

    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return "Teléfono: " + telefono; }
}