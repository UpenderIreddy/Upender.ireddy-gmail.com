package StepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import SharedSteps.Utilities;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepPOMFacebookSignUP extends Utilities {

	WebDriver driver;

	Properties prop;
	
	@Before
	public void loadprops(){
		
		Utilities.readProperties();
	}

	/*@After
	
	public void closeBrowser(){
		
		driver.quit();
	}*/
	@Given("^browser window is Opened$")
	public void browser_window_is_Opened() throws Throwable {

		Utilities.browserOpen("chrome");

	}

	@When("^user launches Facebook URL$")
	public void user_launches_Facebook_URL() throws Throwable {
		
		
		Utilities.launchURL();

	}

	@When("^user enteres \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enteres_and_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6) throws Throwable {
		
		System.out.println("details");
	}

	@When("^user clicks singup button$")
	public void user_clicks_singup_button() throws Throwable {

		System.out.println("details");
	}

	@Then("^User gets warning message$")
	public void user_gets_warning_message() throws Throwable {

		System.out.println("details");
		
		//driver.quit();
	}

}
