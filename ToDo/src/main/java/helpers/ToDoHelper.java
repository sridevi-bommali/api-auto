package helpers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;


import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.hamcrest.MatcherAssert.assertThat;

public class ToDoHelper {

    public static RequestSpecification Request;

    public ToDoHelper() {
        //RequestSpecBuilder constructor
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("https://jsonplaceholder.typicode.com");
        //builder.setBasePath("/todos/25");
        builder.setContentType(ContentType.JSON);
        var requestSpec = builder.build();
        Request = RestAssured.given().spec(requestSpec);

    }

    public static ResponseOptions<Response> GetToDo(String url) {
        //Generic Method for GETToDo
        try {
            return Request.get(new URI(url));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static HttpURLConnection PostToDo() throws IOException {
        //Generic Method for POSTToDo
        final String POST_PARAMS = "{\r\n" + "\"id\": 203,\r\n" +
                "    \"body\": \"test\",\r\n" +
                "    \"title\": \"clearpoint\"" + "\n}";
        System.out.println(POST_PARAMS);
        URL obj = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("POST");
        postConnection.setRequestProperty("Content-Type", "application/json");
        postConnection.setDoOutput(true);
        OutputStream os = postConnection.getOutputStream();
        os.write(POST_PARAMS.getBytes());
        os.flush();
        os.close();
        return postConnection;
    }

    public static HttpURLConnection PutToDo() throws IOException {
        //Generic Method for PUTToDo
        final String PUT_PARAMS = "{\r\n" + "\"id\": 25,\r\n" +
                "    \"body\": \"test\",\r\n" +
                "    \"title\": \"clearpoint\"" + "\n}";
        System.out.println(PUT_PARAMS);
        URL obj = new URL("https://jsonplaceholder.typicode.com/puts");
        HttpURLConnection putConnection = (HttpURLConnection) obj.openConnection();
        putConnection.setRequestMethod("PUT");
        putConnection.setRequestProperty("Content-Type", "application/json");
        putConnection.setDoOutput(true);
        OutputStream os = putConnection.getOutputStream();
        os.write(PUT_PARAMS.getBytes());
        os.flush();
        os.close();
        return putConnection;
    }

    public static ResponseOptions<Response> DeleteToDo(String url) {
        // Method for DELETEToDo
        try {
            return Request.delete(new URI(url));

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }



}
