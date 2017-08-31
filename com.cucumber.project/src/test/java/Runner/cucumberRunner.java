package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/")
public class cucumberRunner extends AbstractTestNGCucumberTests{

}
