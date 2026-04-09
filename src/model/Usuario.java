package model;

public abstract class Usuario {
    protected int id;
    protected String nombre;
    protected String email;
    protected String password;
    protected Billetera billetera; // Relación de composición (rombo negro)

    public Usuario(int id, String nombre, String email, String password, Billetera billetera) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.billetera = billetera;
    }

    public abstract void login();
    public abstract void logout();
    public abstract void registrarUsuario();
}
