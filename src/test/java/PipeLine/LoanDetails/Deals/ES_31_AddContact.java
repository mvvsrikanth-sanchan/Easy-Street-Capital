package PipeLine.LoanDetails.Deals;

import java.time.Duration;

import org.eclipse.aether.util.graph.transformer.JavaScopeDeriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.codeborne.selenide.impl.JavaScript;
import com.codeborne.selenide.impl.WebdriverPhotographer;
import com.fasterxml.jackson.annotation.JacksonAnnotationValue;

public class ES_31_AddContact {
  @Test
  public void AddContact() throws InterruptedException {
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
	     // SELECTING CONTACTS
	     WebElement DealContact= driver.findElement(By.id("deal-Contacts"));
	     JavascriptExecutor ContactMenu = (JavascriptExecutor)driver;
	     ContactMenu.executeScript("arguments[0].click();", DealContact);
	     Thread.sleep(3000);
	  /*   WebElement Close =  driver.findElement(By.className("close_button"));
	     JavascriptExecutor Button_Close = (JavascriptExecutor)driver;
	     Button_Close.executeScript("arguments[0].click();", Close);
	     driver.navigate().refresh();
	     
	     WebElement ChooseAnother =  driver.findElement(By.className("//*[@id=\"messagepopup\"]/div/div/div/div[2]/button"));
	     JavascriptExecutor Choose_Another = (JavascriptExecutor)driver;
	     Choose_Another.executeScript("arguments[0].click();", ChooseAnother);
	     Thread.sleep(3000);
	     driver.navigate().refresh();
	     WebElement AssignAsActiveBroker =  driver.findElement(By.className("//*[@id=\"messagepopup\"]/div/div/div/div[2]/div/div/button"));
	     JavascriptExecutor ActiveBroker = (JavascriptExecutor)driver;
	     ActiveBroker.executeScript("arguments[0].click();", AssignAsActiveBroker);
	     Thread.sleep(3000);
	     */
	    
	    WebElement AddContact = driver.findElement(By.id("addNewContact"));
	     JavascriptExecutor Add= (JavascriptExecutor)driver;
	     Add.executeScript("arguments[0].click();", AddContact);
	     Thread.sleep(3000);
	     WebElement SaveValidation = driver.findElement(By.id("saveContact"));
	     JavascriptExecutor Save_Validation =(JavascriptExecutor)driver;
	     Save_Validation.executeScript("arguments[0].click();", SaveValidation);
	     Thread.sleep(2000);
	     WebElement BackButton= driver.findElement(By.id("navigateContactBack"));
	     JavascriptExecutor Back_Button=(JavascriptExecutor)driver;
	     Back_Button.executeScript("arguments[0].click();", BackButton);
	     Thread.sleep(3000);
	     WebElement Add_Contact = driver.findElement(By.id("addNewContact"));
	     JavascriptExecutor Add1= (JavascriptExecutor)driver;
	     Add1.executeScript("arguments[0].click();", Add_Contact);
	     Thread.sleep(3000);
	     driver.findElement(By.id("contactFirstname")).sendKeys("Marc");
	     driver.findElement(By.id("contactLastname")).sendKeys("Fins");
	     WebElement Email=driver.findElement(By.id("contactEmail"));
	     Email.sendKeys("Marc");
   	     driver.findElement(By.id("contactMobile")).sendKeys("(834) 131-7062");
	     Thread.sleep(3000);
	     WebElement Save_Validation1 = driver.findElement(By.id("saveContact"));
	     JavascriptExecutor Save_Validations =(JavascriptExecutor)driver;
	     Save_Validations.executeScript("arguments[0].click();", Save_Validation1);
	     Thread.sleep(3000);
	  
	     Email.clear();
	     Thread.sleep(5000);
	  
	     Email.sendKeys("9090907657");
	     
	     Thread.sleep(3000);
	     WebElement Save_Validation2 = driver.findElement(By.id("saveContact"));
	     JavascriptExecutor Save_Validations1 =(JavascriptExecutor)driver;
	     Save_Validations1.executeScript("arguments[0].click();", Save_Validation2);
	     Thread.sleep(3000);
	 
	     Thread.sleep(3000);
	     JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].value = '';", Email);
	   
         Thread.sleep(3000);
	     Email.sendKeys("Marc670fins@yopmail.com");
	     
	     Thread.sleep(3000);
	     WebElement SaveContact = driver.findElement(By.id("saveContact"));
	     JavascriptExecutor Save =(JavascriptExecutor)driver;
	     Save.executeScript("arguments[0].click();", SaveContact);
	     System.out.println("Contact Saved Successfully");
	     Thread.sleep(5000);
	     driver.navigate().refresh();
	    
