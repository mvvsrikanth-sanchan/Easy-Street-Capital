package NewLoans.Borrower;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.codeborne.selenide.conditions.Value;

import base.BaseTest;

public class ES_06_NewBorrower_Refinancings__EasyFIX extends BaseTest {
	@Test
	public void NewBorrowerRefinancingsEasyFIX() throws InterruptedException {

		driver.findElement(By.id(loc.getProperty("teammember_button"))).click();

		// Enter User Name
		driver.findElement(By.id(loc.getProperty("emailid"))).sendKeys("mvvsrikanth@sanchaninfo.com");

		// Enter password Name

		driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys("Sanchan@123");

		driver.findElement(By.id(loc.getProperty("Login_button"))).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText(Bor.getProperty("Loanmenu"))).click();
		Thread.sleep(3000);
		// ===========================TAB 1 PROPERTY INFO
		driver.findElement(By.id(Bor.getProperty("Borrower"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(Bor.getProperty("Refinancing"))).click();
		// ADDRESS SELECTION
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Bor.getProperty("RefinancingAddress"))))
				.sendKeys("California");
		Thread.sleep(3000);
		WebElement address = driver.findElement(By.xpath(Bor.getProperty("RefinancingAddress")));

		address.sendKeys(Keys.ARROW_DOWN);

		address.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		Actions PropertyInfoNext = new Actions(driver);
		PropertyInfoNext.moveToElement(driver.findElement(By.id(Bor.getProperty("PropertyInfoNext")))).click()
				.perform();

//===========================TAB 2 LOAN PROGRAM
		Thread.sleep(5000);
		driver.findElement(By.id(Bor.getProperty("EasyFix"))).click();
//========================TAB 3 DEAL INFO
//triplexRefinancingFix
		Thread.sleep(5000);
//clicking on NEXT for validation
		Actions DealInfoNext = new Actions(driver);
		DealInfoNext.moveToElement(driver.findElement(By.id(Bor.getProperty("DealInfoNext")))).click().perform();
//driver.findElement(By.id(Bor.getProperty("dealInfoNext")).click();
		System.out.println("Purchase details validation displayed");
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,-250)", "");
// Thread.sleep(5000);

//Property type
		Actions PropertyType = new Actions(driver);
		PropertyType.moveToElement(driver.findElement(By.id(Bor.getProperty("Triplex")))).click().perform();

		System.out.println("Purchase details validation displayed");
//Purchase Price 
		driver.findElement(By.id(Bor.getProperty("RefinanceFixPurchasePrice"))).sendKeys("659000");
//PURCHASE PROPERTY DATE
		Actions date = new Actions(driver);
		date.moveToElement(driver.findElement(By.id(Bor.getProperty("RefinanceFixPurchaseDate"))));
		driver.findElement(By.id(Bor.getProperty("RefinanceFixPurchaseDate"))).sendKeys("29/03/2024");
		// total square footage

		driver.findElement(By.id(Bor.getProperty("RefinanceFixPropertyArea"))).sendKeys("2300");
//Total bedrooms
		driver.findElement(By.id(Bor.getProperty("RefinanceFixTotalBedrooms"))).sendKeys("2");
//Total bathrooms
		driver.findElement(By.id(Bor.getProperty("RefinanceFixTotalBathrooms"))).sendKeys("2");
		Thread.sleep(5000);

//Year built?
		driver.findElement(By.id(Bor.getProperty("RefinanceFixYearBuilt"))).sendKeys("2020");
//property has a pool
		Actions NoPool = new Actions(driver);
		NoPool.moveToElement(driver.findElement(By.id(Bor.getProperty("RefinanceFixPoolNo")))).click().perform();

		System.out.println("Pool No clickable");
		driver.findElement(By.id(Bor.getProperty("RefinanceFixPoolYes"))).click();
		System.out.println("Pool Yes clickable");
		Thread.sleep(2000);
//square footage of the lot
		driver.findElement(By.id(Bor.getProperty("RefinanceFixLotArea"))).sendKeys("1400");
