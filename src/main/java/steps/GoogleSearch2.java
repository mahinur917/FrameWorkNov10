package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch2 {
	
	WebDriver driver;
	
	@Given("i am on the google homepage")
	public void i_am_on_the_google_homepage() {

		//the following 4 lines of code are used to launch the web browser
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();

	}

	@When("i enter search {string}")
	public void i_enter_search(String string) {
		//1) find/locate the element	
		WebElement searchbox;
		searchbox=driver.findElement(By.name("q")); //in this step you go to the webpage and inspect what element you want to highlight 
		
		//2) perform action 
		searchbox.sendKeys(string);
		//generally any searchBox we use string 
		
	}

	@When("i click on google search button")
	public void i_click_on_google_search_button() {
		
		WebElement searchButton; //you can name web element anything
		searchButton=driver.findElement(By.name("btnK")); //""
		//searchButton.click(); //if click button is not working, use the submit method 
		searchButton.submit();

	}

	@Then("i receive related search result")
	public void i_receive_related_search_result() {

	}

}
