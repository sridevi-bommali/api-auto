package todosrestapi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postnew {
	
	int id;
	
	public static HashMap<String,String> map = new HashMap<String,String>();
	RequestSpecification rs;
	Response resp;
	@Given("I have the apis up and running")
	public void i_have_the_apis_up_and_running() {
	    // Write code here that turns the phrase above into concrete actions
		map.put("title","foo");
		map.put("body","bar");
		map.put("id","203");
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/todos";
		
		rs = given()
		.contentType("application/json")
		.body(map);
	}

	@When("I performs a Post request")
	public void i_performs_a_Post_request() {
	    // Write code here that turns the phrase above into concrete actions
		resp = rs.when()
		.post();
	}
	@Then("I should get the response with status code as {int}")
	public void i_should_get_the_response_with_status_code_as(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		resp.then()
		.statusCode(int1)
		.body("title",equalTo("foo"))
		.body("body",equalTo("bar"))
		.log().all();
	}
	
	
	
	

}