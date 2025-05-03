package oop2.tp3.ejercicio3;

enum TipoDeGasto {
    CENA, DESAYUNO, ALQUILER_AUTO
}

public abstract class Gasto {
    private String nombre;
    private int monto;

    public Gasto(String tipoGasto, int monto) {
        this.nombre = tipoGasto;
        this.monto = monto;
    }

    int calcularGastoComida() {
        return 0;
    }

    String determinarTipoGasto() {
        return this.nombre;
    }

    boolean excesoComida() {
        return false;
    }

    int monto() {
        return this.monto;
    }
}
