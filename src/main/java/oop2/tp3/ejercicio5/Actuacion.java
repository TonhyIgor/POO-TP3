package oop2.tp3.ejercicio5;

//public record Actuacion(String nombreEvento, int numeroEspectadores) {
//}

public abstract class Actuacion {
    private String nombreEvento;
    private int numeroEspectadores;

    public Actuacion(String nombreEvento, int numeroEspectadores) {
        this.nombreEvento = nombreEvento;
        this.numeroEspectadores = numeroEspectadores;
    }

    public abstract int calcularMonto();

    public float calcularCreditos() {
        return Math.max(this.numeroEspectadores() - 30, 0) + adicionalCreditos();
    }

    public abstract float adicionalCreditos();

    String nombreEvento() {
        return this.nombreEvento;
    }

    int numeroEspectadores() {
        return this.numeroEspectadores;
    }
}