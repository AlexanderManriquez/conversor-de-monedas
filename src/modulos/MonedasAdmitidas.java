package modulos;

import java.util.HashSet;
import java.util.Set;

public class MonedasAdmitidas {
    private static Set<String> monedasAdmitidas;

    static {
        // Inicializar el conjunto de monedas admitidas
        monedasAdmitidas = new HashSet<>();
        monedasAdmitidas.add("USD");
        monedasAdmitidas.add("EUR");
        monedasAdmitidas.add("GBP");
        monedasAdmitidas.add("CLP");
        monedasAdmitidas.add("ARS");
        monedasAdmitidas.add("BOB");
        monedasAdmitidas.add("PEN");
        monedasAdmitidas.add("BRL");
        monedasAdmitidas.add("COP");
        monedasAdmitidas.add("MXN");
        monedasAdmitidas.add("CNY");
        monedasAdmitidas.add("JPY");
    }

    public static boolean esMonedaAdmitida(String moneda) {
        return monedasAdmitidas.contains(moneda);
    }

    public static String getNombreMoneda(String codigoMoneda) {
        switch (codigoMoneda) {
            case "USD": return "USD = Dólar estadounidense";
            case "EUR": return "EUR = Euro";
            case "GBP": return "GBP = Libra esterlina";
            case "CLP": return "CLP = Peso chileno";
            case "ARS": return "ARS = Peso argentino";
            case "BOB": return "BOB = Boliviano";
            case "PEN": return "PEN = Sol peruano";
            case "BRL": return "BRL = Real brasileño";
            case "COP": return "COP = Peso colombiano";
            case "MXN": return "MXN = Peso mexicano";
            case "CNY": return "CNY = Yuan chino";
            case "JPY": return "JPY = Yen japonés";
            default: return "Desconocido";
        }
    }

    public static void mostrarMonedasAdmitidas() {
        System.out.println("Monedas admitidas para conversión:");
        int index = 1;
        for (String moneda : monedasAdmitidas) {
        System.out.println(index + ". " + getNombreMoneda(moneda));
        index++;
        }
    }
}



