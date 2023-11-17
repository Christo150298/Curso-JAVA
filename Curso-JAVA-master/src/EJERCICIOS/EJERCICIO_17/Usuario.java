package EJERCICIOS.EJERCICIO_17;

class Usuario implements Autenticable{

    public String nameUser;
    private String passwordUser;

    public Usuario(String nameUser, String passwordUser) {
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
    }
    @Override
    public boolean autenticar() {
        return nameUser.equals(nameUser);
    }
}