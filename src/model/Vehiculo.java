package model;
import Interface.ValidacionVTV;

import java.util.Date;

public class Vehiculo implements ValidacionVTV {
    private String patente;
    private java.util.Date fechaVTV;
    private String marca;
    private String modelo;

    public Vehiculo(String patente, Date fechaVTV, String marca, String modelo) {
    }

    @Override
    public boolean validarVTV(java.util.Date fechaVTV, String patente) {
        // Lógica de validación
        return true;
    }
}