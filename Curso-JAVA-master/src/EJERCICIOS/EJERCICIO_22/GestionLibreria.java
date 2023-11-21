package EJERCICIOS.EJERCICIO_22;

public class GestionLibreria {
    public static void main(String[] args) {

        Libro libro1 = new Libro("La casa de Bernarda Alba","Federico Garcia Lorca",1945,9.45);
        Libro libro2 = new Libro("El Quijote","Miguel de Cervantes",1605,11.50);

        System.out.println("Caracteristicas del libro: ");
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getAnioPublicacion());
        System.out.println(libro1.getPrecio());
        System.out.println();
        System.out.println("Caracteristicas del libro (Precio Modificado): ");
        System.out.println(libro2.getTitulo());
        System.out.println(libro2.getAutor());
        System.out.println(libro2.getAnioPublicacion());
        libro2.setPrecio(14.60);
        System.out.println("Nuevo " + libro2.getPrecio());

        Cliente cliente1 = new Cliente("Javier","C/ Alta 111", 600872155);
        Cliente cliente2 = new Cliente("Andres","C/ Olaguibel 46", 654639128);

        System.out.println("----------------------------");
        System.out.println("Información Cliente: ");
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getDireccion());
        System.out.println(cliente1.getTelefono());
        System.out.println();
        System.out.println("Información Cliente (Ha cambiado de dirección): ");
        System.out.println(cliente2.getNombre());
        cliente2.setDireccion("C/ Barrancal 21");
        System.out.println("Nueva " + cliente2.getDireccion());
        System.out.println(cliente2.getTelefono());
    }
}