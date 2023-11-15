package EJERCICIOS.EJERCICIO10;

public class persona {

    private String nombre;
    private String apellido;
    private String identificacion;
    private String birthYear;

    public static void main(String[] args) {

        persona persona1 = new persona();
        persona persona2 = new persona();

        persona1.setNombre("Christopher");
        persona1.setApellido("Alvarez");
        persona1.setIdentificacion("72361138X");
        persona1.setBirthYear("15/02/1998");

        persona2.setNombre("Javier");
        persona2.setApellido("Gimenez");
        persona2.setIdentificacion("72727844M");
        persona2.setBirthYear("25/06/1978");

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        System.out.println(persona1.getIdentificacion());
        System.out.println(persona1.getBirthYear());
        System.out.println("---------------");
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getApellido());
        System.out.println(persona2.getIdentificacion());
        System.out.println(persona2.getBirthYear());
    }

    public String getNombre() { return nombre; }
    public void  setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public String getBirthYear() { return birthYear; }
    public void setBirthYear(String birthYear) { this.birthYear = birthYear; }
}
