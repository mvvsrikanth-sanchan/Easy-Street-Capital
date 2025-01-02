package Reports;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import net.bytebuddy.asm.Advice.Enter;

public class ES_51_Form1098 extends BaseTest {
	/**
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Test
	public void Form1098() throws InterruptedException, IOException {

		driver.findElement(By.id(loc.getProperty("teammember_button"))).click();

		// Enter User Name
		driver.findElement(By.id(loc.getProperty("emailid"))).sendKeys("mvvsrikanth@sanchaninfo.com");

		// Enter password Name

		driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys("Sanchan@123");

		driver.findElement(By.id(loc.getProperty("Login_button"))).click();
		
		/*
		 * REPORTS MENU
		 */
		Thread.sleep(5000);
		
		driver.findElement(By.linkText(forms.getProperty("ReportsMenu"))).click();
		Thread.sleep(3000);
		WebDriverWait Form1098 = new WebDriverWait(driver, Duration.ofSeconds(30));
		Form1098.until(ExpectedConditions.elementToBeClickable(By.id(forms.getProperty("Form1098")))).click();
		Thread.sleep(3000);
		
		  //Generate
		 
		
		  WebElement Generate = driver.findElement(By.id(forms.getProperty("Generate"))); 
		  JavascriptExecutor Click_Generate = (JavascriptExecutor) driver;
		  Click_Generate.executeScript("arguments[0].click();", Generate);
		  Thread.sleep(5000); 
		  WebElement GenerateClosePopUp =driver.findElement(By.id(forms.getProperty("CloseButton")));
		 JavascriptExecutor Generate_ClosePopUp = (JavascriptExecutor) driver;
		  Generate_ClosePopUp.executeScript("arguments[0].click();",GenerateClosePopUp);
		 Thread.sleep(3000); 
		 WebElement Year =driver.findElement(By.id(forms.getProperty("Year")));
		 Year.sendKeys("2020");
		 Thread.sleep(3000); 
		 WebElement Generates =driver.findElement(By.id(forms.getProperty("Generate"))); 
		 JavascriptExecutor  Click_Generates = (JavascriptExecutor) driver;
		 Click_Generates.executeScript("arguments[0].click();", Generates);
		 Thread.sleep(3000);
		  driver.findElement(By.id(forms.getProperty("Organization"))).sendKeys("Easy Street Capital Investments, LLC"); 
		 Thread.sleep(3000);
		 WebElement SearchLoan = driver.findElement(By.id(forms.getProperty("SearchLoanIds")));
		 SearchLoan.sendKeys("808023"); 
		 Thread.sleep(3000); 
		 WebElement GenerateButton = driver.findElement(By.id(forms.getProperty("Generate"))); 
		 JavascriptExecutor Click_GenerateButton = (JavascriptExecutor) driver;
		 Click_GenerateButton.executeScript("arguments[0].click();", GenerateButton);
		 Thread.sleep(3000);
		 WebElement CloseLoanSearch = driver.findElement(By.xpath(forms.getProperty("CloseLoanSearch")));
		  JavascriptExecutor Close_LoanSearch = (JavascriptExecutor) driver;
		  Close_LoanSearch.executeScript("arguments[0].click();", CloseLoanSearch);
		 Thread.sleep(3000); 
		 SearchLoan.sendKeys("3000");
		 Thread.sleep(2000);
		 //SearchLoan.sendKeys(Keys.ARROW_DOWN); 
		 Thread.sleep(3000);
		 
		  // Loan number doesn't lie between the year validation
		 WebElement IdSelection = driver.findElement(By.xpath(forms.getProperty("LoanIdSelection")));
		  IdSelection.click();
		  Thread.sleep(3000); 
		  WebElement GenerateClick = driver.findElement(By.id(forms.getProperty("Generate"))); 
		  JavascriptExecutor click_Generate = (JavascriptExecutor) driver;
		   click_Generate.executeScript("arguments[0].click();", GenerateClick);
		  Thread.sleep(5000);
		 WebElement Generate_closePopUp = driver.findElement(By.id(forms.getProperty("CloseButton")));
		  JavascriptExecutor Generate_close = (JavascriptExecutor) driver;
		 Generate_close.executeScript("arguments[0].click();", Generate_closePopUp);
		 Thread.sleep(3000); 
		 //Loan selection
		 Year.clear();
		 Thread.sleep(1000); 
		 Year.sendKeys("2024"); 
		 Thread.sleep(3000);
		 Generate.click();
		 Thread.sleep(5000);
		 WebElement UploadedClosePopUp =driver.findElement(By.id(forms.getProperty("CloseButton")));
		 JavascriptExecutor Uploaded_ClosePopUp = (JavascriptExecutor) driver;
		 Uploaded_ClosePopUp.executeScript("arguments[0].click();",UploadedClosePopUp); 
		 Thread.sleep(3000);
		 