	     // EDIT CONTACT 
	     // SORT  ADDED CONTACT
	      WebElement SelectContacts = driver.findElement(By.id("selectContacts"));
	      JavascriptExecutor Select_Contacts =(JavascriptExecutor)driver;
	      Select_Contacts.executeScript("arguments[0].click();", SelectContacts);
	      SelectContacts.sendKeys("Broker");
	      Thread.sleep(3000);
	      JavascriptExecutor Search_ScrollDown = (JavascriptExecutor)driver;
	      Search_ScrollDown.executeScript("window.scrollBy(0,300)", "");
	      Thread.sleep(3000);
	      JavascriptExecutor Search_ScrollUp = (JavascriptExecutor)driver;
	      Search_ScrollUp.executeScript("window.scrollBy(0,-300)", "");
	      Thread.sleep(3000);
	      WebElement SelectContacts1 = driver.findElement(By.id("selectContacts"));
	      JavascriptExecutor Select_Contacts1 =(JavascriptExecutor)driver;
	      Select_Contacts1.executeScript("arguments[0].click();", SelectContacts1);
	      SelectContacts1.sendKeys("Select");
	      Thread.sleep(3000);
	     WebElement PrefillsSearchText = driver.findElement(By.id("prefillsSearchText"));
	     JavascriptExecutor SearchText = (JavascriptExecutor)driver;
	     SearchText.executeScript("arguments[0].click();", PrefillsSearchText);
	     Thread.sleep(3000);
	     PrefillsSearchText.sendKeys("Marc");
	     WebElement PrefillsSearch= driver.findElement(By.id("prefillsSearch"));
	     JavascriptExecutor Search =(JavascriptExecutor)driver;
	     Search.executeScript("arguments[0].click();", PrefillsSearch);
	     Thread.sleep(5000);
	     // Clear Search 
	     WebElement ClearSearch =driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[3]/button"));
	     JavascriptExecutor Clear = (JavascriptExecutor)driver;
	     Clear.executeScript("arguments[0].click();", ClearSearch);
	     
	    // Contact search base on name 
	     Thread.sleep(5000);
	     WebElement Prefills_SearchText = driver.findElement(By.id("prefillsSearchText"));
	     JavascriptExecutor Search_Text = (JavascriptExecutor)driver;
	     Search_Text.executeScript("arguments[0].click();", Prefills_SearchText);
	     Thread.sleep(3000);
	     PrefillsSearchText.sendKeys("marc");
	     Thread.sleep(3000);
	     WebElement Prefills_Search= driver.findElement(By.id("prefillsSearch"));
	     JavascriptExecutor Search1 =(JavascriptExecutor)driver;
	     Search1.executeScript("arguments[0].click();", Prefills_Search);
	     Thread.sleep(5000);
	     // Edit Contact 
	     WebElement EditContact = driver.findElement(By.id("editContacts-0"));
	     JavascriptExecutor Edit = (JavascriptExecutor)driver;
	     Edit.executeScript("arguments[0].click();", EditContact);
	     Thread.sleep(3000);
	     driver.findElement(By.id("contactCompany")).sendKeys("Marc's");
	     WebElement ContactDropdown = driver.findElement(By.id("contactContact_type"));
	     JavascriptExecutor Dropdown = (JavascriptExecutor)driver;
	     Thread.sleep(3000);
	     Dropdown.executeScript("arguments[0].click();", ContactDropdown);
	     ContactDropdown.sendKeys("Broker");
	     Thread.sleep(3000);
	     driver.findElement(By.id("contactCompanynmlsid")).sendKeys("65TYR34O0");
	     driver.findElement(By.id("contactCompanylicense")).sendKeys("5600010UY67");
	     driver.findElement(By.id("contactAddress")).sendKeys("California");
	     driver.findElement(By.id("contactWorkphone")).sendKeys("(898) 900-9000");
	     driver.findElement(By.id("contactFaxnumber")).sendKeys("(834) 130-7062");
	     driver.findElement(By.id("contactLicensenumber")).sendKeys("7079779YURTYR");
	     driver.findElement(By.id("contactNmlsid")).sendKeys("8080yyiyiy89");
	     driver.findElement(By.id("contactContacttitle")).sendKeys("Agent");
	     Thread.sleep(3000);
	     JavascriptExecutor PageScroll = (JavascriptExecutor)driver;
	     PageScroll.executeScript("window.scrollBy(0,350)", "");
	     WebElement contactApprovedOn = driver.findElement(By.id("contactApproved"));
	     JavascriptExecutor Approval_ToggleOn = (JavascriptExecutor)driver;
	     Approval_ToggleOn.executeScript("arguments[0].click();", contactApprovedOn);
	     Thread.sleep(3000);
	     WebElement contactApprovedOff = driver.findElement(By.id("contactApproved"));
	     JavascriptExecutor Approval_ToggleOff = (JavascriptExecutor)driver;
	     Approval_ToggleOff.executeScript("arguments[0].click();", contactApprovedOff);
	     Thread.sleep(3000);
	     WebElement contactBrokerAssignOn = driver.findElement(By.id("contactBrokerAssign"));
	     JavascriptExecutor BrokerAssign_ToggleOn = (JavascriptExecutor)driver;
	     BrokerAssign_ToggleOn.executeScript("arguments[0].click();", contactBrokerAssignOn);
	     Thread.sleep(3000);
	     WebElement contactBrokerAssign = driver.findElement(By.id("contactBrokerAssign"));
	     JavascriptExecutor BrokerAssign_ToggleOff = (JavascriptExecutor)driver;
	     BrokerAssign_ToggleOff.executeScript("arguments[0].click();", contactBrokerAssign);
	     Thread.sleep(5000);
	     WebElement UpdateContact = driver.findElement(By.id("saveContact"));
	     JavascriptExecutor Update_Contact = (JavascriptExecutor)driver;
	     Update_Contact.executeScript("arguments[0].click();", UpdateContact);
	     Thread.sleep(5000);
	    
