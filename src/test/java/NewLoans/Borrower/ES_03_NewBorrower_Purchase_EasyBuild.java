package NewLoans.Borrower;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import base.BaseTest;
import utilities.ReadxlsData;

public class ES_03_NewBorrower_Purchase_EasyBuild extends BaseTest {
	@Test

	
	public void NewBorrower_purchase()  throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		 driver.findElement(By.id(loc.getProperty("teammember_button"))).click();
		
		// Enter User Name
		driver.findElement(By.id(loc.getProperty("emailid"))).sendKeys("mvvsrikanth@sanchaninfo.com");

		// Enter password Name

		driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys("Sanchan@123");

		driver.findElement(By.id(loc.getProperty("Login_button"))).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText(Bor.getProperty("Loanmenu"))).click();
		Thread.sleep(3000);
		/*
		 * BORROWER SELECTION
		 */

		/*
		 * 
		 * TAB 1 PROPERTY INFO
		 */
		driver.findElement(By.id(Bor.getProperty("Borrower"))).click();

		driver.findElement(By.id(Bor.getProperty("Purchase"))).click();
		// WHAT STEP IN THE PROCESS ARE YOU AT?
		driver.findElement(By.id(Bor.getProperty("DoingReasearch"))).click();

		Thread.sleep(3000);
		WebElement address = driver.findElement(By.name(Bor.getProperty("Address")));
		address.sendKeys("California");
		

		address.sendKeys(Keys.ARROW_DOWN);

		address.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		Actions Next = new Actions(driver);
		Next.moveToElement(driver.findElement(By.id(Bor.getProperty("PropertyInfoNext")))).click().perform();
		Thread.sleep(3000);
		/*
		 * 
		 * TAB 2 LOAN PROGRAM
		 */
		driver.findElement(By.id(Bor.getProperty("EasyBuild"))).click();
		/*
		 * 
		 * TAB 3 DEAL INFO
		 */
		// singlePurchasingBuild
		Thread.sleep(5000);
		// clicking on NEXT for validation
		Actions Next1 = new Actions(driver);
		Next1.moveToElement(driver.findElement(By.id(Bor.getProperty("DealInfoNext")))).click().perform();
		// driver.findElement(By.id("dealInfoNext")).click();
		System.out.println("Purchase details validation displayed");
		Thread.sleep(5000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,-250)", "");
	   Thread.sleep(5000);

		// Property type
		Actions singlePurchasingBuild = new Actions(driver);
		singlePurchasingBuild.moveToElement(driver.findElement(By.id(Bor.getProperty("SingleFamilyResidency")))).click()
				.perform();

		System.out.println("Purchase details validation displayed");
		// Purchase Price
		driver.findElement(By.id(Bor.getProperty("PurchasePrice"))).sendKeys("659000");
		// Construction Bugdet
		driver.findElement(By.id(Bor.getProperty("ConstructionBudget"))).sendKeys("250000");
		// total square footage

		driver.findElement(By.id(Bor.getProperty("TotalSquareFootage"))).sendKeys("2000");
		// Total bedrooms
		driver.findElement(By.id(Bor.getProperty("BedRooms"))).sendKeys("3");
		// Total bathrooms
		driver.findElement(By.id(Bor.getProperty("BathRooms"))).sendKeys("4");
		Thread.sleep(5000);
		// property has a pool
		Actions NoPool = new Actions(driver);
		NoPool.moveToElement(driver.findElement(By.id(Bor.getProperty("NoPool")))).click().perform();

		System.out.println("Pool No clickable");
		driver.findElement(By.id(Bor.getProperty("PoolYes"))).click();
		System.out.println("Pool Yes clickable");
		// square footage of the lot
		driver.findElement(By.id(Bor.getProperty("SquareFootageOfLot"))).sendKeys("1400");
		// completed value
		driver.findElement(By.id(Bor.getProperty("CompleteValue"))).sendKeys("350000");
		Thread.sleep(5000);
		// Target complete date

		Actions date = new Actions(driver);
		date.moveToElement(driver.findElement(By.id(Bor.getProperty("TargetClosingDate"))));
		driver.findElement(By.id(Bor.getProperty("TargetClosingDate"))).sendKeys("18/07/2025");

		// occupancyStatus
		WebElement occupancyStatus = driver.findElement(By.id(Bor.getProperty("OccupancyStatus")));
		JavascriptExecutor occupancy_Status = (JavascriptExecutor) driver;
		occupancy_Status.executeScript("arguments[0].click();", occupancyStatus);
		occupancyStatus.sendKeys("Tenant Occupied");
		Thread.sleep(2000);
		// Collateral Property
		WebElement CollateralPropertyNo = driver.findElement(By.id(Bor.getProperty("NoCollateralProperty")));
		JavascriptExecutor CollateralProperty_No = (JavascriptExecutor) driver;
		CollateralProperty_No.executeScript("arguments[0].click();", CollateralPropertyNo);
		Thread.sleep(2000);
		// Collateral Property collateralpropertyNoPurchaseBuild
		WebElement CollateralPropertyYes = driver.findElement(By.id(Bor.getProperty("CollateralPropertyYes")));
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
		System.out.println(350000);
		// proposedLienPosition
		Thread.sleep(3000);
		WebElement proposedLienPosition = driver.findElement(By.id(Bor.getProperty("ProposedLienPosition")));
		JavascriptExecutor proposedLien_Position = (JavascriptExecutor) driver;
		proposedLien_Position.executeScript("arguments[0].click();", proposedLienPosition);
		Thread.sleep(1000);
		proposedLienPosition.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		proposedLienPosition.sendKeys(Keys.ENTER);
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
		lotArea.sendKeys("3000");
		// occupancyStatus
		WebElement occupancyStatus1 = driver.findElement(By.id(Bor.getProperty("c.OccupancyStatus")));
		JavascriptExecutor occupancy_Status1 = (JavascriptExecutor) driver;
		occupancy_Status1.executeScript("arguments[0].click();", occupancyStatus1);
		occupancyStatus1.sendKeys("Tenant Occupied");
		Thread.sleep(2000);
		WebDriverWait Estimatedvalue = new WebDriverWait(driver, Duration.ofSeconds(30));
		Estimatedvalue.until(ExpectedConditions.visibilityOfElementLocated(By.id(Bor.getProperty("EstimatedValue"))))
				.sendKeys("895000");
		Thread.sleep(3000);
		WebElement homeAdress = driver.findElement(By.name(Bor.getProperty("PropertyHomeAddress")));
		homeAdress.sendKeys("Cali");
		Thread.sleep(2000);
		homeAdress.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		homeAdress.sendKeys(Keys.ENTER);
		
		System.out.println("PropertyHomeAddress");
		// clicking on NEXT
		Thread.sleep(5000);

		Actions DealNext = new Actions(driver);
		Next.moveToElement(driver.findElement(By.id(Bor.getProperty("DealInfoNext")))).click().perform();
		Thread.sleep(3000);
		
		/*WebElement DealNext = driver.findElement(By.id(Bor.getProperty("DealInfoNext")));
		JavascriptExecutor next = (JavascriptExecutor)driver;
		next.executeScript("arguments[0].click();", DealNext);

		/*WebDriverWait next = new WebDriverWait(driver, Duration.ofSeconds(3000));
		next.until(ExpectedConditions.elementToBeClickable(By.id(Bor.getProperty("DealInfoNext")))).click();

		/*
		 * 
		 * TAB 4 EASY BUILDStrategy Info
		 */
		// Source of downpayment
		 WebElement DownPayments =     driver.findElement(By.id(Bor.getProperty("SourceOfDownPayment")));
		 DownPayments.click();
		System.out.println("down Payment Borrower clickable");
		// Clicking Back button
		WebElement BackNavigation=driver.findElement(By.linkText(Bor.getProperty("PreviousPage")));
		BackNavigation.click();
		// Source of 2nd loan on Subject Project
		driver.findElement(By.id(Bor.getProperty("LoanOnSubjectProject"))).click();
		System.out.println("2nd loan on Subject Project clickable");
		Thread.sleep(3000);
		// Clicking Back button
		 BackNavigation.click();
		//driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
		// Source of Outside Investors
		driver.findElement(By.id(Bor.getProperty("outsideInvestor"))).click();
		System.out.println("Outside Investors clickable");
		// Clicking Back button
		Thread.sleep(3000);
		 BackNavigation.click();
		//driver.findElement(By.linkText("keyboard_backspace")).click();
		// Source of Other
		driver.findElement(By.id(Bor.getProperty("Other"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Bor.getProperty("OtherInputText")))
				.sendKeys("Bank");
		driver.findElement(By.className(Bor.getProperty("SearchInput"))).click();
		System.out.println("others clickable");
		// Clicking Back button
		Thread.sleep(3000);
		 BackNavigation.click();
		//driver.findElement(By.linkText("keyboard_backspace")).click();
		Thread.sleep(3000);
		// Source of downpayment
		// DownPayments.click();
	    driver.findElement(By.id(Bor.getProperty("SourceOfDownPayment"))).click();
		// plan for paying off the loan
		// Sale
		driver.findElement(By.id(Bor.getProperty("Sale"))).click();
		// applicable licenses
		driver.findElement(By.id(Bor.getProperty("GeneralContractor"))).click();
		System.out.println("General Contractor clickable");
		Thread.sleep(5000);
		BackNavigation.click();
		//driver.findElement(By.linkText("keyboard_backspace")).click();
		Thread.sleep(2000);
		// realEstate Borrower
		driver.findElement(By.id(Bor.getProperty("RealEstateBorrower/Agent"))).click();
		System.out.println("real Estate Borrower clickable");
		// Clicking Change
		Thread.sleep(5000);
		BackNavigation.click();
		//driver.findElement(By.linkText("keyboard_backspace")).click();
		// Not Applicable
		driver.findElement(By.id(Bor.getProperty("NotApplicable"))).click();
		System.out.println("Not Applicable clickable");
		// Clicking Change
		Thread.sleep(5000);
		BackNavigation.click();
		//driver.findElement(By.linkText("keyboard_backspace")).click();
		// Others

		driver.findElement(By.id(Bor.getProperty("Other's"))).click();
		System.out.println("Others  clickable");
		Thread.sleep(2000);
		driver.findElement(By.name(Bor.getProperty("OtherDownpayment"))).sendKeys("NO");
		driver.findElement(By.className(Bor.getProperty("OtherSubmit"))).click();
		// Clicking Change
	//	driver.findElement(By.linkText("keyboard_backspace")).click();
	//	Thread.sleep(3000);
		// Clicking Change
		Thread.sleep(5000);
		BackNavigation.click();
		Thread.sleep(5000);
		BackNavigation.click();
		//driver.findElement(By.linkText("keyboard_backspace")).click();
		// plan for paying off the loan
		// Refinance
		Thread.sleep(3000);
		driver.findElement(By.id(Bor.getProperty("Refinance"))).click();
		Thread.sleep(3000);
		// applicable licenses
		driver.findElement(By.id(Bor.getProperty("GeneralContractor"))).click();
		System.out.println("General Contractor clickable");
		Thread.sleep(5000);
		BackNavigation.click();
		//driver.findElement(By.linkText("keyboard_backspace")).click();
		// realEstate Borrower
		Thread.sleep(3000);
		driver.findElement(By.id(Bor.getProperty("RealEstateBorrower/Agent"))).click();
		System.out.println("RealEstateBorrower/Agent");
		Thread.sleep(3000);
		// Clicking Change
		driver.findElement(By.linkText(Bor.getProperty("PreviousPage"))).click();
		// Not Applicable
		driver.findElement(By.id(Bor.getProperty("NotApplicable"))).click();
		System.out.println("Not Applicable clickable");
		// Clicking Change
		Thread.sleep(5000);
		BackNavigation.click();
	//	driver.findElement(By.linkText("keyboard_backspace")).click();
		// Others

		driver.findElement(By.id(Bor.getProperty("Other's"))).click();
		System.out.println("Others  clickable");
		driver.findElement(By.name(Bor.getProperty("OtherDownpayment"))).sendKeys("NO");
		
		driver.findElement(By.className(Bor.getProperty("OtherSubmit"))).click();
		// Clicking Change
		Thread.sleep(5000);
		BackNavigation.click();
		//driver.findElement(By.linkText("keyboard_backspace")).click();
	
		Thread.sleep(3000);
		// Clicking Change
		Thread.sleep(5000);
		BackNavigation.click();
		//driver.findElement(By.linkText("keyboard_backspace")).click();
		
		// otherLoanBorrower
		driver.findElement(By.id(Bor.getProperty("OtherLoanBorrower"))).click();
		driver.findElement(By.name(Bor.getProperty("OtherDownpayment"))).sendKeys("NO");
		driver.findElement(By.className(Bor.getProperty("OtherSubmit"))).click();
		System.out.println(4);
		// Clicking Change
		Thread.sleep(5000);
		BackNavigation.click();
	//	driver.findElement(By.linkText("keyboard_backspace")).click();
		System.out.println(5);
		Thread.sleep(3000);
		// Clicking Change
		Thread.sleep(5000);
		BackNavigation.click();
	//	driver.findElement(By.linkText("keyboard_backspace")).click();
		
		// Selecting Borrower cash
		driver.findElement(By.id(Bor.getProperty("SourceOfDownPayment"))).click();
		Thread.sleep(3000);
		// What is your plan for paying off the loan?
		driver.findElement(By.id(Bor.getProperty("Sale"))).click();
		// Do you have any applicable licenses?
		driver.findElement(By.id(Bor.getProperty("GeneralContractor"))).click();
		// Execution Strategy Summary
		driver.findElement(By.id(Bor.getProperty("SpecificExecutionStrategy"))).sendKeys("Purchase details need to enter");
		// NEXT
		driver.findElement(By.id(Bor.getProperty("NextButton"))).click();

		
		/*
		 * TAB 5 Borrower info
		 */
		// Click NEXT for to display all Validation for fields
		Actions Next2 = new Actions(driver);
		Next2.moveToElement(driver.findElement(By.id("borrowerBrokerNext"))).click().perform();
		System.out.println("Validation displayed for borrower info");
		// Borrower First Name
		WebElement FirstName = driver.findElement(By.id(Bor.getProperty("FirstName")));
		FirstName.sendKeys("Umar");
		WebElement F1 = FirstName;
		//// Borrower Last Name
		driver.findElement(By.id(Bor.getProperty("LastName"))).sendKeys("Khana");
		// Borrwers Email
		WebElement Email = driver.findElement(By.id(Bor.getProperty("Email")));
		Email.sendKeys("Umar");
		System.out.println("Validation for email displayed");

		// Borrower Phone Number
		WebElement Phone = driver.findElement(By.id(Bor.getProperty("Phone")));
		Phone.sendKeys("asadsd");
		System.out.println("Validation for Phone Number  displayed");
		// Borrower Primary Occupation
		driver.findElement(By.id(Bor.getProperty("Occupation"))).sendKeys("Bussiness ");
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
		AccExecutives.until(ExpectedConditions.elementToBeClickable(By.id(Bor.getProperty("AccountExecutive")))).click();
		WebElement Executive = driver.findElement(By.id(Bor.getProperty("AccountExecutive")));
		Executive.sendKeys("srikanth mvv");
		Executive.click();

		Thread.sleep(3000);

		System.out.println("Validation for borrower Account Executive  displayed");
		// borrowerReferredBy
		driver.findElement(By.id(Bor.getProperty("ReferredBy"))).sendKeys("Other");
		// Address
		WebDriverWait Address1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		Address1.until(ExpectedConditions.visibilityOfElementLocated(By.name(Bor.getProperty("Addresses"))))
				.sendKeys("California");
		Thread.sleep(3000);
		WebElement AddressSelection = driver.findElement(By.name(Bor.getProperty("Addresses")));

		AddressSelection.sendKeys(Keys.ARROW_DOWN);

		AddressSelection.sendKeys(Keys.ENTER);

		System.out.println("Address Entered successfully");
		Thread.sleep(3000);
		// Is Borrower AN Entity ?
		WebElement BorrowerNo = driver.findElement(By.id(Bor.getProperty("EntityNo")));
		JavascriptExecutor Borrower_No = (JavascriptExecutor) driver;
		Borrower_No.executeScript("arguments[0].click();", BorrowerNo);

		System.out.println("Borrower is  Not  Entity clicked");
		Thread.sleep(3000);
		WebElement BorrowerYes = driver.findElement(By.id(Bor.getProperty("EntityYes")));
		JavascriptExecutor Borrower_Yes = (JavascriptExecutor) driver;
		Borrower_Yes.executeScript("arguments[0].click();", BorrowerYes);

		Thread.sleep(3000);
		driver.findElement(By.id(Bor.getProperty("EntityName"))).sendKeys("Umar");

		System.out.println("Borrower is  an  Entity clicked");

		Thread.sleep(3000);
		Email.clear();
		Email.sendKeys("Umar909090@yopmail.com");
		Phone.clear();
		Phone.sendKeys("9899898989");
		CreditScore.clear();
		CreditScore.sendKeys("789");
		CashReserve.clear();
		CashReserve.sendKeys("350000");
		Thread.sleep(3000);
		// Is Any CO-Borrower ?

		WebElement coBorrowerNo = driver.findElement(By.id(Bor.getProperty("NoCoBorrower")));
		JavascriptExecutor coBorrower_No = (JavascriptExecutor) driver;
		coBorrower_No.executeScript("arguments[0].click();", coBorrowerNo);
		System.out.println("No Co-Borrower is  clicked");
		Thread.sleep(3000);
		WebElement coBorrowerYes = driver.findElement(By.id(Bor.getProperty("BorrowerYes")));
		JavascriptExecutor coBorrower_Yes = (JavascriptExecutor) driver;
		coBorrower_Yes.executeScript("arguments[0].click();", coBorrowerYes);
		System.out.println("Yes Co-Borrower is  clicked");

		Thread.sleep(3000);
		// NEXT Click
		Actions Next3 = new Actions(driver);
		Next3.moveToElement(driver.findElement(By.id("borrowerBrokerNext"))).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.name(Bor.getProperty("CoBorrowerFirstname"))).sendKeys("Josheph");
		Thread.sleep(3000);
		driver.findElement(By.name(Bor.getProperty("CoBorrowerLastname"))).sendKeys("Fedrick");
		Thread.sleep(3000);
		Thread.sleep(3000);
		WebElement coBorrowerEmail = driver.findElement(By.name(Bor.getProperty("CoBorrowerEmail")));
		coBorrowerEmail.sendKeys("1803569878");
		WebElement coBorrowerPhone = driver.findElement(By.name(Bor.getProperty("CoBorrowerPhone")));
		JavascriptExecutor coBorrower_Phone = (JavascriptExecutor) driver;
		coBorrower_Phone.executeScript("arguments[0].click();", coBorrowerPhone);
		coBorrowerPhone.sendKeys("1803569878");

		Thread.sleep(3000);
		driver.findElement(By.name(Bor.getProperty("CoBorrowerOccupation"))).sendKeys("Salesman");
		Thread.sleep(3000);
		driver.findElement(By.id(Bor.getProperty("CoBorrowerInvestmentProperties"))).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.name(Bor.getProperty("CoBorrowerCreditscore"))).sendKeys("859");
		Thread.sleep(3000);
		driver.findElement(By.name(Bor.getProperty("CoBorrowerLiquidCashreserve"))).sendKeys("568000");
		Thread.sleep(3000);
		WebDriverWait coAddress = new WebDriverWait(driver, Duration.ofSeconds(30));
		coAddress.until(ExpectedConditions.visibilityOfElementLocated(By.name(Bor.getProperty("CoBorrowerAddress"))))
				.sendKeys("California");
		Thread.sleep(3000);
		WebElement coBorroweAddressselection = driver.findElement(By.name(Bor.getProperty("CoBorrowerAddress")));

		coBorroweAddressselection.sendKeys(Keys.ARROW_DOWN);

		coBorroweAddressselection.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.name(Bor.getProperty("NoCoBorrowerEntity"))).click();
		Thread.sleep(3000);
		driver.findElement(By.name(Bor.getProperty("YesCoBorrowerEntity"))).click();
		Thread.sleep(3000);
		driver.findElement(By.name(Bor.getProperty("CoBorrowerEntityName"))).sendKeys("David");
		Thread.sleep(3000);
		// NEXT Click
		Actions Next4 = new Actions(driver);
		Next4.moveToElement(driver.findElement(By.id(Bor.getProperty("PropertyInfoNext")))).click().perform();
		Thread.sleep(3000);
		coBorrowerEmail.clear();
		Thread.sleep(3000);
		coBorrowerEmail.sendKeys("Josheph");
		Thread.sleep(3000);
		// NEXT Click
		Actions Next5 = new Actions(driver);
		Next5.moveToElement(driver.findElement(By.id(Bor.getProperty("PropertyInfoNext")))).click().perform();
		Thread.sleep(3000);
		WebElement coBorrower_Email = driver.findElement(By.name(Bor.getProperty("CoBorrowerEmail")));
		JavascriptExecutor clearEmail = (JavascriptExecutor) driver;
		clearEmail.executeScript("arguments[0].value='';", coBorrower_Email);

		Thread.sleep(3000);
		coBorrower_Email.sendKeys("Josheph89045@yopmail.com");
		Thread.sleep(3000);
		// NEXT Click
		Actions Next6 = new Actions(driver);
		Next6.moveToElement(driver.findElement(By.id(Bor.getProperty("PropertyInfoNext")))).click().perform();
		Thread.sleep(3000);
		// =============================== TAB 6 SUBMIT APP

		/*
		 * Actions UploadPhoto= new Actions(driver);
		 * UploadPhoto.moveToElement(driver.findElement(By.id("uploadPhotoId"))).click()
		 * .perform();
		 * 
		 * WebElement upload = driver.findElement(By.id("uploadPhotoId"));
		 * upload.sendKeys("‪C:\\Users\\mvvsr\\Downloads\\AdamScott.jpg");
		 * 
		 * //*[@id="root"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/label/text()
		 * 
		 */
		driver.quit();

	}
}
