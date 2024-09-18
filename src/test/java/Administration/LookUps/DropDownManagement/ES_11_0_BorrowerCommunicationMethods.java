package Administration.LookUps.DropDownManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_11_0_BorrowerCommunicationMethods {
  @Test
  public void BorrowerCommunicationMethods() throws InterruptedException {
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
		 
		 //BorrowerCommunicationMethods
		 Thread.sleep(3000);
		 WebElement Borrower = driver.findElement(By.id("BorrowerCommunicationMethods-Lookup"));
		 JavascriptExecutor BorrowerCommunicationMethods = (JavascriptExecutor)driver;
		 BorrowerCommunicationMethods.executeScript("arguments[0].click();", Borrower);
		// Borrower.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("BorrowerCommunicationMethods-Lookup")))).click();
		 Thread.sleep(3000);
		 WebElement  AddItem= driver.findElement(By.id("addItemBtn2"));
		   JavascriptExecutor Add = (JavascriptExecutor)driver;
		   Add.executeScript("arguments[0].click();", AddItem);
			 // Actions AddItem= new Actions(driver);
			// AddItem.moveToElement(driver.findElement(By.id("addItem"))).click().perform();
		   Thread.sleep(3000);
			//Add Item Pop up close
			 driver.findElement(By.id("closeModal")).click();
			 System.out.println("pop up closed successfully");
			 Thread.sleep(3000);
			 WebElement  AddItem1= driver.findElement(By.id("addItemBtn2"));
			   JavascriptExecutor Add1 = (JavascriptExecutor)driver;
			   Add1.executeScript("arguments[0].click();", AddItem1);
			   Thread.sleep(3000);
			 driver.findElement(By.id("itemName")).sendKeys("Easy Street TEST");
			 Thread.sleep(3000);
			// ADDING ITEM 
			/*driver.findElement(By.id("addItemName")).click();
			 System.out.println("Item Added ");
			 Thread.sleep(3000);
			 driver.findElement(By.linkText("OK")).click();*/
			 System.out.println("Borrower Communication Methods Added successfully"); 
			driver.quit();
			 
  }
}
