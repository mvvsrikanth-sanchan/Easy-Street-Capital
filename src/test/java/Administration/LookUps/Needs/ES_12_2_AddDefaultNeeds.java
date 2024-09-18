package Administration.LookUps.Needs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_12_2_AddDefaultNeeds {
  @Test
  public void AddDefaultNeeds() throws InterruptedException {
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
		 WebElement AddDefaults = driver.findElement(By.id("addDefaultNeedBtn"));
		 JavascriptExecutor Defaults = (JavascriptExecutor)driver;
		 Defaults.executeScript("arguments[0].click();", AddDefaults);

			WebElement Submits = driver.findElement(By.className("fs_btn"));
			 JavascriptExecutor SubmitGroups = (JavascriptExecutor)driver;
			 SubmitGroups.executeScript("arguments[0].click();", Submits);
			 Thread.sleep(3000);
		driver.findElement(By.className("back_btn")).click();
		Thread.sleep(3000);
		WebElement AddDefaults1 = driver.findElement(By.id("addDefaultNeedBtn"));
		 JavascriptExecutor Defaults1 = (JavascriptExecutor)driver;
		 Defaults1.executeScript("arguments[0].click();", AddDefaults1);
		 Thread.sleep(3000);
		  driver.findElement(By.id("react-select-2-placeholder")).click();
		 driver.findElement(By.name("documentTag")).sendKeys("Test Group 2");
		 driver.findElement(By.name("needDescription")).sendKeys("Description");
		 driver.findElement(By.name("internalDescription")).sendKeys("internalDescription");
		 WebElement needType=driver.findElement(By.name("needType"));
		 needType.sendKeys(Keys.ARROW_DOWN);
		 needType.sendKeys(Keys.ENTER);
		 driver.findElement(By.name("needOrder")).sendKeys("needOrder");
		 driver.findElement(By.name("dueDateOffset")).sendKeys("0");
		 WebElement Submits1 = driver.findElement(By.className("fs_btn"));
		 JavascriptExecutor SubmitGroups1 = (JavascriptExecutor)driver;
		 SubmitGroups1.executeScript("arguments[0].click();", Submits1);
		 
		 
  }
}
