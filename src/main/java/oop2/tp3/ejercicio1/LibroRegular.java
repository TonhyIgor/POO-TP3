package oop2.tp3.ejercicio1;

public class LibroRegular extends Libro {

    public static final double COEFICIENTE_COSTO = 1.5;

    public LibroRegular(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMonto(int diasAlquilados, double monto) {
        monto += 2;
        if (diasAlquilados > 2)
            monto += (diasAlquilados - 2) * COEFICIENTE_COSTO;
        return monto;
    }

}
