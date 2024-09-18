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

public class ES_20_AdvnceSearch {
  @Test
  public void AdvnceSearch () throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		 
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  
		  driver.findElement(By.id("teamMemberButton")).click();
		  

// Enter User Name
		driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com");
		
		// Enter password Name
		 
		 driver.findElement(By.id("loginPassword")).sendKeys("Sanchan@123");
		
	    driver.findElement(By.id("loginButton")).click();
	   // Thread.sleep(5000);
	    // Clicking Advance Search
	    WebElement AdvaceSearch = driver.findElement(By.id("advancedSearch"));
	    JavascriptExecutor Searchs = (JavascriptExecutor)driver;
	    Searchs.executeAsyncScript("arguments[0].click();", AdvaceSearch);
	    
	    /*  WebDriverWait  AdvanceSearch = new WebDriverWait(driver, Duration.ofSeconds(2000));
	    AdvanceSearch.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("advancedSearch")))).click();  
	  // Close 
	    WebElement Close = driver.findElement(By.id("searchOptionsClose"));
	    Close.click();
	    Thread.sleep(3000);
	    WebDriverWait  AdvanceSearch1 = new WebDriverWait(driver, Duration.ofSeconds(2000));
	    AdvanceSearch1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("advancedSearch")))).click();
	   
	    Thread.sleep(2000);
	    //GENERAL INFO
	    
	    */
	    // Saved Search
	    WebElement SavedSearch = driver.findElement(By.id("savedsearch"));
	    JavascriptExecutor Search = (JavascriptExecutor)driver;
	    Search.executeAsyncScript("arguments[0].click();", SavedSearch);
	    SavedSearch.sendKeys(Keys.ARROW_DOWN);
	    SavedSearch.sendKeys(Keys.ARROW_UP);
	    SavedSearch.sendKeys(Keys.ENTER);
	    
  }
}
