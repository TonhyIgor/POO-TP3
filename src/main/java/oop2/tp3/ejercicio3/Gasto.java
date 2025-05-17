package oop2.tp3.ejercicio3;

public abstract class Gasto {
    private int monto;

    public Gasto(int monto) {
        this.monto = monto;
    }

    abstract String determinarTipoGasto();

    int calcularGastoComida() {
        return 0;
    }

    boolean excesoComida() {
        return false;
    }

    int monto() {
        return this.monto;
    }
}
