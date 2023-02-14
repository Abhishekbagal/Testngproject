package PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPageObject {
	
	public WebDriver driver;
	
	private By enterfirstname=By.xpath("//input[@name='UserFirstName']");
	
	private By enterlastname=By.xpath("//input[@name='UserLastName']");
	
	private By title=By.xpath("//input[@name='UserTitle']");
	
	private By mail=By.xpath("//input[@name='UserEmail']");
	
	private By number=By.xpath("//input[@name='UserPhone']");
	
	private By employe=By.xpath("//select[@name='CompanyEmployees']");
	
	private By comp=By.xpath("//input[@name='CompanyName']");
	
	private By contr=By.xpath("//select[@name='CompanyCountry']");
	
	public signupPageObject(WebDriver driver2) {
		
		this.driver=driver2;
	}
	
	public WebElement firstname() {
		
		return driver.findElement(enterfirstname);
	}
	
    public WebElement lasttname() {
		
		return driver.findElement(enterlastname);
	}
    public WebElement jobt() {
    	
    	return driver.findElement(title);
    }
    public WebElement gmail() {
    	
    	return driver.findElement(mail);
    }
    public WebElement contact() {
    	
    	return driver.findElement(mail);
    }
    public WebElement com() {
    	
    	return driver.findElement(comp);
    }
    
    public WebElement emp() {
    	
    	return driver.findElement(employe);
    }
    
    public WebElement cont() {
    	
    	return driver.findElement(contr);
    }


}
