package PipeLine.LoanDetails.Deals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_34_Leads {
  @Test
  public void CreatLeads () throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  System.out.println("URL opened ");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  
		  driver.findElement(By.id("teamMemberButton")).click();
		  

//Enter User Name
		driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com");
		
		// Enter password Name
		 
		 driver.findElement(By.id("loginPassword")).sendKeys("Sanchan@123");
		
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(5000);
     WebElement LoanId = driver.findElement(By.cssSelector("#row-0 > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));
	    
	    Actions LoanIdSelect = new Actions(driver);
	    LoanIdSelect.moveToElement(LoanId).perform();
	    WebElement DealNavigation = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/ul/li[2]/a"));
	    JavascriptExecutor Deal= (JavascriptExecutor)driver;
	     Deal.executeScript("arguments[0].click();", DealNavigation);
	     Thread.sleep(3000);
	     // CLICKING ON DEAL MENU
	     WebDriverWait ClickMenu =new WebDriverWait(driver, Duration.ofSeconds(30));
	     ClickMenu.until(ExpectedConditions.visibilityOfElementLocated(By.id("dealMenu")));
	     WebElement ClickMenus = driver.findElement(By.id("dealMenu"));
	     JavascriptExecutor DealMenu = (JavascriptExecutor)driver;
	     DealMenu.executeScript("arguments[0].click(); ", ClickMenus);
	     Thread.sleep(3000);
	     //LEAD CREATION saveLead
	     WebElement Leads = driver.findElement(By.id("deal-Lead"));
	     JavascriptExecutor Lead =(JavascriptExecutor)driver;
	     Lead.executeScript("arguments[0].click();", Leads);
	     Thread.sleep(3000);
	     driver.findElement(By.id("dealLeadSource")).sendKeys("Conference");
	     driver.findElement(By.id("dealChannel")).sendKeys("Broker");
	     driver.findElement(By.id("deallenderId")).sendKeys("30001048");
	     Thread.sleep(2000);
	     WebElement SaveLeads = driver.findElement(By.id("saveLead"));
	     JavascriptExecutor SavedLead =(JavascriptExecutor)driver;
	     SavedLead.executeScript("arguments[0].click();", SaveLeads);
	   
	     Thread.sleep(2000);
	     driver.quit();
	     
	     
	     
	  
  }
}
