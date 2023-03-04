package parralel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class backgroundtags {
	WebDriver driver;

	@Given("enter the url")
	public void enter_the_url() {
	String bpath="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
	System.setProperty("webdriver.chrome.driver", bpath);
	driver=new ChromeDriver();
	driver.get("https://www.fancode.com/?utm_campaign=WIvsIND-2022&utm_medium=onebox&utm_source=google&utm_term=highlights");

	}

	@When("click on Schedule link")
	public void click_on_schedule_link() {

		driver.findElement(By.xpath("//a[text()='SCHEDULE']")).click();
	}

	@When("Schedule page is open")
	public void schedule_page_is_open() {

	System.out.println("Schedule page is Successfully open");
	}

	@When("click on Result tab")
	public void click_on_result_tab() throws InterruptedException {
	driver.findElement(By.xpath("//div[text()='Results']")).click();
	Thread.sleep(1500);
	}

	@Then("check the result")
	public void check_the_result() {
	System.out.println("Succesfully Result opened");

	}

	@When("click on Today match")
	public void click_on_today_match() throws InterruptedException {
	driver.findElement(By.xpath("//div[text()='Today']")).click();
	Thread.sleep(1500);
	}

	@Then("Check Today match")
	public void check_today_match() {
		System.out.println("Succesfully today match displayed");

	}

	@When("click on upcoming matches tab")
	public void click_on_upcoming_matches_tab() throws InterruptedException {
	driver.findElement(By.xpath("//div[text()='Upcoming']")).click();
	Thread.sleep(1500);

	}

	@Then("Check upcoming matches")
	public void check_upcoming_matches() {

		System.out.println("Succesfully upcoming matchs displayed");
	}

	}

	
	

