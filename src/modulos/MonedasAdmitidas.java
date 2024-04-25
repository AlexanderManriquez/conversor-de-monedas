package modulos;

import java.util.HashSet;
import java.util.Set;

public class MonedasAdmitidas {
    private static Set<String> monedasAdmitidas;

    static {
        // Inicializar el conjunto de monedas admitidas
        monedasAdmitidas = new HashSet<>();
        monedasAdmitidas.add("USD: Dólar estadounidense");
        monedasAdmitidas.add("EUR: Euro");
        monedasAdmitidas.add("GBP: Libra Esterlina");
        monedasAdmitidas.add("CLP: Peso Chileno");
        monedasAdmitidas.add("ARS: Peso Argentino");
        monedasAdmitidas.add("BOB: Boliviano");
        monedasAdmitidas.add("PEN: Sol Peruano");
        monedasAdmitidas.add("BRL: Real Brasileño");
        monedasAdmitidas.add("COP: Peso Colombiano");
        monedasAdmitidas.add("MXN: Peso Mexicano");
        monedasAdmitidas.add("CNY: Renminbi Chino");
        monedasAdmitidas.add("JPY: Yen Japonés");
    }

    public static Set<String> getMonedasAdmitidas() {
        return monedasAdmitidas;
    }

    public static void mostrarMonedasAdmitidas() {
        System.out.println("Monedas admitidas para conversión:");
        for (String moneda : monedasAdmitidas) {
            System.out.println(moneda);
        }
    }
}


