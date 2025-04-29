package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;


public class ReporteDeGastos {
    private List<Gasto> gastos;

    public ReporteDeGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    public String imprimir(List<Gasto> gastos) {
        int total = 0;
        int gastosDeComida = 0;

        StringBuilder cadena =  new StringBuilder();

        cadena.append("Expenses ").append(LocalDate.now()).append("\n");

        for (Gasto gasto : gastos) {
            /*if (gasto.tipoGasto == TipoDeGasto.CENA || gasto.tipoGasto == TipoDeGasto.DESAYUNO) {
                gastosDeComida += gasto.monto;
            }*/
            gastosDeComida += gasto.calcularGastoComida();

            String nombreGasto = gasto.determinarTipoGasto();
            /*switch (gasto.tipoGasto) {
                case CENA:
                    nombreGasto = "Cena";
                    break;
                case DESAYUNO:
                    nombreGasto = "Desayuno";
                    break;
                case ALQUILER_AUTO:
                    nombreGasto = "Alquiler de Autos";
                    break;
            }*/


            String marcaExcesoComidas = gasto.excesoComida();
//            String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA && gasto.monto > 5000
//                    || gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto > 1000 ? "X" : " ";

            cadena.append(nombreGasto).append("\t").append(gasto.getMonto()).append("\t").append(marcaExcesoComidas).append("\n");

            total = gasto.sumarConMonto(total);
        }

        cadena.append("Gastos de comida: ").append(gastosDeComida).append("\n");
        cadena.append("Total de gastos: ").append(total).append("\n");

        return cadena.toString();
    }
}
