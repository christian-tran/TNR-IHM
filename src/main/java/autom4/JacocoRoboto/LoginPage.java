package autom4.JacocoRoboto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	  	
	  @FindBy(name="username")
	  private WebElement username_field;

	  @FindBy(name="password")
	  private WebElement password_field;
	  
	  @FindBy(name="signon")
	  private WebElement button_submit;
	  
	  private String login = "j2ee";
	  private String pwd = "j2ee";
	
	  public WelcomePage Authentification(WebDriver driver) {
		  Utils.inputField(username_field, login);
		  Utils.inputField(password_field, pwd);
		  button_submit.click();
		  System.out.println("Authentification");
		  return PageFactory.initElements(driver, WelcomePage.class);
	  }
}
