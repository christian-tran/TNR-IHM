package autom4.JacocoRoboto;

import org.openqa.selenium.WebElement;

public class Utils {

	public static void inputField(WebElement e, String s) {
		e.clear();
		e.sendKeys(s);
	}
	
}
