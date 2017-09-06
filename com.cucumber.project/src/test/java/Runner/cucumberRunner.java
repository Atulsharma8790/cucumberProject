package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(format={"pretty", "json:target/cucumber.json"},
features={"src/test/java/"})
public class cucumberRunner extends AbstractTestNGCucumberTests{

}
