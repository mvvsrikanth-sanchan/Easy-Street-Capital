package PipeLine.LoanDetails.ClosingAndFunding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_44_WireInstructions {
  @Test
  public void WireInstructions() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  System.out.println("URL opened ");
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
WebElement LoanId = driver.findElement(By.cssSelector("#row-0 > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));

Actions LoanIdSelect = new Actions(driver);
LoanIdSelect.moveToElement(LoanId).perform();
WebElement DealNavigation = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/ul/li[2]/a"));
JavascriptExecutor Deal= (JavascriptExecutor)driver;
Deal.executeScript("arguments[0].click();", DealNavigation);
Thread.sleep(3000);
//CLICKING ON CLOSING AND FUNDING  MENU
WebElement ClosingAndFundingNavigation = driver.findElement(By.id("closingFundingMenu"));
JavascriptExecutor ClosingAndFunding= (JavascriptExecutor)driver;
ClosingAndFunding.executeScript("arguments[0].click();", ClosingAndFundingNavigation);
Thread.sleep(2000);
//WIRE INSTRUCTIONS
WebElement WireInstructions = driver.findElement(By.id("closingFunding-WireInstructions"));
JavascriptExecutor Wire_Instructions= (JavascriptExecutor)driver;
Wire_Instructions.executeScript("arguments[0].click();", WireInstructions);
Thread.sleep(3000);
driver.findElement(By.id("bankname")).sendKeys("Bank Of Amrica");
driver.findElement(By.id("bankaddress")).sendKeys("California");
driver.findElement(By.id("bankcity")).sendKeys("California");	
Thread.sleep(3000);

WebDriverWait BankState = new WebDriverWait(driver,Duration.ofSeconds(30));
BankState.until(ExpectedConditions.elementToBeClickable(By.id("bankstate")));
WebElement selectState= driver.findElement(By.id("bankstate"));
selectState.sendKeys("California");
Thread.sleep(2000);
selectState.sendKeys(Keys.ARROW_DOWN);
selectState.sendKeys(Keys.ENTER);

Thread.sleep(3000);
driver.findElement(By.id("bankzipcode")).sendKeys("600854");
driver.findElement(By.id("bankaccountname")).sendKeys("Mr.Andrew");
driver.findElement(By.id("bankcity")).sendKeys("California");	
driver.findElement(By.name("bankaccountnumber")).sendKeys("71086643758945400");

driver.findElement(By.id("routingnumber")).sendKeys("548961275630");
Thread.sleep(3000);
WebElement Estimatedfundingdate = driver.findElement(By.id("estimatedfundingdate"));
JavascriptExecutor estimatedfundingdate= (JavascriptExecutor)driver;
estimatedfundingdate.executeScript("arguments[0].click();", Estimatedfundingdate);
Estimatedfundingdate.sendKeys("01-09-2024");
Thread.sleep(3000);
WebElement Actualwire_funddate = driver.findElement(By.id("actualwire_funddate"));
JavascriptExecutor actualwire_funddate= (JavascriptExecutor)driver;
actualwire_funddate.executeScript("arguments[0].click();", Actualwire_funddate);
Actualwire_funddate.sendKeys("10-10-2024");
Thread.sleep(3000);
WebElement SaveWireInstructions = driver.findElement(By.id("saveWireInstructions"));
JavascriptExecutor saveWireInstructions= (JavascriptExecutor)driver;
saveWireInstructions.executeScript("arguments[0].click();", SaveWireInstructions);
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(3000);
driver.quit();
  }
}