//Did you renovate the property?
		Thread.sleep(2000);
		Actions RefinanceLoan = new Actions(driver);
		RefinanceLoan.moveToElement(driver.findElement(By.id(Bor.getProperty("RefinanceFixRenovatedNo")))).click()
				.perform();

		System.out.println("renovated RefinanceFix No clickable");
		Thread.sleep(2000);
		driver.findElement(By.id(Bor.getProperty("RefinanceFixRenovatedYes"))).click();
		System.out.println("renovated RefinanceFix  Yes clickable");
		Thread.sleep(2000);
//IF RENOVATED  REFINANCE   YES 
		driver.findElement(By.id(Bor.getProperty("RefinanceFixRenovationCost"))).sendKeys("340000");
		Thread.sleep(2000);
//Do you want the new refinance loan to provide rehab funding?
		Actions RehabFunding = new Actions(driver);
		RehabFunding.moveToElement(driver.findElement(By.id(Bor.getProperty("RefinanceFixRehabFundingNo")))).click()
				.perform();
		System.out.println("Rehab Funding No clickable");
		Thread.sleep(2000);
		driver.findElement(By.id(Bor.getProperty("RefinanceFixRehabFundingYes"))).click();
		System.out.println("Rehab Funding  Yes clickable");
		Thread.sleep(2000);
//IF Rehab Funding  YES = How much is the remaining rehab budget?
		driver.findElement(By.id(Bor.getProperty("RefinanceFixRehabBudget"))).sendKeys("340000");
//How much is the existing loan?
		driver.findElement(By.id(Bor.getProperty("RefinanceFixExistingLoan"))).sendKeys("569000");
		
//What is the current value
		driver.findElement(By.id(Bor.getProperty("RefinanceFixCurrentValue"))).sendKeys("467000");		
//What is the completed value?
	driver.findElement(By.xpath(Bor.getProperty("RefinanceFixcompleted"))).sendKeys("565000");
	 
//Target complete date
		Actions CompleteDate = new Actions(driver);
		CompleteDate.moveToElement(driver.findElement(By.id(Bor.getProperty("RefinanceFixConstructionCompleted"))));
		driver.findElement(By.id(Bor.getProperty("RefinanceFixConstructionCompleted"))).sendKeys("18/07/2025");
