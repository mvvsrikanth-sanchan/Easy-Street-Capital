package PipeLine.LoanDetails.UnderWriting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ES_38_ToolAndWorkFlow {
  @Test
  public void ToolAndWorkFlow() throws InterruptedException {
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
//CLICKING ON UNDERWRITING  MENU
WebElement UnderwritingNavigation = driver.findElement(By.id("underwritingMenu"));
JavascriptExecutor Underwriting= (JavascriptExecutor)driver;
Underwriting.executeScript("arguments[0].click();", UnderwritingNavigation);
Thread.sleep(2000);
//TOOLS AND WORK FLOW
WebElement ToolsAndWorkflow = driver.findElement(By.id("underwriting-ToolsAndWorkflow"));
JavascriptExecutor Tools_Workflow= (JavascriptExecutor)driver;
Tools_Workflow.executeScript("arguments[0].click();", ToolsAndWorkflow);
Thread.sleep(2000);
// UPDATE WORK FLOW
WebElement SaveUpdateWorkFlow = driver.findElement(By.id("saveUpdateWorkFlow"));
JavascriptExecutor SaveUpdate_WorkFlow =(JavascriptExecutor)driver;
SaveUpdate_WorkFlow.executeScript("arguments[0].click();", SaveUpdateWorkFlow);
Thread.sleep(2000);
WebElement PhaseUpdateWorkFlow = driver.findElement(By.id("PhaseUpdateWorkFlow"));
JavascriptExecutor PhaseUpdate_WorkFlow =(JavascriptExecutor)driver;
PhaseUpdate_WorkFlow.executeScript("arguments[0].click();", PhaseUpdateWorkFlow);
PhaseUpdateWorkFlow.sendKeys("Lead");
Thread.sleep(2000);
WebElement FolderUpdateWorkFlow = driver.findElement(By.id("FolderUpdateWorkFlow"));
JavascriptExecutor FolderUpdate_WorkFlow =(JavascriptExecutor)driver;
FolderUpdate_WorkFlow.executeScript("arguments[0].click();", FolderUpdateWorkFlow);
FolderUpdateWorkFlow.sendKeys("Cancelled");
Thread.sleep(2000);

WebElement SaveUpdateWorkFlow1 = driver.findElement(By.id("saveUpdateWorkFlow"));
JavascriptExecutor SaveUpdate_WorkFlow1 =(JavascriptExecutor)driver;
SaveUpdate_WorkFlow1.executeScript("arguments[0].click();", SaveUpdateWorkFlow1);

Thread.sleep(2000);
WebElement WorkFlowUpdate = driver.findElement(By.id("closePopupBtn"));
JavascriptExecutor WorkFlow_Update =(JavascriptExecutor)driver;
WorkFlow_Update.executeScript("arguments[0].click();", WorkFlowUpdate);

Thread.sleep(2000);
//ManualEmailTab

WebElement ManualEmailTab = driver.findElement(By.id("manualEmailTab"));
JavascriptExecutor ManualEmail_Tab =(JavascriptExecutor)driver;
ManualEmail_Tab.executeScript("arguments[0].click();", ManualEmailTab);
Thread.sleep(2000);
WebElement SendEmailBtn = driver.findElement(By.id("sendEmailBtn"));
JavascriptExecutor SendEmail_Btn =(JavascriptExecutor)driver;
SendEmail_Btn.executeScript("arguments[0].click();", SendEmailBtn);
Thread.sleep(2000);
WebElement SelectEmailTemplate = driver.findElement(By.id("selectEmailTemplate"));
JavascriptExecutor SelectEmail_Template =(JavascriptExecutor)driver;
SelectEmail_Template.executeScript("arguments[0].click();", SelectEmailTemplate);
SelectEmailTemplate.sendKeys("Welcome");
Thread.sleep(2000);
driver.findElement(By.id("emailFrom")).sendKeys("EasyStreetCapital@yopmail.com");
driver.findElement(By.id("emailTo")).sendKeys("mvvsrikanth@sanchaninfo.com");
driver.findElement(By.id("emailSubject")).sendKeys("Welcome To Easy Street Capital");
Thread.sleep(2000);
//
/*WebElement Message = driver.findElement(By.id("/html/body/div[1]/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/div/div/div[2]/div[1]"));
JavascriptExecutor Message_Text =(JavascriptExecutor)driver;
Message_Text.executeScript("arguments[0].click();", Message);*/
Thread.sleep(2000);
WebElement SendEmailBtn1 = driver.findElement(By.id("sendEmailBtn"));
JavascriptExecutor SendEmail_Btn1 =(JavascriptExecutor)driver;
SendEmail_Btn1.executeScript("arguments[0].click();", SendEmailBtn1);
Thread.sleep(3000);

WebElement ManualEmailSuccessPopup = driver.findElement(By.id("closePopupBtn"));
JavascriptExecutor SuccessPopup =(JavascriptExecutor)driver;
SuccessPopup.executeScript("arguments[0].click();", ManualEmailSuccessPopup);
Thread.sleep(2000);

//Email History 
WebElement EmailHistory = driver.findElement(By.id("emailHistoryBtn"));
JavascriptExecutor History =(JavascriptExecutor)driver;
History.executeScript("arguments[0].click();", EmailHistory);
Thread.sleep(3000);
WebElement NavigateBack = driver.findElement(By.id("navigateEmailBack"));
JavascriptExecutor Navigate_Back =(JavascriptExecutor)driver;
Navigate_Back.executeScript("arguments[0].click();", NavigateBack);
//Email History 
WebElement EmailHistory1 = driver.findElement(By.id("emailHistoryBtn"));
JavascriptExecutor History1 =(JavascriptExecutor)driver;
History1.executeScript("arguments[0].click();", EmailHistory1);
Thread.sleep(3000);
//ViewAndResend
WebElement ViewAndResend = driver.findElement(By.id("viewAndResend-0"));
JavascriptExecutor View_Resend =(JavascriptExecutor)driver;
View_Resend.executeScript("arguments[0].click();", ViewAndResend);
Thread.sleep(2000);
WebElement EmailcancelBtn = driver.findElement(By.id("emailcancelBtn"));
JavascriptExecutor Email_cancelBtn =(JavascriptExecutor)driver;
Email_cancelBtn.executeScript("arguments[0].click();", EmailcancelBtn);
Thread.sleep(2000);
System.out.println("Email Cancelled successfully");
WebElement EmailHistory2 = driver.findElement(By.id("emailHistoryBtn"));
JavascriptExecutor History2 =(JavascriptExecutor)driver;
History2.executeScript("arguments[0].click();", EmailHistory2);
Thread.sleep(3000);
WebElement ViewAndResend1 = driver.findElement(By.id("viewAndResend-0"));
JavascriptExecutor View_Resend1 =(JavascriptExecutor)driver;
View_Resend1.executeScript("arguments[0].click();", ViewAndResend1);
Thread.sleep(3000);
//Change In Subject
WebElement  changeSub = driver.findElement(By.id("emailSubject"));
JavascriptExecutor subjectChange = (JavascriptExecutor)driver;
subjectChange.executeScript("arguments[0].value='';", changeSub);
changeSub.sendKeys("Welcome To Easy Street Capitals");

WebElement SendEmail = driver.findElement(By.id("sendEmailBtn"));
JavascriptExecutor Send_EmailBtn =(JavascriptExecutor)driver;
Send_EmailBtn.executeScript("arguments[0].click();", SendEmail);
System.out.println("Email sent successfully");
Thread.sleep(3000);
WebElement SendEmailSuccessPopup = driver.findElement(By.id("closePopupBtn"));
JavascriptExecutor SendEmailPopup =(JavascriptExecutor)driver;
SendEmailPopup.executeScript("arguments[0].click();", SendEmailSuccessPopup);
//driver.navigate().refresh();
Thread.sleep(2000);
//MANAGE ALERTS TAB  

WebElement ManageAlertsTab = driver.findElement(By.id("manageAlertsTab"));
JavascriptExecutor Manage_AlertsTab =(JavascriptExecutor)driver;
Manage_AlertsTab.executeScript("arguments[0].click();", ManageAlertsTab);
Thread.sleep(2000);

WebElement AddAlert = driver.findElement(By.id("addAlert"));
JavascriptExecutor Add_Alert =(JavascriptExecutor)driver;
Add_Alert.executeScript("arguments[0].click();", AddAlert);
Thread.sleep(2000);
WebElement AlertSelectSection = driver.findElement(By.id("alertSelectSection"));
JavascriptExecutor AlertSelect_Section =(JavascriptExecutor)driver;
AlertSelect_Section.executeScript("arguments[0].click();", AlertSelectSection);
Thread.sleep(3000);
AlertSelectSection.sendKeys("Loan Details");
Thread.sleep(3000);
WebElement AlertMessage= driver.findElement(By.id("alertMessage"));
JavascriptExecutor Alert_Message =(JavascriptExecutor)driver;
Alert_Message.executeScript("arguments[0].click();", AlertMessage);
Thread.sleep(3000);
AlertMessage.sendKeys("Do you want to Add Deal Detailes");
Thread.sleep(3000);

WebElement AddAlert1 = driver.findElement(By.id("addAlert"));
JavascriptExecutor Add_Alert1 =(JavascriptExecutor)driver;
Add_Alert1.executeScript("arguments[0].click();", AddAlert1);
Thread.sleep(3000);
WebElement ManageAlertSuccessPopup = driver.findElement(By.id("closePopupBtn"));
JavascriptExecutor ManageAlert_SuccessPopup =(JavascriptExecutor)driver;
ManageAlert_SuccessPopup.executeScript("arguments[0].click();", ManageAlertSuccessPopup);
Thread.sleep(5000);

WebElement DeleteAlert = driver.findElement(By.id("deleteAlert-4")) ;
JavascriptExecutor Delete_Alert = (JavascriptExecutor)driver;
Delete_Alert.executeScript("arguments[0].click();", DeleteAlert);
Thread.sleep(2000);
WebElement DeleteAlertNo = driver.findElement(By.id("delete-alert-no")) ;
JavascriptExecutor Delete_AlertNo = (JavascriptExecutor)driver;
Delete_AlertNo.executeScript("arguments[0].click();", DeleteAlertNo);
Thread.sleep(2000);
WebElement DeleteAlert1 = driver.findElement(By.id("deleteAlert-4")) ;
JavascriptExecutor Delete_Alert1 = (JavascriptExecutor)driver;
Delete_Alert1.executeScript("arguments[0].click();", DeleteAlert1);
Thread.sleep(2000);
WebElement DeleteAlertYes = driver.findElement(By.id("delete-alert-yes")) ;
JavascriptExecutor Delete_AlertYes = (JavascriptExecutor)driver;
Delete_AlertYes.executeScript("arguments[0].click();", DeleteAlertYes);
Thread.sleep(2000);
WebElement ManageAlertSuccessPopup1 = driver.findElement(By.id("closePopupBtn"));
JavascriptExecutor ManageAlert_SuccessPopup1 =(JavascriptExecutor)driver;
ManageAlert_SuccessPopup1.executeScript("arguments[0].click();", ManageAlertSuccessPopup1);
Thread.sleep(3000);
// MANAGE CATEGORIES TAB
WebElement ManageAlerts = driver.findElement(By.id("manageCategoriesTab"));
JavascriptExecutor Manage_Alerts =(JavascriptExecutor)driver;
Manage_Alerts.executeScript("arguments[0].click();", ManageAlerts);
Thread.sleep(2000);
WebElement  SaveCategoriesLoan = driver.findElement(By.id("saveCategoriesLoan"));
JavascriptExecutor Save_CategoriesLoan =(JavascriptExecutor)driver;
Save_CategoriesLoan.executeScript("arguments[0].click();", SaveCategoriesLoan);
Thread.sleep(2000);
WebElement  loanCategories = driver.findElement(By.id("loanCategories"));
JavascriptExecutor loan_Categories =(JavascriptExecutor)driver;
loan_Categories.executeScript("arguments[0].click();", loanCategories);
loanCategories.sendKeys(Keys.ARROW_DOWN);
loanCategories.sendKeys(Keys.ARROW_DOWN);
loanCategories.sendKeys(Keys.ENTER);
Thread.sleep(2000);
WebElement  SaveCategoriesLoan1 = driver.findElement(By.id("saveCategoriesLoan"));
JavascriptExecutor Save_CategoriesLoan1 =(JavascriptExecutor)driver;
Save_CategoriesLoan1.executeScript("arguments[0].click();", SaveCategoriesLoan1);
Thread.sleep(2000);
WebElement ManageCategorySuccessPopup = driver.findElement(By.id("closePopupBtn"));
JavascriptExecutor ManageCategory_SuccessPopup =(JavascriptExecutor)driver;
ManageCategory_SuccessPopup.executeScript("arguments[0].click();", ManageCategorySuccessPopup);
Thread.sleep(3000);
//LOAN ASSIGNMENT TAB loanAssignmentTab
WebElement loanAssignmentTab = driver.findElement(By.id("loanAssignmentTab"));
JavascriptExecutor loan_AssignmentTab =(JavascriptExecutor)driver;
loan_AssignmentTab.executeScript("arguments[0].click();", loanAssignmentTab);
Thread.sleep(2000);
WebElement  Adminto = driver.findElement(By.id("adminto"));
JavascriptExecutor adminto = (JavascriptExecutor)driver;
adminto.executeScript("arguments[0].click();", Adminto);
Adminto.sendKeys("A Vihaan");
Thread.sleep(2000);
WebElement  Accountexecutive = driver.findElement(By.id("accountexecutive"));
JavascriptExecutor accountexecutive = (JavascriptExecutor)driver;
accountexecutive.executeScript("arguments[0].click();", Accountexecutive);
Accountexecutive.sendKeys("anusha gokada");
Thread.sleep(2000);
WebElement  Changeopenerto = driver.findElement(By.id("changeopenerto"));
JavascriptExecutor accountexecutive1 = (JavascriptExecutor)driver;
accountexecutive1.executeScript("arguments[0].click();", Changeopenerto);
Changeopenerto.sendKeys("Aadhya Ar");
Thread.sleep(2000);
WebElement  Changeunderwriterto = driver.findElement(By.id("changeunderwriterto"));
JavascriptExecutor changeunderwriterto = (JavascriptExecutor)driver;
changeunderwriterto.executeScript("arguments[0].click();", Changeunderwriterto);
Changeunderwriterto.sendKeys("Aadhya Ar");
Thread.sleep(2000);
WebElement  Changecloserto = driver.findElement(By.id("changecloserto"));
JavascriptExecutor changecloserto = (JavascriptExecutor)driver;
changecloserto.executeScript("arguments[0].click();", Changecloserto);
Changecloserto.sendKeys("Ch Sakshi");
Thread.sleep(2000);
WebElement  Changefunderto = driver.findElement(By.id("changefunderto"));
JavascriptExecutor changefunderto = (JavascriptExecutor)driver;
changefunderto.executeScript("arguments[0].click();", Changefunderto);
Changefunderto.sendKeys("chandra sekhar");
Thread.sleep(2000);
WebElement  Changeaccountexceutiveto = driver.findElement(By.id("changeaccountexceutiveto"));
JavascriptExecutor changeaccountexceutiveto = (JavascriptExecutor)driver;
changeaccountexceutiveto.executeScript("arguments[0].click();", Changeaccountexceutiveto);
Changeaccountexceutiveto.sendKeys("chandra sekhar");
Thread.sleep(2000);
WebElement  Changeprocessorto = driver.findElement(By.id("changeprocessorto"));
JavascriptExecutor changeprocessorto = (JavascriptExecutor)driver;
changeprocessorto.executeScript("arguments[0].click();", Changeprocessorto);
Changeprocessorto.sendKeys("Divya Divya222");
Thread.sleep(2000);
WebElement  Changeprocessor2to = driver.findElement(By.id("changeprocesser2to"));
JavascriptExecutor changeprocessor2to = (JavascriptExecutor)driver;
changeprocessor2to.executeScript("arguments[0].click();", Changeprocessor2to);
Changeprocessor2to.sendKeys("Arya Ad");
Thread.sleep(2000);
WebElement  Changeaccountingto = driver.findElement(By.id("changeaccountingto"));
JavascriptExecutor changeaccountingto = (JavascriptExecutor)driver;
changeaccountingto.executeScript("arguments[0].click();", Changeaccountingto);
Changeaccountingto.sendKeys("Arya Ad");
Thread.sleep(2000);
WebElement  Changeservicerto = driver.findElement(By.id("changeservicerto"));
JavascriptExecutor changeservicerto = (JavascriptExecutor)driver;
changeservicerto.executeScript("arguments[0].click();", Changeservicerto);
Changeservicerto.sendKeys("arun h");
Thread.sleep(2000);
WebElement  Changeservicer2to = driver.findElement(By.id("changeservicer2to"));
JavascriptExecutor changeservicer2to = (JavascriptExecutor)driver;
changeservicer2to.executeScript("arguments[0].click();", Changeservicer2to);
Changeservicer2to.sendKeys("arun h");
Thread.sleep(2000);
WebElement  Changedrawmanagementto = driver.findElement(By.id("changedrawmanagementto"));
JavascriptExecutor changedrawmanagementto = (JavascriptExecutor)driver;
changedrawmanagementto.executeScript("arguments[0].click();", Changedrawmanagementto);
Changedrawmanagementto.sendKeys("Araz Ar");
Thread.sleep(2000);
WebElement  SaveLoanAssignment = driver.findElement(By.id("saveLoanAssignment"));
JavascriptExecutor saveLoanAssignment = (JavascriptExecutor)driver;
saveLoanAssignment.executeScript("arguments[0].click();", SaveLoanAssignment);
Thread.sleep(2000);
WebElement LoanAssignmentSuccessPopup = driver.findElement(By.id("closePopupBtn"));
JavascriptExecutor LoanAssignment_SuccessPopup =(JavascriptExecutor)driver;
LoanAssignment_SuccessPopup.executeScript("arguments[0].click();", LoanAssignmentSuccessPopup);
Thread.sleep(2000);
//LOAN AUDIT 
WebElement loanAuditTab = driver.findElement(By.id("loanAuditTab"));
JavascriptExecutor loan_AuditTab =(JavascriptExecutor)driver;
loan_AuditTab.executeScript("arguments[0].click();", loanAuditTab);
Thread.sleep(2000);
WebElement LoanHistoryTabChange = driver.findElement(By.id("loanHistoryTabChange"));
JavascriptExecutor loanHistoryTabChange = (JavascriptExecutor)driver;
loanHistoryTabChange.executeScript("arguments[0].click();", LoanHistoryTabChange);
Thread.sleep(2000);
//Drop down
Thread.sleep(2000);
WebElement loanHistoryDropdown = driver.findElement(By.id("allDropdown"));
JavascriptExecutor loanHistory_Dropdown = (JavascriptExecutor)driver;
loanHistory_Dropdown.executeScript("arguments[0].click();", loanHistoryDropdown);
Thread.sleep(2000);
loanHistoryDropdown.sendKeys(Keys.ARROW_DOWN);
loanHistoryDropdown.sendKeys(Keys.ENTER);
Thread.sleep(2000);
WebElement LoanDetailsTabChange = driver.findElement(By.id("loanDetailsTabChange"));
JavascriptExecutor loanDetailsTabChange = (JavascriptExecutor)driver;
loanDetailsTabChange.executeScript("arguments[0].click();", LoanDetailsTabChange);
Thread.sleep(2000);
//Drop down
Thread.sleep(2000);
WebElement LoanDetailsDropdown = driver.findElement(By.id("allDropdown"));
JavascriptExecutor LoanDetails_Dropdown = (JavascriptExecutor)driver;
LoanDetails_Dropdown.executeScript("arguments[0].click();", LoanDetailsDropdown);
Thread.sleep(2000);
loanHistoryDropdown.sendKeys(Keys.ARROW_DOWN);
loanHistoryDropdown.sendKeys(Keys.ENTER);
Thread.sleep(2000);
WebElement LoanReassignmentsTabChange = driver.findElement(By.id("loanReassignmentsTabChange"));
JavascriptExecutor loanReassignmentsTabChange = (JavascriptExecutor)driver;
loanReassignmentsTabChange.executeScript("arguments[0].click();", LoanReassignmentsTabChange);
Thread.sleep(2000);
//Drop down
Thread.sleep(2000);
WebElement LoanReassignmentsDropdown = driver.findElement(By.id("allDropdown"));
JavascriptExecutor LoanReassignments_Dropdown = (JavascriptExecutor)driver;
LoanReassignments_Dropdown.executeScript("arguments[0].click();", LoanReassignmentsDropdown);
Thread.sleep(2000);
loanHistoryDropdown.sendKeys(Keys.ARROW_DOWN);
loanHistoryDropdown.sendKeys(Keys.ENTER);
Thread.sleep(2000);
WebElement EmaillogTabChange = driver.findElement(By.id("emaillogTabChange"));
JavascriptExecutor emaillogTabChange = (JavascriptExecutor)driver;
emaillogTabChange.executeScript("arguments[0].click();", EmaillogTabChange);
Thread.sleep(2000);


  }
}
