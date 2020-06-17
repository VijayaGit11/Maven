package StefDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.qa.base.Base;
import com.qa.testUtil.Listener;
import com.qa.testUtil.TestUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@Listeners(Listener.class)
public class loginTest extends Base{
	
	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
	    LaunchBrowser();
	    driver.navigate().to(prop.getProperty("freeCRM"));
	    Assert.assertEquals("Forgot your password?", driver.findElement(By.xpath("//a[@href='https://register.cogmento.com/password/reset/request/']")).getText());
	}

	@When("title of page is Free CRM")
	public void title_of_page_is_Free_CRM() {
	    Assert.assertEquals(driver.getTitle(), "Cogmento CRM");
	}

	@Then("user enters username and password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.name("email")).sendKeys(prop.getProperty("emailID"));
	    driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
	   
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	   
	}

	@Then("user is on home page")
	public void user_is_on_home_page() throws IOException {
	    Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Deals Summary']")).getText(), "Deals Summary");
	}
	
	@Then("user closes the browser")
	public void user_closes_the_browser() {
		closeBrowser();
	}

}
