package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio1Test {
    @Test
    void calcularCostoTest(){
        Libro elTunel = new LibroRegular("El Túnel", Libro.REGULARES);
        Libro antesDelFin = new LibroRegular("Antes del Fin", Libro.REGULARES);

        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);

        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        System.out.println(resultado[0]);
        System.out.println(resultado[1]);

        assertEquals(10d, resultado[0]);
    }
}