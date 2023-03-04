package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.UnitedAirlinespage;

public class UtdAirlineTest {
	
	WebDriver driver;
	UnitedAirlinespage  ual;
	
	
	@BeforeTest
	
	public void setup() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		String cpath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver",cpath);
		driver=new ChromeDriver(option);
	}
	
	@Test
	
	public void testexecution() {
		driver.get("https://qa9.united.com/en/us");
		ual=new UnitedAirlinespage(driver);
		ual.tt();
		ual.From();
		ual.cleartxt();
		ual.departure();
		
	}
	
	

}
