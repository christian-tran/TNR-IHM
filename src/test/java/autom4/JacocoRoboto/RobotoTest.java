package autom4.JacocoRoboto;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class RobotoTest {

	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void test() {
		driver.get("http://localhost:8090/jpetstore");
		GoToLoginPage goToLoginPage = PageFactory.initElements(driver, GoToLoginPage.class);
		LoginPage loginPage = goToLoginPage.goToLoginPage(driver);
		WelcomePage welcomePage = loginPage.Authentification(driver);
		DogsPage dogsPage = welcomePage.clickDogsLink(driver);
		dogsPage.checkProductId();
		
	}
	
}
