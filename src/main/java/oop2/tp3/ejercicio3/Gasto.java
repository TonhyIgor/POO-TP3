package oop2.tp3.ejercicio3;

enum TipoDeGasto {
    CENA, DESAYUNO, ALQUILER_AUTO
}

public class Gasto {
    private TipoDeGasto tipoGasto;
    private int monto;

    public Gasto (TipoDeGasto tipoGasto, int monto) {
        this.tipoGasto = tipoGasto;
        this.monto = monto;
    }


    int calcularGastoComida() {
        return this.tipoGasto == TipoDeGasto.CENA || this.tipoGasto == TipoDeGasto.DESAYUNO ? this.monto : 0;
    }

    String determinarTipoGasto() {
        return this.tipoGasto.toString();
    }

    String excesoComida() {
        return this.tipoGasto == TipoDeGasto.CENA && this.monto > 5000 || this.tipoGasto == TipoDeGasto.DESAYUNO && this.monto > 1000 ? "X" : " ";
    }

    int getMonto() {
        return this.monto;
    }

    int sumarConMonto(int total) {
        return this.monto += total;
    }
}
