package Administration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_15_EditFormManager {
  @Test
  public void EditFormManager() throws InterruptedException {
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
		 Thread.sleep(5000);
		 WebElement editFormTemplate = driver.findElement(By.id("editFormTemplate-3"));
		 JavascriptExecutor Edit = (JavascriptExecutor)driver;
		 Edit.executeScript("arguments[0].click();", editFormTemplate);
		 Thread.sleep(3000);
		 WebElement formTemplateValues = driver.findElement(By.id("formTemplateValues"));
		 formTemplateValues.sendKeys(Keys.ARROW_DOWN);
		 formTemplateValues.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(3000);
			JavascriptExecutor scroll = (JavascriptExecutor)driver;
			scroll.executeScript("window.scrollBy(0,500)", "");
		  WebElement submitForm =  driver.findElement(By.id("submitFormTemplate"));
		  JavascriptExecutor submit =(JavascriptExecutor)driver;
		  submit.executeScript("arguments[0].click();", submitForm);
		  
		//  submitForm.click();
			 Thread.sleep(3000);
			 System.out.println("FORMS MANAGER EDITED");
  }
}
		 

