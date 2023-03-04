package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnitedAirlinespage {
	
	WebDriver driver;
	
	By  onewy=By.xpath("//span[text()='One-way']");
	By fromto=By.xpath("//input[@placeholder='From*']");
	By clrtxt=By.xpath("//span[text()='Clear this field and undo selection']");
	By depart=By.id("bookFlightOriginInput");
	By to=By.xpath("//input[@placeholder='To*']");
	By deptclr=By.xpath("//span[text()='Clear this field and undo selection']");
	By Arriv=By.id("bookFlightDestinationInput");
	By dd=By.id("DepartDate");
	By Travler=By.id("passengerSelector");
	By travlertyoe=By.name("cabinType");
	By ff=By.xpath("//span[text()='Find flights']");
	
	
	public UnitedAirlinespage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void tt() {
		driver.findElement(onewy).click();
	}
	public void From() {
		driver.findElement(fromto).click();
	}
	public void cleartxt() {
		driver.findElement(clrtxt).click();
	}
	public void departure() {
		driver.findElement(depart).sendKeys("EWR");
	}

}
