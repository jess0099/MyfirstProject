package Windowhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		
		String path="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
	       String parent=   driver.getWindowHandle();
	       
	       driver.findElement( By.xpath("//div[text()='Deals']")).click();
	       driver.findElement(By.xpath("//div[text()='SpiceScreen']")).click();
	       driver.findElement(By.xpath("(//div[text()='Cargo'])[1]")).click();
	       
	  Set<String>  allwind= driver.getWindowHandles();
		
		System.out.println("total window are"+allwind.size());
		
		// 2 methods 1. methods
	/*	
		for(String child:allwind) {
			
			if(!child.contains(parent)) {
				
				driver.switchTo().window(child);
			System.out.println(" url are "+driver.getCurrentUrl());
			 System.out.println(" title are "+driver.getTitle());
			 
			 Thread.sleep(500);
			 driver.close();
			
			}
		}
		driver.switchTo().window(parent);
		System.out.println(" parent url is "+driver.getCurrentUrl());
		 System.out.println(" parent title is "+driver.getTitle());
		 */
		 
		 // 2. methods by index
		
		List<String>   alltab=new ArrayList<>(allwind);
		
		       driver.switchTo().window(alltab.get(1));
		       System.out.println("   cargo url is "+driver.getCurrentUrl());
				 System.out.println("  cargo title is "+driver.getTitle());
				 Thread.sleep(300);
				 driver.close();
				 driver.switchTo().window(alltab.get(2));
				 System.out.println("    Spicescreen url is "+driver.getCurrentUrl());
				 System.out.println("   Spicescreen title is "+driver.getTitle());
				 Thread.sleep(300);
				 driver.close();
		 driver.switchTo().window(alltab.get(3));
		 System.out.println("   Deals url is "+driver.getCurrentUrl());
		 System.out.println("   Deals title is "+driver.getTitle());
		 Thread.sleep(300);
		 driver.close();
		 driver.switchTo().window(alltab.get(0));
		 System.out.println("   spicejet url is "+driver.getCurrentUrl());
		 System.out.println("   spicejet title is "+driver.getTitle());
		 Thread.sleep(300);
	}

}
