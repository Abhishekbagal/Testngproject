package testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectmodel.LoginPageObject;
import PageObjectmodel.signupPageObject;
import Resource.baseclass;
import Resource.commonmethods;
import Resource.constant;

public class signuptestcase extends baseclass {
	@Test
	
	public void Signup() throws IOException, InterruptedException {
		
		
		LoginPageObject lpo=new LoginPageObject(driver);
		
		lpo.tryforfree().click();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		signupPageObject spo=new signupPageObject(driver);
		Thread.sleep(2000);
		
		spo.firstname().sendKeys(constant.firstname);
		spo.lasttname().sendKeys(constant.lastname);
		spo.jobt().sendKeys(constant.jobt);
		spo.gmail().sendKeys(constant.gmail);
		spo.contact().sendKeys(constant.contact);
		spo.com().sendKeys(constant.comp);
		
		commonmethods.selectdropdown(spo.emp(), 2);
		commonmethods.selectdropdown(spo.cont(), 5);
	}

}
