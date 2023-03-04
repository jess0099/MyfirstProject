package Windowhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindowhandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String cpath="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
		System.setProperty("webdriver.chrome.driver", cpath);
		
		driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//div[text()='Hotels'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='SpiceShuttle']")).click();
		driver.findElement(By.xpath("(//div[text()='Charter'])[1]")).click();
		
	Set<String> set=driver.getWindowHandles();
	   List<String> alltabs=new ArrayList<String>(set);
	      
	   System.out.println(alltabs.size());
	/*   
	   for(String child:alltabs) {
		   
		   if(!child.equals(parent)) {
			   driver.switchTo().window(child);
			  System.out.println("title is: "+driver.getTitle());
			  System.out.println("url is "+driver.getCurrentUrl());
			  Thread.sleep(1500);
               driver.close();
		   }
	   }
	   driver.switchTo().window(parent);
	   System.out.println("title is: "+driver.getTitle());
		  System.out.println("url is "+driver.getCurrentUrl());
	    
		 */
	   driver.switchTo().window(alltabs.get(1));
	   System.out.println(driver.getCurrentUrl());
	   System.out.println("Charter "+driver.getTitle());
	   Thread.sleep(100);
	   driver.close();
	   
	     driver.switchTo().window(alltabs.get(2));
	     System.out.println(driver.getCurrentUrl());
	     System.out.println("Spiceshuttle "+driver.getTitle());
	     Thread.sleep(100);
	     driver.close();
	     driver.switchTo().window(alltabs.get(3));
	     System.out.println(driver.getCurrentUrl());
	     System.out.println("hotels "+driver.getTitle());
	     Thread.sleep(100);
	     driver.close();
	     
	     driver.switchTo().window(alltabs.get(0));
	     System.out.println(driver.getCurrentUrl());
	     System.out.println("spicejet "+driver.getTitle());
	   
	   
		
	}

}
