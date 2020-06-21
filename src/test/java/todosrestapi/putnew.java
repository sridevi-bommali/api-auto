package todosrestapi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class putnew {
	public static HashMap<String,String> map = new HashMap<String,String>();
	RequestSpecification rs;
	Response resp;
	
	

		@Given("I have the api up and running for PUT")
		public void i_have_the_api_up_and_running_for_PUT() {
			map.put("title","foo");
			map.put("body","bar");
			map.put("id","203");
			
			RestAssured.baseURI="https://jsonplaceholder.typicode.com/todos";
			RestAssured.basePath="/25";
			
			rs = given()
			.contentType("application/json")
			.body(map);
		}


		

		@When("I update a todo for PUT API")
		public void i_update_a_todo_for_PUT_API() {
			resp = rs.when()
					.put();
		}
		
		@Then("I should get the response code for PUT as {int}")
		public void i_should_get_the_response_code_for_PUT_as(Integer int1) {
			resp.then()
			.statusCode(int1)
			//.statusLine("HTTP/1.1 200 OK")
					
			.body("title",equalTo("foo"))
			.body("body",equalTo("bar"))
			.log().all();
		}





		}




