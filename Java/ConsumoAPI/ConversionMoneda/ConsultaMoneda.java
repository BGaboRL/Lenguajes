import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public String buscarmoneda(String a, String b, int v) {
        String link = "https://v6.exchangerate-api.com/v6/ebd31bfc117f7cfdf6755490/pair/" + a + "/" + b;
        URI url = URI.create(link);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        HttpResponse<String> response;

        {
            try {
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Conversion c = new Gson().fromJson(response.body(), Conversion.class);
        double mul = c.conversion_rate() * v;

        return v + " " + c.base_code() + " es igual a " + mul + " " + c.target_code();
    }
}
