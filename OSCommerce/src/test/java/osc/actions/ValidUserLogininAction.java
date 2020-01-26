package osc.actions;

import org.openqa.selenium.support.PageFactory;
import osc.elements.OscValidLoginPageElement;
import osc.utilities.OscDriverSetup;

public class ValidUserLogininAction {
	OscValidLoginPageElement validsignintest;

	public ValidUserLogininAction() {
		this.validsignintest = new OscValidLoginPageElement();
		PageFactory.initElements(OscDriverSetup.driver, validsignintest);

	}

	public String oscLoginPage() {
		//OscDriverSetup.driver.get("https://demo.oscommerce.com/login.php");
		OscDriverSetup.driver.get("https://demo.oscommerce.com");
		String title = OscDriverSetup.driver.getTitle();
		return title;

	}

	public void myAccountClick() {
		validsignintest.MyAccount.click();

	}
	
	
	public void setEmailAddress(String EmailAddress) {
		validsignintest.EMailAddress.sendKeys(EmailAddress);

	}

	public void setPassword(String password) {
		validsignintest.Password.sendKeys(password);

	}

	public void signinClick() {
		validsignintest.SignIn.click();
	}

	public boolean errorReadMsg() {
		return validsignintest.MyaccountMsg.isDisplayed();
	}
}