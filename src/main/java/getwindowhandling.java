import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getwindowhandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		ChromeOptions options=new ChromeOptions();
		String path="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	String parent=	driver.getWindowHandle();
	System.out.println("parent window is: "+parent);
		driver.findElement(By.xpath("//div[text()='Hotels']")).click();
		driver.findElement(By.xpath("//div[text()='Deals']")).click();
		
	Set<String>  allwindow=	 driver.getWindowHandles();
	System.out.println("totalwindow are: "+allwindow.size());
	/*
	   List<String> ll=new ArrayList<>(allwindow);
	                         driver.switchTo().window(ll.get(1));
	                      String tit2=   driver.getTitle();
	                      System.out.println("tit2 is: "+tit2);
	                         driver.close();
	                         Thread.sleep(1500);
	                         
	                         driver.switchTo().window(ll.get(2));
	                       
	                         String tit1=    driver.getTitle();
	                         System.out.println("tit1 is: "+tit1);
	                         driver.close();
	                         Thread.sleep(1500);
	                         
	                         driver.switchTo().window(ll.get(0));
	                       
	                         String tit0=     driver.getTitle();
	                         System.out.println("tit0 is: "+tit0); */
	                        
	                      //using for-loop
	                         for(String child:allwindow) {
	                        	 if(!parent.equals(child)) {
	                        	 driver.switchTo().window(child);
	                        	String title= driver.getTitle();
	                        	System.out.println("title is:"+title);
	                        	Thread.sleep(2000);
	                        	driver.close();
	                         }
	                         driver.switchTo().window(parent);
	                         System.out.println(driver.getTitle());
	                         
	                         
	                         
	                         }                    
		
	}

}
