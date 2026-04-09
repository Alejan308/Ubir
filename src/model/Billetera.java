package model;

public class Billetera {
    private int idBilletera;
    private double saldo;

    public Billetera(int i, double v) {
    }


    public void recargarBilletera(double monto, MetodoDePago metodo) {
        metodo.procesarPago(monto); // Uso del patrón estrategia implícito en el diagrama
        this.saldo += monto;
    }
}