//occupancyStatus
		WebElement occupancyStatus = driver.findElement(By.id(Bor.getProperty("OccupancyStatus")));
		JavascriptExecutor occupancy_Status = (JavascriptExecutor) driver;
		occupancy_Status.executeScript("arguments[0].click();", occupancyStatus);
		occupancyStatus.sendKeys("Delivered Vacant");
		Thread.sleep(3000);
		// Collateral Property
		WebElement CollateralPropertyNo = driver
				.findElement(By.xpath(Bor.getProperty("RefinanceFixCollateralpropertyNo")));
		JavascriptExecutor CollateralProperty_No = (JavascriptExecutor) driver;
		CollateralProperty_No.executeScript("arguments[0].click();", CollateralPropertyNo);
		Thread.sleep(2000);
		// Collateral Property collateralpropertyNoPurchaseBuild
		WebElement CollateralPropertyYes = driver
				.findElement(By.id(Bor.getProperty("RefinanceFixCollateralpropertyYes")));
		JavascriptExecutor CollateralProperty_Yes = (JavascriptExecutor) driver;
		CollateralProperty_Yes.executeScript("arguments[0].click();", CollateralPropertyYes);
		Thread.sleep(3000);

		// Current Loan
		Thread.sleep(2000);
		WebElement curentLoanNo = driver.findElement(By.id(Bor.getProperty("NoCurrentLoan")));
		JavascriptExecutor curentLoan_No = (JavascriptExecutor) driver;
		curentLoan_No.executeScript("arguments[0].click();", curentLoanNo);
		Thread.sleep(3000);
		// Collateral Property collateralpropertyNoPurchaseBuild
		WebElement curentLoanYes = driver.findElement(By.id(Bor.getProperty("CurrentLoanYes")));
		JavascriptExecutor curentLoan_Yes = (JavascriptExecutor) driver;
		curentLoan_Yes.executeScript("arguments[0].click();", curentLoanYes);
		Thread.sleep(3000);
		// existing loan
		WebElement existingloan = driver.findElement(By.id(Bor.getProperty("ExistingLoan")));
		JavascriptExecutor existing_loan = (JavascriptExecutor) driver;
		existing_loan.executeScript("arguments[0].click();", existingloan);
		existingloan.sendKeys("350000");
		// proposedLienPosition
		Thread.sleep(2000);
		WebElement proposedLienPosition = driver.findElement(By.id(Bor.getProperty("ProposedLienPosition")));
		JavascriptExecutor proposedLien_Position = (JavascriptExecutor) driver;
		proposedLien_Position.executeScript("arguments[0].click();", proposedLienPosition);
		proposedLienPosition.sendKeys(Keys.ARROW_DOWN);
		proposedLienPosition.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// propertyArea
		WebElement propertyArea = driver.findElement(By.id(Bor.getProperty("PropertyArea")));
		JavascriptExecutor property_Area = (JavascriptExecutor) driver;
		property_Area.executeScript("arguments[0].click();", propertyArea);
		propertyArea.sendKeys("2500");
		Thread.sleep(2000);
		driver.findElement(By.id(Bor.getProperty("TotalBedRooms"))).sendKeys("3");
		Thread.sleep(2000);
		driver.findElement(By.id(Bor.getProperty("TotalBathrooms"))).sendKeys("2");
		Thread.sleep(2000);
		// yearBuilt
		WebElement yearBuilt = driver.findElement(By.id(Bor.getProperty("YearBuilt")));
		JavascriptExecutor year_Built = (JavascriptExecutor) driver;
		year_Built.executeScript("arguments[0].click();", yearBuilt);
		yearBuilt.sendKeys("2000");
		// Pool Details
		WebElement poolNo = driver.findElement(By.id(Bor.getProperty("NoCollateralPool")));
		JavascriptExecutor pool_No = (JavascriptExecutor) driver;
		pool_No.executeScript("arguments[0].click();", poolNo);
		Thread.sleep(2000);
		WebElement poolYes = driver.findElement(By.id(Bor.getProperty("CollateralPoolYes")));
		JavascriptExecutor pool_Yes = (JavascriptExecutor) driver;
		pool_Yes.executeScript("arguments[0].click();", poolYes);
		Thread.sleep(2000);
		// LotArea
		WebElement lotArea = driver.findElement(By.id(Bor.getProperty("c.lotArea")));
		JavascriptExecutor lot_Area = (JavascriptExecutor) driver;
		lot_Area.executeScript("arguments[0].click();", lotArea);
		Thread.sleep(3000);
		lotArea.sendKeys("2500");
		// occupancyStatus
		WebElement occupancyStatus1 = driver.findElement(By.id(Bor.getProperty("c.OccupancyStatus")));
		JavascriptExecutor occupancy_Status1 = (JavascriptExecutor) driver;
		occupancy_Status1.executeScript("arguments[0].click();", occupancyStatus1);
		occupancyStatus1.sendKeys("Unknown");
		Thread.sleep(2000);
		//Estimation Value
		WebDriverWait Estimatedvalue = new WebDriverWait(driver, Duration.ofSeconds(30));
		Estimatedvalue.until(ExpectedConditions.visibilityOfElementLocated(By.id(Bor.getProperty("EstimatedValue"))))
				.sendKeys("895000");
		Thread.sleep(2000);
		WebDriverWait collateralhomeAdresses = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Bor.getProperty("PropertyHomeAddress"))))
				.sendKeys("California");
		Thread.sleep(3000);
		WebElement homeAdress = driver.findElement(By.name(Bor.getProperty("PropertyHomeAddress")));

		homeAdress.sendKeys(Keys.ARROW_DOWN);

		homeAdress.sendKeys(Keys.ENTER);
//clicking on NEXT for validation
		Thread.sleep(3000);
        Actions next = new Actions(driver);
        next.moveToElement(driver.findElement(By.id(Bor.getProperty("DealInfoNext")))).click().perform();
		Thread.sleep(3000);

//===================TAB 4 EASY BUILDStrategy Info
//Source of downpayment
		driver.findElement(By.id(Bor.getProperty("SourceOfDownPayment"))).click();
		System.out.println("down Payment Borrower clickable");
