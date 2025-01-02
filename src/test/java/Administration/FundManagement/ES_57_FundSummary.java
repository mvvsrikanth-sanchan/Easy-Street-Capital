package Administration.FundManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class ES_57_FundSummary extends BaseTest {
  @Test
  public void FundSummary() throws InterruptedException {
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
		// CREATE FUND
		driver.findElement(By.id(("FundSummarySubMenu"))).click();
		Thread.sleep(3000);
		WebElement   SortFund =  driver.findElement(By.id(("fundname")));
		SortFund.click();
		SortFund.sendKeys("Bond Fund listing");
		SortFund.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		SortFund.sendKeys("Easy Street Capital LLC");
		Thread.sleep(3000);
		driver.close();
		
		
  }
}
