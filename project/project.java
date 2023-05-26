import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.imageio.ImageIO;

public class project {
    
    public static void saveImage(String address) {
        try (URL url = new URL(address)) {
            Image image = ImageIO.read(url);
        } catch IOException err {

        }
    }
    
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        var client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://api.nasa.gov/planetary/apod?api_key=mJFbREILnMp6DJexcxVVca7hIrBFegVCSYfCcrQD"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
