package oop2.tp3.ejercicio5;

public class Comedia extends EventoNoRecord{
    public Comedia(String nombreEvento, String tipo) {
        super(nombreEvento, tipo);
    }

    @Override
    public int calcularMonto(int numeroEspectadores) {
        int monto = 30000;
        if (numeroEspectadores > 20) {
            monto += 10000 + 500 * (numeroEspectadores - 20);
        }
        return monto + 300 * numeroEspectadores;
    }
}
