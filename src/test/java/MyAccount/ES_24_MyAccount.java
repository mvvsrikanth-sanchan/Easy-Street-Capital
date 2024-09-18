package MyAccount;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.codeborne.selenide.impl.WebdriverPhotographer;

public class ES_24_MyAccount {
  @Test
  public void MyAccountDetails() throws InterruptedException {
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
	    driver.findElement(By.xpath("//*[@id=\"page-header-user-dropdown\"]/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"userAccount\"]/span")).click();
	    Thread.sleep(1000);
	    WebDriverWait History= new WebDriverWait(driver,Duration.ofSeconds(3000));
	    History.until(ExpectedConditions.elementToBeClickable(By.id("userInfoLoadHistoryDays"))).sendKeys("20");
	/*   WebElement History = driver.findElement(By.id("userInfoLoadHistoryDays"));
	   History.clear();
	    Thread.sleep(1000);
	   History.sendKeys("20");*/
	    Thread.sleep(1000);
	    WebDriverWait Reset =  new WebDriverWait(driver,Duration.ofSeconds(2000));
	    Reset.until(ExpectedConditions.elementToBeClickable(By.id("userInfoReset")));
	    
	    
	  
	   System.out.println("User Info  Reseted");
	   Thread.sleep(1000);
	   WebDriverWait History1= new WebDriverWait(driver,Duration.ofSeconds(3000));
	    History1.until(ExpectedConditions.elementToBeClickable(By.id("userInfoLoadHistoryDays"))).sendKeys("30");
	   Thread.sleep(1000);
	   WebElement UserInfoUpdate = driver.findElement(By.id("userInfoUpdate"));
	   JavascriptExecutor Update = (JavascriptExecutor)driver;
	   Update.executeScript("arguments[0].click();", UserInfoUpdate);   
	   Thread.sleep(1000);
	   System.out.println("User Info  Updated");
	  
  }
}
