package PipeLine.Search;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import gherkin.lexer.Th;

public class ES_25_Search {
  @Test
  public void SearchByLoanId() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		 
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
	   //Filter By stage
	    WebElement Stage = driver.findElement(By.id("filterTotalLoanAmount-Underwriting"));
	    JavascriptExecutor Stages = (JavascriptExecutor)driver;
	    Stages.executeScript("arguments[0].click();", Stage);
	   Thread.sleep(3000);
	   WebElement NextStages = driver.findElement(By.id("filterTotalLoanAmount-TermSheetIssued"));
	    JavascriptExecutor NextStage = (JavascriptExecutor)driver;
	    NextStage.executeScript("arguments[0].click();", NextStages);
	 
	   //Clicking on Forward and Backward Arrow
	    WebElement Forward = driver.findElement(By.id("filterStageNext"));
	    JavascriptExecutor FilterStageNext = (JavascriptExecutor)driver;
	    FilterStageNext.executeScript("arguments[0].click();", Forward);
	 
	   System.out.println("Forwarded clicked");
	   Thread.sleep(3000);
	   WebElement Previous = driver.findElement(By.id("filterStagePrevious"));
	    JavascriptExecutor FilterStagePrevious = (JavascriptExecutor)driver;
	    FilterStagePrevious.executeScript("arguments[0].click();", Previous);
	   
	   System.out.println("Previous Clicked");
	   Thread.sleep(2000);
	   WebElement FirstStages = driver.findElement(By.id("filterTotalLoanAmount-AccountExecutiveReview"));
	    JavascriptExecutor StageOne = (JavascriptExecutor)driver;
	    StageOne.executeScript("arguments[0].click();", FirstStages);
	 
	    // Search By Loan ID   
	    WebElement Search = driver.findElement(By.name("searchInputValue"));
	    Search.sendKeys("300000900");
	    System.out.println("No Search Data found message displayed");
	    Thread.sleep(3000);
	    Search.clear();
	     Thread.sleep(3000);
	    Search.sendKeys("300101");
	    Thread.sleep(3000);
	    Search.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(3000);
	    Search.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    //CLOSE LOAN ID
	    WebElement Close = driver.findElement(By.id("closePipelineBtn"));
	    JavascriptExecutor ClosePipeLine = (JavascriptExecutor)driver;
	    ClosePipeLine.executeScript("arguments[0].click();", Close);
	    System.out.println("Searched Loan Id successfully");
	    
	    // MOST RECENT LOANS
	    Thread.sleep(3000);
	    WebElement MostRecentLoans = driver.findElement(By.id("mostRecentLoans"));
	   JavascriptExecutor RecentLoans =(JavascriptExecutor)driver;
	   RecentLoans.executeAsyncScript("arguments[0].click();", MostRecentLoans);
	   Thread.sleep(3000);
	   WebElement dropdown = driver.findElement(By.id("mostRecentLoans"));
	   JavascriptExecutor arrow =(JavascriptExecutor)driver;
	   arrow.executeAsyncScript("arguments[0].click();", dropdown);
	   // Enter the  Loan id  given in Search By Loan ID script 
	   WebElement DropDown = driver.findElement(By.id("recentLoan-300101"));
	   JavascriptExecutor Arrow = (JavascriptExecutor)driver;
	   Arrow.executeAsyncScript("arguments[0].click();", DropDown);
	   
	    Thread.sleep(3000);
	    System.out.println("Most Recent Loans Opened");
	  //CLOSE LOAN ID
	    WebElement Closes = driver.findElement(By.id("closePipelineBtn"));
	    JavascriptExecutor ClosePipeLines = (JavascriptExecutor)driver;
	    ClosePipeLines.executeScript("arguments[0].click();", Closes);
	    System.out.println("Searched Loan Id successfully");
	    
	    
  }
}
