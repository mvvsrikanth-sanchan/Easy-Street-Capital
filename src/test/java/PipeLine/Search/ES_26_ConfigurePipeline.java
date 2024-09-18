package PipeLine.Search;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_26_ConfigurePipeline {
  @Test
  public void ConfigurePipeline() throws InterruptedException { 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
	 System.out.println("browser opened");
	  ChromeDriver driver = new ChromeDriver();
	 
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
	  
	  driver.findElement(By.id("teamMemberButton")).click();
	  

//Enter User Name
	driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com");
	
	// Enter password Name
	 
	 driver.findElement(By.id("loginPassword")).sendKeys("Sanchan@123");
	
   driver.findElement(By.id("loginButton")).click();
   Thread.sleep(5000);
   WebElement ConfigurePipeline = driver.findElement(By.id("configurePipeline"));
   JavascriptExecutor Configure = (JavascriptExecutor)driver;
   Configure.executeAsyncScript("arguments[0].click();", ConfigurePipeline);
   
   /*WebElement CloseButton = driver.findElement(By.className("btn close_btn"));
   JavascriptExecutor Close = (JavascriptExecutor)driver;
   Close.executeAsyncScript("arguments[0].click();", CloseButton);
   Thread.sleep(5000);
   WebElement ConfigurePipelines = driver.findElement(By.id("configurePipeline"));
   JavascriptExecutor Configures = (JavascriptExecutor)driver;
   Configures.executeAsyncScript("arguments[0].click();", ConfigurePipelines);*/
   Thread.sleep(5000);
   driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div[2]/div/div[1]/div[1]/label/span"));
   
   
 
   

   
   
   
  }
}
