package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadxlsData;

public class ES_02_Login extends BaseTest {
	
	@Test(dataProviderClass  =ReadxlsData.class,dataProvider = "loginData")
	
	
	public static void login(String username,String Password) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("teammember_button"))).click();
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.id(loc.getProperty("Login_button")));
		login.click();
		System.out.println("Validations for user name and password displayed");
		WebElement UserName = driver.findElement(By.id(loc.getProperty("emailid")));
		UserName.sendKeys(username);
		login.click();
		Thread.sleep(3000);
		System.out.println("Validations for Password displayed");
		UserName.clear();
		WebElement password = driver.findElement(By.id(loc.getProperty("pwd_field")));
		password.sendKeys(Password);
		Thread.sleep(3000);
		login.click();
	
		System.out.println("Logged in successfully");

	}



}
		

