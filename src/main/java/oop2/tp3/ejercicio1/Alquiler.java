package oop2.tp3.ejercicio1;

public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public double calcularMonto(double monto) {
        return this.copia.calcularCosto(this.diasAlquilados, monto);
    }

    public int sumarPuntosFrecuente() {
        return this.copia.sumarPuntosFrecuente(this.diasAlquilados);
    }
}
