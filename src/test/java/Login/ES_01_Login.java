package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_01_Login {
  @Test
  public void Login() throws InterruptedException {
	// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
			 System.out.println("browser opened");
			  ChromeDriver driver = new ChromeDriver();
			  
			  
			  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
			  System.out.println("URL opened ");
			  driver.manage().window().maximize();
			  Thread.sleep(5000);
			  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
			  
			  driver.findElement(By.id("teamMemberButton")).click();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			  WebElement login=driver.findElement(By.id("loginButton"));
	          login.click();
	          System.out.println("Validations for user name and password displayed");
	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	         // Enter User Name
			WebElement username= driver.findElement(By.id("username"));
			
			username.sendKeys("mvvsrikanth@sanchaninfo.com");
			 login.click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 System.out.println("Validations for Password displayed");
			// Enter password Name
			 username.clear();
			WebElement password =  driver.findElement(By.id("loginPassword"));
		   
			password.sendKeys("Sanchan@123");
			 login.click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 System.out.println("Validations for username  displayed");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 username.sendKeys("mvvsrikanth@sanchaninfo.com");
			 password.sendKeys("Sanchan@123");
			
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    login.click();
			System.out.println("Logged in successfully");
			driver.quit();
			
			  
	}

  }

