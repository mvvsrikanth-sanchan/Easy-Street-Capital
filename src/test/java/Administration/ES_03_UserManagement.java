package Administration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.inject.Key;

import gherkin.lexer.Th;
import io.reactivex.rxjava3.functions.Action;

public class ES_03_UserManagement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
	
		// adm.click();
		  Thread.sleep(3000);
		   driver.findElement(By.linkText("User Management")).click();
	// USER DETAILS TAB
		   Thread.sleep(3000);
		 driver.findElement(By.className("create_btn")).click();
		 //To display a validation message for all fields 
		 Thread.sleep(5000);
		 JavascriptExecutor scroll= (JavascriptExecutor)driver;
		   scroll.executeScript("window.scrollBy(0,-250)", "");
		// Actions save = new Actions(driver);
		 WebElement SaveUser = driver.findElement(By.id("saveUser"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", SaveUser);
		// save.moveToElement(driver.findElement(By.id("saveUser"))).click();
		 Thread.sleep(5000);
	  //   driver.findElement(By.id("saveUser")).click();
		 System.out.println("Displayed Validations for Create users");
	//	 driver.findElement(By.className("fs_btn"));
		 driver.findElement(By.id("userFirstName")).sendKeys("Sam");
		 driver.findElement(By.id("userLastName")).sendKeys("deo");
		 driver.findElement(By.id("userEmail")).sendKeys("Sam-deo56@yopmail.com");
		 driver.findElement(By.id("userPhone")).sendKeys("(123) 456-7890");
		 driver.findElement(By.id("userState")).sendKeys("Arizona");
		 driver.findElement(By.id("userName")).sendKeys("SamDeo");
		// Thread.sleep(5000);
		 WebElement GenPwd = driver.findElement(By.id("generatePassword"));
		 JavascriptExecutor Password = (JavascriptExecutor)driver;
		 Password.executeScript("arguments[0].click();", GenPwd);
	
		 Thread.sleep(3000);
		 WebDriverWait PipeLineHistory= new WebDriverWait(driver,Duration.ofSeconds(3000));
		 PipeLineHistory.until(ExpectedConditions.elementToBeClickable(By.id("loadHistoryDays"))).sendKeys("10");
		 System.out.println("History entered");
		
		 WebElement CancelUser = driver.findElement(By.id("cancelUser"));
		 JavascriptExecutor Cancel= (JavascriptExecutor)driver;
		 Cancel.executeScript("arguments[0].click();", CancelUser);
	
		 Thread.sleep(5000);
	
	      
	      driver.findElement(By.className("create_btn")).click();
	      driver.findElement(By.id("userFirstName")).sendKeys("Astin");
			 driver.findElement(By.id("userLastName")).sendKeys("Huk");
			 driver.findElement(By.id("userEmail")).sendKeys("Astin-566@yopmail.com");
			 driver.findElement(By.id("userPhone")).sendKeys("(123) 456-7890");
			 driver.findElement(By.id("userState")).sendKeys("Arizona");
			 driver.findElement(By.id("userName")).sendKeys("AstinHuk");
			 Thread.sleep(3000);
			 WebElement GenPwd1 = driver.findElement(By.id("generatePassword"));
			 JavascriptExecutor Password1 = (JavascriptExecutor)driver;
			 Password1.executeScript("arguments[0].click();", GenPwd1);
			 Thread.sleep(3000);
			 WebDriverWait PipeLineHistory1= new WebDriverWait(driver,Duration.ofSeconds(3000));
			 PipeLineHistory1.until(ExpectedConditions.elementToBeClickable(By.id("loadHistoryDays"))).sendKeys("10");
			// driver.findElement(By.id("aboutMeUser")).sendKeys("User creation");
			// driver.findElement(By.id("userEmailSignature")).sendKeys("Easy Street Capital");
	    //  Thread.sleep(5000);
	      
			 WebElement SaveUser1 = driver.findElement(By.id("saveUser"));
			 JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			 executor1.executeScript("arguments[0].click();", SaveUser1);
			 System.out.println(" USER CREATED SUCCESSFULLY");
	
			 
	
     driver.quit();
	}

}
