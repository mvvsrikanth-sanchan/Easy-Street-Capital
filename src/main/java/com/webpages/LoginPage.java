package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
  driver.quit();
  
  
  
  
  
	}
}
