import java.util.Scanner;

public class Principal {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ConversorMoneda conversorMoneda = new ConversorMoneda();
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        
        System.out.println("*************************************");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("*************************************");

        while(continuar) {
            System.out.println("\nPor favor, ingrese el código de la moneda de origen (en mayúsculas):");
            String monedaOrigen = entrada.nextLine();

            // Obtener el objeto Moneda
            Moneda monedaData = conversorMoneda.ingresoUsuario(monedaOrigen);
        
            // Verificar si el objeto Moneda tiene tasas de conversión
            if (monedaData.getConversionRates() == null) {
                System.out.println("No se encontraron tasas de conversión para la moneda especificada.");
                return; // Salir del programa
            }
        
            System.out.println("\nPor favor, ingrese el código de la moneda de destino (en mayúsculas):");
            String monedaDestino = entrada.nextLine();
        
            System.out.println("\nIngrese la cantidad de dinero a convertir:");
            double cantidad = entrada.nextDouble();
        
            double cantidadConvertida = conversorMoneda.convertirMoneda(cantidad, monedaOrigen, monedaDestino);
        
            System.out.println("\n" + cantidad + " " + monedaOrigen + " equivale a " + cantidadConvertida + " " + monedaDestino);

            entrada.nextLine();

            // Ofrecer opción de continuar o salir
            System.out.println("¿Desea realizar otra conversión? S para sí, cualquier otra tecla para salir.");
            String opcion = entrada.nextLine();
            if(!opcion.equalsIgnoreCase("S")){
                continuar = false;
            }
        }
        
        System.out.println("Gracias por utilizar nuestro conversor.");
        
        entrada.close();
    }
}