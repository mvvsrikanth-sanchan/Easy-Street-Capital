package PipeLine.LoanDetails.UnderWriting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ES_36_BorrowerExposure {
  @Test
  public void BorrowerExposure() throws InterruptedException {
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
	  // CLICKING ON UNDERWRITING  MENU
	     WebElement UnderwritingNavigation = driver.findElement(By.id("underwritingMenu"));
		   JavascriptExecutor Underwriting= (JavascriptExecutor)driver;
		   Underwriting.executeScript("arguments[0].click();", UnderwritingNavigation);
	   Thread.sleep(2000);
	   // BorrowerExposure Menu 
	   WebElement BorrowerExposure = driver.findElement(By.id("underwriting-BorrowerExposure"));
	   JavascriptExecutor Borrower_Exposure= (JavascriptExecutor)driver;
	   Borrower_Exposure.executeScript("arguments[0].click();", BorrowerExposure);
	   Thread.sleep(2000);
	   WebElement SearchBorrower =driver.findElement(By.id("searchBorrowerLoan"));
	   SearchBorrower.sendKeys("300000012");
	   Thread.sleep(2000);
	   System.out.println("No searched Loan id found");
	   SearchBorrower.clear();
	   Thread.sleep(2000);
	   SearchBorrower.sendKeys("Ricky's");
	   Thread.sleep(2000);
	   System.out.println("No searched Name found");
	   SearchBorrower.clear();
	   Thread.sleep(2000);
	   JavascriptExecutor Search_Borrower = (JavascriptExecutor)driver;
	   Search_Borrower.executeScript("arguments[0].value='';",SearchBorrower);
	   SearchBorrower.sendKeys("Rias");
	   System.out.println("No searched Address found");
	   Thread.sleep(3000);
	   WebElement SearchClose = driver.findElement(By.className("search_close"));
	   JavascriptExecutor Search_close = (JavascriptExecutor)driver;
	   Search_close.executeScript("arguments[0].click();", SearchClose);
	   Thread.sleep(3000);
	   SearchBorrower.sendKeys("300148");
	   Thread.sleep(2000);
	   SearchBorrower.sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(2000);
	   SearchBorrower.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   WebElement AddLoanToBorrower = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/div[2]/div/div/button"));
	   JavascriptExecutor AddLoan_ToBorrower= (JavascriptExecutor)driver;
	   AddLoan_ToBorrower.executeScript("arguments[0].click();", AddLoanToBorrower);
	   Thread.sleep(2000);
	   WebElement AddedLoanPopup = driver.findElement(By.id("closePopupBtn"));
	   JavascriptExecutor Added_LoanPopup= (JavascriptExecutor)driver;
	   Added_LoanPopup.executeScript("arguments[0].click();", AddedLoanPopup);
	  Thread.sleep(2000);
	   WebElement ExportExcel = driver.findElement(By.id("exportBorrowerLoanExcel"));
	   JavascriptExecutor Export_Excel = (JavascriptExecutor)driver;
	   Export_Excel.executeScript("arguments[0].click();", ExportExcel);
	   Thread.sleep(3000);
	// CLICKING ON UNDERWRITING  MENU
	     WebElement UnderwritingNavigation1 = driver.findElement(By.id("underwritingMenu"));
		   JavascriptExecutor Underwriting1= (JavascriptExecutor)driver;
		   Underwriting1.executeScript("arguments[0].click();", UnderwritingNavigation1);
	   Thread.sleep(2000);
	   // Clicking on Underwriting Menu
	   WebElement UnderwritingMenu = driver.findElement(By.id("underwriting-UnderwritingTermSheet"));
	   JavascriptExecutor Underwritings= (JavascriptExecutor)driver;
	   Underwritings.executeScript("arguments[0].click();", UnderwritingMenu);
	   Thread.sleep(2000);
	   // BorrowerExposure Menu 
	   WebElement UnderwritingNavigations = driver.findElement(By.id("underwritingMenu"));
	   JavascriptExecutor Underwritings1= (JavascriptExecutor)driver;
	   Underwritings1.executeScript("arguments[0].click();", UnderwritingNavigations);
	   Thread.sleep(2000);
	   WebElement BorrowerExposure1 = driver.findElement(By.id("underwriting-BorrowerExposure"));
	   JavascriptExecutor Borrower_Exposure1= (JavascriptExecutor)driver;
	   Borrower_Exposure1.executeScript("arguments[0].click();", BorrowerExposure1);
	   Thread.sleep(2000);
	   
        WebElement SearchBorrower1 =driver.findElement(By.id("searchBorrowerLoan"));
		  JavascriptExecutor SearchedBorrower =(JavascriptExecutor)driver;
		  SearchedBorrower.executeScript("arguments[0].click();", SearchBorrower1);
		  Thread.sleep(3000);
		   SearchBorrower1.sendKeys("300148");
		   Thread.sleep(3000);
		 SearchBorrower1.sendKeys(Keys.ARROW_DOWN);
		   Thread.sleep(2000);
		   SearchBorrower1.sendKeys(Keys.ENTER);
		   Thread.sleep(2000);
		   WebElement AddLoanToBorrower2 = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/div[2]/div/div/button"));
		   JavascriptExecutor AddLoan_ToBorrower2= (JavascriptExecutor)driver;
		   AddLoan_ToBorrower2.executeScript("arguments[0].click();", AddLoanToBorrower2); 
		   Thread.sleep(3000);   
		
		   WebElement Delete_PopUpClose = driver.findElement(By.id("closePopupBtn"));
		   JavascriptExecutor PopUpClose=(JavascriptExecutor)driver;
		   PopUpClose.executeScript("arguments[0].click();", Delete_PopUpClose);
		   Thread.sleep(3000);
		     
	   JavascriptExecutor ScrolPage1 = (JavascriptExecutor)driver;
	   ScrolPage1.executeScript("window.scrollBy(0,300);");   
	   
	 
	   Thread.sleep(2000);
	   WebElement PowerOffLoan = driver.findElement(By.id("powerOffLoan-0"));
	   JavascriptExecutor PowerOff_Loan =(JavascriptExecutor)driver;
	   PowerOff_Loan.executeScript("arguments[0].click();", PowerOffLoan);
	   Thread.sleep(2000);
	   WebElement Delete_ExposureNo = driver.findElement(By.id("delete-exposure-no"));
	   JavascriptExecutor ExposureNo =(JavascriptExecutor)driver;
	   ExposureNo.executeScript("arguments[0].click();", Delete_ExposureNo);
	   Thread.sleep(2000);
	   WebElement PowerOffLoan1 = driver.findElement(By.id("powerOffLoan-0"));
	   JavascriptExecutor PowerOff_Loan1 =(JavascriptExecutor)driver;
	   PowerOff_Loan1.executeScript("arguments[0].click();", PowerOffLoan1);
	   Thread.sleep(2000);
	   WebElement Delete_ExposureYes = driver.findElement(By.id("delete-exposure-yes"));
	   JavascriptExecutor ExposureYes =(JavascriptExecutor)driver;
	   ExposureYes.executeScript("arguments[0].click();", Delete_ExposureYes);
	   Thread.sleep(2000);
	   WebElement Delete_PopUpClose1 = driver.findElement(By.id("closePopupBtn"));
	   JavascriptExecutor PopUpClose1=(JavascriptExecutor)driver;
	   PopUpClose1.executeScript("arguments[0].click();", Delete_PopUpClose1);
	   Thread.sleep(2000);
	   
	   driver.quit();
  }
}