		/*
		 * 
		 * Import Form 1098
		 */
		WebElement FormImport = driver.findElement(By.id(forms.getProperty("Import")));
		FormImport.click();
		Thread.sleep(3000);
		// Sample template download
		 WebElement TemplateDownload = driver.findElement(By.id(forms.getProperty("SampleTemplate")));
		 TemplateDownload.click(); 
		 Thread.sleep(3000);
		
		// Upload Form 1098
		// Empty Form 
		String InvalidFile = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\TestData\\Form1098Uploads\\sample_format_form1098.xlsx";
		driver.findElement(By.xpath(forms.getProperty("ImportFile"))).sendKeys(InvalidFile);
		Thread.sleep(3000);
		WebElement EmptyFormClosePopUp = driver.findElement(By.id(forms.getProperty("CloseButton")));
		JavascriptExecutor EmptyForm = (JavascriptExecutor) driver;
		EmptyForm.executeScript("arguments[0].click();", EmptyFormClosePopUp);
		Thread.sleep(3000);
		WebElement NavigateBack = driver.findElement(By.xpath(forms.getProperty("NavigateBack")));
		NavigateBack.click();
		Thread.sleep(3000);
		WebElement Import = driver.findElement(By.id(forms.getProperty("Import")));
		Import.click();
		Thread.sleep(3000);
		// Validations Display
		String FileValidation = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\TestData\\Form1098Uploads\\format_form1098_Validation.xlsx";
		driver.findElement(By.xpath(forms.getProperty("ImportFile"))).sendKeys(FileValidation);

		Thread.sleep(3000);
		// UnCheck and check ALL
		WebElement CheckboxAll = driver.findElement(By.id(forms.getProperty("CheckAll")));
		JavascriptExecutor CheckBoxClick = (JavascriptExecutor) driver;
		CheckBoxClick.executeScript("arguments[0].click();", CheckboxAll);
		Thread.sleep(1000);
		WebElement SelectAll = driver.findElement(By.id(forms.getProperty("CheckAll")));
		JavascriptExecutor Select = (JavascriptExecutor) driver;
		Select.executeScript("arguments[0].click();", SelectAll);
		// Individual Check Box
		WebElement RowUnCheckbox = driver.findElement(By.id(forms.getProperty("FirstRowUncheck")));
		JavascriptExecutor UnCheck = (JavascriptExecutor) driver;
		UnCheck.executeScript("arguments[0].click();", RowUnCheckbox);
		Thread.sleep(1000);
		WebElement RowCheckOn = driver.findElement(By.id(forms.getProperty("FirstRowUncheck")));
		JavascriptExecutor Check = (JavascriptExecutor) driver;
		Check.executeScript("arguments[0].click();", RowCheckOn);
		// Sorting of Rejected one
		WebElement StatusSorting = driver.findElement(By.xpath(forms.getProperty("ResultSorting")));
		JavascriptExecutor sorting = (JavascriptExecutor) driver;
		sorting.executeScript("arguments[0].click();", StatusSorting);
		Thread.sleep(1000);
		// Deleting the Rejected One
		WebElement RejectedDelete = driver.findElement(By.id(forms.getProperty("DeleteRejected")));
		JavascriptExecutor Rejected = (JavascriptExecutor) driver;
		Rejected.executeScript("arguments[0].click();", RejectedDelete);
		Thread.sleep(1000);
		// Rejected Yes or No
		WebElement RejectedNo = driver.findElement(By.id(forms.getProperty("DeleteNo")));
		JavascriptExecutor Rejected_No = (JavascriptExecutor) driver;
		Rejected_No.executeScript("arguments[0].click();", RejectedNo);
		Thread.sleep(1000);
		RejectedDelete.click();
		Thread.sleep(1000);
		WebElement RejectedYes = driver.findElement(By.id(forms.getProperty("DeleteYes")));
		JavascriptExecutor Rejected_Yes = (JavascriptExecutor) driver;
		Rejected_Yes.executeScript("arguments[0].click();", RejectedYes);
		Thread.sleep(3000);
		WebElement DeleteClosePopUp = driver.findElement(By.id(forms.getProperty("CloseButton")));
		JavascriptExecutor DeletePopup = (JavascriptExecutor) driver;
		DeletePopup.executeScript("arguments[0].click();", DeleteClosePopUp);
		Thread.sleep(3000);
		WebElement NavigateBacks = driver.findElement(By.xpath(forms.getProperty("NavigateBack")));
		NavigateBacks.click();

