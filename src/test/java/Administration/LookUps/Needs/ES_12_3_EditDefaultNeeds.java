package Administration.LookUps.Needs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_12_3_EditDefaultNeeds {
  @Test
  public void EditDefaultNeeds() throws InterruptedException {
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
		 // =================Add Check List
		 Thread.sleep(2000);
		 driver.findElement(By.id("checkListBtn-6")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("addCheckList")).click();
		 System.out.println("Checklisted Validation Displayed");
		 driver.findElement(By.id("lineItemName")).sendKeys("Sample Checklist");
		 driver.findElement(By.id("addCheckList")).click();
		 Thread.sleep(3000);
		 System.out.println("Checklisted Added");
		 driver.navigate().refresh();
		 driver.findElement(By.id("checkListBtn-6")).click();
		 driver.findElement(By.id("deleteCheckList")).click();
		 driver.navigate().refresh();
	//===============EDIT DEFAULT NEEDS
		 Thread.sleep(3000);
		 driver.findElement(By.id("editListBtn-6")).click();
		 driver.findElement(By.name("dueDateOffset")).sendKeys("2");
		 WebElement Submits = driver.findElement(By.className("fs_btn"));
		 JavascriptExecutor SubmitGroups = (JavascriptExecutor)driver;
		 SubmitGroups.executeScript("arguments[0].click();", Submits);
		 System.out.println("Need Defaults Updated ");
	//===============DELETE DEFAULTS 
		 driver.findElement(By.id("deleteListBtn-7")).click();
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 System.out.println("Deleted created Defaults Need ");
		 driver.quit();
		 
		 
		 
		 
  }
}
