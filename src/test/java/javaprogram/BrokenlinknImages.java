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

public class BrokenlinknImages {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver;
		String cpath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", cpath);
		driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		                   List<WebElement> links=driver.findElements(By.tagName("a"));
		                   
		                   links.addAll(driver.findElements(By.tagName("img")));
		                   
		                   ArrayList<WebElement>  activelink=new ArrayList<>();
		                   
		                   System.out.println("size is: "+links.size());
		                   
		                   for(int i=1;i<links.size();i++) {
		                	   System.out.println(links.get(i).getAttribute("href"));
		                	   if((links.get(i).getAttribute("href")!=null)&&(!links.get(i).getAttribute("href").contains("java script"))){
		                		   activelink.add(links.get(i));
		                	   }
		                	   
		                	  
		                   }System.out.println("active link size are:"+activelink.size());
		                   
		                   
		                   for(int j=1;j<activelink.size();j++) {
		                	   
		                	   
		                	        HttpURLConnection con=(HttpURLConnection)new URL (activelink.get(j).getAttribute("href")).openConnection();
		                	        
		                	                            con.connect();
		                	                          int statcode=  con.getResponseCode();
		                	                        String msg=con.getResponseMessage();
		                	                        con.disconnect();
		                	                        System.out.println(activelink.get(j).getAttribute("href")+"--"+statcode+"--"+msg);
		                	                            
		                   }
		
	}

}
