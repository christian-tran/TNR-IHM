package autom4.JacocoRoboto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	@FindBy(xpath="//div[@id=\"QuickLinks\"]/a[2]")
	private WebElement dogsLink;
	
	public DogsPage clickDogsLink(WebDriver driver) {
		dogsLink.click();
		System.out.println("Clic sur Dogs");
		return PageFactory.initElements(driver, DogsPage.class);
	}
	
}
