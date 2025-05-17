package oop2.tp3.ejercicio2;


import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RecaudacionTest {

    public final String PATH_ARCHIVO = "src/main/resources/data.csv";

    @Test
    public void testWhereGivenCompany() {
        var recaudacion = new Recaudacion(new LectorCSV(PATH_ARCHIVO));
/*        Map<String, String> options = new HashMap<>();
        options.put("company_name", "Facebook");
        assertEquals(7, recaudacion.ejecutarConsulta().size());*/

        var resultado = recaudacion.filtrarPor(Recaudacion.COMPANY_NAME, "Facebook").ejecutarConsulta();
        assertEquals(7, resultado.size());
    }

    @Test
    public void testWhereGivenCity() {
        var recaudacion = new Recaudacion(new LectorCSV(PATH_ARCHIVO));
        var resultado = recaudacion.filtrarPor(Recaudacion.CITY, "Tempe").ejecutarConsulta();
        assertEquals(3, resultado.size());
    }

    @Test
    public void testWhereGivenState() {
        var recaudacion = new Recaudacion(new LectorCSV(PATH_ARCHIVO));
        var resultado = recaudacion.filtrarPor(Recaudacion.STATE, "CA").ejecutarConsulta();
        assertEquals(873, resultado.size());
    }

    @Test
    public void testWhereGivenRound() {
        var recaudacion = new Recaudacion(new LectorCSV(PATH_ARCHIVO));
        var resultado = recaudacion.filtrarPor(Recaudacion.ROUND, "a").ejecutarConsulta();
        assertEquals(582, resultado.size());
    }

    @Test
    public void testMultipleOptions() {
        var recaudacion = new Recaudacion(new LectorCSV(PATH_ARCHIVO));
        var resultado = recaudacion.filtrarPor(Recaudacion.ROUND, "a")
                .filtrarPor(Recaudacion.COMPANY_NAME, "Facebook")
                .ejecutarConsulta();
        assertEquals(1, resultado.size());
    }

    @Test
    public void testWhereNotExists() {
        var recaudacion = new Recaudacion(new LectorCSV(PATH_ARCHIVO));
        var resultado = recaudacion.filtrarPor(Recaudacion.COMPANY_NAME, "NotFacebook").ejecutarConsulta();
        assertEquals(0, resultado.size());
    }

    @Test
    public void testWhereCorrectKeys() {
        var recaudacion = new Recaudacion(new LectorCSV(PATH_ARCHIVO));
        Map<String, String> row = recaudacion.filtrarPor(Recaudacion.COMPANY_NAME, "Facebook").ejecutarConsulta().get(0);

        assertEquals("facebook", row.get(Recaudacion.PERMALINK));
        assertEquals("Facebook", row.get(Recaudacion.COMPANY_NAME));
        assertEquals("450", row.get(Recaudacion.NUMBER_EMPLOYEES));
        assertEquals("web", row.get(Recaudacion.CATEGORY));
        assertEquals("Palo Alto", row.get(Recaudacion.CITY));
        assertEquals("CA", row.get(Recaudacion.STATE));
        assertEquals("1-Sep-04", row.get(Recaudacion.FUNDED_DATE));
        assertEquals("500000", row.get(Recaudacion.RAISED_AMOUNT));
        assertEquals("angel", row.get(Recaudacion.ROUND));

    }
}
