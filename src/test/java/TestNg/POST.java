package TestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.*;



public class POST {
	
	public static HashMap map = new HashMap();
	

	public static HashMap map1 = new HashMap();
	
	@BeforeClass
	public void postbody()
	{
		map.put("title","foo");
		map.put("body","bar");
		map.put("id","203");
		
		
		map1.put("title","foo");
		map1.put("body","bar");
		
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/todos";
			
	}
	
	@Test
	public void posttodo()
	{
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post()
		
		.then()
			.statusCode(201)
			.body("title",equalTo("foo"))
			.body("body",equalTo("bar"))
			.log().all();
	}

}
