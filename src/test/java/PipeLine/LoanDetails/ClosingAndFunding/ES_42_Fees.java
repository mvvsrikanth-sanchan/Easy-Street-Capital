package PipeLine.LoanDetails.ClosingAndFunding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ES_42_Fees {
  @Test
  public void Fees() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
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
WebElement LoanId = driver.findElement(By.cssSelector("#row-0 > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));

Actions LoanIdSelect = new Actions(driver);
LoanIdSelect.moveToElement(LoanId).perform();
WebElement DealNavigation = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/ul/li[2]/a"));
JavascriptExecutor Deal= (JavascriptExecutor)driver;
Deal.executeScript("arguments[0].click();", DealNavigation);
Thread.sleep(3000);
//CLICKING ON CLOSING AND FUNDING  MENU
WebElement ClosingAndFundingNavigation = driver.findElement(By.id("closingFundingMenu"));
JavascriptExecutor ClosingAndFunding= (JavascriptExecutor)driver;
ClosingAndFunding.executeScript("arguments[0].click();", ClosingAndFundingNavigation);
Thread.sleep(2000);
//CLEAR TO CLOSE  saveFee
WebElement ClosingFunding = driver.findElement(By.id("closingFunding-Fees"));
JavascriptExecutor Closing_Funding= (JavascriptExecutor)driver;
Closing_Funding.executeScript("arguments[0].click();", ClosingFunding);
Thread.sleep(2000);

WebElement AddFee = driver.findElement(By.id("addFee"));
JavascriptExecutor addFee= (JavascriptExecutor)driver;
addFee.executeScript("arguments[0].click();", AddFee);
Thread.sleep(2000);
WebElement SaveFee = driver.findElement(By.id("saveFee"));
JavascriptExecutor saveFee= (JavascriptExecutor)driver;
saveFee.executeScript("arguments[0].click();", SaveFee);
Thread.sleep(2000);
WebElement FeeName = driver.findElement(By.id("feeName"));
JavascriptExecutor feeName= (JavascriptExecutor)driver;
feeName.executeScript("arguments[0].click();", FeeName);
Thread.sleep(2000);
FeeName.sendKeys("Broker's Fee Charges");
Thread.sleep(2000);

WebElement FeeDescription = driver.findElement(By.id("feeDescription"));
JavascriptExecutor feeDescription= (JavascriptExecutor)driver;
feeDescription.executeScript("arguments[0].click();", FeeDescription);
Thread.sleep(2000);
FeeDescription.sendKeys("Clearence Fees");
Thread.sleep(2000);
WebElement FeePercent = driver.findElement(By.id("feePercent"));
JavascriptExecutor feePercent= (JavascriptExecutor)driver;
feePercent.executeScript("arguments[0].click();", FeePercent);
Thread.sleep(2000);
FeePercent.sendKeys("1");
Thread.sleep(2000);
WebElement FeeDollar = driver.findElement(By.id("feeDollar"));
JavascriptExecutor feeDollar= (JavascriptExecutor)driver;
feeDollar.executeScript("arguments[0].click();", FeeDollar);
Thread.sleep(2000);
FeeDollar.sendKeys("20");
Thread.sleep(2000);
WebElement FeePaidBy = driver.findElement(By.id("feePaidBy"));
JavascriptExecutor feePaidBy= (JavascriptExecutor)driver;
feePaidBy.executeScript("arguments[0].click();", FeePaidBy);
Thread.sleep(2000);
FeePaidBy.sendKeys("Borrower");
Thread.sleep(2000);
WebElement FeeType = driver.findElement(By.id("feeType"));
JavascriptExecutor feeType= (JavascriptExecutor)driver;
feeType.executeScript("arguments[0].click();", FeeType);
Thread.sleep(2000);
FeeType.sendKeys("Processing Charges");
Thread.sleep(2000);
WebElement FeePOC = driver.findElement(By.id("feePOC"));
JavascriptExecutor feePOC= (JavascriptExecutor)driver;
feePOC.executeScript("arguments[0].click();", FeePOC);
Thread.sleep(2000);
WebElement FeePOC1 = driver.findElement(By.id("feePOC"));
JavascriptExecutor feePOC1= (JavascriptExecutor)driver;
feePOC1.executeScript("arguments[0].click();", FeePOC1);
Thread.sleep(2000);

WebElement SaveFeeType = driver.findElement(By.id("saveFee"));
JavascriptExecutor SaveFee_Type= (JavascriptExecutor)driver;
SaveFee_Type.executeScript("arguments[0].click();", SaveFeeType);
Thread.sleep(5000);
driver.navigate().refresh();
// EDIT FEES 
Thread.sleep(3000);
WebElement EditFees = driver.findElement(By.id("editFee-8"));
JavascriptExecutor Edit_Fees= (JavascriptExecutor)driver;
Edit_Fees.executeScript("arguments[0].click();", EditFees);
Thread.sleep(2000);
WebElement FeePOC2 = driver.findElement(By.id("feePOC"));
JavascriptExecutor feePOC2= (JavascriptExecutor)driver;
feePOC2.executeScript("arguments[0].click();", FeePOC2);
Thread.sleep(2000);
WebElement SaveFeeType1 = driver.findElement(By.id("saveFee"));
JavascriptExecutor SaveFee_Type1= (JavascriptExecutor)driver;
SaveFee_Type1.executeScript("arguments[0].click();", SaveFeeType1);
Thread.sleep(5000);
driver.navigate().refresh();
// DELETE FEES 
Thread.sleep(3000);
WebElement DeleteFees = driver.findElement(By.id("deleteFee-0"));
JavascriptExecutor Delete_Fees= (JavascriptExecutor)driver;
Delete_Fees.executeScript("arguments[0].click();", DeleteFees);
Thread.sleep(2000);
WebElement CancelDelete = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/p/a[1]"));
JavascriptExecutor Cancel= (JavascriptExecutor)driver;
Cancel.executeScript("arguments[0].click();", CancelDelete);
Thread.sleep(2000);
WebElement DeleteFees1 = driver.findElement(By.id("deleteFee-0"));
JavascriptExecutor Delete_Fees1= (JavascriptExecutor)driver;
Delete_Fees1.executeScript("arguments[0].click();", DeleteFees1);
Thread.sleep(3000);
WebElement FeesDelete = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/p/a[2]"));
JavascriptExecutor Delete1= (JavascriptExecutor)driver;
Delete1.executeScript("arguments[0].click();", FeesDelete);
Thread.sleep(3000);
driver.navigate().refresh();
driver.quit();


  }
}
