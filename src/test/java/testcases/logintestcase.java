package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectmodel.LoginPageObject;
import Resource.baseclass;
import Resource.commonmethods;
import Resource.constant;

public class logintestcase extends baseclass {
	@Test(dataProvider="testdata")
	
	public void login(String username,String password) throws IOException, InterruptedException {
		
		
		Thread.sleep(2000);
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		obj.username().sendKeys("username");
		obj.password().sendKeys("password");
		obj.login().click();
		obj.tryforfree().click();
		
		commonmethods.handleassertion(obj.errortext().getText(), "Please check your username and password. If you still can't log in, contact your Salesforce administrator.","error message not matching");
	}
	
	@DataProvider
	public Object[][]testdata(){
		
		Object[][]data=new Object[2][2];
		data[0][0]=constant.username1;
		data[0][1]=constant.password;
		data[1][0]=constant.username2;
		data[1][1]=constant.password2;
	
		return data;
		
		
		
	}

}
