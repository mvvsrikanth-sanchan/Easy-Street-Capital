package Administration.LookUps.ProgramType;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ES_12_ProgramType {
  @Test
  public void Add_Program() throws InterruptedException {
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
		 //ProgramTypesSubMenu
		 Thread.sleep(3000);
		 driver.findElement(By.id("ProgramTypesSubMenu")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("programType")).sendKeys("EASY FIX");
		 
		WebElement Add = driver.findElement(By.id("programTypeAdd"));
		JavascriptExecutor ProgramType = (JavascriptExecutor)driver;
		ProgramType.executeScript("arguments[0].click();", Add);
		
		 System.out.println("Pragram type already exists validation displayed");
		 
		 
		 driver.navigate().refresh();
	
		 Thread.sleep(3000);
		 //Back button
		 driver.findElement(By.id("programTypeBack")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Administration")).click();
		 driver.findElement(By.linkText("Lookups")).click();
		 driver.findElement(By.id("ProgramTypesSubMenu")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("programType")).sendKeys("EASY FIX 3.0");
		 WebElement Add1 = driver.findElement(By.id("programTypeAdd"));
		 JavascriptExecutor ProgramTypes = (JavascriptExecutor)driver;
		 ProgramTypes.executeScript("arguments[0].click();", Add1);
		 System.out.println("Program type Added Successfully");
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 
		//====================EDIT PROGRAM TYPE
		 Thread.sleep(5000);
		 WebElement Edit= driver.findElement(By.id("editProgramType-3"));
		 JavascriptExecutor EditProgramType = (JavascriptExecutor)driver;
		 EditProgramType.executeScript("arguments[0].click();", Edit);
		 System.out.println("Pragram type Edit Mode Changed Successfully");
		 
		 WebElement EditProgram = driver.findElement(By.id("programType"));
		 EditProgram.clear();
		 Thread.sleep(1000);
		 //EditProgram.sendKeys(Keys.ENTER);
		 EditProgram.sendKeys("EASY FIX 7");
		 Thread.sleep(5000);
		 WebElement Update= driver.findElement(By.id("programTypeUpdate"));
		 JavascriptExecutor ProgramTypeUpdate = (JavascriptExecutor)driver;
		 ProgramTypeUpdate .executeScript("arguments[0].click();", Update);
		 System.out.println("Pragram type Updated Successfully");
		 Thread.sleep(3000);
		// driver.findElement(By.id("programTypeUpdate")).click();
		//System.out.println("Pragram type already exists validation displayed");
		driver.navigate().refresh();
		 
		 //=============DELETE PROGRAM TYPE
		Thread.sleep(3000);
		WebElement Delete= driver.findElement(By.id("deleteProgramType-3"));
		 JavascriptExecutor DeleteProgramType = (JavascriptExecutor)driver;
		 DeleteProgramType.executeScript("arguments[0].click();", Delete);
		 Thread.sleep(3000);
		 driver.findElement(By.id("delete-program-no")).click();
		// Alert alert = driver.switchTo().alert();
		// alert.getText();
		// alert.dismiss();
		// driver.findElement(By.linkText("No"));
		 System.out.println("Alert dismissed");
		 Thread.sleep(3000);
			WebElement Delete1= driver.findElement(By.id("deleteProgramType-3"));
			 JavascriptExecutor DeleteProgramTypes = (JavascriptExecutor)driver;
			 DeleteProgramTypes.executeScript("arguments[0].click();", Delete1);
			 Thread.sleep(3000);
			 driver.findElement(By.id("delete-program-yes")).click();
			// Alert alert1 = driver.switchTo().alert();
			// alert1.getText();
			// alert1.accept();
			 Thread.sleep(3000);
			 System.out.println("Alert Accepted");
			 Thread.sleep(3000);
			 driver.findElement(By.linkText("OK"));
		 driver.navigate().refresh();
		 System.out.println("PROGRAM TYPE ADD/EDIT/DELETE WORKING FINE");
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
			
		 
		 
		 
  }
}
