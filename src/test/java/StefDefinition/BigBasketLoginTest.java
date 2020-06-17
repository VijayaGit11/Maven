package StefDefinition;

import org.openqa.selenium.By;

import com.qa.base.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BigBasketLoginTest extends Base{
	
	@Given("user launches the BB portal")
	public void user_launches_the_BB_portal() {
		LaunchBrowser();
		driver.navigate().to(prop.getProperty("BigBasket"));
	    }

	@Then("user clicks on login link")
	public void user_clicks_on_login_link() throws InterruptedException {
		clickOnHiddenElement(By.xpath("//a[@qa='loginLink']"));
	}

	@Then("user enters {string}")
	public void user_enters(String mbNum) {
//		driver.findElement(By.name("otpEmail")).sendKeys(mbNum);
		sendStringKeys(By.name("otpEmail"), mbNum);
	}

	@Then("user clicks on login using OTP")
	public void user_clicks_on_login_using_OTP() {
		clickElement(By.xpath("//button[@type='submit']"));	    
	}

	@Then("user closes the BB browser")
	public void user_closes_the_BB_browser() {
	    closeBrowser();
	    
	}

}
