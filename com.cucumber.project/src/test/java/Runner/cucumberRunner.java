package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(format={"pretty", "html:target/html/"},
features={"src/test/java/"})
public class cucumberRunner extends AbstractTestNGCucumberTests{

}
