package pages;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class IndainRailwayPage {

	WebDriver driver;
	By popup=By.id("messageDialogClose");
	By trnno=By.xpath("//input[@placeholder='Train Number']");
	By jrnydt=By.xpath("//img[@title='Select date']");
	By sorstn=By.xpath("//input[@placeholder='Enter Source Station']");
	By destn=By.xpath("//input[@placeholder='Enter Destination Station']");
	By clsnm=By.xpath("//select[@name='class']");
	By quot=By.xpath("//select[@name='quota']");
	By getavl=By.xpath("//input[@id='modal1']");
	By nxtbtn=By.xpath("//span[text()='Next']");
	By ctday=By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//tbody//tr//td//a");
	By deptstn=By.xpath("//input[@placeholder='Enter Source Station']");
	By arrivstn=By.xpath("//input[@placeholder='Enter Destination Station']");
	By paxcls=By.xpath("//select[@id='class']");
	By paxquot=By.xpath("//select[@id='quota']");
	By getavlbtn=By.xpath("//input[@id='modal1']");
	By capt=By.xpath("//img[@id='CaptchaImgID']	");
			
	public IndainRailwayPage(WebDriver driver) {
		this.driver=driver;
		}
	public void Trainno() throws InterruptedException {
		driver.findElement(popup).click();
	WebElement el=	driver.findElement(trnno);
	el.sendKeys("123");
		Thread.sleep(2000);
		el.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		el.sendKeys(Keys.TAB);	
	}
	
	public void Calender() {
		driver.findElement(jrnydt).click();
		
		String expdat="28-September-2022";
		String eday=expdat.split("-")[0];
		String emonth=expdat.split("-")[1];
		String eyer=expdat.split("-")[2];
		System.out.println(eday+"#"+emonth+"#"+eyer);
		
	String cmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div//div//span[@class='ui-datepicker-month']")).getText();
	String cyer=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div//div//span[@class='ui-datepicker-year']")).getText();	
	
	while((!cmonth.equals(emonth))||(!cyer.equals(eyer))){
		driver.findElement(nxtbtn).click();
		cmonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div//div//span[@class='ui-datepicker-month']")).getText();
		cyer=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div//div//span[@class='ui-datepicker-year']")).getText();
	}
	 List<WebElement> list= driver.findElements(ctday);
	 for(int i=1;i<list.size();i++) {
		 String cday=list.get(i).getText();
		 if(cday.equals(eday)) {
			 list.get(i).click();
		 }
	 }
	}
	 public void Departure() throws InterruptedException {
		WebElement ed= driver.findElement(deptstn);
		ed.sendKeys("HOWRAH");
		Thread.sleep(1000);
		ed.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		ed.sendKeys(Keys.TAB);
	 
	}
	 public void arrival() throws InterruptedException {
		 WebElement ea=driver.findElement(arrivstn);
		 ea.sendKeys("Delhi");
		 Thread.sleep(1000);
			ea.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			ea.sendKeys(Keys.TAB);
	 }
	 public void  passenclass() {
		
		 Select sp=new Select(driver.findElement(paxcls));
		 sp.selectByValue("FC");
	 }
	 public void enterquote() {
		 Select sq=new Select(driver.findElement(paxquot));
		 sq.selectByVisibleText("Foreign Tourist Quota");
	 }
	 public void avlbtn() {
		 driver.findElement(getavlbtn).click();
	 }
	 
	 public void capthhandle() throws TesseractException, IOException, InterruptedException {
		 String ipath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/Screenshots/capt.png";
	File Src= driver.findElement(capt).getScreenshotAs(OutputType.FILE);
		Files.copy(Src,new File(ipath));
		Thread.sleep(5000);
	    ITesseract it=new Tesseract();
	  String imgtxt=   it.doOCR( new File(ipath));
	
	    String s1=imgtxt.substring(0, 3);
	    System.out.println("s1"+s1);
	    String s2=imgtxt.substring(5, 7);
	    System.out.println("s2"+s2);
		 
	 }
		 
}
