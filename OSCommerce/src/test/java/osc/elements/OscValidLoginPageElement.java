package osc.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OscValidLoginPageElement {
	//my account
		@FindBy(linkText="My Account")
		public WebElement MyAccount;
		
		//UserID
		//@FindBy(name="email_address")
			@FindBy(xpath="//*[@id='loginModules']/div[1]/div/form/table/tbody/tr[1]/td[2]/input")
			
			public WebElement EMailAddress;

			//Password
			@FindBy(name = "password")
			public WebElement Password;

			//Login Button
			@FindBy(xpath = "//*[@id='tdb1']/span[2]")
			public WebElement SignIn;

			//Login Successful Message
			
			@FindBy(id = "bodyContent")
			
			public WebElement MyaccountMsg;
			//*[@id="bodyContent"]/h1


}
