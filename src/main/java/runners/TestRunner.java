package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features", //make sure "Features" exactly matches the class name here 
		glue="steps" //make sure "steps" matches exactly as package name here 
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
//test runner is to connect testng with cucumber 