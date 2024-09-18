package PipeLine.LoanDetails.Processing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ES_39_Forms {
  @Test
  public void Forms() throws InterruptedException {
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
//CLICKING ON PROCESSING  MENU
WebElement ProcessingNavigation = driver.findElement(By.id("processingMenu"));
JavascriptExecutor Processing= (JavascriptExecutor)driver;
Processing.executeScript("arguments[0].click();", ProcessingNavigation);
Thread.sleep(2000);
//FORMS
WebElement ProcessingForms = driver.findElement(By.id("processing-Forms"));
JavascriptExecutor Processing_Forms= (JavascriptExecutor)driver;
Processing_Forms.executeScript("arguments[0].click();", ProcessingForms);
Thread.sleep(2000);
WebElement SelectPackage = driver.findElement(By.id("selectPackage"));
JavascriptExecutor selectPackage = (JavascriptExecutor)driver;
selectPackage.executeScript("arguments[0].click();", SelectPackage);
SelectPackage.sendKeys("Forms bundles 1");

Thread.sleep(2000);
WebElement PopulateBtn = driver.findElement(By.id("populateBtn"));
JavascriptExecutor populateBtn = (JavascriptExecutor)driver;
populateBtn.executeScript("arguments[0].click();", PopulateBtn);
Thread.sleep(2000);
WebElement LenderName = driver.findElement(By.id("lenderName"));
JavascriptExecutor lenderName = (JavascriptExecutor)driver;
lenderName.executeScript("arguments[0].click();", LenderName);
LenderName.sendKeys("Street Capital, LLC") ;
Thread.sleep(2000);
WebElement PopulateBtnS = driver.findElement(By.id("populateBtn"));
JavascriptExecutor populateBtn1 = (JavascriptExecutor)driver;
populateBtn1.executeScript("arguments[0].click();", PopulateBtnS);
Thread.sleep(2000);
WebElement DownloadLoanPackages = driver.findElement(By.id("downloadLoanPackages"));
JavascriptExecutor downloadLoanPackages = (JavascriptExecutor)driver;
downloadLoanPackages.executeScript("arguments[0].click();", DownloadLoanPackages);
Thread.sleep(5000);
driver.navigate().refresh();
//INDIVIDUAL FORMS
WebElement IndividualFormsTab = driver.findElement(By.id("individualFormsTab"));
JavascriptExecutor individualFormsTab = (JavascriptExecutor)driver;
individualFormsTab.executeScript("arguments[0].click();", IndividualFormsTab);
Thread.sleep(2000);
WebElement PopulateIndividualform = driver.findElement(By.id("populateIndividualform"));
JavascriptExecutor populateIndividualform = (JavascriptExecutor)driver;
populateIndividualform.executeScript("arguments[0].click();", PopulateIndividualform);
Thread.sleep(2000);
WebElement IndiviualForms = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div/div[1]"));
JavascriptExecutor Indiviual_Forms = (JavascriptExecutor)driver;
Indiviual_Forms.executeScript("arguments[0].click();", IndiviualForms);
Thread.sleep(2000);
IndiviualForms.sendKeys("Taxes & Insurance");
Thread.sleep(2000);
IndiviualForms.sendKeys(Keys.ARROW_DOWN);
IndiviualForms.sendKeys(Keys.ENTER);
//
WebElement IndividualLenderName = driver.findElement(By.id("individualLenderName"));
JavascriptExecutor individualLenderName = (JavascriptExecutor)driver;
individualLenderName.executeScript("arguments[0].click();", IndividualLenderName);
Thread.sleep(2000);
IndividualLenderName.sendKeys("National Loan Funding, LLC");
Thread.sleep(3000);
WebElement PopulateIndividualform1 = driver.findElement(By.id("populateIndividualform"));
JavascriptExecutor populateIndividualform1 = (JavascriptExecutor)driver;
populateIndividualform1.executeScript("arguments[0].click();", PopulateIndividualform1);
Thread.sleep(2000);

WebElement DownloadIndividualform = driver.findElement(By.id("downloadIndividualform"));
JavascriptExecutor downloadIndividualform = (JavascriptExecutor)driver;
downloadIndividualform.executeScript("arguments[0].click();", DownloadIndividualform);
Thread.sleep(5000);
WebElement IndividualFormContent = driver.findElement(By.id("individualFormContent"));
JavascriptExecutor individualFormContent = (JavascriptExecutor)driver;
individualFormContent.executeScript("arguments[0].click();", IndividualFormContent);
IndividualFormContent.sendKeys("Save as Word Doc");
WebElement PopulateIndividualform11 = driver.findElement(By.id("populateIndividualform"));
JavascriptExecutor populateIndividualform11 = (JavascriptExecutor)driver;
populateIndividualform11.executeScript("arguments[0].click();", PopulateIndividualform11);
Thread.sleep(2000);

WebElement DownloadIndividualform1 = driver.findElement(By.id("downloadIndividualform"));
JavascriptExecutor downloadIndividualform1 = (JavascriptExecutor)driver;
downloadIndividualform1.executeScript("arguments[0].click();", DownloadIndividualform1);
Thread.sleep(5000);
driver.quit();


  }
}
