package PipeLine.LoanDetails.ClosingAndFunding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ES_43_RateAndPoints {
  @Test
  public void RateAndPoints() throws InterruptedException {
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
//RATE AND POINTS
WebElement RateAndPoints = driver.findElement(By.id("closingFunding-RateAndPoints"));
JavascriptExecutor Rate_Points= (JavascriptExecutor)driver;
Rate_Points.executeScript("arguments[0].click();", RateAndPoints);
Thread.sleep(3000);
//DEAL INFO

WebElement  SaveDealInfo = driver.findElement(By.id("saveDealInfo"));
JavascriptExecutor saveDealInfo =(JavascriptExecutor)driver;
saveDealInfo.executeScript("arguments[0].click();", SaveDealInfo);
Thread.sleep(2000);
driver.findElement(By.id("loanorganisationpoints")).sendKeys("10");
driver.findElement(By.id("rate")).sendKeys("5");
driver.findElement(By.id("points")).sendKeys("50");
Thread.sleep(2000);
WebElement  SaveDeal_Info = driver.findElement(By.id("saveDealInfo"));
JavascriptExecutor saveDeal_Info =(JavascriptExecutor)driver;
saveDeal_Info.executeScript("arguments[0].click();", SaveDeal_Info);
Thread.sleep(5000);
driver.navigate().refresh();
//dealInfoChangeRequest
driver.findElement(By.id("loanorganisationpoints")).sendKeys("10");
driver.findElement(By.id("rate")).sendKeys("5");
driver.findElement(By.id("points")).sendKeys("50");
Thread.sleep(5000);
WebElement  DealInfoChangeRequest = driver.findElement(By.id("dealInfoChangeRequest"));
JavascriptExecutor dealInfo_ChangeRequest =(JavascriptExecutor)driver;
dealInfo_ChangeRequest.executeScript("arguments[0].click();", DealInfoChangeRequest);
Thread.sleep(3000);
driver.navigate().refresh();
//LOCK HISTORY
Thread.sleep(3000);

WebElement  dealInfoLock_History = driver.findElement(By.id("dealInfoLockHistory"));
JavascriptExecutor dealInfoLockHistory =(JavascriptExecutor)driver;
dealInfoLockHistory.executeScript("arguments[0].click();", dealInfoLock_History);
Thread.sleep(3000);
driver.quit();
  }
}
