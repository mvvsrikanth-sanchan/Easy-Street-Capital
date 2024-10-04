package PipeLine.Search;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_20_AdvanceSearch {
  @Test
  public void AdvnceSearch () throws InterruptedException {
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
	   Thread.sleep(3000);
	    // Clicking Advance Search
	    WebElement AdvaceSearch = driver.findElement(By.id("advancedSearch"));
	    JavascriptExecutor Searchs = (JavascriptExecutor)driver;
	    Searchs.executeScript("arguments[0].click();", AdvaceSearch);
	    
	    Thread.sleep(3000);
	  // Close 
	    WebElement Close = driver.findElement(By.id("searchOptionsClose"));
	    JavascriptExecutor close = (JavascriptExecutor)driver;
	    close.executeScript("arguments[0].click();", Close);
	    Thread.sleep(3000);
	    WebElement AdvaceSearchs = driver.findElement(By.id("advancedSearch"));
	    JavascriptExecutor Searches = (JavascriptExecutor)driver;
	    Searches.executeScript("arguments[0].click();", AdvaceSearchs);
	   
	    Thread.sleep(2000);
	    //GENERAL INFO
	    driver.findElement(By.id("generalInfo-borrowerfirstname")).sendKeys("srikanth");
	    driver.findElement(By.id("generalInfo-borrowerlastname")).sendKeys("mvv");
	    driver.findElement(By.id("generalInfo-borroweraddress")).sendKeys("california");
	    driver.findElement(By.id("generalInfo-entityname")).sendKeys("lukas");
	    driver.findElement(By.id("generalInfo-propertyaddress")).sendKeys("1-201/1 california ");
	    WebElement propertyType = driver.findElement(By.id("generalInfo-propertytype"));
	    JavascriptExecutor propertytype = (JavascriptExecutor)driver;
	    propertytype.executeScript("arguments[0].click();", propertyType);
	    propertyType.sendKeys("Triplex");
	    Thread.sleep(3000);
	    //DATE AND RANGE  
	    WebElement createdStartDate = driver.findElement(By.id("dateRange-created-start"));
	   JavascriptExecutor created_StartDate = (JavascriptExecutor)driver;
	    created_StartDate.executeScript("arguments[0].click();", createdStartDate);
	    WebElement StartDate =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[4]/div[2]"));
	    JavascriptExecutor startDate = (JavascriptExecutor)driver;
	    startDate.executeScript("arguments[0].click();", StartDate);
	    Thread.sleep(3000);
	    WebElement createdEndDate = driver.findElement(By.id("dateRange-created-end"));
	    JavascriptExecutor created_EndDate = (JavascriptExecutor)driver;
	    created_EndDate.executeScript("arguments[0].click();", createdEndDate);
	    createdEndDate.sendKeys("11/10/2025");
	    WebElement EndDate =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[2]"));
	    JavascriptExecutor endDate = (JavascriptExecutor)driver;
	    endDate.executeScript("arguments[0].click();", EndDate);
	    Thread.sleep(3000);
	   
	    WebElement requestedClosing_Start = driver.findElement(By.id("dateRange-requestedclosing-start"));
	    JavascriptExecutor requested_StartDate = (JavascriptExecutor)driver;
	    requested_StartDate.executeScript("arguments[0].click();", requestedClosing_Start);
	    requestedClosing_Start.sendKeys("10/03/2024");
	    WebElement StartDate1 =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[5]"));
	    JavascriptExecutor startDate1 = (JavascriptExecutor)driver;
	    startDate1.executeScript("arguments[0].click();", StartDate1);
	    Thread.sleep(3000);
	    WebElement requestedClosing_End = driver.findElement(By.id("dateRange-requestedclosing-end"));
	    JavascriptExecutor requested_EndDate = (JavascriptExecutor)driver;
	    requested_EndDate .executeScript("arguments[0].click();", requestedClosing_End);
	    requestedClosing_End.sendKeys("10/25/2024");
	    WebElement Close_Date =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[4]/div[6]"));
	    JavascriptExecutor close_Date = (JavascriptExecutor)driver;
	    close_Date.executeScript("arguments[0].click();", Close_Date);
	    Thread.sleep(3000);
	    WebElement scheduledclosing_start = driver.findElement(By.id("dateRange-scheduledclosing-start"));
	    JavascriptExecutor scheduledclosing_startDate = (JavascriptExecutor)driver;
	    scheduledclosing_startDate.executeScript("arguments[0].click();", scheduledclosing_start );
	    scheduledclosing_start.sendKeys("11/06/2024");
	    WebElement scheduledDate =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div[4]"));
	    JavascriptExecutor scheduled_Date = (JavascriptExecutor)driver;
	    scheduled_Date.executeScript("arguments[0].click();", scheduledDate);
	    Thread.sleep(3000);
	    WebElement scheduledclosing_end = driver.findElement(By.id("dateRange-scheduledclosing-end"));
	    JavascriptExecutor scheduledclosing_endDate = (JavascriptExecutor)driver;
	    scheduledclosing_endDate .executeScript("arguments[0].click();", scheduledclosing_end);
	    scheduledclosing_end.sendKeys("11/22/2024");
	    WebElement scheduledEndDate =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[4]/div[6]"));
	    JavascriptExecutor scheduled_endDate = (JavascriptExecutor)driver;
	    scheduled_endDate.executeScript("arguments[0].click();", scheduledEndDate);
	    Thread.sleep(3000);
	    WebElement actualclosed_start = driver.findElement(By.id("dateRange-actualclosed-start"));
	    JavascriptExecutor actualclosed_startDate = (JavascriptExecutor)driver;
	    actualclosed_startDate.executeScript("arguments[0].click();", actualclosed_start );
	    actualclosed_start.sendKeys("11/23/2024");
	    WebElement actualclosedstart =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[4]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[4]/div[7]"));
	    JavascriptExecutor actualclosed_startdate = (JavascriptExecutor)driver;
	    actualclosed_startdate.executeScript("arguments[0].click();", actualclosedstart);
	    Thread.sleep(3000);
	    WebElement actualclosed_end = driver.findElement(By.id("dateRange-actualclosed-end"));
	    JavascriptExecutor actualclosed_endDate = (JavascriptExecutor)driver;
	    actualclosed_endDate .executeScript("arguments[0].click();", actualclosed_end);
	    actualclosed_end.sendKeys("11/25/2024");
	    WebElement actualclosedend =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[4]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[5]/div[2]"));
	    JavascriptExecutor actualclosed_enddate = (JavascriptExecutor)driver;
	    actualclosed_enddate.executeScript("arguments[0].click();", actualclosedend);
	    Thread.sleep(3000);
	    WebElement application_start = driver.findElement(By.id("dateRange-application-start"));
	    JavascriptExecutor application_startDate = (JavascriptExecutor)driver;
	    application_startDate.executeScript("arguments[0].click();", application_start );
	    application_start.sendKeys("11/28/2024");
	    WebElement applicationstart =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[5]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[5]/div[5]"));
	    JavascriptExecutor applicationstartDate = (JavascriptExecutor)driver;
	    applicationstartDate.executeScript("arguments[0].click();", applicationstart);
	    Thread.sleep(3000);
	    WebElement application_end = driver.findElement(By.id("dateRange-application-end"));
	    JavascriptExecutor application_endDate = (JavascriptExecutor)driver;
	    application_endDate .executeScript("arguments[0].click();", application_end);
	    application_end.sendKeys("11/30/2024");
	    WebElement applicationend =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[5]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[5]/div[7]"));
	    JavascriptExecutor applicationendDate = (JavascriptExecutor)driver;
	    applicationendDate.executeScript("arguments[0].click();", applicationend);
	    Thread.sleep(3000);
	    WebElement servicingmaturity_start = driver.findElement(By.id("dateRange-servicingmaturity-start"));
	    JavascriptExecutor servicingmaturity_startDate = (JavascriptExecutor)driver;
	    servicingmaturity_startDate.executeScript("arguments[0].click();", servicingmaturity_start );
	    servicingmaturity_start.sendKeys("12/05/2024");
	    WebElement servicingmaturitystart =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[6]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div[5]"));
	    JavascriptExecutor servicingmaturitystartDate = (JavascriptExecutor)driver;
	    servicingmaturitystartDate.executeScript("arguments[0].click();", servicingmaturitystart);
	    Thread.sleep(3000);
	    WebElement servicingmaturity_end = driver.findElement(By.id("dateRange-servicingmaturity-end"));
	    JavascriptExecutor servicingmaturity_endDate= (JavascriptExecutor)driver;
	    servicingmaturity_endDate .executeScript("arguments[0].click();", servicingmaturity_end);
	    servicingmaturity_end.sendKeys("12/10/2024");
	    WebElement servicingmaturityend =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[6]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]"));
	    JavascriptExecutor servicingmaturityendDate = (JavascriptExecutor)driver;
	    servicingmaturityendDate.executeScript("arguments[0].click();", servicingmaturityend);
	    Thread.sleep(3000);
	    WebElement LTV_low = driver.findElement(By.name("minltv"));
	    JavascriptExecutor LTVlow = (JavascriptExecutor)driver;
	    LTVlow.executeScript("arguments[0].click();", LTV_low);
	    LTV_low.sendKeys("10");
	    Thread.sleep(3000);
	    WebElement LTV_High = driver.findElement(By.name("maxltv"));
	    JavascriptExecutor LTVHigh = (JavascriptExecutor)driver;
	    LTVHigh.executeScript("arguments[0].click();", LTV_High);
	    LTV_High.sendKeys("15");
	    Thread.sleep(3000);
	    WebElement loanAmountFrom = driver.findElement(By.name("loanamountfrom"));
	    JavascriptExecutor loanAmount_From = (JavascriptExecutor)driver;
	    loanAmount_From.executeScript("arguments[0].click();", loanAmountFrom);
	    loanAmountFrom.sendKeys("470000");
	    Thread.sleep(3000);
	    WebElement loanAmountTo = driver.findElement(By.name("loanamountto"));
	    JavascriptExecutor loanAmount_To = (JavascriptExecutor)driver;
	    loanAmount_To.executeScript("arguments[0].click();", loanAmountTo);
	    loanAmountTo.sendKeys("750000");
	    Thread.sleep(3000);
	    //Add filters
	    WebElement stage = driver.findElement(By.id("stage"));
	    stage.sendKeys("Underwriting");
	    Thread.sleep(3000);
	    WebElement phase = driver.findElement(By.id("phase"));
	    phase.sendKeys("Lead");
	    Thread.sleep(3000);
	    WebElement historyDays = driver.findElement(By.id("historyDays"));
	    historyDays.sendKeys("70");
	    Thread.sleep(3000);
	    WebElement latePaymentStatus = driver.findElement(By.id("latePaymentStatus"));
	    latePaymentStatus.sendKeys("60");
	    Thread.sleep(3000);
	    WebElement drawStatus = driver.findElement(By.id("drawStatus"));
	    drawStatus.sendKeys("Inspection Scheduled");
	    Thread.sleep(3000);
	  /*  WebDriverWait  category = new WebDriverWait(driver, Duration.ofSeconds(30));
	    category.until(ExpectedConditions.elementToBeClickable(By.id("filterscategory"))).click();
	    Thread.sleep(3000); 
	   
	    WebElement Categorydropdown = driver.findElement(By.id("filterscategory"));
	    JavascriptExecutor Category = (JavascriptExecutor)driver;
	    Category.executeScript("arguments[0].click();", Categorydropdown);
	    Thread.sleep(3000);
	    Categorydropdown.sendKeys("Keys.ARROW_DOWN");
	 // Categorydropdown.sendKeys(Keys.ARROW_DOWN);
	 //   Categorydropdown.sendKeys(Keys.ENTER);
	  //  Thread.sleep(3000); */
	    WebElement broker = driver.findElement(By.id("brokerFilters"));
	    broker.sendKeys("Sandhya S");
	    Thread.sleep(3000);
	    WebDriverWait User = new WebDriverWait(driver, Duration.ofSeconds(30));
	    User.until(ExpectedConditions.elementToBeClickable(By.id("filterUser"))).click();
	    WebElement user = driver.findElement(By.id("filterUser"));
	   // JavascriptExecutor userList =(JavascriptExecutor)driver;
	 //   userList.executeScript("arguments[0].click();", user);
	    user.sendKeys(Keys.ARROW_DOWN);
	    user.sendKeys(Keys.ARROW_DOWN);
	    user.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    // Reset resetAdvancedSearchBtn   searchOptionsClose
	    WebElement reset = driver.findElement(By.id("resetAdvancedSearchBtn"));
	    JavascriptExecutor resetAll =(JavascriptExecutor)driver;
	    resetAll.executeScript("arguments[0].click(),", reset);
	    Thread.sleep(3000);
	    WebElement resetClose = driver.findElement(By.id("searchOptionsClose"));
	    JavascriptExecutor ResetClose =(JavascriptExecutor)driver;
	    ResetClose.executeScript("arguments[0].click(),", resetClose);
	    Thread.sleep(3000);
	    WebElement reset1 = driver.findElement(By.id("resetAdvancedSearchBtn"));
	    JavascriptExecutor resetAll1 =(JavascriptExecutor)driver;
	    resetAll1.executeScript("arguments[0].click(),", reset1);
	    Thread.sleep(3000);
	    WebElement resetYes = driver.findElement(By.id("resetAdvancedSearchBtn"));
	    JavascriptExecutor reset_Yes =(JavascriptExecutor)driver;
	    reset_Yes.executeScript("arguments[0].click(),", resetYes);
	    Thread.sleep(3000);
	    WebElement closePopup = driver.findElement(By.id("closePopupBtn"));
	    JavascriptExecutor close_Popup =(JavascriptExecutor)driver;
	    close_Popup.executeScript("arguments[0].click(),", closePopup);
	    System.out.println("Entered Data Reset successfully");
	    Thread.sleep(5000);
	  //GENERAL INFO
	    driver.findElement(By.id("generalInfo-borrowerfirstname")).sendKeys("srikanth");
	    driver.findElement(By.id("generalInfo-borrowerlastname")).sendKeys("mvv");
	    driver.findElement(By.id("generalInfo-borroweraddress")).sendKeys("california");
	    driver.findElement(By.id("generalInfo-entityname")).sendKeys("lukas");
	    driver.findElement(By.id("generalInfo-propertyaddress")).sendKeys("1-201/1 california ");
	    Thread.sleep(3000);
	    Thread.sleep(5000);
	  //DATE AND RANGE  
	  propertyType.sendKeys("09/23/2024");
	  Thread.sleep(3000);
	  createdEndDate.sendKeys("11/10/2025");
	  Thread.sleep(3000);
	  requestedClosing_Start.sendKeys("10/03/2024");
	  Thread.sleep(3000);
	  requestedClosing_End.sendKeys("10/25/2024");
	  Thread.sleep(3000);
	  scheduledclosing_start.sendKeys("11/06/2024");
	  	    Thread.sleep(3000);
	  scheduledclosing_end.sendKeys("11/22/2024");
	  	    Thread.sleep(3000);
	  actualclosed_start.sendKeys("11/23/2024");
	  	    Thread.sleep(3000);
	  actualclosed_end.sendKeys("11/25/2024");
	  	    Thread.sleep(3000);
	  application_start.sendKeys("11/28/2024");
	  	    Thread.sleep(3000);
	  application_end.sendKeys("11/30/2024");
	  	    Thread.sleep(3000);
	  servicingmaturity_start.sendKeys("12/05/2024");
	  	    Thread.sleep(3000);
	  servicingmaturity_end.sendKeys("12/10/2024");
	  	    Thread.sleep(3000);
	  LTV_low.sendKeys("10");
	  	    Thread.sleep(3000);
	  LTV_High.sendKeys("15");
	  	    Thread.sleep(3000);
	  loanAmountFrom.sendKeys("470000");
	  	    Thread.sleep(3000);
	  loanAmountTo.sendKeys("750000");
	  	    Thread.sleep(3000);
	  //Add filters
	   stage.sendKeys("Underwriting");
	  	    Thread.sleep(3000);
	  phase.sendKeys("Lead");
	  	    Thread.sleep(3000);
	  historyDays.sendKeys("70");
	  	    Thread.sleep(3000);
	  latePaymentStatus.sendKeys("60");
	  	    Thread.sleep(3000);
	  drawStatus.sendKeys("Scheduled");
	  	    Thread.sleep(3000);
	  WebElement categories = driver.findElement(By.id("filterscategory"));
	  	    JavascriptExecutor categorySelections =(JavascriptExecutor)driver;
	  	    categorySelections.executeScript("arguments[0].click(),", categories);
	  	    categories.sendKeys(Keys.ARROW_DOWN);
	  	    categories.sendKeys(Keys.ARROW_DOWN);
	  	    categories.sendKeys(Keys.ENTER);
	  	    Thread.sleep(3000);
	  broker.sendKeys("Sandhya S");
	  	    Thread.sleep(3000);
	  WebElement users = driver.findElement(By.id("filterUser"));
	  	    JavascriptExecutor usersList =(JavascriptExecutor)driver;
	  	    usersList.executeScript("arguments[0].click(),", users);
	  	    users.sendKeys(Keys.ARROW_DOWN);
	  	    users.sendKeys(Keys.ARROW_DOWN);
	  	    users.sendKeys(Keys.ENTER);
	  	    Thread.sleep(3000);

	    
	    // Search 
	    WebElement Search = driver.findElement(By.id("advancedSearchBtn"));
	    JavascriptExecutor SearchDetails =(JavascriptExecutor)driver;
	    SearchDetails.executeScript("arguments[0].click(),", Search);
	    
	    // Saved Search
	    WebElement SavedSearch = driver.findElement(By.id("saveAdvancedSearch"));
	    JavascriptExecutor savesearch = (JavascriptExecutor)driver;
	    savesearch.executeScript("arguments[0].click();", SavedSearch);
	    SavedSearch.sendKeys("New Advance search");
	    Thread.sleep(3000);
	    //Saveto My saved search 
	    WebElement SaveToMysavedSearch = driver.findElement(By.id("saveMySavedSearches"));
	    JavascriptExecutor savedsearch = (JavascriptExecutor)driver;
	    savedsearch.executeScript("arguments[0].click();", SaveToMysavedSearch);
	    
	    Thread.sleep(3000);
  }
}
