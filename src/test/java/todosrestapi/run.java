package todosrestapi;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "resources/features"
							,tags= "@smoketest"
		)

public class run {
	
	

}
