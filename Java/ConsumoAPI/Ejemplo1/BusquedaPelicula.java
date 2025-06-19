import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BusquedaPelicula {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        //Solicita un nombre de película
        System.out.println("Coloca el nombre de una película:");
        String busqueda = sc.nextLine();

        //Lo agrega a la url a la que se ara la solicitud
        String url = "https://www.omdbapi.com/?t=" + busqueda + "&apikey=329964b2";

        //Crea un cliente que enviara la solicitud y esperara una respuesta
        HttpClient cliente = HttpClient.newHttpClient();

        //Crea una solicitud HTTP
        HttpRequest request = HttpRequest.newBuilder()  //Inicia la construcción de la solicitud
                .uri(URI.create(url))       //Establece la URL a la que se ara la petición
                .build();                   //Finaliza la construcción de la solicitud

        //Envía la solicitud y espera una respuesta
        HttpResponse<String> response = cliente
                //Realiza la petición y pausa o bloquea asta obtener una respuesta
                .send(request, HttpResponse.BodyHandlers.ofString());
                //HttpResponse.BodyHandlers.ofString(): Concierte el cuerpo de la respuesta a un String

        System.out.println(response.statusCode());  //Imprime el codigo de estado HTTP (200, 400, 500, etc)
        System.out.println(response.body());    //Imprime el contenido de la respuesta
    }
}
