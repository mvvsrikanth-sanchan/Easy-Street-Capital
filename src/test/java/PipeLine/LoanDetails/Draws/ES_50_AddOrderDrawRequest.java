package PipeLine.LoanDetails.Draws;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_50_AddOrderDrawRequest {
  @Test
  public void OrderDrawRequest() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		System.out.println("browser opened");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		driver.findElement(By.id("teamMemberButton")).click();

		// Enter User Name
		driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com");

		// Enter password Name

		driver.findElement(By.id("loginPassword")).sendKeys("Sanchan@123");

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		WebElement LoanId = driver
				.findElement(By.cssSelector("#row-7 > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));
		Actions LoanIdSelect = new Actions(driver);
		LoanIdSelect.moveToElement(LoanId).perform();
		// CLICKING ON DRAWS MENU
		WebElement Draws = driver.findElement(By.xpath(
				"/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[8]/div[1]/div/div/ul/li[7]/a"));
		JavascriptExecutor Drawsmenu = (JavascriptExecutor) driver;
		Drawsmenu.executeScript("arguments[0].click();", Draws);
		Thread.sleep(5000);
		/***
		 * GETTING THE LOAN ID 280 TO WORK ON IT 
		 * 
		 */
		driver.navigate().to("https://feature-development.d3v768j7i3fu59.amplifyapp.com/dashboard?loanid=300280");
		Thread.sleep(3000);
		WebElement DrawMenu = driver.findElement(By.id("drawsMenu"));
		JavascriptExecutor Draws_menu = (JavascriptExecutor) driver;
		Draws_menu.executeScript("arguments[0].click();", DrawMenu);
		Thread.sleep(1000);
		WebElement OrderDrawRequest = driver.findElement(By.id("draws-OrderDrawRequest"));
		JavascriptExecutor OrderDraw_Request = (JavascriptExecutor) driver;
		OrderDraw_Request.executeScript("arguments[0].click();", OrderDrawRequest);
		Thread.sleep(3000);
		/*
		 * Scope of Work
		 */
		// Add Order Draw Request
		WebElement Add = driver
				.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div[1]/div[1]/div/button"));
		JavascriptExecutor AddOrderDrawRequest = (JavascriptExecutor) driver;
		AddOrderDrawRequest.executeScript("arguments[0].click();", Add);
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.name("scopeofwork")).sendKeys("Construction");
		Thread.sleep(1000);
		driver.findElement(By.name("contractor")).sendKeys("Vincent fins");
		Thread.sleep(1000);
		driver.findElement(By.name("completiondate")).sendKeys("15/30/2025");
		Thread.sleep(1000);
		driver.findElement(By.name("notes")).sendKeys("Draw Request Against Construction ");
		Thread.sleep(3000);
		WebElement Upload = driver.findElement(By.id("upload"));
		JavascriptExecutor upload = (JavascriptExecutor) driver;
		upload.executeScript("arguments[0].click();", Upload);
		Thread.sleep(3000);
		Runtime.getRuntime() 
				.exec("C:\\Users\\mvvsr\\OneDrive\\Desktop\\EasyStreetUploadFiles\\ScopeOfwork.exe");
		Thread.sleep(5000);
		WebElement SubmitScopeOfWork = driver
				.findElement(By.xpath("//*[@class=\"add_button fillbtn_new d-inline-block\"]"));
		JavascriptExecutor Submit_ScopeOfWork = (JavascriptExecutor) driver;
		Submit_ScopeOfWork.executeScript("arguments[0].click();", SubmitScopeOfWork);
		Thread.sleep(3000);
		WebDriverWait SubmitClosePopup = new WebDriverWait(driver, Duration.ofSeconds(30));
		SubmitClosePopup.until(ExpectedConditions.elementToBeClickable(By.id("closePopupBtn"))).click();
		// Back Button

				WebElement BackButton1 = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/h2/a"));
				JavascriptExecutor Back_Button1 = (JavascriptExecutor) driver;
				Back_Button1.executeScript("arguments[0].click();", BackButton1);
				Thread.sleep(3000);

				// Edit Scope of Work
				WebElement EditScopeOfWork = driver.findElement(By.id("edit-0"));
				JavascriptExecutor Edit = (JavascriptExecutor) driver;
				Edit.executeScript("arguments[0].click();", EditScopeOfWork);
				Thread.sleep(3000);
				/****
				 * BUDGET
				 */

				WebElement Budget = driver
						.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div[1]/ul/li[2]/a/span[2]"));
				JavascriptExecutor Budget_Menu = (JavascriptExecutor) driver;
				Budget_Menu.executeScript("arguments[0].click();", Budget);
				Thread.sleep(3000);
				WebElement RequiredAmount = driver.findElement(By.id("requestedamount"));
				JavascriptExecutor Required_Amount = (JavascriptExecutor) driver;
				Required_Amount.executeScript("arguments[0].click();", RequiredAmount);
				RequiredAmount.sendKeys("556000");
				Thread.sleep(3000);
				// Labour
				driver.findElement(By.id("labour-quantity")).sendKeys("20");
				Thread.sleep(1000);
				driver.findElement(By.id("labour-unit")).sendKeys("15");
				Thread.sleep(1000);
				driver.findElement(By.id("labour-price")).sendKeys("4500");
				Thread.sleep(1000);
				driver.findElement(By.id("labour-percent")).sendKeys("5");
				Thread.sleep(1000);
				driver.findElement(By.id("labour-original")).sendKeys("250000");
				Thread.sleep(1000);
				driver.findElement(By.id("labour-current")).sendKeys("280000");
				Thread.sleep(1000);
				// Material
				driver.findElement(By.id("material-quantity")).sendKeys("30");
				Thread.sleep(1000);
				driver.findElement(By.id("material-unit")).sendKeys("55");
				Thread.sleep(1000);
				driver.findElement(By.id("material-price")).sendKeys("45500");
				Thread.sleep(1000);
				driver.findElement(By.id("material-percent")).sendKeys("2");
				Thread.sleep(1000);
				driver.findElement(By.id("material-original")).sendKeys("500000");
				Thread.sleep(1000);
				driver.findElement(By.id("material-current")).sendKeys("3750000");
				Thread.sleep(1000);
				// Others
				driver.findElement(By.id("others-quantity")).sendKeys("15");
				Thread.sleep(1000);
				driver.findElement(By.id("others-unit")).sendKeys("5");
				Thread.sleep(1000);
				driver.findElement(By.id("others-price")).sendKeys("365500");
				Thread.sleep(1000);
				driver.findElement(By.id("others-percent")).sendKeys("1");
				Thread.sleep(1000);
				driver.findElement(By.id("others-original")).sendKeys("210000");
				Thread.sleep(1000);
				driver.findElement(By.id("others-current")).sendKeys("220000");
				Thread.sleep(3000);
				// SAVE
				WebElement SaveBudget = driver.findElement(By.id("savebudget-btn"));
				JavascriptExecutor Save_Budget = (JavascriptExecutor) driver;
				Save_Budget.executeScript("arguments[0].click();", SaveBudget);
				Thread.sleep(3000);
				WebElement SaveBudgetClosePopup = driver.findElement(By.id("closePopupBtn"));
				JavascriptExecutor Save_BudgetClosePopup = (JavascriptExecutor) driver;
				Save_BudgetClosePopup.executeScript("arguments[0].click();", SaveBudgetClosePopup);
				Thread.sleep(3000);
				/*
				 * // INSPECTION
				 */

				WebElement InspectionS = driver
						.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div[1]/ul/li[3]/a/span[2]"));
				JavascriptExecutor InspectionTabS = (JavascriptExecutor) driver;
				InspectionTabS.executeScript("arguments[0].click();", InspectionS);
				Thread.sleep(3000);
				Thread.sleep(3000);
				WebElement CreateInspection = driver.findElement(By.xpath("//*[@id=\"INSPECTIONS\"]/div[1]/div/button"));
				JavascriptExecutor Create = (JavascriptExecutor) driver;
				Create.executeScript("arguments[0].click();", CreateInspection);
				Thread.sleep(3000);
				driver.findElement(By.id("inspectedby")).sendKeys("James");
				Thread.sleep(1000);
				driver.findElement(By.id("inspecteddate")).sendKeys("10/21/2024");
				Thread.sleep(1000);
				driver.findElement(By.id("itemcomplete")).sendKeys("85");
				Thread.sleep(1000);
				driver.findElement(By.id("totalprojectcomplete")).sendKeys("60");
				Thread.sleep(1000);
				WebElement InspectionCompleteYes = driver
						.findElement(By.xpath("//*[@id=\"createinspection\"]/div/div/div[2]/div/div[5]/div/label[2]/div"));
				JavascriptExecutor InspectionComplete_Yes = (JavascriptExecutor) driver;
				InspectionComplete_Yes.executeScript("arguments[0].click();", InspectionCompleteYes);
				Thread.sleep(3000);
				
				WebElement FlaggedByInspectionYes = driver
						.findElement(By.xpath("//*[@id=\"createinspection\"]/div/div/div[2]/div/div[6]/div/label[2]/div"));
				JavascriptExecutor FlaggedByInspection_Yes = (JavascriptExecutor) driver;
				FlaggedByInspection_Yes.executeScript("arguments[0].click();", FlaggedByInspectionYes);
				Thread.sleep(3000);
				WebElement Save = driver.findElement(By.id("addinspection-btn"));
				Save.click();
				Thread.sleep(3000);
				WebElement CloseInspectionPopup = driver.findElement(By.id("closePopupBtn"));
				JavascriptExecutor Inspection_ClosePopup = (JavascriptExecutor) driver;
				Inspection_ClosePopup.executeScript("arguments[0].click();", CloseInspectionPopup);
				Thread.sleep(3000);
				// Back
				WebElement Back = driver.findElement(By.id("back-btn"));
				JavascriptExecutor Back_Button11 = (JavascriptExecutor) driver;
				Back_Button11.executeScript("arguments[0].click();", Back);
				Thread.sleep(3000);
				// Edit Status

				WebElement EditStatus = driver.findElement(By.xpath("//*[@id=\"cell-12-undefined\"]/div/span"));
				JavascriptExecutor Edit_Status = (JavascriptExecutor) driver;
				Edit_Status.executeScript("arguments[0].click();", EditStatus);
				Thread.sleep(3000);
				/*
				 * ORDER INSPECTION
				 */
				WebElement OrderDate = driver.findElement(By.name("orderdate"));
				JavascriptExecutor Order_Date = (JavascriptExecutor) driver;
				Order_Date.executeScript("arguments[0].click();", OrderDate);
				OrderDate.sendKeys("10/30/2024");
				Thread.sleep(1000);
				WebElement ScheduledDate = driver.findElement(By.name("scheduleddate"));
				JavascriptExecutor Scheduled_Date = (JavascriptExecutor) driver;
				Scheduled_Date.executeScript("arguments[0].click();", ScheduledDate);
				ScheduledDate.sendKeys("11/02/2024");
				Thread.sleep(1000);
				WebElement CompletedDate = driver.findElement(By.name("completeddate"));
				JavascriptExecutor Completed_Date = (JavascriptExecutor) driver;
				Completed_Date.executeScript("arguments[0].click();", CompletedDate);
				CompletedDate.sendKeys("11/30/2024");
				Thread.sleep(1000);
				driver.findElement(By.name("emailsubject")).sendKeys("Order Inspection");
				Thread.sleep(1000);
				WebElement contacts = driver.findElement(By.name("contacts"));
				JavascriptExecutor Selection = (JavascriptExecutor) driver;
				Selection.executeScript("arguments[0].click();", contacts);
				contacts.sendKeys("broker");
				Thread.sleep(1000);
				WebElement AdditionalEmail = driver.findElement(By.id("additionalemail"));
				JavascriptExecutor Email = (JavascriptExecutor) driver;
				Email.executeScript("arguments[0].click();", AdditionalEmail);
				AdditionalEmail.sendKeys("mvvsrikanth@sanchaninfo.com");

				Thread.sleep(1000);
				WebElement Lockboxcode = driver.findElement(By.name("lockboxcode"));
				JavascriptExecutor Lockbox_code = (JavascriptExecutor) driver;
				Lockbox_code.executeScript("arguments[0].click();", Lockboxcode);
				Lockboxcode.sendKeys("ASRTRU678II");
				Thread.sleep(1000);
				WebElement InspectionNotes = driver.findElement(
						By.xpath("//*[@id=\"ORDERINSPECTION\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div[1]"));
				JavascriptExecutor Notes = (JavascriptExecutor) driver;
				Notes.executeScript("arguments[0].click();", InspectionNotes);
				InspectionNotes.sendKeys("Our Team verifies Order Inspection");
				Thread.sleep(3000);
				WebElement UploadOrderInspection = driver.findElement(By.name("uploadorderinspection"));
				JavascriptExecutor Upload_Inspection = (JavascriptExecutor) driver;
				Upload_Inspection.executeScript("arguments[0].click();", UploadOrderInspection);
				Thread.sleep(3000);
				Runtime.getRuntime().exec("C:\\Users\\mvvsr\\OneDrive\\Desktop\\EasyStreetUploadFiles\\SupportDocuments.exe");
				Thread.sleep(3000);
				// SAVE
				WebElement OrderInspectionSave = driver.findElement(By.id("saveinspection-btn"));
				JavascriptExecutor OrderInspection_Save = (JavascriptExecutor) driver;
				OrderInspection_Save.executeScript("arguments[0].click();", OrderInspectionSave);
				Thread.sleep(5000);
				WebDriverWait OrderInspectionSaveClosePopup = new WebDriverWait(driver, Duration.ofSeconds(30));
				OrderInspectionSaveClosePopup.until(ExpectedConditions.elementToBeClickable(By.id("closePopupBtn"))).click();
				/*WebElement OrderInspectionSaveClosePopup = driver.findElement(By.id("closePopupBtn"));
				JavascriptExecutor OrderInspectionSaveClose_Popup = (JavascriptExecutor) driver;
				OrderInspectionSaveClose_Popup.executeScript("arguments[0].click();", OrderInspectionSaveClosePopup);*/
				Thread.sleep(3000);
				/*
				 * 
				 * Verify Inspection
				 */

				WebElement Inspection = driver
						.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div[1]/ul/li[2]/a/span[2]"));
				JavascriptExecutor InspectionTab = (JavascriptExecutor) driver;
				InspectionTab.executeScript("arguments[0].click();", Inspection);
				Thread.sleep(3000);
				driver.findElement(By.id("verifieddate")).sendKeys("10/21/2024");
				Thread.sleep(1000);
				WebElement VerifiedToggleOn = driver
						.findElement(By.xpath("//*[@id=\"VERIFYINSPECTION\"]/div[2]/div/div[2]/div/label[2]"));
				JavascriptExecutor VerifiedToggle_On = (JavascriptExecutor) driver;
				VerifiedToggle_On.executeScript("arguments[0].click();", VerifiedToggleOn);
				Thread.sleep(3000);

				driver.findElement(By.id("additionalcomments")).sendKeys("Inpection");
				Thread.sleep(3000);
				WebElement UploadVerificationFile = driver.findElement(By.name("uploadverifyinspection"));
				JavascriptExecutor UploadVerification_File = (JavascriptExecutor) driver;
				UploadVerification_File.executeScript("arguments[0].click();", UploadVerificationFile);
				Thread.sleep(3000);
				Runtime.getRuntime().exec("C:\\Users\\mvvsr\\OneDrive\\Desktop\\EasyStreetUploadFiles\\VerifyInspectionDocument.exe");
				Thread.sleep(3000);
				// SAVE
				WebElement VerifyInspectionSave = driver.findElement(By.id("saveverifyinspection-btn"));
				JavascriptExecutor VerifyInspection_Save = (JavascriptExecutor) driver;
				VerifyInspection_Save.executeScript("arguments[0].click();", VerifyInspectionSave);
				Thread.sleep(5000);
				WebDriverWait SaveVerifyInspectionClosePopup = new WebDriverWait(driver, Duration.ofSeconds(30));
				SaveVerifyInspectionClosePopup.until(ExpectedConditions.elementToBeClickable(By.id("closePopupBtn"))).click();
				/*WebElement SaveVerifyInspectionClosePopup = driver.findElement(By.id("closePopupBtn"));
				JavascriptExecutor SaveVerifyInspectionClose_Popup = (JavascriptExecutor) driver;
				SaveVerifyInspectionClose_Popup.executeScript("arguments[0].click();", SaveVerifyInspectionClosePopup);*/
				Thread.sleep(3000);
				// APPROVE DRAW REQUEST
				WebElement ApproveDraw = driver.findElement(By.id("acceptdraw"));
				JavascriptExecutor DrawRequest = (JavascriptExecutor) driver;
				DrawRequest.executeScript("arguments[0].click();", ApproveDraw);
				Thread.sleep(3000);
				driver.findElement(By.name("amountapproved")).sendKeys("255000");
				Thread.sleep(3000);
				WebDriverWait FeeAmount = new WebDriverWait(driver, Duration.ofSeconds(50));
				FeeAmount.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"feeamount\"]"))).sendKeys("2000");
				Thread.sleep(3000);
				WebDriverWait PaymentMethod = new WebDriverWait(driver, Duration.ofSeconds(50));
				PaymentMethod.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"payoutmethod-approve\"]"))).sendKeys("Cash");
				Thread.sleep(3000);
				WebDriverWait Comment = new WebDriverWait(driver, Duration.ofSeconds(50));
				Comment.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"additionalcomments-approve\"]"))).sendKeys("comments");
				Thread.sleep(3000);
				driver.findElement(By.id("approve-btn")).click();
				Thread.sleep(3000);
				WebElement CloseApprovePopup = driver.findElement(By.id("closePopupBtn"));
				JavascriptExecutor CloseDrawRequestPopup = (JavascriptExecutor) driver;
				CloseDrawRequestPopup.executeScript("arguments[0].click();", CloseApprovePopup);
				Thread.sleep(3000);
				//Draw Payout
				WebElement DrawPayout = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[2]/div[1]/ul/li[3]/a/span[2]"));
				JavascriptExecutor DrawPayout_Tab = (JavascriptExecutor) driver;
				DrawPayout_Tab.executeScript("arguments[0].click();", DrawPayout);
				Thread.sleep(3000);	
				driver.findElement(By.name("dateofdraw")).sendKeys("10/25/2024");
				Thread.sleep(3000);
				driver.findElement(By.name("lastdayofdraw")).sendKeys("10/28/2024");
				Thread.sleep(3000);
				driver.findElement(By.name("processeddate")).sendKeys("10/20/2024");
				Thread.sleep(3000);
				driver.findElement(By.name("payoutdescription")).sendKeys("Payment is Cash");
				Thread.sleep(3000);
				WebElement PayBorrower = driver.findElement(By.xpath("//*[@id=\"DRAWPAYOUT\"]/div/div[2]/div[3]/div/button"));
				JavascriptExecutor Pay_Borrower = (JavascriptExecutor) driver;
				Pay_Borrower.executeScript("arguments[0].click();", PayBorrower);
				Thread.sleep(3000);
				WebDriverWait DrawPayoutClosePopup = new WebDriverWait(driver, Duration.ofSeconds(30));
				DrawPayoutClosePopup.until(ExpectedConditions.elementToBeClickable(By.id("closePopupBtn"))).click();
				Thread.sleep(3000);
				// Back
				WebElement BackButton = driver.findElement(By.id("back-btn"));
				JavascriptExecutor BackButton2= (JavascriptExecutor) driver;
				BackButton2.executeScript("arguments[0].click();", BackButton);
  }
}
