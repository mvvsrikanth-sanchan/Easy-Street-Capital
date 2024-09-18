package Administration.LookUps.LOSFEES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.jdiai.tools.switcher.Actions;

import io.reactivex.rxjava3.functions.Action;

public class ES_13_LOSFEES {
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
		//CLICKING ON  LOS FEE MENU
		 Thread.sleep(3000);
		 driver.findElement(By.id("LOSFeesSubMenu")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("createLosFee")).click();
		 Thread.sleep(3000);
		 WebDriverWait NavigateBack = new WebDriverWait(driver, Duration.ofSeconds(3000));
		 NavigateBack.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("navigateCreateFeeBack"))));
		 System.out.println("Back button clicked");
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Administration")).click();
		 driver.findElement(By.linkText("Lookups")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("LOSFeesSubMenu")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("createLosFee")).click();
		 Thread.sleep(3000);
		 //ENTER FEES NAME
		 driver.findElement(By.id("feeName")).sendKeys("Sample Collection fees");
		 Thread.sleep(3000);
		 //FEE PERCENTAGE TOGGLE ON/OFF
		 WebElement feePercent = driver.findElement(By.id("feePercent"));
		 JavascriptExecutor Percent = (JavascriptExecutor)driver;
		 Percent.executeScript("arguments[0].click();", feePercent);
		 System.out.println("Fee Percent Toggle working");
		 Thread.sleep(5000);
		//FEE DOLLAR TOGGLE ON/OFF
		 WebElement feeDollar = driver.findElement(By.id("feeDollar"));
		 JavascriptExecutor Dollar = (JavascriptExecutor)driver;
		 Dollar.executeScript("arguments[0].click();", feeDollar);
		 System.out.println("Fee Dollar Toggle working");
		//ENTER DOLLAR VALUE
		 Thread.sleep(3000);
		 // DOLLAR VALUE
		 driver.findElement(By.id("feeDollarValue")).sendKeys("85");
		 //EFFECTIVE DATE
		 driver.findElement(By.id("feeEffectiveDate")).sendKeys("20/07/2024");
		 //FEE PAID BY
		WebElement FeePaidBy =  driver.findElement(By.id("feePaidBy"));
		FeePaidBy.sendKeys(Keys.ARROW_DOWN);
		FeePaidBy.sendKeys(Keys.ENTER);
		// DESCRIPTION
		driver.findElement(By.id("description")).sendKeys("Sample data");
		//FEE TYPE
		WebElement FeeType = driver.findElement(By.id("feeType"));
		FeeType.sendKeys(Keys.ARROW_DOWN);
		FeeType.sendKeys(Keys.ARROW_DOWN);
		//FeeType.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 // SUBMITTING LOS FEE DETAILS
		 WebElement submitFee=  driver.findElement(By.id("submitFee"));
		 JavascriptExecutor submitFees = (JavascriptExecutor)driver;
		 submitFees.executeScript("arguments[0].click();", submitFee);
		 
		 Thread.sleep(3000);
		driver.navigate().refresh();
		
		System.out.println("LOS FEE CREATED");
		
		driver.quit();
		
  }
}
