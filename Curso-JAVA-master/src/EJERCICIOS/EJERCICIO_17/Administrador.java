package EJERCICIOS.EJERCICIO_17;

class Administrador implements Autenticable {

    public String nameAdmin;
    private String idAdmin;
    private int passwordAdmin;

    public Administrador(String nameAdmin) {
        this.nameAdmin = nameAdmin;
    }
    @Override
    public boolean autenticar() {
        System.out.println("Autenticacion de administrador");
        return true;
    }
}