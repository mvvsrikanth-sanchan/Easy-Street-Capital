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

public class ES_54_DeleteCreatedFund extends BaseTest {
	@Test
	public void CreateFund() throws InterruptedException {

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
		driver.findElement(By.id(creFund.getProperty("FundManagement"))).click();
		Thread.sleep(3000);
		WebElement Search = driver.findElement(By.id(creFund.getProperty("FundSearch")));
		Search.sendKeys("Peafowl");
		//Search.click();
		Thread.sleep(3000);
		//Edit Fund
		WebElement FundDelete = driver.findElement(By.id(creFund.getProperty("DeleteFund")));
		FundDelete.click();
		Thread.sleep(3000);
		WebElement DeleteNo = driver.findElement(By.id(creFund.getProperty("DeleteNo")));
		JavascriptExecutor Delete_No = (JavascriptExecutor) driver;
		Delete_No.executeScript("arguments[0].click();", DeleteNo);
		Thread.sleep(3000);
		FundDelete.click();
		Thread.sleep(3000);
		WebElement DeleteYes = driver.findElement(By.id(creFund.getProperty("DeleteYes")));
		JavascriptExecutor Delete_Yes = (JavascriptExecutor) driver;
		Delete_Yes.executeScript("arguments[0].click();", DeleteYes);
		Thread.sleep(3000);
		WebElement ClosePopup = driver.findElement(By.id(creFund.getProperty("ClosePopup")));
		JavascriptExecutor Close = (JavascriptExecutor) driver;
		Close.executeScript("arguments[0].click();", ClosePopup);
		Thread.sleep(3000);
		//Clear Search
		WebElement ClearSearch = driver.findElement(By.id(creFund.getProperty("ClearSearch")));
		JavascriptExecutor Clear = (JavascriptExecutor) driver;
		Clear.executeScript("arguments[0].click();", ClearSearch);
		
	}
}
