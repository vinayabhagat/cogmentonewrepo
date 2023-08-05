package RunnerTest;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "AllFeatureFile" },
       glue = { "StepDefinition" },
       dryRun = false

)

public class TestRunner {

}
