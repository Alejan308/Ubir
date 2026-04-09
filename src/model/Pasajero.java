package model;

public class Pasajero extends Usuario {

    public Pasajero(int id, String nombre, String email, String password, Billetera billetera) {
        super(id, nombre, email, password, billetera);
    }

    public void solicitarViaje(String origen, String destino) {
        // Lógica para generar un nuevo Viaje
    }

    @Override public void login() { /* ... */ }
    @Override public void logout() { /* ... */ }
    @Override public void registrarUsuario() { /* ... */ }
}
