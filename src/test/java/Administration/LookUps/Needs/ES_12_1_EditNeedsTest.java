package Administration.LookUps.Needs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_12_1_EditNeedsTest {
  @Test
  public void EditNeedsTest() throws InterruptedException {
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
		//========Copy NEED GROUP
			driver.findElement(By.id("contentCopyBtn5")).click();
			System.out.println("Need Copied");
			//=======EDIT NEED GROUP
			WebElement Edit = driver.findElement(By.id("editGroupBtn-5"));
			JavascriptExecutor GroupEdit= (JavascriptExecutor)driver;
			GroupEdit.executeScript("arguments[0].click();", Edit);
			 Thread.sleep(2000);
				driver.findElement(By.name("groupName")).sendKeys("Test Need Groups");
				 Thread.sleep(2000);
				WebElement Stage1=driver.findElement(By.name("stage"));
				Stage1.sendKeys(Keys.ARROW_DOWN);
			//	Stage1.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(2000);
				Stage1.sendKeys(Keys.ENTER);
				
				WebElement programTypes = driver.findElement(By.name("programType"));
				programTypes.sendKeys(Keys.ARROW_DOWN);
				programTypes.sendKeys(Keys.ARROW_DOWN);
				
				WebElement Submits = driver.findElement(By.className("fs_btn"));
				 JavascriptExecutor SubmitGroups = (JavascriptExecutor)driver;
				 SubmitGroups.executeScript("arguments[0].click();", Submits);
				 Thread.sleep(3000);
				//driver.findElement(By.className("fs_btn")).click();
				 driver.navigate().refresh();
				 driver.findElement(By.className("back_btn")).click();
				System.out.println("NEEDS EDITED");
				driver.quit();
			
  }
}
