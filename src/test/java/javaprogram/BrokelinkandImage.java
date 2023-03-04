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

public class BrokelinkandImage {

	public static void main(String[] args) throws MalformedURLException, IOException {
       WebDriver driver;
		String path="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
         List<WebElement> links=  driver.findElements(By.tagName("a"));
         
              links.addAll(driver.findElements(By.tagName("img")));
              
             ArrayList<WebElement> activelink=new ArrayList<>();
             System.out.println("total links are: "+links.size());
             
             for(int i=1;i<links.size();i++) {
            	 
            	System.out.println(links.get(i).getAttribute("href"));
            	
            	if((links.get(i).getAttribute("href")!=null)&&(!links.get(i).getAttribute("href").contains("java script"))){
            		
            		activelink.add(links.get(i));
            	}
             }System.out.println("size of active links are: "+activelink.size());
		               for(int j=1; j<activelink.size();j++) {
		            	   
		            	   
		            	  HttpURLConnection cont=  (HttpURLConnection) new URL(activelink.get(j).getAttribute("href")).openConnection();
		            	  
		            	  cont.connect();
		            	  
		            	int code= cont.getResponseCode();
		            	String msg=cont.getResponseMessage();
		            	cont.disconnect();
		            	System.out.println(activelink.get(j).getAttribute("href")+"-->"+code+"-->"+msg);
		               }
	}

}
