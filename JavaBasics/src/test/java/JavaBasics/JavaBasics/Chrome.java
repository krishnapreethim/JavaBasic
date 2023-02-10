package JavaBasics.JavaBasics;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome 
{
	
	
	public static void main(String[] args) {
		
		    WebDriverManager.chromedriver().setup(); 
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--disable-notifications");
		    options.addArguments("--disable-popup-blocking");
		    ChromeDriver driver = new ChromeDriver(options);
		   // driver.get("https://www.facebook.com/login/");
		  }
	}
	