	   //  driver.navigate().refresh();
	     System.out.println("Contact Updated Successfully");
	   
	     /* WebElement UpdateClosePopup = driver.findElement(By.id("closePopupBtn"));
	     JavascriptExecutor UpdatePopup = (JavascriptExecutor)driver;
	     UpdatePopup.executeScript("arguments[0].click();", UpdateClosePopup);
	     Thread.sleep(3000);*/
	    WebElement BackButton1= driver.findElement(By.id("navigateContactBack"));
	     JavascriptExecutor Back_Button1=(JavascriptExecutor)driver;
	     Back_Button1.executeScript("arguments[0].click();", BackButton1);
	     Thread.sleep(5000);
	 //    Thread.sleep(5000);
	     /*   WebElement Prefills_SearchText1 = driver.findElement(By.id("prefillsSearchText"));
	     JavascriptExecutor Search_Text1 = (JavascriptExecutor)driver;
	     Search_Text1.executeScript("arguments[0].click();", Prefills_SearchText1);
	     Thread.sleep(3000);
	     PrefillsSearchText.sendKeys("Whales");
	     Thread.sleep(3000);
	     WebElement Prefills_Search1= driver.findElement(By.id("prefillsSearch"));
	     JavascriptExecutor Search2 =(JavascriptExecutor)driver;
	     Search2.executeScript("arguments[0].click();", Prefills_Search1);
	    //ADD CONTACT TO BROKER
	     WebElement AddContacts = driver.findElement(By.id("addContacts-0"));
	     JavascriptExecutor Add_Contacts =(JavascriptExecutor)driver;
	     Add_Contacts.executeScript("arguments[0].click();", AddContacts);
	     Thread.sleep(3000);
	    WebElement DeletestatusNo = driver.findElement(By.id("delete-status-no"));
	    JavascriptExecutor  Delete_statusNo =(JavascriptExecutor)driver;
	    Delete_statusNo.executeScript("arguments[0].click();", DeletestatusNo);
	     Thread.sleep(3000);
	     WebElement AddContacts1 = driver.findElement(By.id("addContacts-0"));
	     JavascriptExecutor Add_Contacts1 =(JavascriptExecutor)driver;
	     Add_Contacts1.executeScript("arguments[0].click();", AddContacts1);
	     Thread.sleep(3000);
	     WebElement DeletestatusYes = driver.findElement(By.id("delete-status-yes"));
		    JavascriptExecutor  Delete_statusYes =(JavascriptExecutor)driver;
		    Delete_statusYes.executeScript("arguments[0].click();", DeletestatusYes);
	    
		    Thread.sleep(3000);
		    WebElement ContactAssignedClosePopup = driver.findElement(By.id("closePopupBtn"));
		     JavascriptExecutor ContactAssigned_ClosePopup = (JavascriptExecutor)driver;
		     ContactAssigned_ClosePopup.executeScript("arguments[0].click();", ContactAssignedClosePopup);    
	   //  driver.navigate().refresh();
	     Thread.sleep(3000);
	  //   driver.quit();
	     */
	     //DELETE CONTACT
	   //AGAIN SEARCH BASED ON USER NAME 
	   /*  WebElement Prefills_SearchText2 = driver.findElement(By.id("prefillsSearchText"));
	     JavascriptExecutor Search_Text2 = (JavascriptExecutor)driver;
	     Search_Text2.executeScript("arguments[0].click();", Prefills_SearchText2);
	     Thread.sleep(3000);
	     PrefillsSearchText.sendKeys("Marc");
	     Thread.sleep(3000);
	     WebElement Prefills_Search2= driver.findElement(By.id("prefillsSearch"));
	     JavascriptExecutor Search_2 =(JavascriptExecutor)driver;
	     Search_2.executeScript("arguments[0].click();", Prefills_Search2);
	     Thread.sleep(5000);
	   */ 
	     WebElement DeleteContacts = driver.findElement(By.id("deleteContacts-0"));
	     JavascriptExecutor Delete_Contacts =(JavascriptExecutor)driver;
	     Delete_Contacts.executeScript("arguments[0].click();", DeleteContacts);
	     Thread.sleep(3000);
	  /*   WebElement DeleteClosePopup = driver.findElement(By.id("closePopupBtn"));
	     JavascriptExecutor Delete_ClosePopup = (JavascriptExecutor)driver;
	     Delete_ClosePopup.executeScript("arguments[0].click();", DeleteClosePopup);
	     Thread.sleep(3000);
	     // Edit Contact 
	     
		  */  WebElement DeleteContactNo = driver.findElement(By.xpath("delete-contact-no"));
		    JavascriptExecutor  Delete_ContactNo =(JavascriptExecutor)driver;
		    Delete_ContactNo.executeScript("arguments[0].click();", DeleteContactNo);
		     Thread.sleep(3000);
		     WebElement AddContacts2 = driver.findElement(By.id("addContacts-0"));
		     JavascriptExecutor Add_Contacts2 =(JavascriptExecutor)driver;
		     Add_Contacts2.executeScript("arguments[0].click();", AddContacts2);
		     Thread.sleep(3000);
		     WebElement DeleteContactYes = driver.findElement(By.xpath("delete-contact-yes"));
			    JavascriptExecutor  Delete_ContactYes =(JavascriptExecutor)driver;
			    Delete_ContactYes.executeScript("arguments[0].click();", DeleteContactYes);
	     
