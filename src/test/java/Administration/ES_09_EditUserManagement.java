package Administration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;

public class ES_09_EditUserManagement {
  @Test
  public void EditUser () throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		  
		  
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  System.out.println("URL opened ");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/login");
		 
		 driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com"); 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys("Sanchan@123");
		  
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/form/div[4]/button")).click();
		  System.out.println("Logged in successfully");
		  
		  Thread.sleep(5000);
			 driver.findElement(By.linkText("Administration")).click();
	
		// adm.click();
		  Thread.sleep(3000);
		   driver.findElement(By.linkText("User Management")).click();
		//================ Edit Created user 
		   Thread.sleep(3000);
		WebElement Search=  driver.findElement(By.id("searchUserName"));
		Search.sendKeys("Sam");
		Search.click();
			
		  driver.findElement(By.id("editUser-0")).click();
		// Update User Info 
		  Thread.sleep(2000);
		  driver.findElement(By.id("userFax")).sendKeys("020-564-140");
		  Thread.sleep(1000);
		 WebElement saveUser =  driver.findElement(By.id("saveUser"));
		 JavascriptExecutor save_User=(JavascriptExecutor)driver;
		 save_User.executeScript("arguments[0].click();", saveUser);
	     //driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[2]/div[2]/span")).click();
		 Thread.sleep(3000);
			 WebElement role=driver.findElement(By.id("selectRole"));
			 JavascriptExecutor Role = (JavascriptExecutor)driver;
			 Role.executeScript("arguments[0].click();", role);
			 role.sendKeys(Keys.ARROW_DOWN);
			 role.sendKeys(Keys.ARROW_DOWN);
			 role.sendKeys(Keys.ENTER);
			 System.out.println("Role updated ");
			 Thread.sleep(3000);
			 WebElement Status = driver.findElement(By.id("selectStatus"));
			 JavascriptExecutor status = (JavascriptExecutor)driver;
			 status.executeScript("arguments[0].click();", Status);
					 
			 Status.sendKeys(Keys.ARROW_UP);
			 Status.sendKeys(Keys.ESCAPE);
			 System.out.println("Status set to Active");
			JavascriptExecutor scroll= (JavascriptExecutor)driver;
			   scroll.executeScript("window.scrollBy(0,1000)", "");
			
			WebElement Update= driver.findElement(By.id("submitAdmin"));
			JavascriptExecutor Submit=(JavascriptExecutor)driver;
			Submit.executeScript("arguments[0].click();", Update);
		   System.out.println(" SECURITY INFO ENTERED SUCCESSFULLY");
			 //========================================================STATE LICENSES
			 Thread.sleep(3000);
		  WebElement AddLicense = driver.findElement(By.id("addLicense"));
			 JavascriptExecutor License = (JavascriptExecutor)driver;
			 License.executeScript("arguments[0].click();", AddLicense);
		     System.out.println("Add License validation displayed");
			 WebElement NMLSLicense = driver.findElement(By.id("NMLSLicense"));
			 JavascriptExecutor NMLS_License = (JavascriptExecutor)driver;
			 NMLS_License.executeScript("arguments[0].click();", NMLSLicense);
			 NMLSLicense.sendKeys("12ASTY6709HJ");
			 Thread.sleep(1000);
			 WebElement licenseState = driver.findElement(By.id("licenseState"));
			 licenseState.click();
			 licenseState.sendKeys("Arizona");
			 Thread.sleep(1000);
			 driver.findElement(By.id("licenseNumber")).sendKeys("ARI78945090");
			 Thread.sleep(3000);
			 driver.findElement(By.id("licenseExpiration")).sendKeys("20/07/24");
			 Thread.sleep(2000);
			 WebElement AddLicenses = driver.findElement(By.id("addLicense"));
			 JavascriptExecutor Licenses = (JavascriptExecutor)driver;
			 Licenses.executeScript("arguments[0].click();", AddLicenses);
			 
			 System.out.println("STATE LICENSES ADDED SUCCESSFULLY");
			 Thread.sleep(3000);
			 //===========================Edit Added License
			 WebElement editLicense = driver.findElement(By.id("editLicense-0"));
			 JavascriptExecutor edit_License =(JavascriptExecutor)driver;
			 edit_License.executeScript("arguments[0].click();", editLicense);
			 Thread.sleep(3000);
			 WebElement licenseNumbers = driver.findElement(By.id("licenseNumber"));
			 JavascriptExecutor license_Number = (JavascriptExecutor)driver;
			 license_Number.executeScript("arguments[0].value='';", licenseNumbers);
			 Thread.sleep(2000);
			 //licenseNumber.clear();
			 licenseNumbers.sendKeys("ESC890XCV");
			 Thread.sleep(3000);
			 WebElement updateLicenses = driver.findElement(By.id("updateLicense"));
			 JavascriptExecutor update_Licenses = (JavascriptExecutor)driver;
			 update_Licenses.executeScript("arguments[0].click();", updateLicenses);
			 Thread.sleep(3000);
			
