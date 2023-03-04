package Cucumberproj;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.Loginpage;
public class Stepddefination {
	public WebDriver driver;
	Loginpage lp;
	@Before
	
	public void setup() {
		String chpath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", chpath);
		driver=new ChromeDriver();
	}


	@Given("open the browser")
	public void open_the_browser() {
	driver.get("https://example.testproject.io/web/");
	}

	@And("^enter the valid (.*) and (.*)$")
	public void enter_the_valid_username_and_password(String username,String password) throws InterruptedException {
	lp=new Loginpage(driver);
	lp.username(username);
	lp.userpassword(password);
	Thread.sleep(300);
	}

	@And("^enter the invalid (.*) and (.*)$")
	public void enter_the_invalid_username_and_password(String username,String password) throws InterruptedException {
		lp=new Loginpage(driver);
		lp.username(username);
		lp.userpassword(password);
		Thread.sleep(300);
	}
	@When("click on login btn")
	public void click_on_login_btn() throws InterruptedException, IOException {
		lp=new Loginpage(driver);
		lp.submit();
		String imgpath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/Screenshots/cucumber.png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(imgpath));
		Thread.sleep(3000);
	}

	@Then("navigate to home page")
	public void navigate_to_home_page() {
	
	}
}
