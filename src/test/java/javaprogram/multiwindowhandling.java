package javaprogram;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
      String cpath="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
      System.setProperty("webdriver.chrome.driver", cpath);
      driver=new ChromeDriver();
      driver.get("https://www.spicejet.com/");
      driver.manage().window().maximize();
      
                String parent=driver.getWindowHandle();
               // System.out.println("Parentwindow url"+driver.getCurrentUrl());
            //    System.out.println("Parentwindow title"+driver.getTitle());
                
                driver.findElement(By.xpath("//div[text()='Hotels']")).click();
                driver.findElement(By.xpath("//div[text()='SpiceHolidays']")).click();
                //By usiing set
                
                       Set<String>    allwind=driver.getWindowHandles();
                       ArrayList<String>   tabs=new ArrayList<>(allwind);
                       
                       driver.switchTo().window(tabs.get(1));
                       System.out.println("Holiday Packages, Tour Packages --"+driver.getTitle());
                       Thread.sleep(1500);
                       driver.close();
                       driver.switchTo().window(tabs.get(2));
                       System.out.println("Spicevacations - Book Cheap"+driver.getTitle());
                       Thread.sleep(1500);
                       driver.close();
                       driver.switchTo().window(tabs.get(0));
                       System.out.println("Parentwindow title"+driver.getTitle());
                    /*   for(String  child:allwind) {
                    	   
                    	   if(!child.equals(parent)) {
                    		   driver.switchTo().window(child);
                    		   System.out.println("childwindowURL is:"+driver.getCurrentUrl());
                    		   System.out.println("Childwindowtitlke is:"+driver.getTitle());
                    		  Thread.sleep(2000);
                    		  driver.close();
                    	   }
                    		 }  
                    		   driver.switchTo().window(parent);
                    		   System.out.println("Parentwindow url--"+driver.getCurrentUrl());
                    		   System.out.println("Parentwindow title--"+driver.getTitle());
                    	   
                       } */
		
		
	}

}
