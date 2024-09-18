package Administration.LookUps.LOSFEES;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_14_EditLOSFEES {
  @Test
  public void EditLOSFEES() throws InterruptedException {
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
		//CLICKING ON  LOS FEE MENU
		 Thread.sleep(3000);
		 driver.findElement(By.id("LOSFeesSubMenu")).click();
		 Thread.sleep(3000);
		 WebElement Edit =driver.findElement(By.id("edit-LosFee-8"));
		 JavascriptExecutor EditLosFee =(JavascriptExecutor)driver;
		 EditLosFee.executeScript("arguments[0].click();", Edit);
		 Thread.sleep(3000);
		WebElement feeName = driver.findElement(By.id("feeName"));
		feeName.sendKeys(Keys.ENTER);
		feeName.clear();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.id("feeName")).sendKeys("Sample fee in Dollars");
		
		System.out.println("Name changed");
		Thread.sleep(3000);
		WebElement feeDollarValue = driver.findElement(By.id("feeDollarValue"));
		feeDollarValue.sendKeys(Keys.ENTER);
		feeDollarValue.clear();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.id("feeDollarValue")).sendKeys("75");
		
		System.out.println("Fee value changed from 85 to 75");
		Thread.sleep(3000);
		 // SUBMITTING LOS FEE DETAILS
		WebElement Submit =driver.findElement(By.id("submitFee"));
		JavascriptExecutor SubmitFee =(JavascriptExecutor)driver;
		SubmitFee.executeScript("arguments[0].click();", Submit);
		 Thread.sleep(3000);
		driver.navigate().refresh();
		
		System.out.println("LOS FEE DETAILS UPDATED");
		
		driver.quit();
		 
  }
}
