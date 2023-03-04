package Windowhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowhandling {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver;
         
      
		String cpath="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
		
		System.setProperty("webdriver.chrome.driver", cpath);
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.get("https://www.spicejet.com/");
		
	String parent=	driver.getWindowHandle();
	
	driver.findElement(By.xpath("//div[text()='Hotels']")).click();
	driver.findElement(By.xpath("//div[text()='Deals']")).click();
	driver.findElement(By.xpath("(//div[text()='Charter'])[1]")).click();
	
           Set<String> allwindow=driver.getWindowHandles();
           List<String>  allwind=new ArrayList<>(allwindow);
        
           System.out.println("size is"+allwind.size());
        /*   for(String child:allwind) {
        	   if(!child.equals(parent)) {
        		   driver.switchTo().window(child);
        		  System.out.println("title is"+ driver.getTitle());
        		  System.out.println("url is"+driver.getCurrentUrl());
        		  Thread.sleep(500);
        		  driver.close();
        		   
        	   }
           } driver.switchTo().window(parent);
          System.out.println("title is"+driver.getTitle());
          System.out.println("currenturl is"+driver.getCurrentUrl());  */
//By using list
          
          driver.switchTo().window(allwind.get(1));
          System.out.println("title is charter"+driver.getTitle());
          driver.close();
          driver.switchTo().window(allwind.get(2));
          System.out.println("title  is deals"+driver.getTitle());
          driver.close();
          driver.switchTo().window(allwind.get(3));
          System.out.println("title is hotels"+driver.getTitle());
          driver.close();
          driver.switchTo().window(allwind.get(0));
          System.out.println("title is parent"+driver.getTitle());
          
          

	}

}
