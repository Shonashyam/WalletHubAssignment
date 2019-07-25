package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\Shyam\\eclipse-workspace\\WalletHubTwo\\Resources\\Review.feature"},
        glue = {"StepDefinition"},
        plugin = {"pretty",  "html:target/cucumber-reports", "json:json_output/cucumber.json"},
        monochrome = true,
        strict = false,
       // tags = {"@Functionalfirst", "@Regressionsecond", "@Smokethird"},
        dryRun = false)

public class Myrunner {
	


}
