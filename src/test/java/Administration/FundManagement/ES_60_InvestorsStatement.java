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

import com.fasterxml.jackson.annotation.JacksonAnnotationValue;

import base.BaseTest;

public class ES_60_InvestorsStatement extends BaseTest {
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
		// Click on Investor
		driver.findElement(By.id(InvesStatement.getProperty("InvestorStatements"))).click();
		Thread.sleep(3000);
		/*
		 * Single Investor Statement
		 */
		WebElement Genearate = driver.findElement(By.id(InvesStatement.getProperty("Generate")));
		JavascriptExecutor Genstatement = (JavascriptExecutor) driver;
		Genstatement.executeScript("arguments[0].click();", Genearate);
		Thread.sleep(3000);
		WebElement SelectFund = driver.findElement(By.xpath(InvesStatement.getProperty("SelectFund")));
		JavascriptExecutor FundSelection = (JavascriptExecutor) driver;
		FundSelection.executeScript("arguments[0].click();", SelectFund);
		SelectFund.sendKeys("Easy Street Capital LLC");
		Thread.sleep(1000);
		WebElement StartDate = driver.findElement(By.name(InvesStatement.getProperty("StartDate")));
		JavascriptExecutor Sdate = (JavascriptExecutor) driver;
		Sdate.executeScript("arguments[0].click();", StartDate);
		driver.findElement(By.name(InvesStatement.getProperty("StartDate"))).sendKeys("18/07/2024");
		Thread.sleep(3000);
		WebElement EndDate = driver.findElement(By.name(InvesStatement.getProperty("EndDate")));
		JavascriptExecutor Edate = (JavascriptExecutor) driver;
		Edate.executeScript("arguments[0].click();", EndDate);
		driver.findElement(By.name(InvesStatement.getProperty("EndDate"))).sendKeys("29/12/2024");
		Thread.sleep(3000);

		Thread.sleep(3000);
		WebElement InvestorName = driver.findElement(By.name(InvesStatement.getProperty("Investor")));
		InvestorName.sendKeys("Maanya Gona");
		Thread.sleep(3000);
		Genearate.click();
		// SEND EMAIL

		WebElement SendEmail = driver.findElement(By.id(InvesStatement.getProperty("SendEmail")));
		JavascriptExecutor SendEmil = (JavascriptExecutor) driver;
		SendEmil.executeScript("arguments[0].click();", SendEmail);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		// Bulk InsvStatement Tab
		WebElement BulkInsvStatementTab = driver
				.findElement(By.xpath(InvesStatement.getProperty("BulkInvestorsStatements")));
		JavascriptExecutor BulkStatement = (JavascriptExecutor) driver;
		BulkStatement.executeScript("arguments[0].click();", BulkInsvStatementTab);
		Thread.sleep(3000);
		WebElement BulkEmailSent = driver.findElement(By.id(InvesStatement.getProperty("SendEmailStatements")));
		JavascriptExecutor EmailSent = (JavascriptExecutor) driver;
		EmailSent.executeScript("arguments[0].click();", BulkEmailSent);
		WebElement PullStartDate = driver.findElement(By.name(InvesStatement.getProperty("PullStartDate")));
		PullStartDate.sendKeys("12/05/2024");
		Thread.sleep(1000);
		WebElement PullEndDate = driver.findElement(By.name(InvesStatement.getProperty("PullEndDate")));
		PullEndDate.sendKeys("12/12/2024");
		Thread.sleep(3000);
		BulkEmailSent.click();
		Thread.sleep(3000);
		// Statements Log
		WebElement StatementsLogTab = driver.findElement(By.xpath(InvesStatement.getProperty("StatementsLog")));
		JavascriptExecutor StatementsLog = (JavascriptExecutor) driver;
		StatementsLog.executeScript("arguments[0].click();", StatementsLogTab);
		

	}
}