		 //===========================Delete Added License
			 WebElement deleteLicense = driver.findElement(By.id("deleteLicense-0"));
			 JavascriptExecutor delete_License =(JavascriptExecutor)driver;
			 delete_License.executeScript("arguments[0].click();", deleteLicense);
			 Thread.sleep(3000);
			 WebElement deleteCancel = driver.findElement(By.id("delete-license-no"));
			 JavascriptExecutor delete_Cancel =(JavascriptExecutor)driver;
			 delete_Cancel.executeScript("arguments[0].click();", deleteCancel);
			 Thread.sleep(3000);
			 deleteLicense.click();
			 Thread.sleep(3000);
			 WebElement deleteYes= driver.findElement(By.id("delete-license-yes"));
			 JavascriptExecutor delete_Yes =(JavascriptExecutor)driver;
			 delete_Yes.executeScript("arguments[0].click();", deleteYes);
			 Thread.sleep(5000);
			//submitLicense
			 WebElement submitLicense = driver.findElement(By.id("submitLicense"));
			 JavascriptExecutor submit_License = (JavascriptExecutor)driver;
			 submit_License.executeScript("arguments[0].click();", submitLicense);
			 Thread.sleep(3000);
			 // Clicking on State License Tab  
			 WebElement licenseTab = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[2]/div[3]/span"));
			 JavascriptExecutor license_Tab = (JavascriptExecutor)driver;
			 license_Tab.executeScript("arguments[0].click();", licenseTab);
			 Thread.sleep(3000);
			 //Created New State License
			 WebElement newNMLSLicense = driver.findElement(By.id("NMLSLicense"));
			 JavascriptExecutor newNMLS_License = (JavascriptExecutor)driver;
			 newNMLS_License.executeScript("arguments[0].value='';", newNMLSLicense);
			 newNMLSLicense.sendKeys("12ASTY6709HJ");
			 Thread.sleep(1000);
			 WebElement newlicenseState = driver.findElement(By.id("licenseState"));
			 newlicenseState.click();
			 newlicenseState.sendKeys("Arizona");
			 Thread.sleep(1000);
			 driver.findElement(By.id("licenseNumber")).sendKeys("ESCER45670");
			 Thread.sleep(3000);
			 driver.findElement(By.id("licenseExpiration")).sendKeys("20/07/24");
			 Thread.sleep(3000);
			 WebElement newAddLicenses = driver.findElement(By.id("addLicense"));
			 JavascriptExecutor newLicenses = (JavascriptExecutor)driver;
			 newLicenses.executeScript("arguments[0].click();", newAddLicenses);
			 Thread.sleep(3000);
			 //submitLicense
			 WebElement submitLicens = driver.findElement(By.id("submitLicense"));
			 JavascriptExecutor submit_Licens = (JavascriptExecutor)driver;
			 submit_Licens.executeScript("arguments[0].click();", submitLicens);
			 
			 // My default Loan assignment
			 Thread.sleep(5000);
			// driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div/div/div/div/div[2]/div[4]/span")).click();
		    WebElement pickSelectable = driver.findElement(By.id("pickSelectable"));
			 JavascriptExecutor pick_Selectable = (JavascriptExecutor)driver;
			 pick_Selectable.executeScript("arguments[0].click();", pickSelectable);
			 Thread.sleep(3000);
			 WebElement pickSelectableOff = driver.findElement(By.id("pickSelectable"));
			 JavascriptExecutor pick_SelectableOff = (JavascriptExecutor)driver;
			 pick_SelectableOff.executeScript("arguments[0].click();", pickSelectableOff);
			 Thread.sleep(2000);
			 driver.findElement(By.id("changeunderwriterto")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("adminto")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("accountexecutive")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("changeopenerto")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("changeprocessorto")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("changecloserto")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("changefunderto")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("changeaccountexceutiveto")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("changeservicer2to")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("changeprocesser2to")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("changeaccountingto")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("changeservicerto")).sendKeys("srikanth mvv");
			 Thread.sleep(2000);
			 driver.findElement(By.id("changedrawmanagementto")).sendKeys("srikanth mvv");
			 Thread.sleep(3000);
			 WebElement submitLoanAssignment = driver.findElement(By.id("submitLoanAssignment"));
			 JavascriptExecutor LoanAssignment = (JavascriptExecutor)driver;
			 LoanAssignment.executeScript("arguments[0].click();", submitLoanAssignment);
			 Thread.sleep(3000);
			 WebElement closeUpdatedPopup = driver.findElement(By.id("closePopupBtn"));
			 JavascriptExecutor closePopup = (JavascriptExecutor)driver;
			 closePopup.executeScript("arguments[0].click();", closeUpdatedPopup);
			 
			 System.out.println("MY DEFAULT LOAN ASSIGNMENTS");  
  }
}
