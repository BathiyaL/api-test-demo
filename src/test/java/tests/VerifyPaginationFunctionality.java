package tests;

import org.testng.annotations.Test;

import ataf.actions.BaseTest;
import ui.pages.SignInPage;

public class VerifyPaginationFunctionality extends BaseTest{
	
	@Test
	public void runTest() {
		driver.get(getURL("publisher"));
		
		SignInPage signInPage = new SignInPage(driver);
		signInPage.userNameTextBox.sendKeys("admin");
		signInPage.passwordTextBox.sendKeys("admin");
		signInPage.continiueButton.click();
	}

}
