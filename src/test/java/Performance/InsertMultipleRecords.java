package Performance;

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

public class InsertMultipleRecords {
  @Test
  public void InsertsMultipleRecords () throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		 
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
	   for(int i=1;i<10;i++) {
	   //===========================TAB 1 PROPERTY INFO
	   driver.findElement(By.linkText("New Loan")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.cssSelector(".justify-content-center > button:nth-child(1)")).click();
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
	   NoPool.moveToElement(driver.findElement(By.id("poolYesPurchaseBuild"))).click().perform();
	 
	  
	   //square footage of the lot
	   driver.findElement(By.id("lotAreaPurchaseBuild")).sendKeys("1400");
	   // completed value
	   driver.findElement(By.id("completedPurchaseBuild")).sendKeys("350000");
	   Thread.sleep(5000);
	 //Target complete date
	
	   
	   Actions date = new Actions(driver);
	   date.moveToElement(driver.findElement(By.id("constructionPurchaseBuild")));
	   driver.findElement(By.id("constructionPurchaseBuild")).sendKeys("18/07/2024");
	   Thread.sleep(2000);
	   //What is the Occupancy Status of the Property?
	   driver.findElement(By.id("occupancyStatus")).sendKeys("Tenant Occupied");
	 //clicking on NEXT for validation
	   Thread.sleep(5000);
	   //clicking on NEXT for validation
	   Actions Next1 =  new Actions(driver);
	   Next1.moveToElement(driver.findElement(By.id("dealInfoNext"))).click().perform();
	
	  //===================TAB 4 EASY BUILDStrategy Info
	   //Source of downpayment
	   driver.findElement(By.id("downPaymentBorrower")).click();
	   System.out.println("down Payment Borrower clickable");
	  
	   //Sale
	   driver.findElement(By.id("saleBorrower")).click();
   //applicable licenses
	   driver.findElement(By.id("generalContractorBorrower")).click();
	   System.out.println("General Contractor clickable");
	   Thread.sleep(5000);

		   driver.findElement(By.id("executionStrategySummaryBorrower")).sendKeys("Purchase details need to enter");
        // NEXT 
		   driver.findElement(By.id("strategyInfoNext")).click();
		   
		   System.out.println(9);
		   //============================== TAB 5 Borrower info
		   
		   //Borrower First Name
		 driver.findElement(By.id("borrowerFirstName")).sendKeys("Umar");
		
		   ////Borrower Last  Name
		   driver.findElement(By.id("borrowerLastName")).sendKeys("Khana");
		   // Borrwers Email
		 driver.findElement(By.id("borrowerEmail")).sendKeys("Umar78909@yopmail.com");
		 
		   
		   //Borrower Phone Number 
		   driver.findElement(By.id("borrowerPhone")).sendKeys("9899898989");
		  
		   //Borrower Primary Occupation
		   driver.findElement(By.id("borrowerOccupation")).sendKeys("Bussiness ");
		   //borrowerInvestmentProperties
		   driver.findElement(By.id("borrowerInvestmentProperties")).sendKeys("2");
		   //borrowercreditScore
		  driver.findElement(By.id("borrowercreditScore")).sendKeys("789");
		   
		   //borrowerLiquidCashReserve
		   driver.findElement(By.id("borrowerLiquidCashReserve")).sendKeys("350000");
		   //borrowerAccountExecutive
		   
		   driver.findElement(By.id("borrowerAccountExecutive")).sendKeys("Divya sree");
		 
		   Thread.sleep(3000); 
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
		  Thread.sleep(3000); 
		   //NEXT Click
		  Actions Next3 =  new Actions(driver);
		   Next3.moveToElement(driver.findElement(By.id("borrowerBrokerNext"))).click().perform(); 
	//	=============================== TAB 6 SUBMIT APP
		   Thread.sleep(3000); 
		 driver.findElement(By.id("uploadSubmit")).click();
		  Thread.sleep(3000); 
		  // Closing Alert Pop up 
		  driver.findElement(By.id("closePopupBtn")).click();
		  Thread.sleep(3000); 
	   }
  }
}
