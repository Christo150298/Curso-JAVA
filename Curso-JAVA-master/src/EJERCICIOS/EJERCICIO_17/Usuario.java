package EJERCICIOS.EJERCICIO_17;

class Usuario implements Autenticable{

    public String nameUser;
    private String idUser;
    private int passwordUser;

    public Usuario(String nameUser) {
        this.nameUser = nameUser;
    }
    @Override
    public boolean autenticar() {
        System.out.println("Autenticacion de usuario");
        return true;
    }
}