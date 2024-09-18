package PipeLine.Search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_22_MostRecentLoans {
  @Test
  public void MostRecentLoans() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		  
		  
		 // driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		 // System.out.println("URL opened ");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  
		  driver.findElement(By.id("teamMemberButton")).click();
		  

// Enter User Name
		driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com");
		
		// Enter password Name
		 
		 driver.findElement(By.id("loginPassword")).sendKeys("Sanchan@123");
		
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(2000);
	   WebElement RecentLoans = driver.findElement(By.id("mostRecentLoans"));
	   RecentLoans.click();
	   for (int i=1;i<3;i++) {
	   RecentLoans.sendKeys(Keys.ARROW_DOWN);}
	   Thread.sleep(3000);
	   driver.findElement(By.className("material-icons icon")).click();
	   
  }
}
