package Administration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import gherkin.lexer.Ja;

public class ES_10_EditFormPackages {
  @Test
  public void EditFormsManager() throws InterruptedException {
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
		//  WebElement adm= driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/a/span"));
		// adm.click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("FormPackagesSubMenu")).click();
		  Thread.sleep(3000);
		  WebElement Edit = driver.findElement(By.id("editFormPackage-4"));
			 JavascriptExecutor EditForms = (JavascriptExecutor)driver;
				 EditForms.executeScript("arguments[0].click();", Edit);
		//  driver.findElement(By.id("editFormPackage-3")).click();
		
		  driver.findElement(By.id("navigateFormPackageBack")).click();
		  System.out.println("Back button working");
		  Thread.sleep(5000);
		//  Actions actions  = new Actions(driver);
		//  actions.moveToElement(driver.findElement(By.id("editFormPackage-4"))).click();
		 WebElement Edit1 = driver.findElement(By.id("editFormPackage-4"));
	 JavascriptExecutor EditForms1 = (JavascriptExecutor)driver;
		 EditForms.executeScript("arguments[0].click();", Edit1);
		 
		  driver.findElement(By.id("formPackage-statepromissorynote")).sendKeys("NO");
		  Thread.sleep(3000);
		  WebElement updateFormPackage = driver.findElement(By.id("updateFormPackage"));
		  JavascriptExecutor FormPackage = (JavascriptExecutor)driver;
		  FormPackage.executeScript("arguments[0].click();", updateFormPackage);
	//	  driver.findElement(By.id("updateFormPackage")).click();
		  System.out.println("Updated package");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"viewFormPackage-0\"]/span/text()")).click();
		  
		  driver.findElement(By.id("editFormPackage-1")).click();
		  driver.findElement(By.id("deleteFormPackage")).click();
		  System.out.println("Package Deleted");
		  
		  
	  
  }
}
