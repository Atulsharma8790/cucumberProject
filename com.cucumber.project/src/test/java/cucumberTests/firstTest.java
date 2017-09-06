package cucumberTests;

import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class firstTest {

	@BeforeTest
	public void init()
	{
		System.out.println("Before Test");
	}

	@Given("^This is my first dummy step$")
	public void this_is_my_first()  {
		System.out.println("1st dummy");

	}

	@When("^This is my second dummy step$")
	public void this_is_my_second() {	    

		System.out.println("Second Step");


	}

	@Then("This is my third dummy steps")
	public void this_is_my_third(DataTable stepNumber){

		List<Map<String, String>> data = stepNumber.asMaps(String.class, String.class);
		for(int i=0;i<data.size();i++)
			System.out.println("third step: "+data.get(i).get("stepNumber"));


	}


}
