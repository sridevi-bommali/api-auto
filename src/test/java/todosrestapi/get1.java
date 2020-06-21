package todosrestapi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class get1 {
	
	RequestSpecification rs;
	Response resp;

	

		@Given("I have the api up and running for Get API")
		public void i_have_the_api_up_and_running_for_Get_API() {
			rs = given()
					.contentType("application/json");
		}


	
		

			@When("I perform Get request for a specific todo")
			public void i_perform_Get_request_for_a_specific_todo() {
				resp = rs.when()
						.get("https://jsonplaceholder.typicode.com/todos/25");
			}


			






		@Then("I should get the response code for GET API as {int}")
		public void i_should_get_the_response_code_for_GET_API_as(Integer int1) {
			resp.then()
			.statusCode(int1)
			.header("Content-Type","application/json; charset=utf-8")
			.log().all();
			
		}







}
