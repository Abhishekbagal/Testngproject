package Resource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonmethods {
	
	public static void selectdropdown(WebElement Element,int index) {
		
		Select s=new Select(Element);
		s.selectByIndex(index);
	}
	
	public static void handleassertion(String actual,String expected,String message) {
		
		SoftAssert a=new SoftAssert();
		
		String ac=actual;
		String exp=expected;
		
		a.assertEquals(ac, exp,"error message is not matching");
		a.assertAll();
	}

}

