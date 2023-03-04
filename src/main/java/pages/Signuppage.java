package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Signuppage {
	
	WebDriver driver;
	
	By country=By.xpath("//select[@id='country']");
	By add=By.xpath("//input[@placeholder='Enter your address']");
	By emil=By.xpath("//input[@placeholder='Enter your email']");
	By phn=By.xpath("//input[@placeholder='Enter your phone number']");
	By savbtn=By.id("save");
	
	public Signuppage(WebDriver driver) {
		this.driver=driver;
		}
	public void countryname() {
		Select sc=new Select(driver.findElement(country));
		sc.selectByVisibleText("Australia");
	}
	public void address() {
		driver.findElement(add).sendKeys("Sydeney");
	}
	public void emailadd() {
		driver.findElement(emil).sendKeys("abc@mail.com");
	}
	public void phonenumber() {
		driver.findElement(phn).sendKeys("9821########");
	}
	public void savedbtn() {
		driver.findElement(savbtn).click();
	}
	
	

}
