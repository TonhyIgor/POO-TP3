package oop2.tp3.ejercicio3;

public class Gasto {
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
