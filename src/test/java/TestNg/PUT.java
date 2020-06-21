package TestNg;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PUT {
	
	public static HashMap map = new HashMap();
	
	int id = 25;
	
	@BeforeClass
	public void putdata()
	{
		map.put("title","foo");
		map.put("body","bar");
		map.put("id","25");
			
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/todos";
		RestAssured.basePath="/"+id;
	}
	
	@Test
	public void putatodo()
	{
		given()
		.contentType("application/json")
		.body(map)
	.when()
		.put()
	
	.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all()		
		.body("title",equalTo("foo"))
		.body("body",equalTo("bar"));
		
	}
	

}
