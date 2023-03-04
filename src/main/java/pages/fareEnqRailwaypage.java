package pages;

import java.util.List;

import org.omg.CORBA.PolicyError;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class fareEnqRailwaypage {
	
	WebDriver driver;
	
	By popup=By.id("messageDialogClose");
	By ETN=By.xpath("//input[@placeholder='Train Number']");
	By calndr=By.xpath("//img[@title='Select date']");
	By cmt=By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div//div//span[@class='ui-datepicker-month']");
	By cyr=By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div//div//span[@class='ui-datepicker-year']");
	By nxbtn=By.xpath("//span[text()='Next']");
	By cdt=By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//tbody//tr//td//a");
	By entrsrcstn=By.xpath("//input[@placeholder='Enter Source Station']");
	By entrdestn=By.xpath("//input[@id='destinationStation']");
	By encls=By.name("class");
	By quot=By.id("quota");
	By gtfr=By.id("modal1");
	
	public fareEnqRailwaypage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void alertpopup() {
	driver.findElement(popup).click();
	}
	public void EnterTrainno() throws InterruptedException {
		driver.findElement(ETN).sendKeys("13225 ");
		Thread.sleep(1200);
		driver.findElement(ETN).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1200);
		driver.findElement(ETN).sendKeys(Keys.ENTER);
	}
	public void date() {
		driver.findElement(calndr).click();
		
		String expdate="13-October-2022";
		String eday=expdate.split("-")[0];
		String emonth=expdate.split("-")[1];
		String eyer=expdate.split("-")[2];
		System.out.println(eday+"#"+emonth+"#"+eyer);
		
	String cmonth=driver.findElement(cmt).getText();
	String cyear=driver.findElement(cyr).getText();
	
	while((!cmonth.equals(emonth))||(!cyear.equals(eyer))) {
		driver.findElement(nxbtn).click();
		 cmonth=driver.findElement(cmt).getText();
		 cyear=driver.findElement(cyr).getText();
	}
	   List<WebElement> ls= driver.findElements(cdt);
	   for(int i=1;i<ls.size();i++) {
		String cday= ls.get(i).getText();
		if(cday.equals(eday)) {
			ls.get(i).click();
		}
	   }
	
	}
	
	public void entrstn() throws InterruptedException {
		driver.findElement(entrsrcstn).sendKeys("RAJANAGAR");
		Thread.sleep(1200);
		driver.findElement(entrsrcstn).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		driver.findElement(entrsrcstn).sendKeys(Keys.ENTER);
	}
	
	public void destn() throws InterruptedException {
		driver.findElement(entrdestn).sendKeys("SONPUR");
		Thread.sleep(1500);
		driver.findElement(entrdestn).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		driver.findElement(entrdestn).sendKeys(Keys.ENTER);
	}
	
	public void clastype() {
		Select cl=new Select(driver.findElement(encls));
		cl.selectByValue("CC");
		
	}
	public void quotalevel() {
		Select sq=new Select(driver.findElement(quot));
		sq.selectByVisibleText("Yuva Quota");
	}
	

}
