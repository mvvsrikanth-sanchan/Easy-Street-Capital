package Administration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class ES_EmailManager extends BaseTest {
	@Test
	public void EmailManager() throws InterruptedException {
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
		 * Email Manager
		 */
		driver.findElement(By.id(EmailMngr.getProperty("EmailManager"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(EmailMngr.getProperty("CreateEmail"))).click();

		Thread.sleep(3000);
		WebElement SubmitEmail = driver.findElement(By.id(EmailMngr.getProperty("Submit")));
		JavascriptExecutor submit = (JavascriptExecutor) driver;
		submit.executeScript("arguments[0].click();", SubmitEmail);
		Thread.sleep(3000);
		WebElement BackNavigation = driver.findElement(By.id(EmailMngr.getProperty("Back")));
		JavascriptExecutor back = (JavascriptExecutor) driver;
		back.executeScript("arguments[0].click();", BackNavigation);
		Thread.sleep(3000);
		driver.findElement(By.id(EmailMngr.getProperty("CreateEmail"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(EmailMngr.getProperty("TemplateName"))).sendKeys("Maturity Date Reminder");
		Thread.sleep(3000);
		WebElement Rule = driver.findElement(By.id(EmailMngr.getProperty("RuleType")));
		Select rule = new Select(Rule);
		rule.selectByVisibleText("Date Rules");
		Thread.sleep(3000);
		WebElement EmailDate = driver.findElement(By.id(EmailMngr.getProperty("EmailReminderDate")));
		Select RemainderDate = new Select(EmailDate);
		RemainderDate.selectByIndex(1);
		Thread.sleep(3000);
		WebElement EmailFrom = driver.findElement(By.id(EmailMngr.getProperty("EmailFrom")));
		JavascriptExecutor emailfrom = (JavascriptExecutor)driver;
		emailfrom.executeScript("arguments[0].click();", EmailFrom);
		EmailFrom.sendKeys("develope@sanchaninfo.com");
		Thread.sleep(3000);
		WebDriverWait SelectEmailTo = new WebDriverWait(driver, Duration.ofSeconds(30));
		SelectEmailTo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EmailMngr.getProperty("EmailTo")))).click();
		WebElement EmailTo = driver.findElement(By.xpath(EmailMngr.getProperty("EmailTo")));
		JavascriptExecutor email = (JavascriptExecutor)driver;
		email.executeScript("arguments[0].click();", EmailTo);
		Select emailto = new Select(EmailTo);
		emailto.selectByValue("Borrower and Broker");

	}
}
