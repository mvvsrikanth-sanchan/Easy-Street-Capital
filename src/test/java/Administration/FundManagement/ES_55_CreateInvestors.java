package Administration.FundManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class ES_55_CreateInvestors extends BaseTest {
  @Test
  public void CreateInvestor() throws InterruptedException {
	     
	  driver.findElement(By.id(loc.getProperty("teammember_button"))).click();

		// Enter User Name
		driver.findElement(By.id(loc.getProperty("emailid"))).sendKeys("mvvsrikanth@sanchaninfo.com");

		// Enter password Name

		driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys("Sanchan@123");

		driver.findElement(By.id(loc.getProperty("Login_button"))).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText(creFund.getProperty("Administration"))).click();
		Thread.sleep(3000);
		/*
		 * FUND MANAGEMENT
		 */
		driver.findElement(By.linkText(creFund.getProperty("Fund/InvestorManagement"))).click();
		Thread.sleep(3000);
		 //Click on  Investor
		 driver.findElement(By.id(Investor.getProperty("Investors"))).click();
		 Thread.sleep(3000);
		 //Create Investor
		 WebElement CreateInvestor =  driver.findElement(By.id(Investor.getProperty("Create")));
		 JavascriptExecutor Create = (JavascriptExecutor)driver;
		 Create.executeScript("arguments[0].click();", CreateInvestor);
		 Thread.sleep(1000);
		 WebElement CreateInvestors =  driver.findElement(By.id(Investor.getProperty("Create")));
		 JavascriptExecutor Creates = (JavascriptExecutor)driver;
		 Creates.executeScript("arguments[0].click();", CreateInvestors);
		 Thread.sleep(1000);
		 JavascriptExecutor Scrolldown = (JavascriptExecutor)driver;
		 Scrolldown.executeScript("window.scrollTo(0,300);"); 
		 Thread.sleep(1000);
		 JavascriptExecutor ScrollUp = (JavascriptExecutor)driver;
		 ScrollUp.executeScript("window.scrollTo(0,-300);"); 
		 //INVESTOR INFO 
		 WebElement FirstName =  driver.findElement(By.id(Investor.getProperty("FirstName")));
		 FirstName.sendKeys("Alex");
		 Thread.sleep(1000);
		 WebElement LastName =  driver.findElement(By.id(Investor.getProperty("LastName")));
		 LastName.sendKeys("Whales");
		 Thread.sleep(1000);
		 WebElement Email =  driver.findElement(By.id(Investor.getProperty("Email")));
		 Email.sendKeys("Whales");
		 Thread.sleep(3000);
		 WebElement FundName = driver.findElement(By.id(Investor.getProperty("FundName")));
		 JavascriptExecutor FundDropdown = (JavascriptExecutor)driver;
		 FundDropdown.executeScript("arguments[0].click();", FundName);
		 FundName.sendKeys("select");
		 Thread.sleep(3000);	 
		 WebElement Phone =  driver.findElement(By.id(Investor.getProperty("Phone")));
		 Phone.sendKeys("8656465600");
		 Thread.sleep(1000);
		 WebElement Address =  driver.findElement(By.id(Investor.getProperty("Address")));
		 Address.sendKeys("2443 Sierra Nevada Road, Mammoth Lakes");
		 Thread.sleep(1000);
		 WebElement City =  driver.findElement(By.id(Investor.getProperty("City")));
		 City.sendKeys("CA");
		 Thread.sleep(3000);
		 WebElement State = driver.findElement(By.id(Investor.getProperty("State")));
		 JavascriptExecutor PropertyState = (JavascriptExecutor)driver;
		 PropertyState.executeScript("arguments[0].click();", State);
		 State.sendKeys("California");
		 State.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 WebElement ZipCode =  driver.findElement(By.id(Investor.getProperty("Zipcode")));
		 ZipCode.sendKeys("93546");
		 Thread.sleep(1000);
		 WebElement ReturnRate =  driver.findElement(By.id(Investor.getProperty("ReturnRate")));
		 ReturnRate.sendKeys("2");
		 Thread.sleep(1000);
		 WebElement ReturnType =  driver.findElement(By.id(Investor.getProperty("ReturnType")));
		 ReturnType.sendKeys("Income");
		 Thread.sleep(1000);
		 WebElement FundPreferedToggle = driver.findElement(By.id(Investor.getProperty("MonthlyFundToggle")));
		 JavascriptExecutor FundPrefered = (JavascriptExecutor)driver;
		 FundPrefered.executeScript("arguments[0].click();", FundPreferedToggle);
		 Thread.sleep(3000);
		 WebElement FundPreferedToggles = driver.findElement(By.id(Investor.getProperty("MonthlyFundToggle")));
		 JavascriptExecutor FundPrefere = (JavascriptExecutor)driver;
		 FundPrefere.executeScript("arguments[0].click();", FundPreferedToggles);
		 Thread.sleep(3000);
		 WebElement ActiveToggles = driver.findElement(By.id(Investor.getProperty("ActiveToggle")));
		 JavascriptExecutor active = (JavascriptExecutor)driver;
		 active.executeScript("arguments[0].click();", ActiveToggles);
		// WebElement Active = driver.findElement(By.id(Investor.getProperty("ActiveToggle")));
		// JavascriptExecutor ActiveToggle = (JavascriptExecutor)driver;
		// ActiveToggle.executeScript("arguments[0].click();", Active);
		 Thread.sleep(3000);
		
		 Thread.sleep(3000);
		// Investor Bank Information
		 WebElement BankAccount =  driver.findElement(By.id(Investor.getProperty("BankAccount")));
		 BankAccount.sendKeys("Saving"); 
		 Thread.sleep(1000);
		 WebElement BankRouting =  driver.findElement(By.id(Investor.getProperty("BankRouting")));
		 BankRouting.sendKeys("1234567890123456"); 
		 Thread.sleep(1000);
		 WebElement AccountNumber =  driver.findElement(By.name(Investor.getProperty("AccountNumber")));
		 AccountNumber.sendKeys("7416359564189620"); 
		 Thread.sleep(1000);
		 WebElement AccountType =  driver.findElement(By.name(Investor.getProperty("AccountType")));
		 AccountType.sendKeys(" Saving "); 
		 AccountType.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 WebElement CreateButton =  driver.findElement(By.id(Investor.getProperty("Create")));
		 JavascriptExecutor Create_Buttton= (JavascriptExecutor)driver;
		 Create_Buttton.executeScript("arguments[0].click();", CreateButton);
		 Thread.sleep(1000);
		 Email.click();
		 Email.clear();
		 Thread.sleep(1000);
		 Email.sendKeys("89090@yopmail.com");
		 Thread.sleep(3000);
		 FundName.sendKeys("Easy Street Capital LLC");
		 Thread.sleep(3000);
		 WebElement Create_Button =  driver.findElement(By.id(Investor.getProperty("Create")));
		 JavascriptExecutor Created= (JavascriptExecutor)driver;
		 Created.executeScript("arguments[0].click();", Create_Button);
		 Thread.sleep(3000);
		 WebElement ClosePopup =  driver.findElement(By.id(Investor.getProperty("CloseButton")));
		 JavascriptExecutor Popup= (JavascriptExecutor)driver;
		 Popup.executeScript("arguments[0].click();", ClosePopup);
		 
  }
}
