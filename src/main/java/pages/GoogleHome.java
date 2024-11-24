package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	
	public WebDriver driver;
	
	public GoogleHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	//WebElement searchbox=driver.findElement(By.name("q"));
	@FindBy(name="q")
	WebElement searchbox;
	
	//2) perform action 
	//						(int      x    )
	public void enterSearch(String string) {
		searchButton.sendKeys(string);
	
		
	}
	
	//WebElement searchButton; //you can name web element anything
	//searchButton=driver.findElement(By.name("btnK")); //""
	//simply the previous two lines 
	
	//WebElement=searchButton=driver.findElement(By.name("btnK"));
	@FindBy(name="btnK")
	WebElement searchButton;
	
	//searchButton.click(); //if click button is not working, use the submit method 
	//searchButton.submit();
	
	public void clickSearch(){
		searchButton.click(); 
		
}
}
