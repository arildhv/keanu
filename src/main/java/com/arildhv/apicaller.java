package com.arildhv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import org.json.JSONObject;


public class apicaller {
    String apiUrl = "https://api.themoviedb.org/3/person/";
    HttpRequest request = null;
    HttpClient client = null;
    HttpResponse<String> response = null;

    public apicaller(String key, String id){
        client = HttpClient.newBuilder().build();
        String uri = apiUrl + id + "?api_key=" + key;
        request = HttpRequest.newBuilder()
            .uri(URI.create(uri))
            .header("Content-Type", "application/json")
            .GET()
            .build();       
    }

    public String getBirthdate(){
        try {
            response = client.send(request, BodyHandlers.ofString());
        }catch (IOException e) {
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        String birthDate = "";
        if(response.statusCode() == 200)
        {
            JSONObject keanuObject = new JSONObject(response.body());
            birthDate = keanuObject.get("birthday").toString();
        }
        return birthDate;
    }

}