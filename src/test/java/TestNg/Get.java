package TestNg;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.*;



public class Get {
	
	int id = 25;
	
	@Test
	public void getlistofalltodos()
	{
		given()
		.when()
			.get("https://jsonplaceholder.typicode.com/todos")
		.then()
		.statusCode(200)
		.header("Content-Type","application/json; charset=utf-8")
		.log().all();

	}
	
	@Test
	
	public void getatodo()
	{
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/todos";
		RestAssured.basePath="/"+id;
		
		given()
		.when()
			.get()
		.then()
		.statusCode(200)
		.header("Content-Type","application/json; charset=utf-8")
		.log().all();
		
		
	}
	
	
	
	

}
