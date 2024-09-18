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

public class ES_17_0_NewBorrower_Refinancings__EasyBuild{
  @Test
  public void NewBorrower_Refinancings() throws InterruptedException {System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
	 System.out.println("browser opened");
	  ChromeDriver driver = new ChromeDriver();
	  
	  
	  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
	  System.out.println("URL opened ");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
	  
	  driver.findElement(By.id("teamMemberButton")).click();
	  

// Enter User Name
	driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com");
	
	// Enter password Name
	 
	 driver.findElement(By.id("loginPassword")).sendKeys("Sanchan@123");
	
   driver.findElement(By.id("loginButton")).click();
   Thread.sleep(5000);
  driver.findElement(By.linkText("New Loan")).click();
  Thread.sleep(3000);
  //===========================TAB 1 PROPERTY INFO
  driver.findElement(By.id("newPipelineBorrowerButton")).click();
  driver.findElement(By.id("refinancing")).click();
  //ADDRESS SELECTION
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search City and Zip Code']"))).sendKeys("California");
  Thread.sleep(3000);
  WebElement address=driver.findElement(By.xpath("//input[@placeholder='Search City and Zip Code']"));
  
  address.sendKeys(Keys.ARROW_DOWN);
  
  address.sendKeys(Keys.ENTER);
  Thread.sleep(5000);
	
  Actions Next =  new Actions(driver);
  Next.moveToElement(driver.findElement(By.id("borrowerBrokerNext"))).click().perform();
  
//===========================TAB 2 LOAN PROGRAM
  Thread.sleep(5000);
  driver.findElement(By.id("easyBuildLoanProgram")).click();
//========================TAB 3 DEAL INFO
  //singlePurchasingBuild
  Thread.sleep(5000);
  //Purchase Price 
  driver.findElement(By.id("purchasePriceRefinanceBuild")).sendKeys("669000");
  //PURCHASE PROPERTY DATE
  Actions date = new Actions(driver);
  date.moveToElement(driver.findElement(By.id("purchaseDateRefinanceBuild")));
  driver.findElement(By.id("purchaseDateRefinanceBuild")).sendKeys("29/03/2024");
   // total square footage 
  
  driver.findElement(By.id("propertyAreaRefinanceBuild")).sendKeys("2300");
  //Total bedrooms
  driver.findElement(By.id("totalBedroomsRefinanceBuild")).sendKeys("4");
  //Total bathrooms
  driver.findElement(By.id("totalBathroomsRefinanceBuild")).sendKeys("3");
  Thread.sleep(5000);
  //property has a pool
  Actions NoPool = new Actions(driver);
  NoPool.moveToElement(driver.findElement(By.id("poolNoRefinanceBuild"))).click().perform();

  System.out.println("Pool No clickable");
  driver.findElement(By.id("poolYesRefinanceBuild")).click();
  System.out.println("Pool Yes clickable");
  Thread.sleep(2000);
  //square footage of the lot
  driver.findElement(By.id("lotAreaRefinanceBuild")).sendKeys("1400");
  //DID YOU FINISHED BUILDING THE PROPERTY
  Thread.sleep(2000);
  
  Actions Property = new Actions(driver);
  Property.moveToElement(driver.findElement(By.id("finishedBuildingNoRefinanceBuild"))).click().perform();

  System.out.println("FINISHED BUILDING No clickable");
  driver.findElement(By.id("finishedBuildingYesRefinanceBuild")).click();
  System.out.println("FINISHED BUILDING Yes clickable");
  // Refinance Loan to provide construction funding
  Thread.sleep(2000);
  Actions RefinanceLoan = new Actions(driver);
  RefinanceLoan.moveToElement(driver.findElement(By.id("constructionFundingNoRefinanceBuild"))).click().perform();

  System.out.println("Refinance Loan No clickable");
  driver.findElement(By.id("constructionFundingYesRefinanceBuild")).click();
  System.out.println("Refinance Loan  Yes clickable");
  //How much is the existing loan
  driver.findElement(By.id("existingLoanRefinanceBuild")).sendKeys("330000");
  //What is the current value
  driver.findElement(By.id("currentValueRefinanceBuild")).sendKeys("467000");
  //What is the completed value?
  driver.findElement(By.id("completedRefinanceBuild")).sendKeys("565000");
 //Target complete date
  Actions CompleteDate = new Actions(driver);
  CompleteDate.moveToElement(driver.findElement(By.id("constructionCompletedRefinanceBuild")));
  driver.findElement(By.id("constructionCompletedRefinanceBuild")).sendKeys("18/07/2025");
  // occupancyStatus
  WebElement occupancyStatus = driver.findElement(By.id("occupancyStatus"));
  JavascriptExecutor occupancy_Status = (JavascriptExecutor)driver;
  occupancy_Status.executeScript("arguments[0].click();", occupancyStatus);
  occupancyStatus.sendKeys("Delivered Vacant");
  Thread.sleep(2000);
	 //Collateral Property 
	   WebElement  CollateralPropertyNo = driver.findElement(By.id("collateralpropertyNoRefinanceBuild"));
	   JavascriptExecutor CollateralProperty_No = (JavascriptExecutor)driver;
	   CollateralProperty_No.executeScript("arguments[0].click();", CollateralPropertyNo);
	   Thread.sleep(2000);
	   //Collateral Property collateralpropertyNoPurchaseBuild
	   WebElement  CollateralPropertyYes = driver.findElement(By.id("collateralpropertyYesRefinanceBuild"));
	   JavascriptExecutor CollateralProperty_Yes = (JavascriptExecutor)driver;
	   CollateralProperty_Yes.executeScript("arguments[0].click();", CollateralPropertyYes);
	   Thread.sleep(3000);
	   
		 //Current Loan 
		   Thread.sleep(2000);
		   WebElement  curentLoanNo = driver.findElement(By.id("collateralCurrentLoanNo"));
		   JavascriptExecutor curentLoan_No = (JavascriptExecutor)driver;
		   curentLoan_No.executeScript("arguments[0].click();", curentLoanNo);
		   Thread.sleep(3000);
		   //Collateral Property collateralpropertyNoPurchaseBuild
		   WebElement  curentLoanYes = driver.findElement(By.id("collateralCurrentLoanYes"));
		   JavascriptExecutor curentLoan_Yes = (JavascriptExecutor)driver;
		   curentLoan_Yes.executeScript("arguments[0].click();", curentLoanYes);
		   Thread.sleep(3000);
		   // existing loan 
		   WebElement existingloan = driver.findElement(By.id("collateralExistingLoan"));
		   JavascriptExecutor existing_loan = (JavascriptExecutor)driver;
		   existing_loan.executeScript("arguments[0].click();", existingloan);
		   existingloan.sendKeys("350000");
		   //proposedLienPosition
		   Thread.sleep(2000);
		   WebElement proposedLienPosition = driver.findElement(By.id("collatrealProposedLienPosition"));
		   JavascriptExecutor proposedLien_Position = (JavascriptExecutor)driver;
		   proposedLien_Position.executeScript("arguments[0].click();", proposedLienPosition);
		   proposedLienPosition.sendKeys(Keys.ARROW_DOWN);
		   proposedLienPosition.sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		   //propertyArea
		   WebElement propertyArea = driver.findElement(By.id("collateralPropertyArea"));
		   JavascriptExecutor property_Area = (JavascriptExecutor)driver;
		   property_Area.executeScript("arguments[0].click();", propertyArea);
		   propertyArea.sendKeys("2500");
		   Thread.sleep(2000);
		   driver.findElement(By.id("collateralTotalBedrooms")).sendKeys("3");
		   Thread.sleep(2000);
		   driver.findElement(By.id("collateralTotalBathrooms")).sendKeys("2");
		   Thread.sleep(2000);
		 //yearBuilt
		   WebElement yearBuilt = driver.findElement(By.id("collateralYearBuilt"));
		   JavascriptExecutor year_Built = (JavascriptExecutor)driver;
		   year_Built.executeScript("arguments[0].click();", yearBuilt);
		   yearBuilt.sendKeys("2000");
		 //Pool Details 
		   WebElement  poolNo = driver.findElement(By.id("collateralpoolNo"));
		   JavascriptExecutor pool_No = (JavascriptExecutor)driver;
		   pool_No.executeScript("arguments[0].click();", poolNo);
		   Thread.sleep(2000);
		   WebElement  poolYes = driver.findElement(By.id("collateralPoolYes"));
		   JavascriptExecutor pool_Yes = (JavascriptExecutor)driver;
		   pool_Yes.executeScript("arguments[0].click();", poolYes);
		   Thread.sleep(2000);
		   //LotArea
		   WebElement  lotArea = driver.findElement(By.id("collateralLotArea"));
		   JavascriptExecutor lot_Area = (JavascriptExecutor)driver;
		   lot_Area.executeScript("arguments[0].click();", lotArea);
		   Thread.sleep(3000);
		   lotArea.sendKeys("2500");
		   // occupancyStatus
		   WebElement occupancyStatus1 = driver.findElement(By.id("collateralOccupancyStatus"));
		   JavascriptExecutor occupancy_Status1 = (JavascriptExecutor)driver;
		   occupancy_Status1.executeScript("arguments[0].click();", occupancyStatus1);
		   occupancyStatus1.sendKeys("Tenant Occupied");
		   Thread.sleep(2000);
		   WebDriverWait collateralhomeAdresses = new WebDriverWait(driver, Duration.ofSeconds(30));
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("propertyPlace"))).sendKeys("California");
		   Thread.sleep(3000);
		   WebElement homeAdress=driver.findElement(By.name("propertyPlace"));

		   homeAdress.sendKeys(Keys.ARROW_DOWN);

		   homeAdress.sendKeys(Keys.ENTER);
