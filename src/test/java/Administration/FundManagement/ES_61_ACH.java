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

public class ES_61_ACH extends BaseTest {
	@Test
	public void ACH() throws InterruptedException {

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
		// Click on ACH
		driver.findElement(By.id(ACH.getProperty("ACH"))).click();
		Thread.sleep(3000);
		WebElement Back = driver.findElement(By.id(ACH.getProperty("Back")));
		JavascriptExecutor Button = (JavascriptExecutor) driver;
		Button.executeScript("arguments[0].click();", Back);
		Thread.sleep(3000);
		driver.findElement(By.linkText(creFund.getProperty("Administration"))).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText(creFund.getProperty("Fund/InvestorManagement"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(ACH.getProperty("ACH"))).click();
		Thread.sleep(3000);
		WebElement Generate = driver.findElement(By.id(ACH.getProperty("Generate")));
		JavascriptExecutor generate = (JavascriptExecutor) driver;
		generate.executeScript("arguments[0].click();", Generate);
		Thread.sleep(3000);
		WebElement FromDate = driver.findElement(By.id(ACH.getProperty("FromDate")));
		JavascriptExecutor FrDate = (JavascriptExecutor) driver;
		FrDate.executeScript("arguments[0].click();", FromDate);
		driver.findElement(By.id(ACH.getProperty("FromDate"))).sendKeys("01/10/2024");
		Thread.sleep(3000);
		WebElement ToDate = driver.findElement(By.id(ACH.getProperty("ToDate")));
		JavascriptExecutor todate = (JavascriptExecutor) driver;
		todate.executeScript("arguments[0].click();", ToDate);
		driver.findElement(By.id(ACH.getProperty("ToDate"))).sendKeys("29/12/2024");
		Thread.sleep(3000);
		WebElement EffectiveDate = driver.findElement(By.id(ACH.getProperty("EffectiveDate")));
		JavascriptExecutor EffDate = (JavascriptExecutor) driver;
		EffDate.executeScript("arguments[0].click();", EffectiveDate);
		driver.findElement(By.id(ACH.getProperty("EffectiveDate"))).sendKeys("01/11/2024");
		Thread.sleep(3000);
		//NSF 
		WebElement NSFToggleOn = driver.findElement(By.id(ACH.getProperty("NSFToggle")));
		JavascriptExecutor ToggleOn = (JavascriptExecutor) driver;
		ToggleOn.executeScript("arguments[0].click();", NSFToggleOn);
		Thread.sleep(3000);
		WebElement GenerateACH = driver.findElement(By.id(ACH.getProperty("Generate")));
		JavascriptExecutor generateACH = (JavascriptExecutor) driver;
		generateACH.executeScript("arguments[0].click();", GenerateACH);
		Thread.sleep(3000);
		WebElement Download = driver.findElement(By.xpath(ACH.getProperty("Download")));
		JavascriptExecutor download = (JavascriptExecutor) driver;
		download.executeScript("arguments[0].click();", Download);
		Thread.sleep(3000);
		WebElement GeneratesACH = driver.findElement(By.id(ACH.getProperty("Generate")));
		JavascriptExecutor generatesACH = (JavascriptExecutor) driver;
		generatesACH.executeScript("arguments[0].click();", GeneratesACH);
		Thread.sleep(3000);
		WebElement NSFToggleOff = driver.findElement(By.id(ACH.getProperty("NSFToggle")));
		JavascriptExecutor ToggleOff = (JavascriptExecutor) driver;
		ToggleOff.executeScript("arguments[0].click();", NSFToggleOff);
		Thread.sleep(3000);
		WebElement Generate_ACH = driver.findElement(By.id(ACH.getProperty("Generate")));
		JavascriptExecutor generate_ACH = (JavascriptExecutor) driver;
		generate_ACH.executeScript("arguments[0].click();", Generate_ACH);
		Thread.sleep(3000);
		Thread.sleep(3000);
		// NSF Toggle off
		WebElement NSFOff_Download = driver.findElement(By.xpath(ACH.getProperty("Download")));
		JavascriptExecutor NSFofdownload = (JavascriptExecutor) driver;
		NSFofdownload.executeScript("arguments[0].click();", NSFOff_Download);
		Thread.sleep(3000);
		WebElement NSFOff_GeneratesACH = driver.findElement(By.id(ACH.getProperty("Generate")));
		JavascriptExecutor NSFofgeneratesACH = (JavascriptExecutor) driver;
		NSFofgeneratesACH.executeScript("arguments[0].click();", NSFOff_GeneratesACH);
		Thread.sleep(3000);
		WebElement NavigateBack = driver.findElement(By.id(ACH.getProperty("Back")));
		JavascriptExecutor Navigate_Back = (JavascriptExecutor) driver;
		Navigate_Back.executeScript("arguments[0].click();", NavigateBack);
	}
}
