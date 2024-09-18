package Administration;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_07_TermsheetPrifills {
  @Test
  public void TermsheetPrifills() throws InterruptedException {
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
		  driver.findElement(By.linkText("Underwriting Term Sheet Prefills")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.cssSelector(".create_btn")).click();
		  Thread.sleep(2000);
          driver.findElement(By.name("programtype")).sendKeys("EASY BUILD");
          Thread.sleep(3000);
         WebElement state= driver.findElement(By.id("prefillStates"));
          state.click();
           Thread.sleep(2000);
          state.sendKeys("Alaska");
      
       
       state.sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000);
        state.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
         WebElement points=driver.findElement(By.name("points"));
         points.click();
         points.sendKeys("10"); 
         driver.findElement(By.name("maxLTV")).sendKeys("16");
         driver.findElement(By.name("maxLTC")).sendKeys("15");
         driver.findElement(By.name("interestRate")).sendKeys("10.5");
         driver.findElement(By.name("loanTerm")).sendKeys("10");
         driver.findElement(By.name("insurancePercent")).sendKeys("50");
         driver.findElement(By.name("docFee")).sendKeys("15000");
         driver.findElement(By.name("title")).sendKeys("20000");
         driver.findElement(By.name("escrow")).sendKeys("28000");
         driver.findElement(By.name("originationFee")).sendKeys("20000");
       //  driver.findElement(By.name("propertyInsurance")).sendKeys("33000");
         driver.findElement(By.name("drawFee")).sendKeys("3000");
         driver.findElement(By.name("cashReservesRequired")).sendKeys("345000");
         driver.findElement(By.name("floodInsuranceRequired")).sendKeys("NO");
         driver.findElement(By.name("yearBuiltBefore1940")).sendKeys("1956");
         Thread.sleep(3000);
         
		   
  }
}
