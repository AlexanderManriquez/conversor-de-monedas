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

    public static void mostrarMonedasAdmitidas() {
        System.out.println("Monedas admitidas para conversión:");
        for (String moneda : monedasAdmitidas) {
            System.out.println(moneda);
        }
    }
}


