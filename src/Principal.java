import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        BuscadorMoneda buscadorMoneda = new BuscadorMoneda();
        double cantidadOrigen;
        String monedaOrigen;
        String monedaDestino;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa la moneda de Origen: ");
        monedaOrigen = entrada.next();
        System.out.println("Ingresa la moneda de destino: ");
        monedaDestino = entrada.next();
        System.out.println("Que cantidad deseas convertir: ");
        cantidadOrigen = entrada.nextDouble();
        
        double cantidadDestino = buscadorMoneda.convertirMoneda(cantidadOrigen, monedaOrigen, monedaDestino);
        System.out.println(cantidadOrigen + " " + monedaOrigen + " son " + cantidadDestino + " " + monedaDestino);

        entrada.close();
    }
    
}