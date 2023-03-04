package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Spicejetpage {
	
	WebDriver driver;
	
	By addonele=By.xpath("//div[text()='Add-ons']");
	By fmf=By.xpath("//div[text()='Friends and Family']");
	By trip=By.xpath("//div[text()='round trip']");
	By from=By.xpath("//div[text()='From']");
	By depcity=By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar']");
	By dest=By.xpath("//div[text()='To']");
	By arrival=By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar']");
	By deprtd=By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])[1]");
	By ddat=By.xpath("(//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']//div[@class='css-1dbjc4n'])[8]//div//div[@data-focusable='true']");
	By Rday=By.xpath("((//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088'])[2]//div[@class='css-1dbjc4n'])[8]//div[@data-focusable='true']");
	By pax=By.xpath("//div[text()='Passengers']");
	By adlt=By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']");
	By chld=By.xpath("//div[@data-testid='Children-testID-plus-one-cta']");
	By nfnts=By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']");
	By curr=By.xpath("//div[text()='Currency']");
	By rup=By.xpath("(//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh'])[3]//div[@data-focusable='true']");
	By paxcls=By.xpath("//div[text()='Health Professional']");
	By srhflt=By.xpath("//div[@data-testid='home-page-flight-cta']");
	By Booktkt=By.xpath("//div[@data-testid='continue-search-page-cta']");
	public Spicejetpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Mouseovr() throws InterruptedException {
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(addonele)).build().perform();
		Thread.sleep(3000);
		}
	public void ff() {
		driver.findElement(fmf).click();
	}
	public void triptype() {
		driver.findElement(trip).click();
	}
	public void departure() {
		driver.findElement(from).click();
		List<WebElement> list=driver.findElements(depcity);
		
		for(int i=1;i<list.size();i++) {
		String depcityname=	list.get(i).getText();
		if(depcityname.equals("HYD")) {
			list.get(i).click();
			break;
		}
		}
		}
	/*public void destination() throws InterruptedException {
		//Actions act=new Actions(driver);
		//act.doubleClick(driver.findElement(dest)).build().perform();
		
		for(int i=1;i<=1;i++) {
			driver.findElement(dest).click();
		}
		Thread.sleep(2000);
	
	}*/
	public void arriv() {
		
		List<WebElement> ll=driver.findElements(arrival);
		for(int j=1;j<ll.size();j++) {
			String arrvcityname=ll.get(j).getText();
			if(arrvcityname.equals("DEL")) {
				ll.get(j).click();
				break;
			}
		}
	}
		public void deptdat() {
		
			String expdate="26-October 2022";
			String eday=expdate.split("-")[0];
			/*String emyr=expdate.split("-")[1];
			System.out.println(eday+"-"+emyr);
			
			String cmyr=driver.findElement(deprtd).getText();
			System.out.println("current year"+cmyr);
			/*while(!cmyr.equals(emyr)) {
				driver.findElement(By.xpath("(//div[@data-focusable='true'])[18]")).click();
				cmyr=driver.findElement(deprtd).getText();
			}*/
			
	      List<WebElement>  tdays= driver.findElements(ddat);
	     // System.out.println(tdays+"========");
	      
	      for(int k=1;k<tdays.size();k++) {
	    	String cday=  tdays.get(k).getText();
	    	//System.out.println("cday"+cday);
	    	
	    	if(cday.equals(eday)) {
	    		tdays.get(k).click();
	    		break;
	    	}
	      }
	      
	     String  ERday="15";
	     
	   List<WebElement>  le= driver.findElements(Rday);
	 
	    for(int m=1;m<le.size();m++) {
	    String rdat=le.get(m).getText();
	   // System.out.println("retdat"+rdat);
	    if(ERday.equals(rdat)) {
	    	le.get(m).click();
	    	break;
	    }
	    }
	
	}
		public void paxtype() {
			driver.findElement(pax).click();
			for(int r=1;r<=2;r++) {
				driver.findElement(adlt).click();
			}
			Actions act=new Actions(driver);
			act.doubleClick(driver.findElement(chld)).build().perform();
			
			for(int d=1;d<=4;d++) {
				driver.findElement(nfnts).click();
			}
			
		}
		public void currency() {
			driver.findElement(curr).click();
			
			List<WebElement> alr=driver.findElements(rup);
			for(int m=1;m<alr.size();m++) {
				String cdr=alr.get(m).getText();
				if(cdr.equals("MYR")) {
					alr.get(m).click();
					break;
				}
			}
			driver.findElement(paxcls).click();
		}
		public void submtbtn() {
			driver.findElement(srhflt).click();
		}
		
		public void ticketbook() {
			driver.findElement(Booktkt).click();
		}
	
	
	}

