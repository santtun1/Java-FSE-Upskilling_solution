// Q36: HTTP Client API (Java 11+)
// Objective: Make HTTP requests from Java.
// Task: Fetch data from a public API (e.g., GitHub).
// Instructions:
// - Use HttpClient and HttpRequest.
// - Print the response status and body.
// - Optional: Parse JSON response using Jackson or Gson.

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Q36_HTTPClientAPI {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
    }
}
