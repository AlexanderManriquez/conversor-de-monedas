import java.util.Scanner;

public class Principal {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ConversorMoneda buscadorMoneda = new ConversorMoneda();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("*************************************");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("*************************************");
        System.out.println("\nPor favor, ingrese la moneda de origen:");
        String monedaOrigen = entrada.nextLine();

        // Obtener el objeto Moneda
        Moneda monedaData = buscadorMoneda.ingresoUsuario(monedaOrigen);
        
        // Verificar si el objeto Moneda tiene tasas de conversión
        if (monedaData.getConversionRates() == null) {
            System.out.println("No se encontraron tasas de conversión para la moneda especificada.");
            return; // Salir del programa
        }
        
        System.out.println("\nIngrese la moneda de destino:");
        String monedaDestino = entrada.nextLine();
        
        System.out.println("\nIngrese la cantidad de dinero a convertir:");
        double cantidad = entrada.nextDouble();
        
        double cantidadConvertida = buscadorMoneda.convertirMoneda(cantidad, monedaOrigen, monedaDestino);
        
        System.out.println("\n" + cantidad + " " + monedaOrigen + " equivale a " + cantidadConvertida + " " + monedaDestino);
        
        entrada.close();
    }
}