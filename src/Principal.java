import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        BuscadorMoneda buscadorMoneda = new BuscadorMoneda();

        
        // Convertir 100 dólares a euros
        double cantidadDolares = 100;
        String monedaOrigen = "USD";
        String monedaDestino = "EUR";
        double cantidadEuros = buscadorMoneda.convertirMoneda(cantidadDolares, monedaOrigen, monedaDestino);
        System.out.println(cantidadDolares + " " + monedaOrigen + " son " + cantidadEuros + " " + monedaDestino);
    }
    
}