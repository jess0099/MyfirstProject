package Windowhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlemultiwindow {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
		String path="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");;
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[text()='Gift Card']")).click();
		driver.findElement(By.xpath("//div[text()='Cargo']")).click();
		driver.findElement(By.xpath("//div[text()='Charter']")).click();
		     Set<String> tabs= driver.getWindowHandles();
		     
		   List<String>  child=new ArrayList<>(tabs);
		/*    
		   for(String ch:child) {
			   
			   if(!ch.endsWith(parent)) {
				   driver.switchTo().window(ch);
				   System.out.println(driver.getCurrentUrl());
				   System.out.println(driver.getTitle());
				   Thread.sleep(1000);
				   driver.close();
		   }
		
		
	}driver.switchTo().window(parent);
	System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getTitle());
	   Thread.sleep(1000); */
		   
		   driver.switchTo().window(child.get(1));
		   System.out.println("cargo--"+driver.getTitle());
		   Thread.sleep(100);
		   driver.close();
		   driver.switchTo().window(child.get(2));
		   System.out.println("charter-->"+driver.getTitle());
		   Thread.sleep(100);
		   driver.close();
		   driver.switchTo().window(child.get(0));
		   System.out.println("spice-->"+driver.getTitle());
		   Thread.sleep(100);
		   
		   
	   
	}
}