//clicking on NEXT for validation
  Thread.sleep(5000);
  WebDriverWait next = new WebDriverWait(driver, Duration.ofSeconds(3000));
  next.until(ExpectedConditions.elementToBeClickable(By.id("dealInfoNext"))).click();
  
  //===================TAB 4 EASY BUILDStrategy Info
  //Source of downpayment
  driver.findElement(By.id("downPaymentBorrower")).click();
  System.out.println("down Payment Borrower clickable");
  // Clicking Back button 
  driver.findElement(By.linkText("keyboard_backspace")).click();
//Source of 2nd loan on Subject Project
  driver.findElement(By.id("subjectProjectBorrower")).click();
  System.out.println("2nd loan on Subject Project clickable");
// Clicking Back button 
  driver.findElement(By.linkText("keyboard_backspace")).click();
//Source of Outside Investors
  driver.findElement(By.id("outsideInvestorBorrower")).click();
  System.out.println("Outside Investors clickable");
// Clicking Back button 
  Thread.sleep(3000);
 driver.findElement(By.linkText("keyboard_backspace")).click();
  //Source of Other
  driver.findElement(By.id("otherPaymentBorrower")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div/div/input")).sendKeys("Bank");
  driver.findElement(By.className("search_btn")).click();
  System.out.println("others clickable");
// Clicking Back button 
  driver.findElement(By.linkText("keyboard_backspace")).click();
  Thread.sleep(2000);
  //Source of downpayment
  driver.findElement(By.id("downPaymentBorrower")).click();
  //plan for paying off the loan
  //Sale
  driver.findElement(By.id("saleBorrower")).click();
 //applicable licenses
  driver.findElement(By.id("generalContractorBorrower")).click();
  System.out.println("General Contractor clickable");
  Thread.sleep(5000);
  driver.findElement(By.linkText("keyboard_backspace")).click();
  Thread.sleep(2000);
  //realEstate Borrower
  driver.findElement(By.id("realEstateBorrower")).click();
  System.out.println("real Estate Borrower clickable");
// Clicking Change 
  driver.findElement(By.linkText("keyboard_backspace")).click();
  //Not Applicable
  driver.findElement(By.id("notApplicableBorrower")).click();
  System.out.println("Not Applicable clickable");
// Clicking Change 
  driver.findElement(By.linkText("keyboard_backspace")).click();
  //Others 

  driver.findElement(By.id("otherLicenseBorrower")).click();
  System.out.println("Others  clickable");
  Thread.sleep(2000);
  driver.findElement(By.name("sourceofdownpayent")).sendKeys("NO");
  driver.findElement(By.className("material-symbols-outlined")).click();
// Clicking Change 
  driver.findElement(By.linkText("keyboard_backspace")).click();
  Thread.sleep(3000); 
// Clicking Change 
  driver.findElement(By.linkText("keyboard_backspace")).click();
  //plan for paying off the loan
  //Refinance
  driver.findElement(By.id("refinanceBorrower")).click();
//applicable licenses
  driver.findElement(By.id("generalContractorBorrower")).click();
  System.out.println("General Contractor clickable");
  driver.findElement(By.linkText("keyboard_backspace")).click();
  //realEstate Borrower
  driver.findElement(By.id("realEstateBorrower")).click();
  System.out.println("real Estate Borrower clickable");
  Thread.sleep(3000); 
// Clicking Change 
  driver.findElement(By.linkText("keyboard_backspace")).click();
  //Not Applicable
  driver.findElement(By.id("notApplicableBorrower")).click();
  System.out.println("Not Applicable clickable");
// Clicking Change 
  driver.findElement(By.linkText("keyboard_backspace")).click();
  //Others 

  driver.findElement(By.id("otherLicenseBorrower")).click();
  System.out.println("Others  clickable");
  driver.findElement(By.name("sourceofdownpayent")).sendKeys("NO");
  System.out.println(1);
  driver.findElement(By.className("material-symbols-outlined")).click();
// Clicking Change 
  driver.findElement(By.linkText("keyboard_backspace")).click();
  System.out.println(2);
  Thread.sleep(3000); 
// Clicking Change 
  driver.findElement(By.linkText("keyboard_backspace")).click();
  System.out.println(3);
//otherLoanBorrower
  driver.findElement(By.id("otherLoanBorrower")).click();  
  driver.findElement(By.name("sourceofdownpayent")).sendKeys("NO");
 driver.findElement(By.className("material-symbols-outlined")).click();
 System.out.println(4);
// Clicking Change 
  driver.findElement(By.linkText("keyboard_backspace")).click();
  System.out.println(5);
  Thread.sleep(3000); 
	// Clicking Change 
	   driver.findElement(By.linkText("keyboard_backspace")).click();
	   System.out.println(6);
	   // Selecting Borrower cash
	  driver.findElement(By.id("downPaymentBorrower")).click();
	  Thread.sleep(3000);
	 //What is your plan for paying off the loan?
	   driver.findElement(By.id("saleBorrower")).click();   
	 //Do you have any applicable licenses?
	   driver.findElement(By.id("generalContractorBorrower")).click();
	  //Execution Strategy Summary
	   driver.findElement(By.id("executionStrategySummaryBorrower")).sendKeys("Purchase details need to enter");
      // NEXT 
	   driver.findElement(By.id("strategyInfoNext")).click();
	   
	   System.out.println(9);
	   //============================== TAB 5 Borrower info
	   //Click NEXT for to display all Validation for fields
	   Actions Next2 =  new Actions(driver);
	   Next2.moveToElement(driver.findElement(By.id("borrowerBrokerNext"))).click().perform();
	   System.out.println("Validation displayed for borrower info");
	   //Borrower First Name
	  WebElement FirstName= driver.findElement(By.id("borrowerFirstName"));
	  FirstName.sendKeys("Tim");
	  WebElement F1=FirstName;
	   ////Borrower Last  Name
	   driver.findElement(By.id("borrowerLastName")).sendKeys("Jukes");
	   // Borrwers Email
	 WebElement Email=  driver.findElement(By.id("borrowerEmail"));
	 Email.sendKeys("Tim");
	   System.out.println("Validation for email displayed");
	   
	   //Borrower Phone Number 
	  WebElement Phone= driver.findElement(By.id("borrowerPhone"));
	  Phone.sendKeys("asadsd");
	   System.out.println("Validation for Phone Number  displayed"); 
	   //Borrower Primary Occupation
	   driver.findElement(By.id("borrowerOccupation")).sendKeys("Software ");
	   //borrowerInvestmentProperties
	   driver.findElement(By.id("borrowerInvestmentProperties")).sendKeys("2");
	   //borrowercreditScore
	   WebElement CreditScore=driver.findElement(By.id("borrowercreditScore"));
	   CreditScore.sendKeys("NO");
	   System.out.println("Validation for borrower credit Score displayed");
	   //borrowerLiquidCashReserve
	   WebElement CashReserve =driver.findElement(By.id("borrowerLiquidCashReserve"));
	   CashReserve .sendKeys("Money");
	   System.out.println("Validation for  borrower Liquid CashReserve displayed");
	   //borrowerAccountExecutive
	   Thread.sleep(3000);
	   WebDriverWait AccExecutives = new WebDriverWait(driver, Duration.ofSeconds(3000));
	   AccExecutives.until(ExpectedConditions.elementToBeClickable(By.id("borrowerAccountExecutive"))).click();
	   WebElement Executive = driver.findElement(By.id("borrowerAccountExecutive"));
	   Executive.sendKeys("srikanth mvv");
	   Executive.click();
	
	   
	   Thread.sleep(3000);
	   
	   
	
	   System.out.println("Validation for borrower Account Executive  displayed");
	   //borrowerReferredBy
	   driver.findElement(By.id("borrowerReferredBy")).sendKeys("Other");
	   //Address 
	   WebDriverWait Address1 = new WebDriverWait(driver, Duration.ofSeconds(30));
	   Address1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search City and Zip Code']"))).sendKeys("California");
	   Thread.sleep(3000);
	   WebElement AddressSelection=driver.findElement(By.xpath("//input[@placeholder='Search City and Zip Code']"));
	   
	   AddressSelection.sendKeys(Keys.ARROW_DOWN);
	   
	   AddressSelection.sendKeys(Keys.ENTER); 
	   
	   System.out.println("Address Entered successfully");
	   Thread.sleep(3000);
	   //Is Borrower an Entity?
	   driver.findElement(By.id("borrowerEntityNo")).click();
	   System.out.println("Entity No Selected");
	   Thread.sleep(3000);
	   driver.findElement(By.id("borrowerEntityYes")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.id("borrowerEntityName")).sendKeys("Tim Jukes");
	   
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
	   //NEXT Click
	  Actions Next3 =  new Actions(driver);
	   Next3.moveToElement(driver.findElement(By.id("borrowerBrokerNext"))).click().perform(); 
//		=============================== TAB 6 SUBMIT APP
	   Thread.sleep(3000); 
	   driver.quit();
  }
}
