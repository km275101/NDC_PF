package defineStep;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreAction.Initialize;
import coreAction.OpenAndCloseBrowser;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageElements.LoginTestPE;

public class AmazonImplementation extends Initialize{
	@Given("^users open login page$")
	public void users_open_login_page() throws Throwable {
		System.out.println("Opening amazon URL");
	    openUrl("https://www.amazon.in/");
	}

	@When("^user enters credentials$")
	public void user_enters_credentials() throws Throwable {
		LoginTestPE lpe = new LoginTestPE(driver);
		lpe.clickYourOrders();
	}

	@And("^click submit button$")
	public void click_submit_button() throws Throwable {
		//loginTest.clickLogin();
	}

	@Then("^user sees the login page$")
	public void user_sees_the_login_page() throws Throwable {
	    System.out.println("Successful login");
	   // closeBrowser();
	}

}
