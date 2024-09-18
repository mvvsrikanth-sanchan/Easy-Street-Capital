package Administration;

import java.time.Duration;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ES_04_formPackages {

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
		//  WebElement adm= driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/a/span"));
		// adm.click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("FormPackagesSubMenu")).click();
		  driver.findElement(By.className("border_btn")).click();
		  //Validation for empty fields
		  WebElement save= driver.findElement(By.id("saveNewFormPackage"));
			 JavascriptExecutor FormPackage = (JavascriptExecutor)driver;
			 FormPackage.executeScript("arguments[0].click();", save);
		  
		 // Actions SaveFormPage = new Actions(driver);
		//  SaveFormPage.moveToElement(driver.findElement(By.linkText("Save New Package"))).click().perform();
		// WebElement button = driver.findElement(By.id("saveNewFormPackage"));
		 Actions SaveFormPage = new Actions(driver);
		// SaveFormPage.moveToElement(driver.findElement(By.className("fs_btn"))).click().build().perform();
		//  System.out.println("Validation for empty fields displayed");
		  driver.findElement(By.id("navigateFormPackageBack")).click();
		  System.out.println("Back button clicked "); 
		  driver.findElement(By.className("border_btn")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("packagename")).sendKeys("Google Package");
		  driver.findElement(By.name("state")).sendKeys("Arizona");
		  driver.findElement(By.name("loantype")).sendKeys("Refinance");
		  driver.findElement(By.name("propertyType")).sendKeys("Townhome");
		  driver.findElement(By.name("specificborrower")).sendKeys("None");
		  driver.findElement(By.name("statestandaloneguaranty")).sendKeys("Yes");
		  driver.findElement(By.name("statepromissorynote")).sendKeys("No");
		  driver.findElement(By.name("statespousalconsent")).sendKeys("Yes");
		  driver.findElement(By.name("loanfund")).sendKeys("Yes");
		  driver.findElement(By.name("interestreserves")).sendKeys("Yes");
		 WebElement ClosingInstructions= driver.findElement(By.id("react-select-3-input"));
		 ClosingInstructions.sendKeys("Closing Instructions");
		 ClosingInstructions.sendKeys(Keys.ARROW_DOWN);
		 ClosingInstructions.sendKeys(Keys.ENTER);
		 
		  
		  Thread.sleep(5000);
		 WebElement saves= driver.findElement(By.id("saveNewFormPackage"));
		 JavascriptExecutor FormPackages = (JavascriptExecutor)driver;
		 FormPackages.executeScript("arguments[0].click();", saves);
		 System.out.println("Form Pakage Created");
		 Thread.sleep(5000);
		driver.close();
		
		 
		
		  
		  
		  
		  
		
		  
		  
		  
	}

}
