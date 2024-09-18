package Administration.LookUps.Needs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import gherkin.lexer.Ja;

public class ES_12_0_AddNeeds {
  @Test
  public void AddNeeds() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		  
		  
		  
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  System.out.println("URL opened ");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/login");
		 
		 driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys("Sanchan@123");
		  
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/form/div[4]/button")).click();
		  System.out.println("Logged in successfully");
		  Thread.sleep(5000);
		 driver.findElement(By.linkText("Administration")).click();
		 driver.findElement(By.linkText("Lookups")).click();
		//CLICKING ON  DROPDOWN MANAGEMENT
		 Thread.sleep(3000);
		 driver.findElement(By.id("NeedsListSubMenu")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("needsGroupTab")).click();
		 Thread.sleep(2000);
		 WebElement AddNewGroupbtn = driver.findElement(By.id("AddNewGroupbtn"));
		 JavascriptExecutor AddNew = (JavascriptExecutor)driver;
		 AddNew.executeScript("arguments[0].click();", AddNewGroupbtn);
		 
		//driver.findElement(By.id("AddNewGroupbtn")).click();
		 Thread.sleep(2000);
		driver.findElement(By.name("groupName")).sendKeys("Test Need Group");
		 Thread.sleep(2000);
		WebElement Stage=driver.findElement(By.name("stage"));
		Stage.sendKeys(Keys.ARROW_DOWN);
		Stage.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Stage.sendKeys(Keys.ENTER);
		
		WebElement programType = driver.findElement(By.name("programType"));
		programType.sendKeys(Keys.ARROW_DOWN);
		//programType.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
	
		
		WebElement Submit = driver.findElement(By.className("fs_btn"));
		 JavascriptExecutor SubmitGroup = (JavascriptExecutor)driver;
		 SubmitGroup.executeScript("arguments[0].click();", Submit);
		 Thread.sleep(3000);
		//driver.findElement(By.className("fs_btn")).click();
		System.out.println("NEEDS ADDED");
		driver.quit();
		
		
  }
}
