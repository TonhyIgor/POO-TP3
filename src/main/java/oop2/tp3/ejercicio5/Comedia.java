package oop2.tp3.ejercicio5;

public class Comedia extends Actuacion {

    public Comedia(String nombreEvento, int numeroEspectadores) {
        super(nombreEvento, numeroEspectadores);
    }

    @Override
    public int calcularMonto() {
        int monto = 30000;
        if (this.numeroEspectadores() > 20) {
            monto += 10000 + 500 * (this.numeroEspectadores() - 20);
        }
        return monto + 300 * this.numeroEspectadores();
    }

    @Override
    public float adicionalCreditos() {
        return (float) Math.floor(this.numeroEspectadores() / 5);
    }
}
