package oop2.tp3.ejercicio3;

public class GastoCena extends Gasto {
    public GastoCena(String nombre, int monto) {
        super(nombre, monto);
    }

    @Override
    int calcularGastoComida() {
        return 0;
    }

    @Override
    boolean excesoComida() {
        return false;
    }
}
