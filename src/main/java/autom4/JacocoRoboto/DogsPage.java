package autom4.JacocoRoboto;

import static org.junit.Assert.*;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DogsPage {

	@FindBy(xpath="//td[contains(text(),'Dalmation')]/preceding-sibling::td/a")
	private WebElement dalmationProductId;
	
	public void checkProductId() {
		String dalmation = dalmationProductId.getText();
		System.out.println("Dalmation Product Id : " + dalmation);
		assertEquals("K9-DL-01", dalmation);
		System.out.println("Vérification du code Dalmatien");
	}
	
	public DalmationPage clickDalmationLink(WebDriver driver) {
		dalmationProductId.click();
		System.out.println("Clic sur Dalmatien");
		return PageFactory.initElements(driver, DalmationPage.class);
	}
	
}
