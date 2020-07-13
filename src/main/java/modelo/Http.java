package modelo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe
 */
public class Http {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();
  
    private String DIRECCION = "https://tareaprueba123.herokuapp.com";
    
    public String sendGet(String agumentos) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(DIRECCION + agumentos))
                    //.setHeader("User-Agent", "Java 11 HttpClient Bot")
                    .build();
            System.out.println(request.uri());
            System.out.println(request.headers().toString());
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // print status code
            System.out.println(response.statusCode());

            // print response body
            System.out.println("********RESULTADO***********");
            System.out.println(response.body());
            System.out.println("****************************");
            return response.body();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Http.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public  String sendPost(Map<Object, Object> values, String tablaConSlash) {

        try {
            var objectMapper = new ObjectMapper();
            String requestBody = objectMapper
                    .writeValueAsString(values);
            System.out.println("Request body 1:"+requestBody);
            var a=requestBody.replace("\\", "");
            var b=a.replace("\"{", "{");
            requestBody=b.replace("}\"", "}");
            System.out.println("Request body 2:"+requestBody);
            System.out.println("object mapper"+objectMapper.toString());
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(DIRECCION + tablaConSlash))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();
            
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            System.out.println("Request body"+response.body());
            return response.body();
        } catch (JsonProcessingException ex) {
            Logger.getLogger(Http.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Http.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }


    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }
    

   

   
}
