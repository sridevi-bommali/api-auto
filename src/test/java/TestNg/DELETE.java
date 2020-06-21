package TestNg;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DELETE {
	
	int id = 25;
	
	@Test
	public void deletetodos()
	{
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/todos";
		RestAssured.basePath = "/"+id;
	
		//Response response=
		
		when()
		  .delete()
		  
		.then()
		  .statusCode(200)
		  .statusLine("HTTP/1.1 200 OK")
		  .log().all()
		  .extract().response();  // extracting response and storing it in response 
		
		
		
	}
	
	

}
