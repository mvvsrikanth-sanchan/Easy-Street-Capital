package Administration.FundManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class ES_58_FundDistribution extends BaseTest{
  @Test
  public void FundDistribution() throws InterruptedException {
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
		// Fund Distribution
		driver.findElement(By.id(FndDistribution.getProperty("FundDistribution"))).click();
		Thread.sleep(3000);
		WebElement CalculationDistribution= driver.findElement(By.id(FndDistribution.getProperty("calculation")));
		CalculationDistribution.click();
		Thread.sleep(3000);
		WebElement FundName = driver.findElement(By.id(FndDistribution.getProperty("InvestmentFund")));
		FundName.sendKeys("Easy Street Capital LLC");
		FundName.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		CalculationDistribution.click();
		Thread.sleep(1000);  
		WebElement Investor  = driver.findElement(By.id(FndDistribution.getProperty("Investor")));
		Investor.sendKeys("AlexWhale");
		Investor.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement StartDate = driver.findElement(By.name(FndDistribution.getProperty("startDate")));
		StartDate.sendKeys("18/05/2024");
		Thread.sleep(1000);
		WebElement DisbursementDate = driver.findElement(By.name(FndDistribution.getProperty("DisbursementDate")));
		DisbursementDate.sendKeys("18/08/2024");
		Thread.sleep(1000);
		WebElement Percentage = driver.findElement(By.name(FndDistribution.getProperty("Percentage")));
		Percentage.sendKeys("10");
		Thread.sleep(1000);
		CalculationDistribution.click();
		Thread.sleep(3000);
		// Edit Distribution
		
		
		
		
  }
  }

