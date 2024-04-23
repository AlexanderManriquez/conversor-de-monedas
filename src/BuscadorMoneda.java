import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class BuscadorMoneda {

    public Moneda ingresoUsuario (String moneda){
    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b968a5e4dca58bf40a81d984/latest/" + moneda);

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
                            .uri(direccion)
                            .build();
    HttpResponse<String> response;
    try {
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
    } catch (Exception e) {
        throw new RuntimeException("Moneda no encontrada");
    }
    return new Gson().fromJson(response.body(), Moneda.class);
    }
}
