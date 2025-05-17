package oop2.tp3.ejercicio1;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    public double calcularCosto(int diasAlquilados, double monto) {
        return this.libro.calcularMonto(diasAlquilados, monto);
    }

    public int sumarPuntosFrecuente(int diasAlquilados) {
        return this.libro.sumarPuntosFrecuente(diasAlquilados);
    }
}