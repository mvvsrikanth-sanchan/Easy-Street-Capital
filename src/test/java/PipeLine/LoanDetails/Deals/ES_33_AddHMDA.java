package PipeLine.LoanDetails.Deals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_33_AddHMDA {
  @Test
  public void HMDA() throws InterruptedException {
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
	     // CLICKING ON DEAL MENU
	     WebDriverWait ClickMenu =new WebDriverWait(driver, Duration.ofSeconds(30));
	     ClickMenu.until(ExpectedConditions.visibilityOfElementLocated(By.id("dealMenu")));
	     WebElement ClickMenus = driver.findElement(By.id("dealMenu"));
	     JavascriptExecutor DealMenu = (JavascriptExecutor)driver;
	     DealMenu.executeScript("arguments[0].click(); ", ClickMenus);
	     Thread.sleep(3000);
	     //CLICKINH HMDA
	     WebElement DealHMDA= driver.findElement(By.id("deal-HMDA"));
	     JavascriptExecutor HMDAMenu = (JavascriptExecutor)driver;
	     HMDAMenu.executeScript("arguments[0].click();", DealHMDA);
	     Thread.sleep(3000);
	     //LOAN AND ORIGINATION INFO
	     WebElement LoanPurposeHmda = driver.findElement(By.id("loanPurposeHmda"));
	     JavascriptExecutor Loan_PurposeHmda =(JavascriptExecutor)driver;
	     Loan_PurposeHmda.executeScript("arguments[0].click();", LoanPurposeHmda);
	     LoanPurposeHmda.sendKeys("Other purpose");
	     Thread.sleep(3000);
	     driver.findElement(By.id("preApprovalsHmda")).sendKeys("Preapproval not requested");
	     Thread.sleep(3000);
	     driver.findElement(By.id("actionTakenHmda")).sendKeys("Application approved but not accepted");
	     Thread.sleep(3000);
	     WebElement ActionDateHmda = driver.findElement(By.id("actionDateHmda"));
	     JavascriptExecutor Action_DateHmda= (JavascriptExecutor)driver;
	     Action_DateHmda.executeScript("arguments[0].click();", ActionDateHmda);
	     ActionDateHmda.sendKeys("01-08-2024");
	     Thread.sleep(3000);
	     driver.findElement(By.id("purchaserHmda")).sendKeys("Fannie Mae");
	     Thread.sleep(3000);
	     driver.findElement(By.id("rateSpreadHmda")).sendKeys("1");
	     driver.findElement(By.id("HoepaStatusHmda")).sendKeys("Not applicable");
	     Thread.sleep(3000);
	     WebElement SaveLoanOrigination = driver.findElement(By.id("saveLoanOrigination"));
	     JavascriptExecutor saveLoan_Origination =(JavascriptExecutor)driver;
	     saveLoan_Origination.executeScript("arguments[0].click();", SaveLoanOrigination);
	     driver.navigate().refresh();
	     Thread.sleep(3000);
	     //REASON FOR DENIAL TAB
	     WebElement ReasonForDenialTab = driver.findElement(By.id("reasonForDenialTab"));
	     JavascriptExecutor ReasonFor_DenialTab =(JavascriptExecutor)driver;
	     ReasonFor_DenialTab.executeScript("arguments[0].click();", ReasonForDenialTab);
	     Thread.sleep(3000);
	     driver.findElement(By.id("reasonDeal1")).sendKeys("Collateral");
	     Thread.sleep(3000);
	     driver.findElement(By.id("reasonDeal2")).sendKeys("Credit history");
	     Thread.sleep(3000);
	     driver.findElement(By.id("reasonDeal3")).sendKeys("Credit application incomplete");
	     Thread.sleep(3000);
	     driver.findElement(By.id("reasonDeal4")).sendKeys("Debt-to-income ratio");
	     Thread.sleep(3000);
	     driver.findElement(By.id("otherDenialReasons")).sendKeys("Improper Documents Attached");
	     WebElement SaveReasonForDenial = driver.findElement(By.id("saveReasonForDenial"));
	     JavascriptExecutor SaveReasonFor_Denial = (JavascriptExecutor)driver;
	     SaveReasonFor_Denial.executeScript("arguments[0].click();", SaveReasonForDenial);
	     driver.navigate().refresh();
	     Thread.sleep(3000);
	     //closingCostsDetailsTab CLOSING COSTS DETAILS TAB
	     WebElement ClosingCostsDetailsTab = driver.findElement(By.id("closingCostsDetailsTab"));
	     JavascriptExecutor ClosingCosts_DetailsTab =(JavascriptExecutor)driver;
	     ClosingCosts_DetailsTab.executeScript("arguments[0].click();", ClosingCostsDetailsTab);
	     Thread.sleep(3000);
	     driver.findElement(By.id("negativeAmortization")).sendKeys("Negative amortization");
	     Thread.sleep(3000);
	     driver.findElement(By.id("otherAmortization")).sendKeys("Other non-fully amortizing features");
	     Thread.sleep(3000);
	     driver.findElement(By.id("securedPropType")).sendKeys("Not applicable");
	     Thread.sleep(3000);
	     driver.findElement(By.id("homeLandProp")).sendKeys("Direct ownership");
	     Thread.sleep(3000);
	     driver.findElement(By.id("multiFamilyNoUnits")).sendKeys("2");
	     Thread.sleep(3000);
	     driver.findElement(By.id("appSubmission")).sendKeys("Not applicable");
	     Thread.sleep(3000);
	     driver.findElement(By.id("initiallyPayable")).sendKeys("Not initially payable to your institution");
	     Thread.sleep(3000);
	     driver.findElement(By.id("nmlsLoanOriginatorId")).sendKeys("890YU657");
	     Thread.sleep(3000);
	     WebElement SaveClosingCosts = driver.findElement(By.id("saveReasonForDenial"));
	     JavascriptExecutor Save_ClosingCosts = (JavascriptExecutor)driver;
	     Save_ClosingCosts.executeScript("arguments[0].click();", SaveClosingCosts);
	     driver.navigate().refresh();
	     Thread.sleep(3000);
	     //RISK ASSESSMENT TAB
	     WebElement RiskAssessmentTab = driver.findElement(By.id("riskAssessmentTab"));
	     JavascriptExecutor Risk_AssessmentTab =(JavascriptExecutor)driver;
	     Risk_AssessmentTab.executeScript("arguments[0].click();", RiskAssessmentTab);
	     Thread.sleep(3000);
	     driver.findElement(By.id("aus1")).sendKeys("Desktop Underwriter (DU)");
	     Thread.sleep(3000);
	     driver.findElement(By.id("aus2")).sendKeys("Guaranteed Underwriting System (GUS)");
	     Thread.sleep(3000);
	     driver.findElement(By.id("aus3")).sendKeys("Loan Prospector (LP)");
	     Thread.sleep(3000);
	     driver.findElement(By.id("aus4")).sendKeys("Not applicable");
	     Thread.sleep(3000);
	     driver.findElement(By.id("aus5")).sendKeys("Other");
	     Thread.sleep(3000);
	     driver.findElement(By.id("otherAus")).sendKeys("Not applicable");
	     Thread.sleep(3000);
	     driver.findElement(By.id("ausRecommendation1")).sendKeys("Accept");
	     Thread.sleep(3000);
	     driver.findElement(By.id("ausRecommendation2")).sendKeys("Approve/Eligible");
	     Thread.sleep(3000);
	     driver.findElement(By.id("ausRecommendation3")).sendKeys("Eligible");
	     Thread.sleep(3000);
	     driver.findElement(By.id("ausRecommendation4")).sendKeys("Invalid");
	     Thread.sleep(3000);
	     driver.findElement(By.id("ausRecommendation5")).sendKeys("Incomplete");
	     Thread.sleep(3000);
	     driver.findElement(By.id("otherAusRecommendation")).sendKeys("Approve");
	     Thread.sleep(3000);
	     driver.findElement(By.id("reverseMortgage")).sendKeys("Reverse Mortgage");
	     Thread.sleep(3000);
	     driver.findElement(By.id("creditOpenEndLine")).sendKeys("Open-end line of credit");
	     Thread.sleep(3000);
	     driver.findElement(By.id("businessOrCommercial")).sendKeys("Not primarily for a business or commercial purpose");
	     WebElement SaveRiskAssessment = driver.findElement(By.id("saveRiskAssessment"));
	     JavascriptExecutor Save_RiskAssessment = (JavascriptExecutor)driver;
	     Save_RiskAssessment.executeScript("arguments[0].click();", SaveRiskAssessment);
	     driver.navigate().refresh();
	     Thread.sleep(3000);
	     // REGULATION TAB
	     WebElement RegulationTab = driver.findElement(By.id("regulationTab"));
	     JavascriptExecutor Regulation_Tab =(JavascriptExecutor)driver;
	     Regulation_Tab.executeScript("arguments[0].click();", RegulationTab);
	     Thread.sleep(3000);
	     driver.findElement(By.id("regulationActionTaken")).sendKeys("Cancelled by lender");
	     Thread.sleep(3000);
	     WebElement RegulationActionDate =  driver.findElement(By.id("regulationActionDate"));
	     JavascriptExecutor Regulation_ActionDate =(JavascriptExecutor)driver;
	     Regulation_ActionDate.executeScript("arguments[0].click();", RegulationActionDate);
	     RegulationActionDate.sendKeys("02-08-2024");
	     Thread.sleep(3000);
	     WebElement SaveRegulation =  driver.findElement(By.id("saveRegulation"));
	     JavascriptExecutor Save_Regulation =(JavascriptExecutor)driver;
	     Save_Regulation.executeScript("arguments[0].click();", SaveRegulation);
	     driver.navigate().refresh();
	     Thread.sleep(3000);
	     driver.quit();
	     
	     
	     
  }
}
