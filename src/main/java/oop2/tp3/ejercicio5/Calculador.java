package oop2.tp3.ejercicio5;

public class Calculador {

    public String reporte(Factura factura) {
        float totalAmount = 0;
        float creditos = 0;
        StringBuilder result = new StringBuilder("Facturación para " + factura.nombreCliente() + System.lineSeparator());
        var actuaciones = factura.actuaciones();
        for (var actuacion : actuaciones) {
            float monto = 0;
            //se elimina porque no se usa mas
            /*var tipo = eventos.stream()
                    .filter(e -> e.nombreEvento().equals(actuacion.nombreEvento()))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Evento no encontrado"))
                    .tipo();*/

            /*switch (tipo) {
                case "Drama":
                    monto = 40000;
                    if (actuacion.numeroEspectadores() > 30) {
                        monto += 1000 * (actuacion.numeroEspectadores() - 30);
                    }
                    break;
                case "Comedia":
                    monto = 30000;
                    if (actuacion.numeroEspectadores() > 20) {
                        monto += 10000 + 500 * (actuacion.numeroEspectadores() - 20);
                    }
                    monto += 300 * actuacion.numeroEspectadores();
                    break;
                default:
                    throw new RuntimeException("Tipo de evento no conocido");
            }*/

/*            // creditos a ganar
            creditos += Math.max(actuacion.numeroEspectadores() - 30, 0);
            // creditos extras para comedia
            if ("Comedia".equals(tipo)) {
                creditos += Math.floor(actuacion.numeroEspectadores() / 5);
            }*/

            monto += actuacion.calcularMonto();
            creditos += actuacion.calcularCreditos();

            result.append(actuacion.nombreEvento()).append(": ").append(monto).append(". Asientos: ")
                    .append(actuacion.numeroEspectadores()).append(System.lineSeparator());//` ${play.name}: ${format(thisAmount/100)} (${perf.audience} seats)\n`;
            totalAmount += monto;
        }
        result.append("Monto ganado: ").append(totalAmount).append(System.lineSeparator());
        result.append("Créditos ganados: ").append(creditos).append(System.lineSeparator());

        return result.toString();
    }
}
