package PipeLine.LoanDetails.Servicing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ES_45_ServicingSetup {
  @Test
  public void ServicingSetup () throws InterruptedException {
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
//CLICKING ON SERVICING MENU
WebElement ServicingMenu = driver.findElement(By.id("servicingMenu"));
JavascriptExecutor Servicing_Menu= (JavascriptExecutor)driver;
Servicing_Menu.executeScript("arguments[0].click();", ServicingMenu);
Thread.sleep(5000);
//SERVICING SETUP
WebElement ServicingSetup = driver.findElement(By.id("servicing-ServicingSetup"));
JavascriptExecutor Servicing_Setup= (JavascriptExecutor)driver;
Servicing_Setup.executeScript("arguments[0].click();", ServicingSetup);
Thread.sleep(5000);
//LOAN SETUP
// Locate the button 
WebElement Unlockbutton = driver.findElement(By.id("saveandlockbtn"));
JavascriptExecutor Unlock_Setup= (JavascriptExecutor)driver;
Unlock_Setup.executeScript("arguments[0].click();", Unlockbutton);

if (Unlockbutton.isEnabled()) {
    System.out.println("Button is unlocked. Proceeding with further automation...");
    
        
} else {
    System.out.println("Button is locked. Attempting to unlock...");
    enableButton(driver);
    if (Unlockbutton.isEnabled()) {
        System.out.println("Button is now enabled. Proceeding with further automation...");
        Unlockbutton.click();
        // Add further test steps here
    } else {
        System.out.println("Button could not be enabled.");
    }
}
    Thread.sleep(3000);
    
    /*

/////////////////////////////////////////
WebElement unlocked = driver.findElement(By.id("savebtn"));
//JavascriptExecutor unlock_Setup= (JavascriptExecutor)driver;
//unlock_Setup.executeScript("arguments[0].click();", unlockSetup);
Thread.sleep(3000);
if (unlocked.isEnabled()) {
    System.out.println("Button is unlocked. Proceeding with automation.");

    // Perform actions as the button is unlocked
  JavascriptExecutor unlock_Setup= (JavascriptExecutor)driver;
    unlock_Setup.executeScript("arguments[0].click();", unlocked);
    // Add further automation steps here

} else {
	WebElement unlockSetup = driver.findElement(By.id("unlockbtn"));
	if (unlockSetup.isEnabled()) {
		System.out.println("Button is locked. Automation will not proceed.");
		JavascriptExecutor unlock_Setup= (JavascriptExecutor)driver;
	    unlock_Setup.executeScript("arguments[0].click();", unlockSetup);
		unlockSetup.click();
	}
    
}

Thread.sleep(3000);
WebElement closePopup = driver.findElement(By.id("closePopupBtn"));
JavascriptExecutor close_Popup= (JavascriptExecutor)driver;
close_Popup.executeScript("arguments[0].click();", closePopup);
Thread.sleep(3000);
WebElement Actualwire_Funddate = driver.findElement(By.name("actualwire_funddate"));
JavascriptExecutor actualwire_funddate= (JavascriptExecutor)driver;
actualwire_funddate.executeScript("arguments[0].click();", Actualwire_Funddate);
Actualwire_Funddate.sendKeys("01-09-2024");
Thread.sleep(3000);
WebElement Scheduledfirstpaymentdate = driver.findElement(By.name("scheduledfirstpaymentdate"));
JavascriptExecutor scheduledfirstpaymentdate= (JavascriptExecutor)driver;
scheduledfirstpaymentdate.executeScript("arguments[0].click();", Scheduledfirstpaymentdate);
Scheduledfirstpaymentdate.sendKeys("10-10-2024");
Thread.sleep(3000);
WebElement Servicingenddate = driver.findElement(By.name("servicingenddate"));
JavascriptExecutor servicingenddate= (JavascriptExecutor)driver;
servicingenddate.executeScript("arguments[0].click();", Servicingenddate);
Servicingenddate.sendKeys("22-11-2024");
Thread.sleep(3000);
WebElement Save1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[3]/div[2]/div[2]/div/a"));
JavascriptExecutor Save_funddate1= (JavascriptExecutor)driver;
Save_funddate1.executeScript("arguments[0].click();", Save1);
Thread.sleep(3000);
driver.navigate().refresh();
//PAYMENT SETUP
Thread.sleep(3000);
WebElement PaymentSetup = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[2]/a/span[2]"));
JavascriptExecutor Payment_Setup= (JavascriptExecutor)driver;
Payment_Setup.executeScript("arguments[0].click();", PaymentSetup);
Thread.sleep(2000);
WebElement DeferPayments = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/label/div"));
JavascriptExecutor Defer_Payments= (JavascriptExecutor)driver;
Defer_Payments.executeScript("arguments[0].click();", DeferPayments);
Thread.sleep(2000);
WebElement DeferPayments1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/label/div"));
JavascriptExecutor Defer_Payments1= (JavascriptExecutor)driver;
Defer_Payments1.executeScript("arguments[0].click();", DeferPayments1);
Thread.sleep(2000);
WebElement PartialPayments = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/label/div"));
JavascriptExecutor Partial_Payments= (JavascriptExecutor)driver;
Partial_Payments.executeScript("arguments[0].click();", PartialPayments);
Thread.sleep(2000);
WebElement PartialPayments1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/label/div"));
JavascriptExecutor Partial_Payments1= (JavascriptExecutor)driver;
Partial_Payments1.executeScript("arguments[0].click();", PartialPayments1);
Thread.sleep(2000);
WebElement UserAutopay = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/label/div"));
JavascriptExecutor User_Autopay= (JavascriptExecutor)driver;
User_Autopay.executeScript("arguments[0].click();", UserAutopay);
Thread.sleep(2000);
WebElement UserAutopay1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/label/div"));
JavascriptExecutor User_Autopay1= (JavascriptExecutor)driver;
User_Autopay1.executeScript("arguments[0].click();", UserAutopay1);
Thread.sleep(2000);
WebElement PaymentSetup1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[2]/a/span[2]"));
JavascriptExecutor Payment_Setup1= (JavascriptExecutor)driver;
Payment_Setup1.executeScript("arguments[0].click();", PaymentSetup1);
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.quit();*/
  }


private void enableButton(ChromeDriver driver) {
	// TODO Auto-generated method stub
	WebElement unlockButton = driver.findElement(By.id("unlockbtn"));
    unlockButton.click();
}}
