package todosrestapi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getnew {
	RequestSpecification rs;
	Response resp;
	
	
	
	@Given("I have the api up and running")
	public void i_have_the_api_up_and_running() {
		rs = given()
				.contentType("application/json");
	}

	
	@When("I perform a Get request")
	public void i_perform_a_Get_request() {
	resp = rs.when()
			.get("https://jsonplaceholder.typicode.com/todos");
	}
	@Then("I should get the response code as {int}")
	public void i_should_get_the_response_code_as(Integer int1) {
		resp.then()
		.statusCode(int1);
		
		
	}
	@Then("I should get all the todos in the log")
	public void i_should_get_all_the_todos_in_the_log() {
		resp.then()
		.header("Content-Type","application/json; charset=utf-8");
		
	}
	
	







}
