package Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.TesseractException;
import pages.IndainRailwayPage;
import pages.fareEnqRailwaypage;

public class IndainRailwayTest {
	//WebDriver driver;
	ChromeDriver driver;//we can use class chromeDriver instead of WebDriver interface if our project support only single browser,for ci/cd and cross browser testing it is not most useful
	IndainRailwayPage irp;
	fareEnqRailwaypage fer;
	
	@BeforeTest
	
	public void setup() {
		String cpath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", cpath);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	
	public void testexecution() throws InterruptedException, TesseractException, IOException {
		driver.get("https://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html?locale=en");
		irp=new IndainRailwayPage(driver);
		irp.Trainno();
		irp.Calender();
		irp.Departure();
		irp.arrival();
		irp.passenclass();
		irp.enterquote();
		//irp.avlbtn();
		//irp.capthhandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Fare Enquiry']")).click();
		fer=new fareEnqRailwaypage(driver);
		fer.alertpopup();
		fer.EnterTrainno();
		fer.date();
		fer.entrstn();
		fer.destn();
		fer.clastype();
		fer.quotalevel();
		
	}
	


}
