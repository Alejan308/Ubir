package model;

public class Viaje {
    private int idViaje;
    private String origen;
    private String destino;
    private Chofer chofer;
    private Pasajero pasajero;
    private double distancia;
    private double montoTotal;
    private String estado; // Sugerencia: Usar un Enum para [En camino, Viajando, Finalizado, Cancelado]

    public Viaje(int idViaje, String origen, String destino, Pasajero pasajero) {
        this.idViaje = idViaje;
        this.origen = origen;
        this.destino = destino;
        this.pasajero = pasajero;
        this.estado = "En camino";
    }

    public void setEstado(String estado) { this.estado = estado; }
}
