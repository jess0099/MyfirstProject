package brokenlinkimages;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import java.net.HttpURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imagesborkenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
WebDriver driver;
		String path="/Users/amitbhati/git/JAVAPROGRAM_2nd/MyFirstProject1/src/test/resources/drivers/chromedriver 3";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		
		  driver.get("https://www.spicejet.com/");
		  driver.manage().window().maximize();
		 
	
	List<WebElement>	link=  driver.findElements(By.tagName("a"));
	
	link.addAll(driver.findElements(By.tagName("img")));
	
	System.out.println("total links are->"+link.size());
	
	ArrayList<WebElement> activelink=new ArrayList<>();
	
	for(int i=0;i<link.size();i++) {
		
		System.out.println(link.get(i).getAttribute("href"));
		
		if((link.get(i).getAttribute("href")!=null && !(link.get(i).getAttribute("href").contains("javascript")))) {
			
			activelink.add(link.get(i));
		}
	}
	      System.out.println("activelink are--"+activelink.size());
	 for(int j=0; j<activelink.size();j++) {
		 
		   HttpURLConnection    hp=  (HttpURLConnection) new URL(activelink.get(j).getAttribute("href")).openConnection();
	  hp.connect();
	int rcode=  hp.getResponseCode();
	String msg=hp.getResponseMessage();
	hp.disconnect();
	
	System.out.println(activelink.get(j).getAttribute("href")+"->"+rcode+"->"+msg);
	 
	 }
	}

}
