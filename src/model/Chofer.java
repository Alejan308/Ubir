package model;

import Interface.ValidacionLicenciaConducir;

public class Chofer extends Usuario implements ValidacionLicenciaConducir {
    private String licencia;
    private Vehiculo vehiculo;
    private boolean estaDisponible;

    public Chofer(int id, String nombre, String email, String password, Billetera billetera, String licencia) {
        super(id, nombre, email, password, billetera);
        this.licencia = licencia;
    }

    public void aceptarViaje(Viaje viaje) { viaje.setEstado("Viajando"); }
    public void declinarViaje(Viaje viaje) { viaje.setEstado("Cancelado"); }
    public void aniadirVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
    public void quitarVehiculo(Vehiculo vehiculo) { this.vehiculo = null; }

    @Override
    public boolean validarLicenciaConducir(String licencia) {
        return licencia != null && !licencia.isEmpty();
    }

    @Override public void login() { /* ... */ }
    @Override public void logout() { /* ... */ }
    @Override public void registrarUsuario() { /* ... */ }
}