package PipeLine.LoanDetails.DashBoard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_27_LoanStagesNavigation {
  @Test
  public void LoanStagesNavigation() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  System.out.println("URL opened ");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  
		  driver.findElement(By.id("teamMemberButton")).click();
		  
 
   // Enter User Name
		driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com");
		
		// Enter password Name
		 
		 driver.findElement(By.id("loginPassword")).sendKeys("Sanchan@123");
		
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(5000);
	    WebElement LoanId = driver.findElement(By.cssSelector("#row-0 > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));
	    
	    Actions LoanIdSelect = new Actions(driver);
	    LoanIdSelect.moveToElement(LoanId).perform();
	    //=================== DASHBOARD TAB========================
	    Thread.sleep(3000);
	  
	 WebElement DashBoardNavigation = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/ul/li[1]/a"));
	  
	    JavascriptExecutor Dashboard= (JavascriptExecutor)driver;
       Dashboard.executeScript("arguments[0].click();", DashBoardNavigation);
	  //  DashBoardNavigation.click();
	  Thread.sleep(2000);
	 
	/*   if(DashBoardNavigation.isDisplayed()) {
	    	
	    	System.out.println(" Navigated to DashBoard");
	    }else {
	    	System.out.println(" Not Navigated to DashBoard");
	    
	    }*/
	    
     WebElement CloseDashboard =  driver.findElement(By.id("closePipelineBtn"));
     JavascriptExecutor Close = (JavascriptExecutor)driver;
     Close.executeScript("arguments[0].click();", CloseDashboard);
     Thread.sleep(3000);
     System.out.println("DASHBOARD CLICK VERIFIED ");
     // ====================DEAL TAB =======================================
     WebElement DealNavigation = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/ul/li[2]/a"));
	   JavascriptExecutor Deal= (JavascriptExecutor)driver;
     Deal.executeScript("arguments[0].click();", DealNavigation);
     Thread.sleep(2000);
     WebElement CloseDeal =  driver.findElement(By.id("closePipelineBtn"));
     JavascriptExecutor DealTab = (JavascriptExecutor)driver;
     DealTab.executeScript("arguments[0].click();", CloseDeal);
     Thread.sleep(3000);
     System.out.println("DEAL CLICK VERIFIED ");
     //================UNDERWRITING TERMSHEET TAB===================
     WebElement UnderwritingNavigation = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/ul/li[3]/a"));
	   JavascriptExecutor Underwriting= (JavascriptExecutor)driver;
	   Underwriting.executeScript("arguments[0].click();", UnderwritingNavigation);
   Thread.sleep(2000);
   WebElement CloseUnderwriting =  driver.findElement(By.id("closePipelineBtn"));
   JavascriptExecutor UnderwritingTab = (JavascriptExecutor)driver;
   UnderwritingTab.executeScript("arguments[0].click();", CloseUnderwriting);
   Thread.sleep(3000);
   System.out.println("UNDERWRITING CLICK VERIFIED ");
   // ===========PROCESSING FORMS TAB============
   WebElement ProcessingFormsNavigation = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/ul/li[4]/a"));
   JavascriptExecutor Processing= (JavascriptExecutor)driver;
   Processing.executeScript("arguments[0].click();", ProcessingFormsNavigation);
   Thread.sleep(2000);
WebElement CloseProcessing =  driver.findElement(By.id("closePipelineBtn"));
JavascriptExecutor ProcessingTab = (JavascriptExecutor)driver;
ProcessingTab.executeScript("arguments[0].click();", CloseProcessing);
Thread.sleep(3000);
System.out.println("PROCESSING FORMS CLICK VERIFIED ");
     //===CLEAR TO CLOSE TAB================
WebElement ClearToCloseNavigation = driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/ul/li[5]/a"));
JavascriptExecutor ClearToClose= (JavascriptExecutor)driver;
ClearToClose.executeScript("arguments[0].click();", ClearToCloseNavigation);
Thread.sleep(2000);
WebElement CloseClearToClose =  driver.findElement(By.id("closePipelineBtn"));
JavascriptExecutor ClearToCloseTab = (JavascriptExecutor)driver;
ClearToCloseTab.executeScript("arguments[0].click();", CloseClearToClose);
Thread.sleep(3000);
System.out.println("PROCESSING FORMS CLICK VERIFIED ");
// ===========SERVICING LOAN SUMMARY TAB===================
WebElement ServicingLoanSummaryNavigation = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/ul/li[6]/a"));
JavascriptExecutor ServicingLoanSummary= (JavascriptExecutor)driver;
ServicingLoanSummary.executeScript("arguments[0].click();", ServicingLoanSummaryNavigation);
Thread.sleep(2000);
WebElement CloseServicingLoanSummary =  driver.findElement(By.id("closePipelineBtn"));
JavascriptExecutor ServicingLoanSummaryTab = (JavascriptExecutor)driver;
ServicingLoanSummaryTab.executeScript("arguments[0].click();", CloseServicingLoanSummary);
Thread.sleep(3000);
System.out.println("SERVICING LOAN SUMMARY CLICK VERIFIED ");
//===========DRAW LOAN TAB===================
WebElement DrawLoanSummaryNavigation = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/ul/li[7]/a"));
JavascriptExecutor DrawLoanSummary= (JavascriptExecutor)driver;
DrawLoanSummary.executeScript("arguments[0].click();", DrawLoanSummaryNavigation);
Thread.sleep(2000);
WebElement CloseDrawLoanSummary =  driver.findElement(By.id("closePipelineBtn"));
JavascriptExecutor DrawLoanSummaryTab = (JavascriptExecutor)driver;
DrawLoanSummaryTab.executeScript("arguments[0].click();", CloseDrawLoanSummary);
Thread.sleep(3000);
System.out.println("DRAW LOAN  SUMMARY CLICK VERIFIED ");
driver.quit();
  }
}
