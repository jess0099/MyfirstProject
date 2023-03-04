package javaprogram;

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

public class brokenlinkimages {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver;
		
		String cpath="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
		
		System.setProperty("webdriver.chrome.driver", cpath);
		
		driver=new ChromeDriver();
		
		 driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();
		 
	List<WebElement>	links= driver.findElements(By.tagName("a"));
	
	links.addAll(driver.findElements(By.tagName("img")));
	
	System.out.println(links.size()+"-->toatl links and images");

	ArrayList<WebElement> activelinks=new ArrayList<>();
	
	    for(int i=0;i<links.size();i++) {
	    	
	    	System.out.println(links.get(i).getAttribute("href"));
	    	if((links.get(i).getAttribute("href")!=null) && !(links.get(i).getAttribute("href").contains("javascript"))) {
	    		
	    		activelinks.add(links.get(i));
	    	}
	    	
	    }  System.out.println("active links counts are"+activelinks.size());
	    
	    for(int j=0;j<activelinks.size();j++) {
	    	
	    	                  HttpURLConnection conct=(HttpURLConnection)  new URL(activelinks.get(j).getAttribute("href")).openConnection();
	    	                  
	    	                  conct.connect();
	    	                  
	    	             int   rcode= conct.getResponseCode();
	    	          String msg= conct.getResponseMessage();
	    	          conct.disconnect();
	    	          System.out.println(activelinks.get(j).getAttribute("href")+"->"+rcode+"->"+msg);
	    	                  
	    	                  
	    	
	    }
	    
		
		
		
		
	}

}
