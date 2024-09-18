package Administration.LookUps.DropDownManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_11_1_EditBorrowerCommunicationMethods {
  @Test
  public void EditBorrowerCommunicationMethods() throws InterruptedException {
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
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[5]/div/button")).click();
  }
}
