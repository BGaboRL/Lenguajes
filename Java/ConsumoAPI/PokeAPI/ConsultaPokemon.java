import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPokemon {
    public Pokemon buscarPokemon(int numeroPokemon){
        URI url = URI.create("https://pokeapi.co/api/v2/pokemon/" + numeroPokemon);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Pokemon.class);
        } catch (Exception e) {
            throw new RuntimeException("pokemon.Pokemon no encontrado!");
        }
    }
}
