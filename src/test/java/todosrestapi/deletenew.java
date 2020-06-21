package todosrestapi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deletenew {
	
	RequestSpecification rs;
	Response resp;

		@Given("I have the api up and running for Delete")
		public void i_have_the_api_up_and_running_for_Delete() {
			RestAssured.baseURI="https://jsonplaceholder.typicode.com/todos";
			RestAssured.basePath="/25";
			
			rs = given()
			.contentType("application/json");
		}


		

		@When("I perform deletion of a todo")
		public void i_perform_deletion_of_a_todo() {
			resp = rs.when()
					.delete();
		}
		@Then("I should get the response code for deleteAPI as {int}")
		public void i_should_get_the_response_code_for_deleteAPI_as(Integer int1) {
			resp.then()
			.statusCode(int1)
			.log().all();
		}




}
