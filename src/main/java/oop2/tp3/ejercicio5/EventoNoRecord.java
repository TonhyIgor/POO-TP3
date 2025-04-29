package oop2.tp3.ejercicio5;

public abstract class EventoNoRecord {
    private String nombreEvento;
    private String tipo;

    public EventoNoRecord(String nombreEvento, String tipo) {
        this.nombreEvento = nombreEvento;
        this.tipo = tipo;
    }

    public String nombreEvento() {
        return nombreEvento;
    }

    public String tipo() {
        return tipo;
    }

    public abstract int calcularMonto(int numeroEspectadores);
}
