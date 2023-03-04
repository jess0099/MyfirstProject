package brokenlinkimages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class linknimagesbroken {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		String cpath="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
		System.setProperty("webdriver.chrome.driver", cpath);
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
	}
		@Test
		
		public void Testexecution() throws MalformedURLException, IOException {
			
		driver.get("http://makemysushi.com/404");
		
	List<WebElement>  links=driver.findElements(By.tagName("a"));
	
	    links.addAll(driver.findElements(By.tagName("img")));
	    
	    System.out.println(links.size()+" total size: ");
	    
	  List<WebElement> activelist=new ArrayList<>();
	    
	    for(int i=0;i<links.size();i++) {
	       System.out.println(links.get(i).getAttribute("href"));
	       if((links.get(i).getAttribute("href")!=null)&&(!links.get(i).getAttribute("href").contains("javascript"))) {
	    	   activelist.add(links.get(i));
	       }
	       
	    }
	    System.out.println("activelist are: "+activelist.size());
	    for(int j=0;j<activelist.size();j++) {
	    	
	    	 HttpURLConnection cont= ( HttpURLConnection)new URL (activelist.get(j).getAttribute("href")).openConnection();
	    	 cont.connect();
	    	  int rcode=  cont.getResponseCode();
	    	 String msg= cont.getResponseMessage();
	    	 cont.disconnect();
	    	 System.out.println(activelist.get(j).getAttribute("href")+"-->"+rcode+"-->"+msg);
	    }
		
	}
	
	
	

}
