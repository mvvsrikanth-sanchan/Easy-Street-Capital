package NewLoans.Broker;

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

import com.codeborne.selenide.impl.WebdriverPhotographer;

import gherkin.lexer.Th;

public class ES_20_NewBROKER_Purchase_EasyBuild {
  @Test
  public void NewBROKERPurchaseEasyBuild() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
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
	   driver.findElement(By.id("sideMenu-NewLoan")).click();
	   Thread.sleep(3000);
	  // LOAN TYPE SELECTION 
	   driver.findElement(By.id("newPipelineBrokerButton")).click();
	  //driver.findElement(By.cssSelector(".justify-content-center > button:nth-child(1)")).click();
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/button[1]")).click();
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div/button[2]")).click();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search City and Zip Code']"))).sendKeys("California");
	   Thread.sleep(3000);
	   WebElement address=driver.findElement(By.xpath("//input[@placeholder='Search City and Zip Code']"));

	   address.sendKeys(Keys.ARROW_DOWN);

	   address.sendKeys(Keys.ENTER);
	   //  address.click();

	   Thread.sleep(5000);

	   Actions Next =  new Actions(driver);
	   Next.moveToElement(driver.findElement(By.id("borrowerBrokerNext"))).click().perform();
	   Thread.sleep(5000);
	 //===========================TAB 2 LOAN PROGRAM
	   driver.findElement(By.id("easyBuildLoanProgram")).click();
	   //========================TAB 3 DEAL INFO
	   //singlePurchasingBuild
	   Thread.sleep(5000);
	   //clicking on NEXT for validation
	   
	   Actions Next1 =  new Actions(driver);
	   Next1.moveToElement(driver.findElement(By.id("dealInfoNext"))).click().perform();
	 //  driver.findElement(By.id("dealInfoNext")).click();
	   System.out.println("Purchase details validation displayed");
	   JavascriptExecutor scroll= (JavascriptExecutor)driver;
	   scroll.executeScript("window.scrollBy(0,-250)", "");
	  Thread.sleep(5000);

	 //Property type
	   Actions singlePurchasingBuild =  new Actions(driver);
	   singlePurchasingBuild.moveToElement(driver.findElement(By.id("singlePurchasingBuild"))).click().perform();
	
	   System.out.println("Purchase details validation displayed");
	   //Purchase Price 
	   driver.findElement(By.id("purchasePricePurchaseBuild")).sendKeys("659000");
	   //Construction Bugdet
	   driver.findElement(By.id("constructionBudgetPurchaseBuild")).sendKeys("250000");
	   // total square footage 
	   
	   driver.findElement(By.id("propertyAreaPurchaseBuild")).sendKeys("2000");
	   //Total bedrooms
	   driver.findElement(By.id("totalBedroomsPurchaseBuild")).sendKeys("3");
	   //Total bathrooms
	   driver.findElement(By.id("totalBathroomsPurchaseBuild")).sendKeys("4");
	   Thread.sleep(5000);
	   //property has a pool
	   Actions NoPool = new Actions(driver);
	   NoPool.moveToElement(driver.findElement(By.id("poolNoPurchaseBuild"))).click().perform();
	
	   System.out.println("Pool No clickable");
	   driver.findElement(By.id("poolYesPurchaseBuild")).click();
	   System.out.println("Pool Yes clickable");
	   //square footage of the lot
	   driver.findElement(By.id("lotAreaPurchaseBuild")).sendKeys("1400");
	   // completed value
	   driver.findElement(By.id("completedPurchaseBuild")).sendKeys("350000");
	   Thread.sleep(5000);
	 //Target complete date
	
	   
	   Actions date = new Actions(driver);
	   date.moveToElement(driver.findElement(By.id("constructionPurchaseBuild")));
	   driver.findElement(By.id("constructionPurchaseBuild")).sendKeys("18/07/2025");
	   // occupancyStatus
	   WebElement occupancyStatus = driver.findElement(By.id("occupancyStatus"));
	   JavascriptExecutor occupancy_Status = (JavascriptExecutor)driver;
	   occupancy_Status.executeScript("arguments[0].click();", occupancyStatus);
	   occupancyStatus.sendKeys("Delivered Vacant");
	   Thread.sleep(2000);
	 //Collateral Property 
	   WebElement  CollateralPropertyNo = driver.findElement(By.id("collateralpropertyNoPurchaseBuild"));
	   JavascriptExecutor CollateralProperty_No = (JavascriptExecutor)driver;
	   CollateralProperty_No.executeScript("arguments[0].click();", CollateralPropertyNo);
	   Thread.sleep(2000);
	   //Collateral Property collateralpropertyNoPurchaseBuild
	   WebElement  CollateralPropertyYes = driver.findElement(By.id("collateralpropertyYesPurchaseBuild"));
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
	   WebElement existingloan = driver.findElement(By.name("existingloan"));
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
	   driver.findElement(By.id("collateralPropertyArea")).sendKeys("2500");
	
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
	   lotArea.sendKeys("3000");
	   // occupancyStatus
	   WebElement collateralOccupancyStatus = driver.findElement(By.id("collateralOccupancyStatus"));
	   JavascriptExecutor collateralOccupancy_Status = (JavascriptExecutor)driver;
	   collateralOccupancy_Status.executeScript("arguments[0].click();", collateralOccupancyStatus);
	   collateralOccupancyStatus.sendKeys("Tenant Occupied");
	
	   Thread.sleep(5000);
	   WebDriverWait collateralhomeAdresses = new WebDriverWait(driver, Duration.ofSeconds(30));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("propertyPlace"))).sendKeys("California");
	   Thread.sleep(3000);
	   WebElement homeAdress=driver.findElement(By.name("propertyPlace"));

	   homeAdress.sendKeys(Keys.ARROW_DOWN);

	   homeAdress.sendKeys(Keys.ENTER);
	//   Thread.sleep(5000);
	   //clicking on NEXT for validation  
	//   Actions NextButton =  new Actions(driver);
