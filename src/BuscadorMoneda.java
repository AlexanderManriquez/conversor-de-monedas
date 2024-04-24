import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class BuscadorMoneda {

    // Método para obtener la tasa de conversión entre dos monedas
    public double obtenerTasaConversion(String monedaOrigen, String monedaDestino) {
        Moneda datosMoneda = ingresoUsuario(monedaOrigen);
        return datosMoneda.getConversionRates().get(monedaDestino);
    }

    // Método para realizar la conversión de una cantidad de una moneda a otra
    public double convertirMoneda(double cantidad, String monedaOrigen, String monedaDestino) {
        double tasaConversion = obtenerTasaConversion(monedaOrigen, monedaDestino);
        return cantidad * tasaConversion;
    }

    // Método para obtener los datos de la moneda desde la API
    public Moneda ingresoUsuario(String moneda) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b968a5e4dca58bf40a81d984/latest/" + moneda);
    
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            // Imprimir la respuesta responseBody
         System.out.println("Respuesta de la API:");
         System.out.println(responseBody);
         
            Gson gson = new Gson();
            Moneda monedaData = gson.fromJson(responseBody, Moneda.class);
            
            // Verificar si el mapa de tasas de conversión se ha inicializado correctamente
            if (monedaData.getConversionRates() == null) {
                throw new RuntimeException("El objeto Moneda devuelto no tiene tasas de conversión.");
            }
            
            return monedaData;
        } catch (Exception e) {
            throw new RuntimeException("Moneda no encontrada");
        }
    }
    
}

