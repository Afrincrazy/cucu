package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@Given("^user is in the facebook page$")
	public void user_is_in_the_facebook_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	  
	}

	@When("^user enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String arg1) throws Throwable {
		driver.findElement(By.id("email")).sendKeys("afrinsafa@gmail.com");
    
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String arg1) throws Throwable {
	   driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	    
	}

	@Then("^user should be navigated to login page$")
	public void user_should_be_navigated_to_login_page() throws Throwable {
	    
	 
	}

}
