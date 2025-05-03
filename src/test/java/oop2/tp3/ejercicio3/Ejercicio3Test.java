package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Ejercicio3Test {
    @Test
    void test() {
/*        List<Gasto> gastos = new ArrayList<>();
        var g1 = new Gasto(TipoDeGasto.DESAYUNO, 1000);
        gastos.add(g1);

        var g2 = new Gasto(TipoDeGasto.CENA, 5000);
        gastos.add(g2);

        var reporte = new ReporteDeGastos(gastos);
        String cadena = reporte.imprimir(List.of(g1, g2));
        assertEquals(valorEsperado(), cadena);*/
    }

    private String valorEsperado() {
        return "Expenses " + LocalDate.now() + "\n" +
                "DESAYUNO\t1000\t \n" +
                "CENA\t5000\t \n" +
                "Gastos de comida: 6000\n" +
                "Total de gastos: 6000\n";
    }
}
