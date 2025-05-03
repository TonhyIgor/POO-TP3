package oop2.tp3.ejercicio5;

public class Drama extends Actuacion {

    public Drama(String nombreEvento, int numeroEspectadores) {
        super(nombreEvento, numeroEspectadores);
    }

    @Override
    public int calcularMonto() {
        int monto = 40000;
        if (this.numeroEspectadores() > 30) {
            return monto + 1000 * (this.numeroEspectadores() - 30);
        }
        return monto;
    }

    @Override
    public float adicionalCreditos() {
        return 0;
    }
}