	   //  Prefills_Search.click();
	    //Per Page search 
	     Thread.sleep(3000);
	     JavascriptExecutor scroll = (JavascriptExecutor)driver;
	     scroll.executeScript("window.scrollBy(0,400)", "");
	     Thread.sleep(5000);
	     WebElement PerPage =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/div[4]/nav/div[1]/select"));
	     JavascriptExecutor Page = (JavascriptExecutor)driver;
	     Page.executeScript("arguments[0].click();", PerPage);
	     PerPage.sendKeys(Keys.ARROW_DOWN);
	     PerPage.sendKeys(Keys.ARROW_DOWN);
	     PerPage.sendKeys(Keys.ARROW_DOWN);
	     PerPage.sendKeys(Keys.ENTER);
	     Thread.sleep(3000);
	     JavascriptExecutor scroll1 = (JavascriptExecutor)driver;
	     scroll1.executeScript("window.scrollBy(0,600)", "");
	     Thread.sleep(5000);
	     WebElement PerPages =driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div/div[4]/nav/div[1]/select"));
	     JavascriptExecutor Pages = (JavascriptExecutor)driver;
	     Pages.executeScript("arguments[0].click();", PerPages);
	     PerPages.sendKeys(Keys.ARROW_UP);
	     PerPages.sendKeys(Keys.ARROW_UP);
	     PerPages.sendKeys(Keys.ARROW_UP);
	     PerPage.sendKeys(Keys.ENTER);
	     Thread.sleep(5000);
	   //Page Navigation
	     WebElement NextPage = driver.findElement(By.id("pagination-next-page"));
	     JavascriptExecutor NextClick = (JavascriptExecutor)driver;
	     NextClick.executeScript("arguments[0].click();", NextPage);
	     Thread.sleep(3000);
	     WebElement LastPage = driver.findElement(By.id("pagination-last-page"));
	     JavascriptExecutor LastPageClick = (JavascriptExecutor)driver;
	     LastPageClick.executeScript("arguments[0].click();", LastPage);
	     Thread.sleep(3000);
	     WebElement PreviousPage = driver.findElement(By.id("pagination-previous-page"));
	     JavascriptExecutor PreviousPageClick = (JavascriptExecutor)driver;
	     PreviousPageClick.executeScript("arguments[0].click();", PreviousPage);
	     Thread.sleep(3000);
	     WebElement FirstPage = driver.findElement(By.id("pagination-first-page"));
	     JavascriptExecutor FirstPageClick = (JavascriptExecutor)driver;
	     FirstPageClick.executeScript("arguments[0].click();", FirstPage);
	     driver.quit();
  }
}
