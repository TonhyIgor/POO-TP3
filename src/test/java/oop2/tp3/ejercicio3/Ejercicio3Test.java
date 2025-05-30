package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio3Test {
    @Test
    void test() {
        List<Gasto> gastos = new ArrayList<>();
        var g1 = new GastoDesayuno(1000);
        gastos.add(g1);

        var g2 = new GastoCena(5000);
        gastos.add(g2);

        var reporte = new ReporteDeGastos(gastos);
        String cadena = reporte.imprimir(List.of(g1, g2));
        assertEquals(valorEsperado(), cadena);
    }

    private String valorEsperado() {
        return "Expenses " + LocalDate.now() + "\n" +
                "DESAYUNO\t1000\t \n" +
                "CENA\t5000\t \n" +
                "Gastos de comida: 6000\n" +
                "Total de gastos: 6000\n";
    }
}
