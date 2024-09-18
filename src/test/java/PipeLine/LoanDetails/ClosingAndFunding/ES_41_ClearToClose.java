package PipeLine.LoanDetails.ClosingAndFunding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ES_41_ClearToClose {
  @Test
  public void ClearToClose () throws InterruptedException {
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
//CLICKING ON CLOSING AND FUNDING  MENU
WebElement ClosingAndFundingNavigation = driver.findElement(By.id("closingFundingMenu"));
JavascriptExecutor ClosingAndFunding= (JavascriptExecutor)driver;
ClosingAndFunding.executeScript("arguments[0].click();", ClosingAndFundingNavigation);
Thread.sleep(2000);
//CLEAR TO CLOSE
WebElement ClosingFunding = driver.findElement(By.id("closingFunding-ClearToClose"));
JavascriptExecutor Closing_Funding= (JavascriptExecutor)driver;
Closing_Funding.executeScript("arguments[0].click();", ClosingFunding);
Thread.sleep(2000);

WebElement Constructioncompleteddate = driver.findElement(By.id("constructioncompleteddate"));
JavascriptExecutor Construction_completeddate= (JavascriptExecutor)driver;
Construction_completeddate.executeScript("arguments[0].click();", Constructioncompleteddate);
Thread.sleep(2000);
Constructioncompleteddate.sendKeys("20-07-2026");
Thread.sleep(2000);
WebElement Scheduledclosingdate = driver.findElement(By.id("scheduledclosingdate"));
JavascriptExecutor scheduledclosingdate= (JavascriptExecutor)driver;
scheduledclosingdate.executeScript("arguments[0].click();", Scheduledclosingdate);
Thread.sleep(2000);
Scheduledclosingdate.sendKeys("20-10-2026");
Thread.sleep(2000);
WebElement Scheduledfirstpaymentdate = driver.findElement(By.id("scheduledfirstpaymentdate"));
JavascriptExecutor Scheduled_firstpaymentdate= (JavascriptExecutor)driver;
Scheduled_firstpaymentdate.executeScript("arguments[0].click();", Scheduledfirstpaymentdate);
Thread.sleep(2000);
Scheduledfirstpaymentdate.sendKeys("05-01-2026");
Thread.sleep(2000);
WebElement Cleartoclosingdate = driver.findElement(By.id("cleartoclosingdate"));
JavascriptExecutor cleartoclosingdate= (JavascriptExecutor)driver;
cleartoclosingdate.executeScript("arguments[0].click();", Cleartoclosingdate);
Thread.sleep(2000);
Cleartoclosingdate.sendKeys("20-10-2026");
Thread.sleep(2000);
WebElement Prelimeffectivedate = driver.findElement(By.id("prelimeffectivedate"));
JavascriptExecutor prelimeffectivedate= (JavascriptExecutor)driver;
prelimeffectivedate.executeScript("arguments[0].click();", Prelimeffectivedate);
Thread.sleep(2000);
Prelimeffectivedate.sendKeys("10-01-2026");
Thread.sleep(2000);
WebElement Docssenttotitlecompanydate = driver.findElement(By.id("docssenttotitlecompanydate"));
JavascriptExecutor docssenttotitlecompanydate= (JavascriptExecutor)driver;
docssenttotitlecompanydate.executeScript("arguments[0].click();", Docssenttotitlecompanydate);
Thread.sleep(2000);
Docssenttotitlecompanydate.sendKeys("02-01-2026");
Thread.sleep(5000);
WebElement Declaredmaturitydate = driver.findElement(By.id("declaredmaturitydate"));
JavascriptExecutor declaredmaturitydate= (JavascriptExecutor)driver;
declaredmaturitydate.executeScript("arguments[0].click();", Declaredmaturitydate);
Thread.sleep(2000);
Declaredmaturitydate.sendKeys("10-10-2026");
Thread.sleep(2000);
WebElement Titleordernumber = driver.findElement(By.id("titleordernumber"));
JavascriptExecutor titleordernumber= (JavascriptExecutor)driver;
titleordernumber.executeScript("arguments[0].click();", Titleordernumber);
Thread.sleep(2000);
Titleordernumber.sendKeys("10");
Thread.sleep(2000);
WebElement SaveClearToClose = driver.findElement(By.id("saveClearToClose"));
JavascriptExecutor saveClearToClose= (JavascriptExecutor)driver;
saveClearToClose.executeScript("arguments[0].click();", SaveClearToClose);
Thread.sleep(2000);
driver.navigate().refresh();
driver.quit();


  }
}
