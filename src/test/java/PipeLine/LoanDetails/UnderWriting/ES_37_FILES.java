package PipeLine.LoanDetails.UnderWriting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_37_FILES {
  @Test
  public void Files() throws InterruptedException, IOException {
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
// CLICKING ON UNDERWRITING  MENU
 WebElement UnderwritingNavigation = driver.findElement(By.id("underwritingMenu"));
   JavascriptExecutor Underwriting= (JavascriptExecutor)driver;
   Underwriting.executeScript("arguments[0].click();", UnderwritingNavigation);
Thread.sleep(2000);
// FILES TAB 
WebElement UnderwritingFiles = driver.findElement(By.id("underwriting-Files"));
JavascriptExecutor Underwriting_Files= (JavascriptExecutor)driver;
Underwriting_Files.executeScript("arguments[0].click();", UnderwritingFiles);
Thread.sleep(2000);
WebElement FileUpload = driver.findElement(By.id("fileUpload"));
JavascriptExecutor File_Upload =(JavascriptExecutor)driver;
File_Upload.executeScript("arguments[0].click();", FileUpload);
Thread.sleep(5000);
WebElement CloseUpdate = driver.findElement(By.id("uploadClose"));
JavascriptExecutor Close_Update =(JavascriptExecutor)driver;
Close_Update.executeScript("arguments[0].click();", CloseUpdate);
Thread.sleep(2000);
WebElement FileUpload1 = driver.findElement(By.id("fileUpload"));
JavascriptExecutor File_Upload1 =(JavascriptExecutor)driver;
File_Upload1.executeScript("arguments[0].click();", FileUpload1);
Thread.sleep(2000);
//Alert alert = driver.switchTo().alert();

WebElement UploadFile = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div[1]/div/div/div[1]/div[2]"));
WebDriverWait Upload = new WebDriverWait(driver, Duration.ofSeconds(3000));
Upload.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div/div[1]/div[1]/div/div/div[1]/div[2]"))).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div[1]/div/div/div[1]/div[2]")).sendKeys("Bank statement");
Thread.sleep(2000);
//UploadFile.sendKeys(Keys.ARROW_DOWN);
UploadFile.sendKeys(Keys.ENTER);


//JavascriptExecutor Upload = (JavascriptExecutor)driver;
//Upload.executeScript("arguments[0].click();", UploadFile);
//UploadFile.sendKeys("Bank statement");
Thread.sleep(2000);
WebElement chooseFile = driver.findElement(By.id("chooseFile"));
JavascriptExecutor Choose_File =(JavascriptExecutor)driver;
Choose_File.executeScript("arguments[0].click();", chooseFile);
Thread.sleep(2000);
Runtime.getRuntime().exec("\"C:\\Users\\mvvsr\\OneDrive\\Desktop\\autoit scripts\\File_Upload.au3\"");


  }
}
