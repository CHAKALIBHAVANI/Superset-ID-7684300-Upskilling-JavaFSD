// Task: Fetch data from a public API, for example GitHub.
// Instructions:
// - Use Java HttpClient.
// - Send GET request.
// - Print response.
import java.net.URI;
import java.net.http.*;

public class HttpClientExample {
    public static void main(String[] args) {
        String dummyApiName = "GitHub API Test";

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            System.out.println(dummyApiName);
            System.out.println("Status Code: " + response.statusCode());
            System.out.println(response.body());
        } catch (Exception e) {
            System.out.println("HTTP error: " + e.getMessage());
        }
    }
}