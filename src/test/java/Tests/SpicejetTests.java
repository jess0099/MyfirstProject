package Tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pages.Spicejetpage;
import pages.Spiejetform;

public class SpicejetTests {
  
	WebDriver driver;
	Spicejetpage spt;
	Spiejetform sf;
	
	@BeforeTest
	
	public void setup() {
		String chpath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/drivers/chromedriver";
	     System.setProperty("webdriver.chrome.driver", chpath);
	     ChromeOptions option=new ChromeOptions();
	     option.addArguments("--disable-notifications")  ;
	     driver=new ChromeDriver(option);
	    
	     }
	@Test
	
	public void test1() throws InterruptedException, IOException {
		driver.get("https://www.spicejet.com/");
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
	     driver.manage().window().maximize();
	    // driver.manage().deleteAllCookies();
	     
	     spt=new Spicejetpage(driver);
	     
	   /*  spt.Mouseovr();
	     spt.ff();
	     
	       String parent=   driver.getWindowHandle();
	     driver.switchTo().window(parent);
	     */
	     spt.triptype();
	      spt.departure();
	      Thread.sleep(3000);
	    //  spt.destination();
	      spt.arriv();
	      Thread.sleep(2000);
	     spt.deptdat();
	     spt.paxtype();
	     spt.currency();
	     spt.submtbtn();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	     Thread.sleep(2000);
	     String imgpath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/Screenshots/image.png";
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(src, new File(imgpath));
	     spt.ticketbook();
	  
	}
}
