package cucumberTests;

import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeTest;

import cucumber.api.java.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class firstTest {
	
	
	

	@Before("@dummy")
	public void init()
	{
		System.out.println("Before Dummy Test");
	}
	
	@After("@dummy")
	public void tear(){
		System.out.println("After Dummy Test");
		
	}
	
	@Before("@aboutMe")
	public void initMe()
	{
		System.out.println("Before aboutMe Test");
	}
	
	@After("@aboutMe")
	public void tearMe(){
		System.out.println("After aboutMeTest");
		
	}
	

	@Given("^This is my first dummy step$")
	public void this_is_my_first()  {
		System.out.println("1st dummy");

	}

	@When("^This is my second dummy step$")
	public void this_is_my_second(){	    

		System.out.println("Second Step");

	}

	@Then("This is my third dummy steps")
	public void this_is_my_third(DataTable stepNumber) {

		List<Map<String, String>> data = stepNumber.asMaps(String.class, String.class);
		for(int i=0;i<data.size();i++)
			System.out.println("third step: "+data.get(i).get("stepNumber"));
	}


	@Given("^My Name is \"([^\"]*)\"$")
	public void my_Name_is(String name) throws Throwable {
		System.out.println("My Name Is: " + name);
	}

	@When("^I am a \"([^\"]*)\"$")
	public void i_am_a(String profile) throws Throwable {
		System.out.println("I am a: " + profile);

	}

	@When("^I am \"([^\"]*)\"$")
	public void i_am(String profession) throws Throwable {
		System.out.println("I am : " + profession);

	}

	@Then("^This is all about me$")
	public void this_is_all_about_me() throws Throwable {
		System.out.println("Thank You");
	}


}
