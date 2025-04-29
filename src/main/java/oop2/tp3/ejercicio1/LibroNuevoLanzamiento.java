package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamiento extends Libro{

    public static final int MINIMOS_DIAS_ALQUILADOS = 1;
    public static final int COEFICIENTE_COSTO = 3;

    public LibroNuevoLanzamiento(String nombre, int priceCode) {
        super(nombre, priceCode);
    }

    @Override
    double calcularMonto(int diasAlquilados, double monto) {
        monto += diasAlquilados * COEFICIENTE_COSTO;
        return monto;
    }

    @Override
    public int sumarPuntosFrecuente(int diasAlquilados){
        return (diasAlquilados == MINIMOS_DIAS_ALQUILADOS) ? 1 : 0;
    }
}
