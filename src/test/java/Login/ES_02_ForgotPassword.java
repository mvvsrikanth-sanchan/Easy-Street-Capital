package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_02_ForgotPassword {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		  
		  
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  System.out.println("URL opened ");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  
		  driver.findElement(By.id("teamMemberButton")).click();
		  
		  driver.findElement(By.id("forgotLogin")).click();
		  System.out.println("Email Id validation message displayed ");
		  WebElement username= driver.findElement(By.id("username"));
			
			username.sendKeys("mvvsrikanth@sanchaninfo.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("forgotLogin")).click();
			Thread.sleep(5000);
			
			System.out.println("Passwrod sent message displayed ");
		//	driver.navigate().refresh();
			driver.quit();
  }
}
