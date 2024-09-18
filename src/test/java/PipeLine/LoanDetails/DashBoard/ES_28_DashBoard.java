package PipeLine.LoanDetails.DashBoard;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_28_DashBoard {
  @Test
  public void DashBoard() throws InterruptedException {
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
	  Thread.sleep(3000);
	  // Loan to loan forward and Backward arrow check
	  // Forward Check
	  WebElement Next = driver.findElement(By.id("changeLoanNext"));
	  JavascriptExecutor Forward =(JavascriptExecutor)driver;
	  Forward.executeScript("arguments[0].click();", Next);
	  
	  System.out.println("Forward clicked");
	// Backward Check
	   Thread.sleep(3000);
	   WebElement Previous =driver.findElement(By.id("changeLoanPrevious"));
	   JavascriptExecutor Backward =(JavascriptExecutor)driver;
	   Backward.executeScript("arguments[0].click();", Previous);
	   System.out.println("Backward clicked");
	  //Stages Verification
	   WebElement UnderwritingStage = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div[2]/section/div[1]/div/div/ul/li[2]/div"));
	   WebDriverWait UnderwritingStages = new WebDriverWait(driver,Duration.ofSeconds(50));
	   UnderwritingStages.until(ExpectedConditions.elementToBeClickable(UnderwritingStage));
	   JavascriptExecutor Stage1 = (JavascriptExecutor)driver;
	   Stage1.executeAsyncScript("arguments[0].click();", UnderwritingStage);
	   Thread.sleep(5000);
	   Alert alert = driver.switchTo().alert();
	   alert.dismiss();
	   /*WebElement CancelAlert = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div[1]/div[1]/div/div/p/a[1]"));
	   JavascriptExecutor Cancel= (JavascriptExecutor)driver;
	   Cancel.executeScript("arguments[0].click();", CancelAlert);*/
	   WebElement UnderwritingStage1 = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[1]/div[2]/section/div[1]/div/div/ul/li[2]/div"));
	   WebDriverWait UnderwritingStages1 = new WebDriverWait(driver,Duration.ofSeconds(50));
	   UnderwritingStages1.until(ExpectedConditions.elementToBeClickable(UnderwritingStage1));
	   JavascriptExecutor StageOne = (JavascriptExecutor)driver;
	   StageOne.executeAsyncScript("arguments[0].click();", UnderwritingStage1);
	   
  }
}
