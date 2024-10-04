package PipeLine.LoanDetails.Servicing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ES_48_PayOff {
	@Test
	public void PayOff() throws InterruptedException {
		// TODO Auto-generated method stub
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
	    Thread.sleep(1000);
    //SERVICING MENU
    WebElement ServicingMenu = driver.findElement(By.id("servicingMenu"));
    JavascriptExecutor servicing_menu = (JavascriptExecutor)driver;
    servicing_menu.executeScript("arguments[0].click();", ServicingMenu);
    Thread.sleep(1000);
    WebElement PayOff = driver.findElement(By.id("servicing-Payoff"));
    JavascriptExecutor PayOff_Submenu = (JavascriptExecutor)driver;
    PayOff_Submenu.executeScript("arguments[0].click();", PayOff);
    Thread.sleep(1000);
    WebElement NetfunddrawbalanceToggleOn = driver.findElement(By.name("netfunddrawbalance"));
    JavascriptExecutor ToggleOn = (JavascriptExecutor)driver;
    ToggleOn.executeScript("arguments[0].click();", NetfunddrawbalanceToggleOn);
    Thread.sleep(1000);
    WebElement NetfunddrawbalanceToggleOff = driver.findElement(By.name("netfunddrawbalance"));
    JavascriptExecutor ToggleOff = (JavascriptExecutor)driver;
    ToggleOff.executeScript("arguments[0].click();", NetfunddrawbalanceToggleOff);
    Thread.sleep(1000);
    driver.findElement(By.name("payoffdate")).sendKeys("11/11/2024");
    Thread.sleep(1000);
    driver.findElement(By.name("payoffexpirydate")).sendKeys("12/12/2024");
    Thread.sleep(1000);
    driver.findElement(By.name("dailyperdiem")).sendKeys("255000");
    Thread.sleep(1000);
    driver.findElement(By.name("overwritedays")).sendKeys("30");
    Thread.sleep(1000);
    driver.findElement(By.name("outstandingpaymentasofdate")).sendKeys("11/11/2024");
    Thread.sleep(3000);
    //ALL SAVED Fees & credits
   /* WebElement AddFeesandCredits = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/div/div[3]/div[4]/div/button)"));
    JavascriptExecutor Add = (JavascriptExecutor)driver;
    Add.executeScript("arguments[0].click();", AddFeesandCredits);
    Thread.sleep(1000);*/
    driver.findElement(By.name("amount")).sendKeys("650000");
    Thread.sleep(1000);
    WebElement Description = driver.findElement(By.name("description"));
    JavascriptExecutor description =(JavascriptExecutor)driver;
    description.executeScript("arguments[0].click();", Description);
    Description.sendKeys("Will Credit");
    Thread.sleep(1000);
    WebElement creditToggleOn = driver.findElement(By.name("credit"));
    JavascriptExecutor credit_ToggleOn = (JavascriptExecutor)driver;
    credit_ToggleOn.executeScript("arguments[0].click();", creditToggleOn);
    Thread.sleep(1000);
    WebElement creditToggleOff = driver.findElement(By.name("credit"));
    JavascriptExecutor credit_ToggleOff = (JavascriptExecutor)driver;
    credit_ToggleOff.executeScript("arguments[0].click();", creditToggleOff);
    Thread.sleep(1000);
    WebElement AddFeesCredits = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/div/div[3]/div[4]/div/button)"));
    JavascriptExecutor AddCredits = (JavascriptExecutor)driver;
    AddCredits.executeScript("arguments[0].click();", AddFeesCredits);
    Thread.sleep(1000);
    //Additional Payoff Letter Verbiage
    WebElement PayoffLetterVerbiage = driver.findElement(By.name("additionalpayoffletterverbage"));
    JavascriptExecutor Verbiage = (JavascriptExecutor)driver;
    Verbiage.executeScript("arguments[0].click();", PayoffLetterVerbiage);
    PayoffLetterVerbiage.sendKeys("Additional Payoff Letter Verbiage");
    Thread.sleep(1000);
    //SEND PAYOFF LETTER
    WebElement PayoffLetter = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/div/div[6]/button[2]"));
    JavascriptExecutor Letter = (JavascriptExecutor)driver;
    Letter.executeScript("arguments[0].click();", PayoffLetter);
    Thread.sleep(3000);
    WebElement ClosePopup = driver.findElement(By.xpath("closePopupBtn"));
    JavascriptExecutor Popup = (JavascriptExecutor)driver;
    Popup.executeScript("arguments[0].click();", ClosePopup);
    Thread.sleep(3000);
    WebElement SendEmail = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/div/div[5]/div[3]/div/div/input"));
    JavascriptExecutor EmailAddress = (JavascriptExecutor)driver;
    EmailAddress.executeScript("arguments[0].click();", SendEmail);
    Thread.sleep(3000);
    SendEmail.sendKeys("mvvsrikanth@sanchaninfo.com");
  //SEND PAYOFF LETTER
    WebElement PayoffLetters = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/div/div[6]/button[2]"));
    JavascriptExecutor Letters = (JavascriptExecutor)driver;
    Letters.executeScript("arguments[0].click();", PayoffLetters);
    Thread.sleep(3000);
    WebElement Closepopup = driver.findElement(By.xpath("closePopupBtn"));
    JavascriptExecutor popup = (JavascriptExecutor)driver;
    popup.executeScript("arguments[0].click();", Closepopup);
    Thread.sleep(3000);
    WebElement PayoffLetterPreview = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/div/div[6]/button[1]"));
    JavascriptExecutor Preview = (JavascriptExecutor)driver;
    Preview.executeScript("arguments[0].click();", PayoffLetterPreview);
    
}}
