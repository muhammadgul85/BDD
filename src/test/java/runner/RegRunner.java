package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//to run a group, specific, all test cases
@RunWith(Cucumber.class)

@CucumberOptions(
	
		
		glue="steps",  //mention where our step(.java) file is
		features="src\\test\\resources\\features\\regression",

		//features="src\\test\\resources\\features", other way to run
		tags="@wip0720a",
		monochrome = true,
		//To see the steps inside the scenario i.e. details use stepNotification
		stepNotifications=true, //this is set to false by default
		
		dryRun=false //if set to true, you get step definition but test not run, To check if all the steps are glued or not
			
		)

public class RegRunner {

}