// Clicking Back button 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
//Source of 2nd loan on Subject Project
		driver.findElement(By.id(Bor.getProperty("LoanOnSubjectProject"))).click();
		System.out.println("2nd loan on Subject Project clickable");
//Clicking Back button 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
//Source of Outside Investors
		driver.findElement(By.id(Bor.getProperty("OutsideInvestor"))).click();
		System.out.println("Outside Investors clickable");
//Clicking Back button 
		Thread.sleep(3000);
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
//Source of Other
		driver.findElement(By.id(Bor.getProperty("Other"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Bor.getProperty("OtherInputText"))).sendKeys("Bank");
		driver.findElement(By.className(Bor.getProperty("SearchInput"))).click();
		System.out.println("others clickable");
//Clicking Back button 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
		Thread.sleep(2000);
//Source of downpayment
		driver.findElement(By.id(Bor.getProperty("SourceOfDownPayment"))).click();
//plan for paying off the loan
//Sale
		driver.findElement(By.xpath(Bor.getProperty("Sale"))).click();
//applicable licenses
		driver.findElement(By.id(Bor.getProperty("GeneralContractor"))).click();
		System.out.println("General Contractor clickable");
		Thread.sleep(5000);
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
		Thread.sleep(2000);
//realEstate Borrower
		driver.findElement(By.id(Bor.getProperty("RealEstateBorrower/Agent"))).click();
		System.out.println("real Estate Borrower clickable");
//Clicking Change 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
//Not Applicable
		driver.findElement(By.id(Bor.getProperty("NotApplicable"))).click();
		System.out.println("Not Applicable clickable");
//Clicking Change 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
//Others 

		driver.findElement(By.id(Bor.getProperty("Other's"))).click();
		System.out.println("Others  clickable");
		Thread.sleep(2000);
		driver.findElement(By.name(Bor.getProperty("OtherDownpayment"))).sendKeys("NO");
		driver.findElement(By.className(Bor.getProperty("OtherSubmit"))).click();
//Clicking Change 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
		Thread.sleep(3000);
//Clicking Change 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
//plan for paying off the loan
//Refinance
		driver.findElement(By.id(Bor.getProperty("Refinance"))).click();
//applicable licenses
		driver.findElement(By.id(Bor.getProperty("GeneralContractor"))).click();
		System.out.println("General Contractor clickable");
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
//realEstate Borrower
		driver.findElement(By.id(Bor.getProperty("RealEstateBorrower/Agent"))).click();
		System.out.println("real Estate Borrower clickable");
		Thread.sleep(3000);
//Clicking Change 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
//Not Applicable
		driver.findElement(By.id(Bor.getProperty("NotApplicable"))).click();
		System.out.println("Not Applicable clickable");
//Clicking Change 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
//Others 

		driver.findElement(By.id(Bor.getProperty("Other's"))).click();
		System.out.println("Others  clickable");
		driver.findElement(By.name(Bor.getProperty("OtherDownpayment"))).sendKeys("NO");
		System.out.println(1);
		driver.findElement(By.className(Bor.getProperty("OtherSubmit"))).click();
//Clicking Change 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
		System.out.println(2);
		Thread.sleep(3000);
//Clicking Change 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
		System.out.println(3);
//otherLoanBorrower
		driver.findElement(By.id(Bor.getProperty("OtherLoanBorrower"))).click();
		driver.findElement(By.name(Bor.getProperty("OtherDownpayment"))).sendKeys("NO");
		driver.findElement(By.className(Bor.getProperty("OtherSubmit"))).click();
		System.out.println(4);
//Clicking Change 
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
		System.out.println(5);
		Thread.sleep(3000);
		// Clicking Change
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
		System.out.println(6);
		// Selecting Borrower cash
		driver.findElement(By.id(Bor.getProperty("SourceOfDownPayment"))).click();
		Thread.sleep(3000);
		// What is your plan for paying off the loan?
		driver.findElement(By.xpath(Bor.getProperty("Sale"))).click();
		// Do you have any applicable licenses?
		driver.findElement(By.id(Bor.getProperty("GeneralContractor"))).click();
		// Execution Strategy Summary
		driver.findElement(By.id(Bor.getProperty("SpecificExecutionStrategy")))
				.sendKeys("Purchase details need to enter");
		// NEXT
		driver.findElement(By.id(Bor.getProperty("NextButton"))).click();

		System.out.println(9);
		// ============================== TAB 5 Borrower info
		// Click NEXT for to display all Validation for fields
		Actions InfoNext = new Actions(driver);
		InfoNext.moveToElement(driver.findElement(By.id(Bor.getProperty("PropertyInfoNext")))).click().perform();
		System.out.println("Validation displayed for borrower info");
		// Borrower First Name
		WebElement FirstName = driver.findElement(By.id(Bor.getProperty("FirstName")));
		FirstName.sendKeys("Tim");
		// WebElement F1=FirstName;
		//// Borrower Last Name
		driver.findElement(By.id(Bor.getProperty("LastName"))).sendKeys("Jukes");
		// Borrwers Email
		WebElement Email = driver.findElement(By.id(Bor.getProperty("Email")));
		Email.sendKeys("Tim");
		System.out.println("Validation for email displayed");

		// Borrower Phone Number
		WebElement Phone = driver.findElement(By.id(Bor.getProperty("Phone")));
		Phone.sendKeys("asadsd");
		System.out.println("Validation for Phone Number  displayed");
		// Borrower Primary Occupation
		driver.findElement(By.id(Bor.getProperty("Occupation"))).sendKeys("Software ");
		// borrowerInvestmentProperties
		driver.findElement(By.id(Bor.getProperty("InvestmentProperties"))).sendKeys("2");
		// borrowercreditScore
		WebElement CreditScore = driver.findElement(By.id(Bor.getProperty("CreditScore")));
		CreditScore.sendKeys("NO");
		System.out.println("Validation for borrower credit Score displayed");
		// borrowerLiquidCashReserve
		WebElement CashReserve = driver.findElement(By.id(Bor.getProperty("LiquidCashReserve")));
		CashReserve.sendKeys("Money");
		System.out.println("Validation for  borrower Liquid CashReserve displayed");
		// borrowerAccountExecutive
		Thread.sleep(3000);
		WebDriverWait AccExecutives = new WebDriverWait(driver, Duration.ofSeconds(3000));
		AccExecutives.until(ExpectedConditions.elementToBeClickable(By.id(Bor.getProperty("AccountExecutive"))))
				.click();
		WebElement Executive = driver.findElement(By.id(Bor.getProperty("AccountExecutive")));
		Executive.sendKeys("srikanth mvv");
		Executive.click();

		Thread.sleep(3000);

		System.out.println("Validation for borrower Account Executive  displayed");
		// borrowerReferredBy
		driver.findElement(By.id(Bor.getProperty("ReferredBy"))).sendKeys("Other");
		// Address
		WebDriverWait Address1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		Address1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Bor.getProperty("RefinancingAddress"))))
				.sendKeys("California");
		Thread.sleep(3000);
		WebElement AddressSelection = driver.findElement(By.xpath(Bor.getProperty("RefinancingAddress")));

		AddressSelection.sendKeys(Keys.ARROW_DOWN);

		AddressSelection.sendKeys(Keys.ENTER);

		System.out.println("Address Entered successfully");
		Thread.sleep(3000);
		// Is Borrower an Entity?
		driver.findElement(By.id(Bor.getProperty("EntityNo"))).click();
		System.out.println("Entity No Selected");
		Thread.sleep(3000);
		driver.findElement(By.id(Bor.getProperty("EntityYes"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(Bor.getProperty("EntityName"))).sendKeys("Tim Jukes");

		System.out.println("Entity YES Selected");

		Thread.sleep(3000);
		Email.clear();
		Email.sendKeys("TimJukes456709@yopmail.com");
		Phone.clear();
		Phone.sendKeys("9899898989");
		CreditScore.clear();
		CreditScore.sendKeys("789");
		CashReserve.clear();
		CashReserve.sendKeys("230000");
		Thread.sleep(3000);
		// NEXT Click
		Actions propertyinfonext = new Actions(driver);
		propertyinfonext.moveToElement(driver.findElement(By.id(Bor.getProperty("PropertyInfoNext")))).click()
				.perform();
//		=============================== TAB 6 SUBMIT APP
		Thread.sleep(3000);

	}
}
