package StefDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {

		@Given("User is on Login page")
		public void user_launch_google_page() {
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		  		}
		@When("user search Java tutorial")
		public void user_search_java_tutorial() {
	   WebElement schBox = driver.findElement(By.name("q"));
	   schBox.sendKeys("Selenium Tutorial"); 
	   schBox.submit();
	   
		}
		@Then("should displayed Java search page")
		public void should_displayed_java_search_page1() {
		   Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search" );
		}
	
	}

}
