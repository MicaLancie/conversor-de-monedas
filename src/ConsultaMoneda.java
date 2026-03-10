import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public double obtenerValorConvertido(String monedaOrigen, String monedaDestino, double cantidad) {
        String apiKey = "8e6eb543704cb32b00ead50a";
        String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey +
                "/pair/" + monedaOrigen + "/" + monedaDestino + "/" + cantidad;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            return jsonObject.get("conversion_result").getAsDouble();

        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la tasa: " + e.getMessage());
        }
    }
}