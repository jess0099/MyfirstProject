package pages;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Loginpage {

	WebDriver driver;
	
	By nam=By.xpath("//input[@placeholder='Enter your full name']");
	By pas=By.xpath("//input[@placeholder='Enter your password']");
	By lognbtn=By.xpath("//button[@onclick='performLogin()']");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void username(String username) {
		
		driver.findElement(nam).sendKeys(username);
	}
	
	public void userpassword(String password) {
		driver.findElement(pas).sendKeys(password);
	}
	public void submit() throws IOException, InterruptedException {
		driver.findElement(lognbtn).click();
		

		String path="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/Screenshots/Project__"+datetime(driver)+"saved.png";
	  File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   Files.copy(src, new File(path));
		
	   Thread.sleep(3000);
	}
	
	public String datetime(WebDriver driver) {
		DateFormat custformat=new SimpleDateFormat("MM_DD_yyy:HH_mm_SS");
		Date currdate=new Date();
		
		return custformat.format(currdate);
		
	}
	
	
}
