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

public class ES_52_CreateFund extends BaseTest {
	@Test
	
	public void CreateFund() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
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
		WebElement CreateFund = driver.findElement(By.id(creFund.getProperty("CreateFund")));
		CreateFund.click();
		Thread.sleep(3000);
		WebElement NavigateBack = driver.findElement(By.id(creFund.getProperty("NavigateBack")));
		NavigateBack.click();
		Thread.sleep(3000);
		WebElement Create = driver.findElement(By.id(creFund.getProperty("CreateFund")));
		Create.click();
		Thread.sleep(3000);
		WebElement CreateFundButton = driver.findElement(By.id(creFund.getProperty("CreateButton")));
		CreateFundButton.click();
		Thread.sleep(3000);
		WebElement FundName = driver.findElement(By.id(creFund.getProperty("Name")));
		JavascriptExecutor Name = (JavascriptExecutor) driver;
		Name.executeScript("arguments[0].click();", FundName);
		FundName.sendKeys("Peafowl");
		Thread.sleep(3000);
		driver.findElement(By.id(creFund.getProperty("FundType"))).sendKeys("Preferred");
		Thread.sleep(3000);
		WebDriverWait Address = new WebDriverWait(driver, Duration.ofSeconds(30));
		Address.until(ExpectedConditions.visibilityOfElementLocated(By.name(creFund.getProperty("Addresses"))))
				.sendKeys("California");
		Thread.sleep(3000);
		WebElement AddressSelection = driver.findElement(By.name(creFund.getProperty("Addresses")));

		AddressSelection.sendKeys(Keys.ARROW_DOWN);

		AddressSelection.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		CreateFundButton.click();
		Thread.sleep(3000);
		WebElement ClosePopup = driver.findElement(By.id(creFund.getProperty("ClosePopup")));
		JavascriptExecutor Close = (JavascriptExecutor) driver;
		Close.executeScript("arguments[0].click();", ClosePopup);
		Thread.sleep(3000);
	}
}
