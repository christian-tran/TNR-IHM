package autom4.JacocoRoboto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToLoginPage {

	@FindBy(xpath="//a[contains(text(),'Enter the Store')]")
	private WebElement enterLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	private WebElement signInLink;
	
	public LoginPage goToLoginPage(WebDriver driver) {
		enterLink.click();
		signInLink.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
}
