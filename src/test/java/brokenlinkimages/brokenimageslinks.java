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

public class brokenimageslinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver;
		
		String path="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
		System.setProperty("webdriver.chrome.driver", path);
		driver =new ChromeDriver();
		
		driver.get("http://makemysushi.com/404");
		driver.manage().window().maximize();
		
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		links.addAll(driver.findElements(By.tagName(path)));
		
		System.out.println("total links and images are"+links.size());
		
		ArrayList<WebElement>  activelinks=new ArrayList<>();
		
		for(int i=1;i<links.size();i++) {
			if((links.get(i).getAttribute("href")!=null) &&(!links.get(i).getAttribute("href").contains("javascript"))){
				
				System.out.println( links.get(i).getAttribute("href"));
				
				activelinks.add(links.get(i));
			}
		}
		
		System.out.println("active links are"+ activelinks.size());
		  
		  for(int j=1; j<activelinks.size();j++) {
			  
			                    
			                        	 
			           HttpURLConnection  connect=  ( HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			                        	 
			                      connect.connect();
			                  int rcode=    connect.getResponseCode();
			              String rmsg=connect.getResponseMessage();
		connect.disconnect();
			              System.out.println(activelinks.get(j).getAttribute("href")+" -->"+rcode+"-->"+rmsg);
		
	}
	}
}
