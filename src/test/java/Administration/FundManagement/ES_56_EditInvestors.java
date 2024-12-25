package Administration.FundManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v104.audits.model.HeavyAdResolutionStatus;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class ES_56_EditInvestors extends BaseTest {
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
		 //Search By Investor name
		 WebElement SearchByName =  driver.findElement(By.id(Investor.getProperty("SearchInvestor")));
		 JavascriptExecutor Search = (JavascriptExecutor)driver;
		 Search.executeScript("arguments[0].click();", SearchByName);
		 SearchByName.sendKeys("WhalesWhales89090@yopmail.com");
		 Thread.sleep(1000);
		 WebElement SearchIcon =  driver.findElement(By.id(Investor.getProperty("searchIcon")));
		 JavascriptExecutor searching = (JavascriptExecutor)driver;
		 searching.executeScript("arguments[0].click();", SearchIcon);
		 Thread.sleep(1000);
		 WebElement EditInvestors =  driver.findElement(By.id(Investor.getProperty("Edit")));
		 JavascriptExecutor Edit = (JavascriptExecutor)driver;
		 Edit.executeScript("arguments[0].click();", EditInvestors);
		 Thread.sleep(3000);
		 
		 //EDIT INFO 
		 WebElement FirstName =  driver.findElement(By.id(Investor.getProperty("FirstName")));
		 Thread.sleep(1000);
		 FirstName.click();
		 FirstName.clear();
		 FirstName.sendKeys("s");
		 Thread.sleep(1000);
		 WebElement LastName =  driver.findElement(By.id(Investor.getProperty("LastName")));
		 LastName.click();
		 LastName.clear();
		 Thread.sleep(1000);
		 LastName.sendKeys("s");
		 Thread.sleep(3000);	 
		 WebElement Phone =  driver.findElement(By.id(Investor.getProperty("Phone")));
		 Phone.click();
		 Thread.sleep(1000);
		 Phone.clear();
		 Thread.sleep(1000);
		 Phone.sendKeys("9090909090");
		 Thread.sleep(1000);
		 WebElement Address =  driver.findElement(By.id(Investor.getProperty("Address")));
		 Address.click();
		 Thread.sleep(1000);
		 Address.clear();
		 Thread.sleep(1000);
		 Address.sendKeys("Sierra Nevada Road, Mammoth Lakes");
		 Thread.sleep(1000);
		 WebElement City =  driver.findElement(By.id(Investor.getProperty("City")));
		 City.click();
		 Thread.sleep(1000);
		 City.clear();
		 Thread.sleep(1000);
		 City.sendKeys("California");
		 Thread.sleep(3000);
		 WebElement ReturnRate =  driver.findElement(By.id(Investor.getProperty("ReturnRate")));
		 Thread.sleep(1000);
		 ReturnRate.clear();
		 Thread.sleep(1000);
		 ReturnRate.sendKeys("10");
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
		 Thread.sleep(3000);
		// Investor Bank Information
		 WebElement BankAccount =  driver.findElement(By.id(Investor.getProperty("BankAccount")));
		 Thread.sleep(1000);
		 BankAccount.clear();
		 Thread.sleep(1000);
		 BankAccount.sendKeys("United States of America"); 
		 Thread.sleep(3000);
		 WebElement CreateButton =  driver.findElement(By.id(Investor.getProperty("Create")));
		 JavascriptExecutor Create_Buttton= (JavascriptExecutor)driver;
		 Create_Buttton.executeScript("arguments[0].click();", CreateButton);
		 Thread.sleep(3000);
		WebElement ClosePopup =  driver.findElement(By.id(Investor.getProperty("CloseButton")));
		 JavascriptExecutor Popup= (JavascriptExecutor)driver;
		 Popup.executeScript("arguments[0].click();", ClosePopup);
		 
  }
}