		// Upload Valid Data
		String ValidFile = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\TestData\\Form1098Uploads\\format_form1098_Data.xlsx";
		driver.findElement(By.xpath(forms.getProperty("ImportFile"))).sendKeys(ValidFile);
		Thread.sleep(3000);
		JavascriptExecutor PageScroll = (JavascriptExecutor)driver;
		PageScroll.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);
		// Per Page setup
		WebElement PerPageSetup = driver.findElement(By.xpath(forms.getProperty("PerPageSelect")));
		JavascriptExecutor PerPage = (JavascriptExecutor) driver;
		PerPage.executeScript("arguments[0].click();", PerPageSetup);
		Select Pagination = new Select(PerPageSetup);
		Pagination.selectByValue("20");
		Thread.sleep(3000);
		WebElement PerPagesSetup = driver.findElement(By.xpath(forms.getProperty("PerPageSelect")));
		JavascriptExecutor PerPages = (JavascriptExecutor) driver;
		PerPages.executeScript("arguments[0].click();", PerPagesSetup);
		Thread.sleep(3000);
		Pagination.selectByValue("10");
		Thread.sleep(3000);
		// Page Forward
		WebElement ThirdPage = driver.findElement(By.xpath(forms.getProperty("ThirdPage")));
		JavascriptExecutor Forward = (JavascriptExecutor) driver;
		PerPage.executeScript("arguments[0].click();", ThirdPage);
		Thread.sleep(3000);
		WebElement LastPage = driver.findElement(By.xpath(forms.getProperty("LastPage")));
		JavascriptExecutor Last = (JavascriptExecutor) driver;
		Last.executeScript("arguments[0].click();", LastPage);
		Thread.sleep(3000);
		WebElement SecondPage = driver.findElement(By.xpath(forms.getProperty("SecondPage")));
		JavascriptExecutor Second = (JavascriptExecutor) driver;
		Second.executeScript("arguments[0].click();", SecondPage);
		Thread.sleep(3000);
		WebElement FirstPage = driver.findElement(By.xpath(forms.getProperty("FirstPage")));
		JavascriptExecutor First = (JavascriptExecutor) driver;
		First.executeScript("arguments[0].click();", FirstPage);
		Thread.sleep(3000);
		WebElement ImportedGenerate = driver.findElement(By.id(forms.getProperty("Generate")));
		JavascriptExecutor Import_Generate = (JavascriptExecutor) driver;
		Import_Generate.executeScript("arguments[0].click();", ImportedGenerate);
		//Thread.sleep(5000);
		WebDriverWait WaitClosePopUp = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement GeneratedClosePopUp =WaitClosePopUp.until(ExpectedConditions.visibilityOfElementLocated(By.id(forms.getProperty("CloseButton"))));
		GeneratedClosePopUp.click();
 		//WebElement GeneratedClosePopUp = driver.findElement(By.id(forms.getProperty("CloseButton")));
		//JavascriptExecutor GeneratedPopup = (JavascriptExecutor) driver;
		//GeneratedPopup.executeScript("arguments[0].click();", GeneratedClosePopUp);
		Thread.sleep(3000);
		// View Uploaded loan
		WebElement ViewUploadedLoan = driver.findElement(By.xpath(forms.getProperty("ViewLoan")));
		JavascriptExecutor AllUploads = (JavascriptExecutor) driver;
		AllUploads.executeScript("arguments[0].click();", ViewUploadedLoan);
		Thread.sleep(3000);
		WebElement PdfDownload = driver.findElement(By.id(forms.getProperty("PdfDownload")));
		JavascriptExecutor Download = (JavascriptExecutor) driver;
		Download.executeScript("arguments[0].click();", PdfDownload);
		Thread.sleep(3000);
		WebElement ViewFileClose = driver.findElement(By.id(forms.getProperty("ViewFileClose")));
		JavascriptExecutor ViewFile = (JavascriptExecutor) driver;
		ViewFile.executeScript("arguments[0].click();", ViewFileClose);
		Thread.sleep(3000);
		// Download Individual uploaded loan
		WebElement DownloadLoan = driver.findElement(By.xpath(forms.getProperty("DownloadLoan")));
		JavascriptExecutor downloadLoan = (JavascriptExecutor) driver;
		downloadLoan.executeScript("arguments[0].click();", DownloadLoan);
		Thread.sleep(3000);
		// Select All for Download
		WebElement SelectAllUploads = driver.findElement(By.name(forms.getProperty("select-all-rows")));
		JavascriptExecutor Select_All = (JavascriptExecutor) driver;
		Select_All.executeScript("arguments[0].click();", SelectAllUploads);
		Thread.sleep(3000);
		// form98BulkDownload
		WebElement BulkDownload = driver.findElement(By.id(forms.getProperty("form98BulkDownload")));
		JavascriptExecutor bulk = (JavascriptExecutor) driver;
		bulk.executeScript("arguments[0].click();", BulkDownload);
		
	}
}
