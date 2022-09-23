package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	protected WebDriver driver;

	  public SignInPage(WebDriver driver){
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	  }
	  
	  @FindBy(name="usernameUserInput")
	  public WebElement userNameTextBox;
	  
	  @FindBy(name="password")
	  public WebElement passwordTextBox;
	  
	  @FindBy(xpath="//button[@type='submit']")
	  public WebElement continiueButton;
}
