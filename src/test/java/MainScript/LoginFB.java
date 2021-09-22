package MainScript;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Base;

public class LoginFB extends Base {

	WebDriver driver;
	LoginPage lo;

	@Given("Launch the Browser")
	public void launch_the_browser() {
		driver = launchBrowser();
		maxi();
		iwait(10);
		lo = new LoginPage(driver);
	}

	@Given("open the facebook Application")
	public void open_the_facebook_application() {
		openURL("https://www.facebook.com/");
		System.out.println(getTtitle());
	}

	@When("enter the username and password")
	public void enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> amp = dataTable.asMaps();
		type(lo.getUsername(), amp.get(1).get("username"));
		type(lo.getPassword(), amp.get(1).get("password"));
	}

	@When("click the login button")
	public void click_the_login_button() {
		tap(lo.getLogin());
	}

	@Then("validate the {string} message")
	public void validate_the_message(String msg) {
		System.out.println(msg);
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}
