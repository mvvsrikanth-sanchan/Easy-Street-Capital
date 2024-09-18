package Administration.LookUps.DropDownManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_05_1_EditAcquisitionType {
  @Test
  public void f() throws InterruptedException {
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
		 driver.findElement(By.xpath("//a[@href='dropdownmanagement']")).click();
		 
		
		 // Adding ACQUISITION TYPE 
		 Thread.sleep(3000);
		 WebDriverWait Accquisition = new WebDriverWait(driver,Duration.ofSeconds(3000));
		 Accquisition.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("AcquisitionType-Lookup")))).click();
		 
		Actions EditLookUp = new Actions(driver);
		EditLookUp.moveToElement(driver.findElement(By.xpath("//*[@id=\"lookupEdit\"]"))).click();
		// WebDriverWait EditLookUp = new WebDriverWait(driver, Duration.ofSeconds(3000));
		// EditLookUp.until(ExpectedConditions.visibilityOfElementLocated(By.id("test1")));
		
		 driver.findElement(By.id("lookupEdit")).click();
		 //Close pop up 
		 driver.findElement(By.id("closeModal")).click();
		 
		 
		 driver.findElement(By.id("updateItem")).click();
		 
  }
}
