package PipeLine.LoanDetails.Servicing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ES_47_FeeManagement {
	 @Test
	 public void FeeManagement() throws InterruptedException {
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
    WebElement FeeManagement = driver.findElement(By.id("servicing-FeeManagement"));
    JavascriptExecutor FeeManagement_Submenu = (JavascriptExecutor)driver;
    FeeManagement_Submenu.executeScript("arguments[0].click();", FeeManagement);
    Thread.sleep(1000);
    WebElement CreateFee = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div[1]/div[1]/div/button"));
    JavascriptExecutor CreateFee_button = (JavascriptExecutor)driver;
    CreateFee_button.executeScript("arguments[0].click();", CreateFee);
    Thread.sleep(1000);
    WebElement BackButton = driver.findElement(By.className("back_btn"));
    JavascriptExecutor Button= (JavascriptExecutor)driver;
    Button.executeScript("arguments[0].click();", BackButton);
    Thread.sleep(1000);
    WebElement CreateFees = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div[1]/div[1]/div/button"));
    JavascriptExecutor CreateFees_button = (JavascriptExecutor)driver;
    CreateFees_button.executeScript("arguments[0].click();", CreateFees);
    Thread.sleep(1000);
    driver.findElement(By.name("quickFee")).sendKeys("Servicing Fee");
    Thread.sleep(1000);
    driver.findElement(By.name("effectiveDate")).sendKeys("10/10/2025");
    Thread.sleep(1000);
    driver.findElement(By.name("feeAmount")).sendKeys("1500");
    Thread.sleep(1000);
    driver.findElement(By.name("notes")).sendKeys("Fee May change at the time of payments");
    Thread.sleep(1000);
    WebElement DeferredOn = driver.findElement(By.name("deferred"));
    JavascriptExecutor Deferred_On = (JavascriptExecutor)driver;
    Deferred_On.executeScript("arguments[0].click();", DeferredOn);
    Thread.sleep(1000);
    WebElement DeferredOff = driver.findElement(By.name("deferred"));
    JavascriptExecutor Deferred_Off = (JavascriptExecutor)driver;
    Deferred_Off.executeScript("arguments[0].click();", DeferredOff);
    Thread.sleep(1000);
    WebElement Interest1098reportableOn = driver.findElement(By.name("interest1098reportable"));
    JavascriptExecutor Interest1098reportable_On = (JavascriptExecutor)driver;
    Interest1098reportable_On.executeScript("arguments[0].click();", Interest1098reportableOn);
    Thread.sleep(1000);
    WebElement Interest1098reportableOff = driver.findElement(By.name("interest1098reportable"));
    JavascriptExecutor Interest1098reportable_Off = (JavascriptExecutor)driver;
    Interest1098reportable_Off.executeScript("arguments[0].click();", Interest1098reportableOff);
    Thread.sleep(1000);
    WebElement Principal1098reportableOn = driver.findElement(By.name("principal1098reportable"));
    JavascriptExecutor Principal1098reportable_On = (JavascriptExecutor)driver;
    Principal1098reportable_On.executeScript("arguments[0].click();", Principal1098reportableOn);
    Thread.sleep(1000);
    WebElement Principal1098reportableOff = driver.findElement(By.name("principal1098reportable"));
    JavascriptExecutor Principal1098reportable_Off = (JavascriptExecutor)driver;
    Principal1098reportable_Off.executeScript("arguments[0].click();", Principal1098reportableOff);
    Thread.sleep(1000);
    WebElement MonthlyrecurringOn = driver.findElement(By.name("monthlyrecurring"));
    JavascriptExecutor Monthlyrecurring_On = (JavascriptExecutor)driver;
    Monthlyrecurring_On.executeScript("arguments[0].click();", MonthlyrecurringOn);
    Thread.sleep(1000);
    WebElement MonthlyrecurringOff = driver.findElement(By.name("monthlyrecurring"));
    JavascriptExecutor Monthlyrecurring_Off = (JavascriptExecutor)driver;
    Monthlyrecurring_Off.executeScript("arguments[0].click();", MonthlyrecurringOff);
    Thread.sleep(1000);  
    WebElement Save = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div/div[2]/div/div[9]/div/button"));
    JavascriptExecutor save = (JavascriptExecutor)driver;
    save.executeScript("arguments[0].click();", Save);
    Thread.sleep(3000);  
    WebElement Closepopup = driver.findElement(By.id("closePopupBtn"));
    JavascriptExecutor popup = (JavascriptExecutor)driver;
    popup.executeScript("arguments[0].click();", Closepopup);
    Thread.sleep(1000); 
    WebElement FundsSave = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div/div[2]/div/div[14]/div/button"));
    JavascriptExecutor Funds_Save = (JavascriptExecutor)driver;
    Funds_Save.executeScript("arguments[0].click();", FundsSave);
    Thread.sleep(3000);  
    WebElement FundsClosepopup = driver.findElement(By.id("closePopupBtn"));
    JavascriptExecutor Fundspopup = (JavascriptExecutor)driver;
    Fundspopup.executeScript("arguments[0].click();", FundsClosepopup);
    Thread.sleep(3000); 
    // Filter
    WebElement ApplyFilter = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div[1]/div[2]/select"));
    JavascriptExecutor Filter = (JavascriptExecutor)driver;
    Filter.executeScript("arguments[0].click();", ApplyFilter);
    Thread.sleep(2000); 
    ApplyFilter.sendKeys("Servicing Fee") ;
    Thread.sleep(3000);
    //Edit fee
    WebElement EditFee = driver.findElement(By.id("edit-0"));
    JavascriptExecutor Edit_Fee = (JavascriptExecutor)driver;
    Edit_Fee.executeScript("arguments[0].click();", EditFee);
    Thread.sleep(3000); 
    driver.findElement(By.name("quickFee")).sendKeys("Servicing Fee");
    Thread.sleep(1000);
    driver.findElement(By.name("effectiveDate")).sendKeys("10/10/2024");
    Thread.sleep(1000);
    driver.findElement(By.name("feeAmount")).sendKeys("1900");
    Thread.sleep(3000);
    WebElement Notes = driver.findElement(By.name("notes"));
    JavascriptExecutor note = (JavascriptExecutor)driver;
    note.executeScript("arguments[0].value='';", Notes);
    Thread.sleep(3000);
    driver.findElement(By.name("notes")).sendKeys("Fee May change at per the government orders");
    //Notes.sendKeys("Fee May change at per the government orders");
    Thread.sleep(1000);
    WebElement UpdateFees = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div/div[2]/div/div[9]/div/button"));
    JavascriptExecutor update = (JavascriptExecutor)driver;
    update.executeScript("arguments[0].click();", UpdateFees);
    Thread.sleep(3000);  
    WebElement Closepopup1 = driver.findElement(By.id("closePopupBtn"));
    JavascriptExecutor popup1 = (JavascriptExecutor)driver;
    popup1.executeScript("arguments[0].click();", Closepopup1);
    Thread.sleep(3000); 
    /*JavascriptExecutor PageScroll = (JavascriptExecutor)driver;
    PageScroll.executeScript("window.scrollBy(0,300)", PageScroll);
    Thread.sleep(3000);   */
    WebElement EditFunds = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div/div[2]/div/div[15]/table/tbody/tr/td[8]/div/button[2]/span"));
    JavascriptExecutor Edit_Funds = (JavascriptExecutor)driver;
    Edit_Funds.executeScript("arguments[0].click();", EditFunds);
    Thread.sleep(3000); 
    WebElement Percent = driver.findElement(By.name("percent"));
    Thread.sleep(3000); 
    Percent.clear();
    Thread.sleep(3000); 
    Percent.sendKeys("90");
    Thread.sleep(3000); 
    WebElement FundsUpdate = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div/div[2]/div/div[14]/div/button"));
    JavascriptExecutor Funds_Update = (JavascriptExecutor)driver;
    Funds_Update.executeScript("arguments[0].click();", FundsUpdate);
    Thread.sleep(3000);  
    WebElement FundsUpdateClosepopup = driver.findElement(By.id("closePopupBtn"));
    JavascriptExecutor Fundsupdatepopup = (JavascriptExecutor)driver;
    Fundsupdatepopup.executeScript("arguments[0].click();", FundsUpdateClosepopup);
    Thread.sleep(3000); 
    //FILTER
    WebElement ApplyFilter1 = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div[1]/div[2]/select"));
    JavascriptExecutor Filter1 = (JavascriptExecutor)driver;
    Filter1.executeScript("arguments[0].click();", ApplyFilter1);
    Thread.sleep(2000); 
    ApplyFilter1.sendKeys("Servicing Fee") ;
    Thread.sleep(3000);
    //EDIT FEE
    WebElement EditFee1 = driver.findElement(By.id("edit-0"));
    JavascriptExecutor Edit_Fee1 = (JavascriptExecutor)driver;
    Edit_Fee1.executeScript("arguments[0].click();", EditFee1);
    Thread.sleep(3000); 
    WebElement Disburse = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div/div[2]/div/div[15]/table/tbody/tr/td[8]/div/button[1]/span"));
    JavascriptExecutor Disburses = (JavascriptExecutor)driver;
    Disburses.executeScript("arguments[0].click();", Disburse);
    Thread.sleep(1000); 
    WebElement DisburseNo = driver.findElement(By.id("delete-disburse-no"));
    JavascriptExecutor Disburse_No = (JavascriptExecutor)driver;
    Disburse_No.executeScript("arguments[0].click();", DisburseNo);
    Thread.sleep(1000); 
    WebElement Disburse1 = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div/div[2]/div/div[15]/table/tbody/tr/td[8]/div/button[1]/span"));
    JavascriptExecutor Disburses1 = (JavascriptExecutor)driver;
    Disburses1.executeScript("arguments[0].click();", Disburse1);
    Thread.sleep(1000);
    WebElement DisburseYes = driver.findElement(By.id("delete-disburse-yes"));
    JavascriptExecutor Disburse_Yes = (JavascriptExecutor)driver;
    Disburse_Yes.executeScript("arguments[0].click();", DisburseYes);
    Thread.sleep(3000); 
    WebElement DisburseClosepopup = driver.findElement(By.id("closePopupBtn"));
    JavascriptExecutor Disbursepopup = (JavascriptExecutor)driver;
    Disbursepopup.executeScript("arguments[0].click();", DisburseClosepopup);
    Thread.sleep(3000); 
    //Delete Funds 
    WebElement DeleteFunds = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div/div[2]/div/div[15]/table/tbody/tr/td[8]/div/button[2]/span"));
    JavascriptExecutor Delete_Funds = (JavascriptExecutor)driver;
    Delete_Funds.executeScript("arguments[0].click();", DeleteFunds);
    Thread.sleep(1000);
    WebElement DeleteFundsNo = driver.findElement(By.id("delete-fund-no"));
    JavascriptExecutor DeleteFunds_No = (JavascriptExecutor)driver;
    DeleteFunds_No.executeScript("arguments[0].click();", DeleteFundsNo);
    Thread.sleep(1000); 
    WebElement DeleteFunds1 = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div/div[2]/div/div[15]/table/tbody/tr/td[8]/div/button[2]/span"));
    JavascriptExecutor Delete_Funds1 = (JavascriptExecutor)driver;
    Delete_Funds1.executeScript("arguments[0].click();", DeleteFunds1);
    Thread.sleep(1000);
    WebElement DeleteFundsYes = driver.findElement(By.id("delete-fund-yes"));
    JavascriptExecutor DeleteFunds_Yes = (JavascriptExecutor)driver;
    DeleteFunds_Yes.executeScript("arguments[0].click();", DeleteFundsYes);
    Thread.sleep(3000);   
    WebElement DeleteFundsClosepopup = driver.findElement(By.id("closePopupBtn"));
    JavascriptExecutor DeleteFundspopup = (JavascriptExecutor)driver;
    DeleteFundspopup.executeScript("arguments[0].click();", DeleteFundsClosepopup);
    Thread.sleep(1000); 
    WebElement BackButton1 = driver.findElement(By.className("back_btn"));
    JavascriptExecutor Button1= (JavascriptExecutor)driver;
    Button1.executeScript("arguments[0].click();", BackButton1);
    Thread.sleep(1000);
    //FILTERS
    WebElement ApplyFilters1 = driver.findElement(By.xpath("//*[@id=\"ENTITY\"]/div[1]/div[2]/select"));
    JavascriptExecutor Filters1 = (JavascriptExecutor)driver;
    Filters1.executeScript("arguments[0].click();", ApplyFilters1);
    Thread.sleep(2000); 
    ApplyFilters1.sendKeys("Servicing Fee") ;
    //DELETE FEES 
    
    WebElement DeleteFee = driver.findElement(By.id("delete-0"));
    JavascriptExecutor Delete_Fee = (JavascriptExecutor)driver;
    Delete_Fee.executeScript("arguments[0].click();", DeleteFee);
    Thread.sleep(1000); 
    WebElement DeleteNo = driver.findElement(By.id("delete-confirm-no"));
    JavascriptExecutor Delete_No = (JavascriptExecutor)driver;
    DeleteFunds_No.executeScript("arguments[0].click();", DeleteNo);
    Thread.sleep(1000); 
    WebElement DeleteFee1 = driver.findElement(By.id("delete-0"));
    JavascriptExecutor Delete_Fee1 = (JavascriptExecutor)driver;
    Delete_Fee1.executeScript("arguments[0].click();", DeleteFee1);
    Thread.sleep(1000);
    WebElement DeleteYes = driver.findElement(By.id("delete-confirm-yes"));
    JavascriptExecutor Delete_Yes = (JavascriptExecutor)driver;
    Delete_Yes.executeScript("arguments[0].click();", DeleteYes);
    Thread.sleep(3000);  
    WebElement DeleteClosepopup = driver.findElement(By.id("closePopupBtn"));
    JavascriptExecutor Deletepopup = (JavascriptExecutor)driver;
    Deletepopup.executeScript("arguments[0].click();", DeleteClosepopup);
 
	}

}
