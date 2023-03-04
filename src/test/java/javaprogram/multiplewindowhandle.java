package javaprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowhandle {
	
	public static void main(String [] xyz) throws InterruptedException {
		WebDriver driver;
		String cpath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", cpath);
		driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		String parent=driver.getWindowHandle();
		
		System.out.println("parent window title is: "+driver.getTitle());
		
		driver.findElement(By.xpath("//div[text()='Hotels']")).click();
		driver.switchTo().window(parent);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Cargo']")).click();
	
	
	           Set<String>  allwind=  driver.getWindowHandles();
	           
	           List<String>  allw=new ArrayList<>(allwind);
	          
	            for(String child:allwind) {
	            	
	            	if(!parent.equals(child)) {
	            		driver.switchTo().window(child);
	            	System.out.println(driver.getTitle());
	            	System.out.println(driver.getCurrentUrl());
	            	Thread.sleep(1500);
	            	driver.close();
	            		
	            	}
	            	
	            }
	            		driver.switchTo().window(parent);
	            		System.out.println(driver.getTitle());
	            	
	            	
	             
	            
	  /*          
		driver.switchTo().window(allw.get(2));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		
    	Thread.sleep(1000);
    	driver.switchTo().window(allw.get(1));
    	System.out.println(driver.getCurrentUrl());
    	System.out.println(driver.getTitle());
    	driver.close();
    	Thread.sleep(1000);
    	driver.switchTo().window(allw.get(0));
    	System.out.println(driver.getCurrentUrl());
     	System.out.println(driver.getTitle());*/
	}

}
