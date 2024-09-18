package PipeLine.LoanDetails.Deals;

import java.time.Duration;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.gson.annotations.Until;

public class ES_30_AddNewEntity {
  @Test
  public void AddNewEntity() throws InterruptedException {
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
      WebElement LoanId = driver.findElement(By.cssSelector("#row-1 > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));
	    
	    Actions LoanIdSelect = new Actions(driver);
	    LoanIdSelect.moveToElement(LoanId).perform();
	    WebElement DealNavigation = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div/ul/li[2]/a"));
	    JavascriptExecutor Deal= (JavascriptExecutor)driver;
	     Deal.executeScript("arguments[0].click();", DealNavigation);
	     Thread.sleep(3000);
	     
	     // Add Entity
	    // Thread.sleep(3000);
	    WebElement AddNewEntity= driver.findElement(By.id("addNewLoanEntity"));
	    JavascriptExecutor LoanEntity = (JavascriptExecutor)driver;
	    LoanEntity.executeScript("arguments[0].click();", AddNewEntity);
	     //Validations
	     WebElement FeildsValidation = driver.findElement(By.id("saveEntity"));
	     JavascriptExecutor Validation =(JavascriptExecutor)driver;
	     Validation.executeScript("arguments[0].click();", FeildsValidation);
	     System.out.println("Validation displayed");
	     Thread.sleep(3000);
	     //BackButton Click
	     WebElement Back =driver.findElement(By.id("navigateEntityBack"));
	     JavascriptExecutor Button= (JavascriptExecutor)driver;
	     Button.executeScript("arguments[0].click();", Back);
	     Thread.sleep(2000);
	       WebElement AddNewLoanEntity= driver.findElement(By.id("addNewLoanEntity"));
		    JavascriptExecutor AddEntity = (JavascriptExecutor)driver;
		    AddEntity.executeScript("arguments[0].click();", AddNewLoanEntity);
		  driver.findElement(By.id("entityType")).sendKeys("Individual");
		 WebElement LegalName = driver.findElement(By.id("entityLegalName"));
		 LegalName.sendKeys("Srikanth");
		 WebElement  EntityAddress =  driver.findElement(By.name("entityaddress"));
		 EntityAddress.sendKeys("822 E. 20th Street");
		 Thread.sleep(2000);
		 EntityAddress.sendKeys(Keys.ARROW_DOWN);
		 EntityAddress.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		
		 Thread.sleep(5000);
		 WebElement StateFormation = driver.findElement(By.id("react-select-5-input"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", StateFormation);
		 WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement  StateFormations  = waits.until(ExpectedConditions.elementToBeClickable(By.id("react-select-5-input")));
		 StateFormations .sendKeys("California");
		 StateFormations.sendKeys(Keys.ENTER);
		  //Save Entity 
		 Thread.sleep(3000);
		  WebElement SaveEntity= driver.findElement(By.id("saveEntity"));
		     JavascriptExecutor Save =(JavascriptExecutor)driver;
		     Save.executeScript("arguments[0].click();", SaveEntity); 
		    System.out.println("Entity Saved");
		    Thread.sleep(3000);
		  driver.navigate().refresh();
		    
		   // Edit Entity  
		    Thread.sleep(5000); 
		   WebElement EditEntity = driver.findElement(By.id("edit-entity-1"));
		   JavascriptExecutor Edit = (JavascriptExecutor)driver;
		   Edit.executeScript("arguments[0].click();", EditEntity);
		
		   Thread.sleep(5000);
		
		  WebElement EditLegalName = driver.findElement(By.id("entityLegalName"));
		  JavascriptExecutor LegaNameEdit =(JavascriptExecutor)driver;
		  LegaNameEdit.executeScript("arguments[0].value='';", EditLegalName);
		  /* Thread.sleep(2000);
		   EditLegalName.sendKeys(Keys.ENTER);
		   EditLegalName.clear();*/
		   Thread.sleep(3000);
		   EditLegalName.sendKeys("Srikanth");
		   
			 Thread.sleep(2000);
			 
		   WebElement UpdateEntity= driver.findElement(By.id("updateEntity"));
		     JavascriptExecutor Update =(JavascriptExecutor)driver;
		     Update.executeScript("arguments[0].click();", UpdateEntity); 
		    System.out.println("Entity Saved");
		    driver.navigate().refresh();
	   
		// DELETE ENTITY 
		    Thread.sleep(5000);
		  WebElement DeleteEntityIcon= driver.findElement(By.id("delete-entity-1"));
		  JavascriptExecutor DeleteIcon = (JavascriptExecutor)driver;
		  DeleteIcon.executeScript("arguments[0].click();", DeleteEntityIcon);
		  Thread.sleep(3000);
		  WebElement DeleteEntityNo = driver.findElement(By.id("delete-entity-no"));
		  JavascriptExecutor DeleteNo = (JavascriptExecutor)driver;
		  DeleteNo.executeScript("arguments[0].click();", DeleteEntityNo);
	     
	      Thread.sleep(3000);
		  WebElement DeleteEntity_Icon = driver.findElement(By.id("delete-entity-1"));
		  JavascriptExecutor Delete_Icon = (JavascriptExecutor)driver;
		  Delete_Icon.executeScript("arguments[0].click();", DeleteEntity_Icon);
		  Thread.sleep(2000);
		  WebElement DeleteEntityYes = driver.findElement(By.id("delete-entity-yes"));
		  JavascriptExecutor DeleteYes = (JavascriptExecutor)driver;
		  DeleteYes.executeScript("arguments[0].click();", DeleteEntityYes);
	     // driver.findElement(By.xpath("delete-entity-yes")).click();
	      Thread.sleep(3000);
	      WebElement CloseDeletePopup = driver.findElement(By.id("closePopupBtn"));
	      JavascriptExecutor DeletePopup =(JavascriptExecutor)driver;
	      DeletePopup.executeScript("arguments[0].click();", CloseDeletePopup);
	      //driver.navigate().refresh();
		  
		
		// APPLICANT 
		     Thread.sleep(3000);
		   
		   
		     WebElement NewApplicantTab = driver.findElement(By.id("loan-applicant-tab"));
		     JavascriptExecutor ApplicantTab = (JavascriptExecutor)driver;
		     ApplicantTab.executeScript("arguments[0].click();", NewApplicantTab);
		  // Application Validation
		     Thread.sleep(3000);
		   WebElement AddNewApplicant= driver.findElement(By.id("addNewApplicant"));
	       JavascriptExecutor AddApplicant  = (JavascriptExecutor)driver;
	       AddApplicant.executeScript("arguments[0].click();", AddNewApplicant);
		
		   Thread.sleep(3000);
		     WebElement Save1 = driver.findElement(By.id("saveApplicant"));
		     JavascriptExecutor SaveApplication =(JavascriptExecutor)driver;
		     SaveApplication.executeScript("arguments[0].click();", Save1);
		     System.out.println("Add Applicant Validation Displayed");
		    // Back Button click
		     Thread.sleep(3000);
		    WebElement Back1 = driver.findElement(By.id("navigateApplicantBack"));
		    JavascriptExecutor ButtonClick = (JavascriptExecutor)driver;
		    ButtonClick.executeScript("arguments[0].click();", Back1);
		    //Add Applicant details 
		    Thread.sleep(3000);
		    WebElement NewApplicants = driver.findElement(By.id("loan-applicant-tab"));
		     JavascriptExecutor AddApplicants = (JavascriptExecutor)driver;
		     AddApplicants.executeScript("arguments[0].click();", NewApplicants);
		     Thread.sleep(3000);
		     WebElement AddNewApplicants= driver.findElement(By.id("addNewApplicant"));
		       JavascriptExecutor AddApplicants1  = (JavascriptExecutor)driver;
		       AddApplicants1.executeScript("arguments[0].click();", AddNewApplicants);
		     driver.findElement(By.id("applicantFirstName")).sendKeys("Antony");
		     driver.findElement(By.id("applicantMiddleName")).sendKeys("Gabril");
		     driver.findElement(By.id("applicantLastName")).sendKeys("Jude");
		     driver.findElement(By.id("applicantPhone")).sendKeys("(123) 456-7890");
		     driver.findElement(By.id("applicantEmail")).sendKeys("AntonyJude6750@yopmail.com");
		     WebElement SaveButton = driver.findElement(By.id("saveApplicant"));
		     JavascriptExecutor SaveNewApplication =(JavascriptExecutor)driver;
		     SaveNewApplication.executeScript("arguments[0].click();", SaveButton); 
		     Thread.sleep(3000);
		     driver.navigate().refresh();
		     Thread.sleep(3000);
		    System.out.println(" New Applicant Saved");
		   
		  // EDIT APPLICANT editApplicant-2

		     WebElement NewApplicantTab1 = driver.findElement(By.id("loan-applicant-tab"));
		     JavascriptExecutor ApplicantTab1 = (JavascriptExecutor)driver;
		     ApplicantTab1.executeScript("arguments[0].click();", NewApplicantTab1);
		     Thread.sleep(3000);
		     WebElement EditApplicant = driver.findElement(By.id("editApplicant-1"));
		     JavascriptExecutor Edit1 = (JavascriptExecutor)driver;
		     Edit1.executeScript("arguments[0].click();", EditApplicant);
		     Thread.sleep(2000);
		     WebElement ApplicantSuffix = driver.findElement(By.id("applicantSuffix"));
		     JavascriptExecutor Suffix = (JavascriptExecutor)driver;
		     Suffix.executeScript("arguments[0].click();", ApplicantSuffix);
		     ApplicantSuffix.sendKeys("Sr");
		     Thread.sleep(2000);
		     WebElement ApplicantBirthDate = driver.findElement(By.id("applicantBirthDate"));
		     JavascriptExecutor BirthDate = (JavascriptExecutor)driver;
		     BirthDate.executeScript("arguments[0].click();", ApplicantBirthDate);
		     ApplicantBirthDate.sendKeys("01-01-1993");
		     WebElement ApplicantMaritalStatus = driver.findElement(By.id("applicantMaritalStatus"));
		     ApplicantMaritalStatus.sendKeys(Keys.ARROW_DOWN);
		     ApplicantBirthDate.sendKeys(Keys.ENTER) ;
		     
		    WebElement OnToggle = driver.findElement(By.id("applicantGuarantor"));
		    JavascriptExecutor ToggleOn = (JavascriptExecutor)driver;
		    ToggleOn.executeScript("arguments[0].click();", OnToggle);
		   
		    System.out.println("Guarantor Toggle On");
		    Thread.sleep(2000);
		    WebElement ApplicantGuarantorTitle = driver.findElement(By.id("applicantGuarantorTitle"));
		    ApplicantGuarantorTitle.sendKeys("Guarantor");
		    Thread.sleep(2000);
		    WebElement Toggle = driver.findElement(By.id("applicantGuarantor"));
		    JavascriptExecutor ToggleOff = (JavascriptExecutor)driver;
		    ToggleOff.executeScript("arguments[0].click();", Toggle);
		    Thread.sleep(2000);
		    System.out.println("Guarantor Toggle off");
		    Thread.sleep(2000);
		    WebElement OnSigner = driver.findElement(By.id("applicantSigner"));
		    JavascriptExecutor SignerOn = (JavascriptExecutor)driver;
		    SignerOn.executeScript("arguments[0].click();", OnSigner);
		   
		    System.out.println("Signer Toggle On");
		    Thread.sleep(2000);
		    driver.findElement(By.id("applicantSignerTitle")).sendKeys("Signer");
		    WebElement Signer = driver.findElement(By.id("applicantSigner"));
		    JavascriptExecutor SignerOff = (JavascriptExecutor)driver;
		    SignerOff.executeScript("arguments[0].click();", Signer);
		    System.out.println("Signer Toggle Off");
		    Thread.sleep(3000);
		   
		  //  WebElement BorrowerAddress = driver.findElement(By.id("borroweraddress"));
			// ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BorrowerAddress);
			 WebDriverWait BAddress = new WebDriverWait(driver,Duration.ofSeconds(30));
			 WebElement  BorrowersAddress = BAddress.until(ExpectedConditions.elementToBeClickable(By.name("borroweraddress")));
			 BorrowersAddress .sendKeys("California");
			 Thread.sleep(3000);
			 
			 BorrowersAddress.sendKeys(Keys.ENTER); 
		    Thread.sleep(5000);
		   
		    WebElement SecondBorrowerAddress1 = driver.findElement(By.id("borroweraddress2"));
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SecondBorrowerAddress1);
			 WebDriverWait waits1 = new WebDriverWait(driver,Duration.ofSeconds(10));
			 WebElement  SecondBorrowerAddress3  = waits1.until(ExpectedConditions.elementToBeClickable(By.id("borroweraddress2")));
			 SecondBorrowerAddress3 .sendKeys("California");
			 SecondBorrowerAddress3.sendKeys(Keys.ENTER);
		    driver.findElement(By.id("applicantSSN")).sendKeys("795-32-1564");
		    //CREDIT SCORE
		    driver.findElement(By.id("applicantCreditScore")).sendKeys("890");
		    driver.findElement(By.id("applicantCreditScoringModel")).sendKeys("VantageScore 2.0");
		    WebElement ApplicantPulledDate = driver.findElement(By.id("applicantPulledDate"));
		    JavascriptExecutor PulledDate =(JavascriptExecutor)driver;
		    PulledDate.executeScript("arguments[0].click();", ApplicantPulledDate);
		    ApplicantPulledDate.sendKeys("09-10-2023");
		    //HMDA
		    WebElement ApplicantEthnicity = driver.findElement(By.id("applicantEthnicity"));
		    JavascriptExecutor Ethnicity = (JavascriptExecutor)driver;
		    Ethnicity.executeScript("arguments[0].click();", ApplicantEthnicity);
		    ApplicantEthnicity.sendKeys("I do not wish to provide this information");
		    driver.findElement(By.id("applicantRace")).sendKeys("asian");
		    Thread.sleep(2000);
		    driver.findElement(By.id("applicantAsian")).sendKeys("Asian Indian");
		    driver.findElement(By.id("applicantGender")).sendKeys("male");
		    WebElement UpdateApplicant = driver.findElement(By.id("updateApplicant"));
		    JavascriptExecutor  Update1 = (JavascriptExecutor)driver;
		    Update1.executeScript("arguments[0].click();", UpdateApplicant);
		    Thread.sleep(2000);
		   // driver.findElement(By.id("closePopupBtn")).click();
		    Thread.sleep(2000);
		    System.out.println("Applicant Details Updated Succeesfully");
		    driver.navigate().refresh();
		     Thread.sleep(5000);
		     
			   
		  /*   WebElement NewApplicantTabs = driver.findElement(By.id("loan-applicant-tab"));
		     JavascriptExecutor ApplicantTabs = (JavascriptExecutor)driver;
		    Thread.sleep(3000);
		    WebElement ApplicantName = driver.findElement(By.xpath("//*[@id=\"APPLICANT\"]/div[2]/table/tbody/tr[3]/t'd[1]"));
		    		
		    WebElement NameOfApplicant = driver.findElement(By.xpath("//td[text()='Antony Jude']"));
		     NameOfApplicant.click();

		     if (NameOfApplicant.equals("Antony Jude")) {
		                System.out.println("Successfully clicked on Antony Jude.");
		            } else {
		                System.out.println("Failed to click on Antony Jude.");
		            }
*/
		    // Delete Applicant 
		     WebElement NewApplicantTab11 = driver.findElement(By.id("loan-applicant-tab"));
		     JavascriptExecutor ApplicantTab11 = (JavascriptExecutor)driver;
		     ApplicantTab11.executeScript("arguments[0].click();", NewApplicantTab11);
		     Thread.sleep(3000);
		     
		     WebElement DeleteApplicantNo = driver.findElement(By.id("deleteApplicant-1"));
		     JavascriptExecutor DeleteApplicant= (JavascriptExecutor)driver;
		     DeleteApplicant.executeScript("arguments[0].click();", DeleteApplicantNo);
		     Thread.sleep(3000);
		     
		     WebElement ApplicantDeleteNo = driver.findElement(By.id("delete-applicant-no"));
		     JavascriptExecutor ApplicantNo = (JavascriptExecutor)driver;
		     ApplicantNo.executeScript("arguments[0].click();", ApplicantDeleteNo);
		     Thread.sleep(5000); 
		    
		     WebElement DeleteApplicantYes = driver.findElement(By.id("deleteApplicant-1"));
		     JavascriptExecutor DeleteApplicantConfirm = (JavascriptExecutor)driver;
		     DeleteApplicantConfirm.executeScript("arguments[0].click();", DeleteApplicantYes);
		     Thread.sleep(3000);
		     WebElement ApplicantDeleteYes = driver.findElement(By.id("delete-applicant-yes"));
		     JavascriptExecutor ApplicantYes = (JavascriptExecutor)driver;
		     ApplicantYes.executeScript("arguments[0].click();", ApplicantDeleteYes);
		     Thread.sleep(3000); 
		    
		     driver.navigate().refresh();
		     
		  // Property Tab
		
		  WebElement LoanProperty = driver.findElement(By.id("loan-property-tab"));
		  JavascriptExecutor LoanPropertyTab = (JavascriptExecutor)driver;
		  LoanPropertyTab.executeScript("arguments[0].click();", LoanProperty);
		  Thread.sleep(3000);
		  WebElement AddNewProperty = driver.findElement(By.id("AddNewProperty"));
		  JavascriptExecutor NewProperty = (JavascriptExecutor)driver;
		  NewProperty.executeScript("arguments[0].click();", AddNewProperty);
		  //saveProperty
		  WebElement SaveProperty = driver.findElement(By.id("saveProperty"));
		  JavascriptExecutor Property = (JavascriptExecutor)driver;
		  Property.executeScript("arguments[0].click();", SaveProperty);
		  System.out.println("Validation for Property displayed ");
		  Thread.sleep(3000);
		  //Back Button navigatePropertyBack
		  WebElement BackNavigation = driver.findElement(By.id("navigatePropertyBack"));
		  JavascriptExecutor Navigation = (JavascriptExecutor)driver;
		  Navigation.executeScript("arguments[0].click();", BackNavigation);
		  System.out.println("Navigated Back from Property Tab");
		  Thread.sleep(3000);
		  WebElement AddNewProperties = driver.findElement(By.id("AddNewProperty"));
		  JavascriptExecutor NewProperties = (JavascriptExecutor)driver;
		  NewProperties.executeScript("arguments[0].click();", AddNewProperties);
		  WebDriverWait waits11 = new WebDriverWait(driver, Duration.ofSeconds(30));
		   waits11.until(ExpectedConditions.visibilityOfElementLocated(By.name("propertyaddress"))).sendKeys("California");
		   Thread.sleep(3000);
		   driver.findElement(By.name("propertycity")).sendKeys("California ");
		   Thread.sleep(5000);
			
		//  WebDriverWait PropertyState = new WebDriverWait(driver, Duration.ofSeconds(30));
		  //PropertyState.until(ExpectedConditions.elementToBeClickable(By.id("propertyState"))).sendKeys("California");
		 // WebElement PropertiesState =  driver.findElement(By.id("react-select-5-input"));
		//  JavascriptExecutor States = (JavascriptExecutor)driver;
		//  States.executeScript("arguments[0].click();", PropertiesState);
		//   PropertiesState.sendKeys("California");
		   
		   WebElement PropertyZipcode =  driver.findElement(By.name("propertyzipcode"));
			  JavascriptExecutor Zipcode = (JavascriptExecutor)driver;
			  Zipcode.executeScript("arguments[0].click();", PropertyZipcode);
			  PropertyZipcode.sendKeys("90001");
			 
		  // driver.findElement(By.id("propertyzipcode")).sendKeys("90001 ");
		   driver.findElement(By.name("totalbedrooms")).sendKeys("2");
		   driver.findElement(By.name("totalbathrooms")).sendKeys("4");
		   driver.findElement(By.id("propertyPool")).sendKeys("Yes");
		   driver.findElement(By.name("lotsqft")).sendKeys("1400");
		   driver.findElement(By.name("buildingsqft")).sendKeys("1250");
		   driver.findElement(By.name("finishedsqft")).sendKeys("1150");
		   WebElement PropertySave = driver.findElement(By.id("saveProperty"));
			  JavascriptExecutor Asset = (JavascriptExecutor)driver;
			  Asset.executeScript("arguments[0].click();", PropertySave);
		// loanTab
		   Thread.sleep(3000);
			 WebElement loanTab = driver.findElement(By.id("loan-tab"));
			 JavascriptExecutor Tab= (JavascriptExecutor)driver;
			 Tab.executeScript("arguments[0].click();", loanTab);
			
			 WebElement loanPurpose = driver.findElement(By.id("loanPurpose"));
			 loanPurpose.sendKeys("Purchase");
			 driver.findElement(By.id("purchaseprice")).sendKeys("986000");
			 
			 WebElement SaveLoanDeal = driver.findElement(By.id("saveLoanDeal"));
			 JavascriptExecutor SaveDeal= (JavascriptExecutor)driver;
			 SaveDeal.executeScript("arguments[0].click();", SaveLoanDeal);
			 driver.quit();
			 
			 
 }
}
