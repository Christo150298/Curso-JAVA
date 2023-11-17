package EJERCICIOS.EJERCICIO_17;

class Administrador implements Autenticable {

    public String nameAdmin;
    private String passwordAdmin;

    public Administrador(String nameAdmin, String passwordAdmin) {
        this.nameAdmin = nameAdmin;
        this.passwordAdmin = nameAdmin;
    }
    @Override
    public boolean autenticar() {
        System.out.println("Autenticacion de administrador");
        return true;
    }
}