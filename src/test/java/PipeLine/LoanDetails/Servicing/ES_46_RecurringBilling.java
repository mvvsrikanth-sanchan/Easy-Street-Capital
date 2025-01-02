package PipeLine.LoanDetails.Servicing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ES_46_RecurringBilling {
	@Test
	public void RecurringBilling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		System.out.println("browser opened");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		System.out.println("URL opened ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		driver.findElement(By.id("teamMemberButton")).click();

//Enter User Name
		driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com");

		// Enter password Name

		driver.findElement(By.id("loginPassword")).sendKeys("Sanchan@123");

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		// #row-3
//WebElement LoanId = driver.findElement(By.cssSelector("#row-4 > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));
		WebElement LoanId = driver
				.findElement(By.cssSelector("#row-3 > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));
		Actions LoanIdSelect = new Actions(driver);
		LoanIdSelect.moveToElement(LoanId).perform();
//CLICKING ON SERVICING MENU
		WebElement Servicing = driver.findElement(By.xpath(
				"/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[4]/div[1]/div/div/ul/li[6]/a"));
		JavascriptExecutor Servicingmenu = (JavascriptExecutor) driver;
		Servicingmenu.executeScript("arguments[0].click();", Servicing);
		Thread.sleep(5000);
		WebElement ServicingMenu = driver.findElement(By.id("servicingMenu"));
		JavascriptExecutor servicing_menu = (JavascriptExecutor) driver;
		servicing_menu.executeScript("arguments[0].click();", ServicingMenu);
		Thread.sleep(1000);
		WebElement RecurringBilling = driver.findElement(By.id("servicing-RecurringBilling"));
		JavascriptExecutor Recurring_Billing = (JavascriptExecutor) driver;
		Recurring_Billing.executeScript("arguments[0].click();", RecurringBilling);
		Thread.sleep(3000);
//Principal 
		WebElement PrincipalToggleOn = driver
				.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/div/div[2]/label[1]/div"));
		JavascriptExecutor Principal_ToggleOn = (JavascriptExecutor) driver;
		Principal_ToggleOn.executeScript("arguments[0].click();", PrincipalToggleOn);
		Thread.sleep(1000);
		WebElement PrincipalToggleOff = driver
				.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/div/div[2]/label[1]/div"));
		JavascriptExecutor Principal_ToggleOff = (JavascriptExecutor) driver;
		Principal_ToggleOff.executeScript("arguments[0].click();", PrincipalToggleOff);
		Thread.sleep(1000);
//Interest
		WebElement InterestToggleOn = driver
				.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/div/div[2]/label[2]/div"));
		JavascriptExecutor Interest_ToggleOn = (JavascriptExecutor) driver;
		Interest_ToggleOn.executeScript("arguments[0].click();", InterestToggleOn);
		Thread.sleep(1000);
		WebElement InterestToggleOff = driver
				.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/div/div[2]/label[2]/div"));
		JavascriptExecutor Interest_ToggleOff = (JavascriptExecutor) driver;
		Interest_ToggleOff.executeScript("arguments[0].click();", InterestToggleOff);
		Thread.sleep(1000);
//Fees
		WebElement FeesToggleOn = driver
				.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/div/div[2]/label[3]/div"));
		JavascriptExecutor Fees_ToggleOn = (JavascriptExecutor) driver;
		Fees_ToggleOn.executeScript("arguments[0].click();", FeesToggleOn);
		Thread.sleep(1000);
		WebElement FeesToggleOff = driver
				.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/div/div[2]/label[3]/div"));
		JavascriptExecutor Fees_ToggleOff = (JavascriptExecutor) driver;
		Fees_ToggleOff.executeScript("arguments[0].click();", FeesToggleOff);
		Thread.sleep(1000);
		WebElement SavePaymentSetup = driver.findElement(By.xpath("//*[@id=\"PROPERTY\"]/div/div[3]/button"));
		JavascriptExecutor Save_PaymentSetup = (JavascriptExecutor) driver;
		Save_PaymentSetup.executeScript("arguments[0].click();", SavePaymentSetup);
		Thread.sleep(3000);
		WebElement ClosePopup = driver.findElement(By.id("closePopupBtn"));
		JavascriptExecutor Popup = (JavascriptExecutor) driver;
		Popup.executeScript("arguments[0].click();", ClosePopup);
		Thread.sleep(3000);
// RECURRING ACH PAYMENTS
		WebElement ACHPayements = driver
				.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/ul/li[2]/a/span[2]"));
		JavascriptExecutor ACH_Payements = (JavascriptExecutor) driver;
		ACH_Payements.executeScript("arguments[0].click();", ACHPayements);
		Thread.sleep(3000);
		WebElement AccountName = driver.findElement(By.xpath("//*[@id=\"LOAN\"]/div[2]/div/div[1]/div/input"));
		JavascriptExecutor Funding_AccName = (JavascriptExecutor) driver;
		Funding_AccName.executeScript("arguments[0].click();", AccountName);
		AccountName.sendKeys("SAVINGS");
		Thread.sleep(1000);
		WebElement BillingStartDate = driver.findElement(By.xpath("//*[@id=\"LOAN\"]/div[2]/div/div[5]/div/input"));
		JavascriptExecutor Billing_StartDate = (JavascriptExecutor) driver;
		Billing_StartDate.executeScript("arguments[0].click();", BillingStartDate);
		BillingStartDate.sendKeys("01/01/2024");
		Thread.sleep(3000);
		WebElement ChargesDescption = driver.findElement(By.xpath("//*[@id=\"LOAN\"]/div[2]/div/div[8]/div/input"));
		JavascriptExecutor Descption = (JavascriptExecutor) driver;
		Descption.executeScript("arguments[0].click();", ChargesDescption);
		ChargesDescption.sendKeys("Chargers will apply 2 days after the due date");
		Thread.sleep(1000);
		WebElement Save = driver.findElement(By.xpath("//*[@id=\"LOAN\"]/div[2]/div/div[10]/div/button"));
		JavascriptExecutor save = (JavascriptExecutor) driver;
		save.executeScript("arguments[0].click();", Save);
		Thread.sleep(3000);
		WebElement RecurringSaveClosePopup = driver.findElement(By.id("closePopupBtn"));
		JavascriptExecutor Recurring_SaveClosePopup = (JavascriptExecutor) driver;
		Recurring_SaveClosePopup.executeScript("arguments[0].click();", RecurringSaveClosePopup);
	}
}