//	   NextButton.moveToElement(driver.findElement(By.id("dealInfoNext"))).click().perform();
	//   Thread.sleep(5000);
	  // driver.findElement(By.id("collateralPropertyArea")).sendKeys("2500");
	  // Thread.sleep(5000);
	   //clicking on NEXT for validation  
	 //    Actions NextButton1 =  new Actions(driver);
	 //  NextButton1.moveToElement(driver.findElement(By.id("dealInfoNext"))).click().perform();
	 //  Thread.sleep(5000);
	 /* WebElement  dealInfoNext = driver.findElement(By.id("dealInfoNext"));
	   JavascriptExecutor  Next_Button = (JavascriptExecutor)driver;
	   Next_Button.executeScript("arguments[0].click();", dealInfoNext);
	  WebDriverWait next = new WebDriverWait(driver, Duration.ofSeconds(3000));
	   next.until(ExpectedConditions.elementToBeClickable(By.id("dealInfoNext"))).click();
	   Thread.sleep(5000); */
	   Thread.sleep(5000);
	   WebDriverWait next = new WebDriverWait(driver, Duration.ofSeconds(3000));
	   next.until(ExpectedConditions.elementToBeClickable(By.id("dealInfoNext"))).click();

	  //===================TAB 4 EASY BUILDStrategy Info
	   //Source of downpayment
	   WebElement  BorrowerCash = driver.findElement(By.id("downPaymentBroker"));
	   JavascriptExecutor  downpayment = (JavascriptExecutor)driver;
	   downpayment.executeScript("arguments[0].click();", BorrowerCash);
	 //  driver.findElement(By.id("downPaymentBroker")).click();
	   System.out.println("down Payment Broker clickable");
	   // Clicking Back button 
	   driver.findElement(By.linkText("keyboard_backspace")).click();
	 //Source of 2nd loan on Subject Project
	   driver.findElement(By.id("subjectProjectBroker")).click();
	   System.out.println("2nd loan on Subject Project clickable");
	// Clicking Back button 
	   driver.findElement(By.linkText("keyboard_backspace")).click();
	 //Source of Outside Investors
	   driver.findElement(By.id("outsideInvestorBroker")).click();
	   System.out.println("Outside Investors clickable");
	// Clicking Back button 
	   Thread.sleep(3000);
	  driver.findElement(By.linkText("keyboard_backspace")).click();
	   //Source of Other
	   driver.findElement(By.id("otherPaymentBroker")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div/div/input")).sendKeys("Bank");
	   driver.findElement(By.className("search_btn")).click();
	   System.out.println("others clickable");
	// Clicking Back button 
	   driver.findElement(By.linkText("keyboard_backspace")).click();
	   Thread.sleep(2000);
	   //Source of downpayment
	   driver.findElement(By.id("downPaymentBroker")).click();
	   //plan for paying off the loan
	   //Sale
	   driver.findElement(By.id("saleBroker")).click();
      //applicable licenses
	   driver.findElement(By.id("generalContractorBroker")).click();
	   System.out.println("General Contractor clickable");
	   Thread.sleep(5000);
	   driver.findElement(By.linkText("keyboard_backspace")).click();
	   Thread.sleep(2000);
	   //realEstate Borrower
	   driver.findElement(By.id("realEstateBroker")).click();
	   System.out.println("real Estate Broker clickable");
	// Clicking Change 
	   driver.findElement(By.linkText("keyboard_backspace")).click();
	   //Not Applicable
	   driver.findElement(By.id("notApplicableBroker")).click();
	   System.out.println("Not Applicable clickable");
	// Clicking Change 
	   driver.findElement(By.linkText("keyboard_backspace")).click();
	   //Others 
	 
	   driver.findElement(By.id("otherLicenseBroker")).click();
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
	   driver.findElement(By.id("refinanceBroker")).click();
	 //applicable licenses
	   driver.findElement(By.id("generalContractorBroker")).click();
	   System.out.println("General Contractor clickable");
	   driver.findElement(By.linkText("keyboard_backspace")).click();
	   //realEstate Borrower
	   driver.findElement(By.id("realEstateBroker")).click();
	   System.out.println("real Estate Broker clickable");
	   Thread.sleep(3000); 
	// Clicking Change 
	   driver.findElement(By.linkText("keyboard_backspace")).click();
	   //Not Applicable
	   driver.findElement(By.id("notApplicableBroker")).click();
	   System.out.println("Not Applicable clickable");
	// Clicking Change 
	   driver.findElement(By.linkText("keyboard_backspace")).click();
	   //Others 
	 
	   driver.findElement(By.id("otherLicenseBroker")).click();
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
	   driver.findElement(By.id("otherLoanBroker")).click();  
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
		  driver.findElement(By.id("downPaymentBroker")).click();
		  Thread.sleep(3000);
		 //What is your plan for paying off the loan?
		   driver.findElement(By.id("saleBroker")).click();   
		 //Do you have any applicable licenses?
		   driver.findElement(By.id("generalContractorBroker")).click();
		  //Execution Strategy Summary
		   driver.findElement(By.id("executionStrategySummaryBroker")).sendKeys("Purchase details need to enter");
           // NEXT 
		   driver.findElement(By.id("strategyInfoNext")).click();
		   
		   System.out.println(9);
		   //============================== TAB 5 Borrower info
		   //Click NEXT for to display all Validation for fields
		   Actions Next2 =  new Actions(driver);
		   Next2.moveToElement(driver.findElement(By.id("borrowerBrokerNext"))).click().perform();
		   System.out.println("Validation displayed for Broker info");
		   Thread.sleep(2000);
		   //Borrower First Name
		  WebElement FirstName= driver.findElement(By.id("brokerFirstName"));
		  FirstName.sendKeys("Umar");
		  Thread.sleep(2000);
		   ////Borrower Last  Name
		   driver.findElement(By.id("brokerLastName")).sendKeys("Khana");
		   // broker Email
		   Thread.sleep(2000);
		 WebElement Email=  driver.findElement(By.id("brokerEmail"));
		 Email.sendKeys("Umar");
		   System.out.println("Validation for email displayed");
		   
		   //Borrower Phone Number 
		   Thread.sleep(2000);
		  WebElement Phone= driver.findElement(By.id("brokerPhone"));
		  Phone.sendKeys("8045796523");
		  // System.out.println("Validation for Phone Number  displayed"); 
		   //broker Points
		   Thread.sleep(2000);
		   driver.findElement(By.id("brokerPoints")).sendKeys("67");
		   //brokerProcessingFee
		   Thread.sleep(2000);
		   driver.findElement(By.id("brokerProcessingFee")).sendKeys("145000");
		   //brokerBorrowerFirstName
		   Thread.sleep(2000);
		   driver.findElement(By.id("brokerBorrowerFirstName")).sendKeys("Lukes");
		   //brokerBorrowerLastName
		   driver.findElement(By.id("brokerBorrowerLastName")).sendKeys("Mutons");
		   //brokerBorrowerEmail
		   Thread.sleep(2000);
		   driver.findElement(By.id("brokerBorrowerEmail")).sendKeys("LukesMutons34875@yopmail.com");
          //brokerBorrowerPhone
		   Thread.sleep(2000);
		   driver.findElement(By.id("brokerBorrowerPhone")).sendKeys("9809898012");
		   
		   //Borrower Primary Occupation
		   Thread.sleep(2000);
		   driver.findElement(By.id("brokerOccupation")).sendKeys("Bussiness ");
		   //borrowercreditScore
		   Thread.sleep(2000);
		   WebElement CreditScore=driver.findElement(By.id("brokerCreditScore"));
		  CreditScore.sendKeys("789");
		   System.out.println("broker Credit Score Entered");
		 //borrowerLiquidCashReserve
		   Thread.sleep(2000);
		   WebElement CashReserve =driver.findElement(By.id("brokerLiquidCashReserve"));
		   CashReserve.sendKeys("289000");
		  // System.out.println("Validation for  borrower Liquid CashReserve displayed");
		   
		   //borrowerInvestmentProperties
		   driver.findElement(By.id("brokerInvestmentProperties")).sendKeys("2");
		 
		   //borrowerAccountExecutive
		   Thread.sleep(3000);
		   
		//  WebDriverWait AccExecutives = new WebDriverWait(driver, Duration.ofSeconds(3000));
		//   AccExecutives.until(ExpectedConditions.elementToBeClickable(By.id("brokerAccountExecutive"))).click();
		  WebElement Executive = driver.findElement(By.id("brokerAccountExecutive"));
		   JavascriptExecutor AccExecutives =(JavascriptExecutor)driver;
		   AccExecutives.executeScript("arguments[0].click();", Executive);
		   Executive.sendKeys("Divya sree");
		 //  Thread.sleep(2000);
		 //  Executive.sendKeys(Keys.ENTER);
		   Thread.sleep(3000);
		  
		  System.out.println("Validation for borrower Account Executive  displayed");
		   //borrowerReferredBy
		 //  Thread.sleep(3000);
		  WebElement Refer= driver.findElement(By.id("brokerReferredBy"));
		  Refer.sendKeys(Keys.ARROW_DOWN);
		  Refer.sendKeys("Other");
		   Thread.sleep(3000);
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
		   driver.findElement(By.id("brokerEntityNo")).click();
		   System.out.println("Entity No Selected");
		   Thread.sleep(3000);
		   driver.findElement(By.id("brokerEntityYes")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.id("brokerEntityName")).sendKeys("Umar");
		   
		   System.out.println("Entity YES Selected");
		   
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
		   //NEXT Click
		  Actions Next3 =  new Actions(driver);
		   Next3.moveToElement(driver.findElement(By.id("borrowerBrokerNext"))).click().perform(); 
	//	=============================== TAB 6 SUBMIT APP
		   Thread.sleep(3000); 
		/*   
		   Actions UploadPhoto= new Actions(driver);
		   UploadPhoto.moveToElement(driver.findElement(By.id("uploadPhotoId"))).click().perform();
		   
		  WebElement upload = driver.findElement(By.id("uploadPhotoId"));
		  upload.sendKeys("‪C:\\Users\\mvvsr\\Downloads\\AdamScott.jpg");
		   
		 //*[@id="root"]/div/div[2]/div[2]/div[2]/div[1]/div[1]/label/text() 
		  
		  */
		   driver.findElement(By.id("skipAndSubmitButton")).click();
		   Thread.sleep(3000); 
		   driver.quit();
  }
}
