package oop2.tp3.ejercicio5;

public class Drama extends EventoNoRecord{
    public Drama(String nombreEvento, String tipo) {
        super(nombreEvento, tipo);
    }

    @Override
    public int calcularMonto(int numeroEspectadores) {
        int monto = 40000;
        if (numeroEspectadores > 30) {
            return monto += 1000 * (numeroEspectadores - 30);
        }
        return monto;
    }
}
