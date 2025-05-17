package oop2.tp3.ejercicio3;

public class GastoCena extends Gasto {
    public GastoCena(int monto) {
        super(monto);
    }

    @Override
    String determinarTipoGasto() {
        return "CENA";
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
