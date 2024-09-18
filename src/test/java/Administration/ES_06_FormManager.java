package Administration;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import gherkin.lexer.Ja;
import gherkin.lexer.Th;

public class ES_06_FormManager {
  

@Test
  public void FormManager() throws InterruptedException {
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
		  //Opening Administration
		 driver.findElement(By.linkText("Administration")).click();
		 //Opening Form Manager
		 driver.findElement(By.linkText("Form Manager")).click();
		driver.findElement(By.className("create_btn")).click();
		Thread.sleep(5000);
		WebElement TemplateName = driver.findElement(By.id("formTemplateName"));
		JavascriptExecutor formTemplateName = (JavascriptExecutor)driver;
		formTemplateName.executeScript("arguments[0].click();", TemplateName);
		TemplateName.sendKeys("PDF-1 DOC-TEST");
		Thread.sleep(3000);
		 driver.findElement(By.id("formTemplateTag")).sendKeys("PDF-TEST");
		 Thread.sleep(3000);
		 WebElement signature = driver.findElement(By.id("formTemplateSignature"));
		 signature.sendKeys(Keys.ARROW_DOWN);
		// signature.click();
		 //signature.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 WebElement formTemplateValues = driver.findElement(By.id("formTemplateValues"));
		 formTemplateValues.sendKeys(Keys.ARROW_DOWN);
		// formTemplateValues.click();
		 Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,500)", "");
	  WebElement submitForm =  driver.findElement(By.id("submitFormTemplate"));
	  JavascriptExecutor submit =(JavascriptExecutor)driver;
	  submit.executeScript("arguments[0].click();", submitForm);
	  
	//  submitForm.click();
		 Thread.sleep(3000);
		 System.out.println("FORMS MANAGER CREATED");
		 
		 
		
		 
		 
;		 
		 
		 
		 
  }
}
