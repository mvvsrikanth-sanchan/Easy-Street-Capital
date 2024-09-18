package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codeborne.selenide.Driver;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;

public class newBorrower_Purchasing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		  
		  
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  System.out.println("URL opened ");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/button[1]")).click();
		  System.out.println("Purchasing selected");
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/button[1]")).click();
		  System.out.println("I submitted an offer I feel good about is selected");
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div/button[2]")).click();
		  System.out.println("Purchasing selected");
		  Thread.sleep(2000);
		WebElement address=driver.findElement(By.xpath("//input[@class='form-control searchcontroll pac-target-input' and @name='location']\r\n"
		  		+ ""));
		 address.sendKeys("Aurora CO");
		 Thread.sleep(2000);
		 //address.click();
		 
		address.sendKeys(Keys.DOWN);
		
		 address.sendKeys(Keys.ENTER);
		 //address.sendKeys(Keys.TAB);
		// address.sendKeys(Keys.ENTER);*/
	  System.out.println("Address entered");
		  Thread.sleep(2000);
		
	 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/div[2]/button")).click();
		// driver.findElement(By.className("cp_btn")).click();
		 // System.out.println("Clicked on Next"); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/ul")).click();
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[3]/img")).click();
		  driver.findElement(By.xpath("//input[@name='purchaseprice']")).sendKeys("89000");
		  driver.findElement(By.xpath("//input[@name='constructionbudget']")).sendKeys("40000");
		  driver.findElement(By.xpath("//input[@name='propertyarea']")).sendKeys("1400");
		  driver.findElement(By.xpath("//input[@name='totalbedrooms']")).sendKeys("3");
		  driver.findElement(By.xpath("//input[@name='totalbathrooms']")).sendKeys("4");
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[7]/div/button[2]']")).click();
		  driver.findElement(By.xpath("//input[@name='lotarea']")).sendKeys("1600");
		  driver.findElement(By.xpath("//input[@name='completedvalue']")).sendKeys("50000");
		  driver.findElement(By.xpath("//input[@name='constructioncompleteddate']")).sendKeys("2024-09-23");
		  driver.findElement(By.className("cp_btn mt-10")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/button[1]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/button[2]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[3]/button[3]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.className("form-control")).sendKeys("Need not required");
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[4]/button")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.className("borrowerfirstname")).sendKeys("Rajiv");
		  
		  driver.findElement(By.className("borrowerlastname")).sendKeys("Kumar");
		  driver.findElement(By.className("borroweremail")).sendKeys("Rajiv67@yopmail.com");
		  
		  driver.findElement(By.className("borrowerphone")).sendKeys("9989794636");
		  
		  driver.findElement(By.className("borroweroccupation")).sendKeys("software employee");
		  driver.findElement(By.className("investmentproperties")).sendKeys("1");
		  driver.findElement(By.className("creditscore")).sendKeys("8");
		  driver.findElement(By.className("liquidcashreserve")).sendKeys("35000");
		  driver.findElement(By.className("accountexecutive")).sendKeys("Not working with anyone currently");
		  driver.findElement(By.className("referredBy")).sendKeys("Other");
		  driver.findElement(By.xpath("//input[@name='borroweraddress']")).sendKeys("Aurora, IL");
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[12]/div/div/button[2]")).click();
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[13]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/p/a")).click();
		  
		  driver.close();
		  

	}
	

}
