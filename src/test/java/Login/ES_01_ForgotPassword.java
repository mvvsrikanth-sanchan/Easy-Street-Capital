package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class ES_01_ForgotPassword extends BaseTest {
	
	@Test 
	public static void Forgotpassword() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.id(fpwd.getProperty("teammember_button"))).click();
		driver.findElement(By.id(fpwd.getProperty("forgotpwdButton"))).click();
		System.out.println("Email Id validation message displayed ");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id(loc.getProperty("emailid")));
		username.sendKeys(fpwd.getProperty("UserName"));
		Thread.sleep(3000);
		driver.findElement(By.id(fpwd.getProperty("forgotpwdButton"))).click();
		Thread.sleep(5000);
        System.out.println("Password sent message displayed ");
        WebElement closepopup = driver.findElement(By.id(fpwd.getProperty("popupclose")));
        closepopup.click();
        driver.close();
        

	}
}
