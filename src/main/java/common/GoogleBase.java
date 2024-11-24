package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBase {
	// we are enhancing the code in the common package 
	
	public WebDriver driver;
	
	public void launchBrowser() { //you can name method anything 
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize(); //you cant keep this code in the same project, comment out or delete this code in the steps class 
		
		
	}
	
	public void closeBrowser(){ //can't be in the same class 
		driver.close(); //diff b/w close and quit method , close method closes the current window int he web browser while quit method closes the whole browser and its pages
	}

}
