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

public class brokenlinkimges {

	public static void main(String[] args) throws MalformedURLException, IOException {

		//brokenlinkandimages
		
		WebDriver  driver;
		String cpath="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
		System.setProperty("webdriver.chrome.driver", cpath);
		driver=new ChromeDriver();
		
		driver.get("http://makemysushi.com/404");
		driver.manage().window().maximize();
		
	    List<WebElement> links=	driver.findElements(By.tagName("a"));
	                             links.addAll(driver.findElements(By.tagName("img")));
	    System.out.println("total links are"+links.size());
	    
	    
	                     ArrayList<WebElement>  activelink=new ArrayList<WebElement>();
	    
		for(int i=1; i<links.size();i++) {
			
			System.out.println(links.get(i).getAttribute("href"));
			
			if((links.get(i).getAttribute("href")!=null)&&(!(links.get(i).getAttribute("href").contains("javascript")))){
				
				      activelink.add(links.get(i));
				
			}
		}
		
		                System.out.println("activelinks are:"+activelink.size());
		                
		                for(int j=1; j<activelink.size();j++) {
		                	
		                	    
		                	
		                	HttpURLConnection  http=(HttpURLConnection) new URL   (activelink.get(j).getAttribute("href")).openConnection();
		                	
		                	http.connect();
		                	
		                	int code=  http.getResponseCode();
		                	String msg=http.getResponseMessage();
		                	
		                	System.out.println(activelink.get(j).getAttribute("href")+"-->"+code+"-->"+msg);
		                
		                }
	                     
	                     
		
		
		
		
	}

}
