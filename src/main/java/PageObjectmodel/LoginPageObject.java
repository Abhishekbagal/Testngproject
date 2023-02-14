package PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By enterusername=By.xpath("//input[@name='username']");
	
	
	private By enterpassword=By.xpath("//input[@name='pw']");
	
	
	private By clicklogin=By.xpath("//input[@name='Login']");
	
	private By clicktryforfree=By.xpath("//a[@id='signup_link']");
	
	private By error=By.xpath("//div[@id='error']");
	
	public LoginPageObject(WebDriver driver2){
		
		this.driver=driver2;
	}
	
	public WebElement username() {
		
		return driver.findElement(enterusername);
	}
	
	public WebElement password() {
		
		return driver.findElement(enterpassword);
    }
	
	public WebElement login() {
		
		return driver.findElement(clicklogin);
	}
	public WebElement tryforfree() {
		
		return driver.findElement(clicktryforfree);
	}
	public WebElement errortext() {
		
		return driver.findElement(error);
	}

}
