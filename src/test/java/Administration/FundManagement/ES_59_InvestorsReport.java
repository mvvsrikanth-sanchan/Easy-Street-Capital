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

public class ES_59_InvestorsReport extends BaseTest {
  @Test
  public void InvestorsReport() throws InterruptedException {
	     
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
		 driver.findElement(By.id(Investor.getProperty("InvestorsReport"))).click();
		 Thread.sleep(3000);
		 //Search By Investor name
		 WebElement InvestmentFund =  driver.findElement(By.id(Investor.getProperty("InvestmentFund")));
		 JavascriptExecutor FundType = (JavascriptExecutor)driver;
		 FundType.executeScript("arguments[0].click();", InvestmentFund);
		 InvestmentFund.sendKeys("test fund");
		 Thread.sleep(3000);
		 WebElement FundYear =  driver.findElement(By.id(Investor.getProperty("FundYear")));
		 JavascriptExecutor Year = (JavascriptExecutor)driver;
		 Year.executeScript("arguments[0].click();", FundYear);
		 FundYear.sendKeys("2019");
		 Thread.sleep(3000);
		 WebElement Export =  driver.findElement(By.id(Investor.getProperty("Export")));
		 JavascriptExecutor DetailReport = (JavascriptExecutor)driver;
		 DetailReport.executeScript("arguments[0].click();", Export);
		 Thread.sleep(3000);
		 InvestmentFund.sendKeys("Easy Street Capital LLC");
		 Thread.sleep(3000);
		 FundYear.sendKeys("2024");
		 Thread.sleep(3000);
		 Export.click();
		 
		 
		 
  }
}
