package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spiejetform {

	WebDriver driver;
	
	By fstnm=By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj'])[1]");
	
	
	public Spiejetform(WebDriver driver) {
		this.driver=driver;
		}
	
	public void nmdetails() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement el=driver.findElement(fstnm);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(fstnm));
		el.sendKeys("Amit bhati");
	}
}
