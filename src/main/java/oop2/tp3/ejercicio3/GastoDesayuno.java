package oop2.tp3.ejercicio3;

public class GastoDesayuno extends Gasto {
    public GastoDesayuno(int monto) {
        super(monto);
    }

    @Override
    String determinarTipoGasto() {
        return "DESAYUNO";
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
