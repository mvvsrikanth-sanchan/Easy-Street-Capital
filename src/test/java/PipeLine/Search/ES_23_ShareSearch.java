package PipeLine.Search;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_23_ShareSearch {
  @Test
  public void ShareSearch() throws InterruptedException {
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
	  WebElement  ShareSearch =   driver.findElement(By.id("shareSearch"));
	  JavascriptExecutor Share = (JavascriptExecutor)driver;
	  Share.executeScript("arguments[0].click();",ShareSearch);
	  Thread.sleep(3000);
	  // Share Button
	 WebElement  ShareButton = driver.findElement(By.id("sharesearch-share"));
	 JavascriptExecutor Button = (JavascriptExecutor)driver;
	 Button.executeScript("arguments[0].click();", ShareButton);
	 System.out.println("Validation displayed");
	  Thread.sleep(3000);
	  //Back button'
	  WebElement  backButton = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div[1]/button/span"));
		 JavascriptExecutor back = (JavascriptExecutor)driver;
		 back.executeScript("arguments[0].click();", backButton);
		 System.out.println("Navigated Back");
		 Thread.sleep(3000);
		 ShareSearch.click();
		 Thread.sleep(3000);
	  //All Views 
	  WebElement  AllViews = driver.findElement(By.id("sharesearch-allviews"));
	  JavascriptExecutor Views = (JavascriptExecutor)driver;
	  Views.executeScript("arguments[0].click();", AllViews);
	  
	 
	  AllViews.sendKeys("SANCHA");
	 // AllViews.sendKeys(Keys.ARROW_DOWN);
	//  AllViews.sendKeys(Keys.ARROW_UP);
	  AllViews.sendKeys(Keys.ENTER);
	  // Share Button
	  Thread.sleep(3000);
	  WebElement  ShareButton1 = driver.findElement(By.id("sharesearch-share"));
		 JavascriptExecutor Button1 = (JavascriptExecutor)driver;
		 Button1.executeScript("arguments[0].click();", ShareButton1);
	  System.out.println("Validation displayed For EveryOne");
	 
	  Thread.sleep(3000);
	 // driver.navigate().refresh();
	  //Everyone
	  WebElement  ClearAllview = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div/div/div[1]/div[1]/div[1]/div[2]"));
		 JavascriptExecutor Allview = (JavascriptExecutor)driver;
		 Allview.executeScript("arguments[0].click();", ClearAllview);
	  Thread.sleep(3000);
	  WebElement  Everyone = driver.findElement(By.xpath("//*[@id=\"react-select-5-placeholder\"]"));
	  JavascriptExecutor EveryOne1 = (JavascriptExecutor)driver;
	  EveryOne1.executeScript("arguments[0].click();", Everyone);
	  
	  Everyone.sendKeys("teja ch");
	//  Everyone.sendKeys(Keys.ARROW_DOWN);
	 // Everyone.sendKeys(Keys.ARROW_UP);
	 // Everyone.sendKeys(Keys.ENTER);
	  // Share Button
	  WebElement  ShareButton2 = driver.findElement(By.id("sharesearch-share"));
		 JavascriptExecutor Button2 = (JavascriptExecutor)driver;
		 Button2.executeScript("arguments[0].click();", ShareButton2);
	  System.out.println("Validation displayed For All Viwes");
	  // SINGLE VIEW WITH SINGLE EVERYONE
	  AllViews.sendKeys("SANCHA");
	  AllViews.sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  Everyone.sendKeys("srikanth mvv");
	  Thread.sleep(3000);
	// Share Button
     driver.findElement(By.className("add_button fillbtn_new ")).click();
     Thread.sleep(3000);
     
  }
}
