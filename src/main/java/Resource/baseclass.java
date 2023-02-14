package Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {
	
	public WebDriver driver;
	public Properties prop;
	
	public void driverInitilize() throws IOException {
		
	
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resource\\data.properties");
		
	    prop=new Properties();
	    prop.load(fs);
	    
	    String browsername=prop.getProperty("browser");
	    prop.get(browsername);
	    
	    if(browsername.equalsIgnoreCase("chrome"))
	    {
	       driver=new ChromeDriver();	
	    }
	    
	    else if(browsername.equalsIgnoreCase("Firefox")) {
	    	
	    	driver=new FirefoxDriver();
	    }
	    
	    else if(browsername.equalsIgnoreCase("Edge")) {
	    	
	    	driver=new EdgeDriver();
	    }
	    else {
	    	
	    	System.out.println("please make sure you have a proper driver");
	    }
		
		
	}
	
	@BeforeMethod
	public void openurl() throws IOException {
		
		driverInitilize();
		
		
		String urlname=prop.getProperty("url");
		driver.get(urlname);
	}
	
	@AfterMethod
	public void close() {
		
		driver.quit();
		
	}
	
	

}
