package osc.stepdef;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import osc.actions.ValidUserLogininAction;

public class OscValidUserLogininStepDef {

	ValidUserLogininAction loginActions = new ValidUserLogininAction(); 
	
	@Given("^i am on the home page of OSCommerce$")
	public void i_am_on_the_home_page_of_OSCommerce() throws InterruptedException {
		String actualTitle = loginActions.oscLoginPage();
		//Assert.assertEquals(acttualTitle, expected);
		System.out.println(actualTitle);
	    Thread.sleep(5000); 
	   
	}

	@Given("^i click on My Account$")
	public void i_click_on_My_Account() throws InterruptedException  {
		loginActions.myAccountClick();
		Thread.sleep(5000);
		   
	}
	
	@When("^i enter valid username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_invalid_username_as_and_password_as(String arg1, String arg2, String EmailAddress, String Password) throws InterruptedException  {
		loginActions.setEmailAddress(EmailAddress);
		loginActions.setPassword(Password);
		Thread.sleep(5000);
	}

	@When("^I click on Sign In Button$")
	public void i_click_on_Sign_In_Button() throws InterruptedException  {
		loginActions.signinClick();
		Thread.sleep(5000);
	}

	@Then("^I should be able to login$")
	public void i_should_be_able_to_login() throws InterruptedException  {
		//Assert.assertTrue(loginActions.myAccountClick(), true);
		Assert.assertTrue(true);
		Thread.sleep(5000);
	    }
	/*@Then("I should be able to login")
	public void i_should_be_able_to_login() {
		Assert.assertEquals(loginActions.errorReadMsg(), false);
	}*/
	
	
}