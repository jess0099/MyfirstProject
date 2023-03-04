package DataXLDemo;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;

import ExclUtils.Exclutilsdemo;
import pages.Loginpage;
import pages.Signuppage;

public class Demoexcldata {
	WebDriver driver;
	Exclutilsdemo edu;
	Loginpage lp;
	Signuppage sup;
	
	@BeforeTest
	
	public void setup() {
		String cpath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", cpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@DataProvider(name="testdata")
	
	public Object [][] datap() throws IOException{
		String xlpath="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/DataUtils/Data_login.xlsx";
		String Sheetname="Sheet1";		
		Object data[][]=getdatamethod(xlpath, Sheetname);
		return data;
	}
	@Test(dataProvider="testdata")
	
	public void finaldata(String username,String password) throws InterruptedException, IOException {
		System.out.println(username+" | "+password);
		driver.get("https://example.testproject.io/web/");
		lp=new Loginpage(driver);
		lp.username(username);
		lp.userpassword(password);
		Thread.sleep(1500);
		lp.submit();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//p[@id='greetings']//b")).getText();
		System.out.println("actual name: "+actual);
		SoftAssert softassert=new SoftAssert();//verify
		softassert.assertEquals(username, actual);
		Assert.assertEquals(actual,username);
		sup=new Signuppage(driver);
		sup.countryname();
		sup.address();
		sup.emailadd();
		sup.phonenumber();
		sup.savedbtn();
		
		String path="/Users/amitbhati/eclipse-workspace/MyFirstProject1/src/test/resources/Screenshots/saved.png";
	  File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   Files.copy(src, new File(path));
		
	   Thread.sleep(3000);
	}
	@AfterTest
	
	public void teardown() {
		System.out.println("Successfull");
		driver.close();
	}
	
	
	

	public Object [][] getdatamethod(String xlpath,String Sheetname) throws IOException{
		edu=new Exclutilsdemo(xlpath, Sheetname);
		
		int Rownum=edu.rowcount();
		int Celnum= edu.cellcount();
		Object data[][]=new Object[Rownum-1][Celnum];
		
		for (int i=1;i<Rownum;i++) {
			for(int j=0;j<Celnum;j++) {
				data [i-1][j]= edu.getdatecellstring(i, j);
			}
		}return data;
		
	}
	

}
