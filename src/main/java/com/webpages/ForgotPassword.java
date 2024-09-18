package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mvvsr\\\\OneDrive\\\\Desktop\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  System.out.println("URL opened ");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/login");
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/form/div[4]/a")).click();
		  System.out.println("Invalid email id message");
		  driver.findElement(By.id("username")).sendKeys("mvvsrikanth@sanchaninfo.com");
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div/div[2]/form/div[4]/a")).click();
		  Thread.sleep(5000);
		  System.out.println("Display pop up message successful message");
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/p/a")).click();
		  System.out.println("pop up message closed ");
		  driver.close();
		  
		  
		  
		  
		  
		  
		  
	}

}
