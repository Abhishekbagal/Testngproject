package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		obj.username().sendKeys(username);
		obj.password().sendKeys(password);
		obj.login().click();
		//obj.tryforfree().click();
		
		Thread.sleep(2000);
		
		commonmethods.handleassertion(obj.errortext().getText(),constant.expect,constant.message);
		
		driver.quit();
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
