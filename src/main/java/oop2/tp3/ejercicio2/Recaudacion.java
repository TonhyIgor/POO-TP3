package oop2.tp3.ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {
    public static final String PERMALINK = "permalink";
    public static final int INDICE_PERMALINK = 0;
    public static final String COMPANY_NAME = "company_name";
    public static final int INDICE_COMPANY_NAME = 1;
    public static final String NUMBER_EMPLOYEES = "number_employees";
    public static final int INDICE_NUMBER_EMPLOYEES = 2;
    public static final String CATEGORY = "category";
    public static final int INDICE_CATEGORY = 3;
    public static final String CITY = "city";
    public static final int INDICE_CITY = 4;
    public static final String STATE = "state";
    public static final int INDICE_STATE = 5;
    public static final String FUNDED_DATE = "funded_date";
    public static final int INDICE_FUNDED_DATE = 6;
    public static final String RAISED_AMOUNT = "raised_amount";
    public static final int INDICE_RAISED_AMOUNT = 7;
    public static final String RAISED_CURRENCY = "raised_currency";
    public static final int INDICE_RAISED_CURRENCY = 8;
    public static final String ROUND = "round";
    public static final int INDICE_ROUND = 9;
    private final Map<String, Integer> columna_indice;
    private List<String[]> datos;
    private Map<String, String> filtros;

    public Recaudacion(FuenteDeDatos lector) {
        this.datos = lector.toList();
        this.filtros = new HashMap<>();
        this.columna_indice = inicarlizarMapa();
    }

    private Map<String, Integer> inicarlizarMapa() {
        return Map.of(PERMALINK, INDICE_PERMALINK,
                COMPANY_NAME, INDICE_COMPANY_NAME,
                NUMBER_EMPLOYEES, INDICE_NUMBER_EMPLOYEES,
                CATEGORY, INDICE_CATEGORY,
                CITY, INDICE_CITY,
                STATE, INDICE_STATE,
                FUNDED_DATE, INDICE_FUNDED_DATE,
                RAISED_AMOUNT, INDICE_RAISED_AMOUNT,
                RAISED_CURRENCY, INDICE_RAISED_CURRENCY,
                ROUND, INDICE_ROUND);
    }

    public List<Map<String, String>> ejecutarConsulta() {
        filtrar();
        return armarResultado();

/*        filtro(COMPANY_NAME, INDICE_COMPANY_NAME);
        filtro(CITY, INDICE_CITY);
        filtro(STATE, INDICE_STATE);
        filtro(ROUND, INDICE_ROUND);*/

    }

    public Recaudacion filtrarPor(String columna, String valor) {
        this.filtros.put(columna, valor);
        filtrar();
        return this;
    }

    private void filtrar() {
        for (String columna : this.filtros.keySet()) {
            datos = datos.stream()
                    .filter(fila -> fila[columna_indice.get(columna)]
                            .equals(this.filtros.get(columna)))
                    .toList();
        }
    }

    private List<Map<String, String>> armarResultado() {
        List<Map<String, String>> output = new ArrayList<>();

        for (int i = 0; i < this.datos.size(); i++) {
            Map<String, String> mapped = new HashMap<>();
            mapped.put(PERMALINK, this.datos.get(i)[INDICE_PERMALINK]);
            mapped.put(COMPANY_NAME, this.datos.get(i)[INDICE_COMPANY_NAME]);
            mapped.put(NUMBER_EMPLOYEES, this.datos.get(i)[INDICE_NUMBER_EMPLOYEES]);
            mapped.put(CATEGORY, this.datos.get(i)[INDICE_CATEGORY]);
            mapped.put(CITY, this.datos.get(i)[INDICE_CITY]);
            mapped.put(STATE, this.datos.get(i)[INDICE_STATE]);
            mapped.put(FUNDED_DATE, this.datos.get(i)[INDICE_FUNDED_DATE]);
            mapped.put(RAISED_AMOUNT, this.datos.get(i)[INDICE_RAISED_AMOUNT]);
            mapped.put(RAISED_CURRENCY, this.datos.get(i)[INDICE_RAISED_CURRENCY]);
            mapped.put(ROUND, this.datos.get(i)[INDICE_ROUND]);
            output.add(mapped);
        }
        return output;
    }

/*    private void filtro(String company_name, int x) {
        if (filtros.containsKey(company_name)) {
            List<String[]> results = new ArrayList<>();

            for (int i = 0; i < this.datos.size(); i++) {
                if (this.datos.get(i)[x].equals(filtros.get(company_name))) {
                    results.add(this.datos.get(i));
                }
            }
            this.datos = results;
        }
    }*/
}
