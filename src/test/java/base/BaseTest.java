package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest  {
	public static WebDriver driver;
	
	public static Properties pro = new Properties();
	public static Properties loc = new Properties();
	public static Properties fpwd = new Properties();
	public static Properties Bor = new Properties();
	public static Properties forms = new Properties();
	public static Properties creFund = new Properties();
	public static Properties Investor = new Properties();
	public static Properties FndDistribution = new Properties();
	public static Properties InvesStatement = new Properties();
	public static Properties ACH = new Properties();
	public static Properties EmailMngr = new Properties();
	public static  FileReader file;
	public static  FileReader login;
	public static  FileReader forgotpwd;
	public static FileReader borwer ;
	public static FileReader F1098;
	public static FileReader CreateFund;
	public static FileReader Invs;
	public static FileReader fnddis;
	public static FileReader Invsstmnt;
	public static FileReader ach;
	public static FileReader mngr;
	
	
 @BeforeMethod
  public void setup() throws IOException {
	  if (driver==null) {
		  
		  file = new FileReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\configfiles\\config.properties");
		  login = new FileReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\Properties\\LoginPage.properties");
		  forgotpwd = new FileReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\Properties\\ForgotPassword.properties");
		  borwer = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Borrower.properties");
		  F1098 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Form1098.properties");
		  CreateFund = new FileReader (System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\CreateFund.properties");
		  Invs = new FileReader (System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Investor.properties");
		  fnddis = new FileReader (System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\FundDistribution.properties");
		  Invsstmnt = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\InvestorStatements.properties");
		  ach = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\ACH.properties");
		  mngr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\EmailManager.properties");
		  pro.load(file);
		  loc.load(login);
		  fpwd.load(forgotpwd);
		  Bor.load(borwer);
		  forms.load(F1098);
		  creFund.load(CreateFund);
		  Investor.load(Invs);
		  FndDistribution.load(fnddis);
		  InvesStatement.load(Invsstmnt);
		  ACH.load(ach);
		  EmailMngr.load(mngr);
		  
		 
		  }
	if(pro.getProperty("browser").equalsIgnoreCase("chrome")) {
		
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 driver.get(pro.getProperty("testurl"));
		 driver.manage().window().maximize();
		
		 
		 
	 }
	 else if (pro.getProperty("browser").equalsIgnoreCase("Firefox")) {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 driver.get(pro.getProperty("testurl"));
		 driver.findElement(By.id("teamMemberButton")).click();
	 }
  }
	@AfterMethod
  public void tearDown() {
		
		
	        //  driver.close(); // Safely close the driver if it's initialized
	          System.out.println("Teardown successfully");
	 
	  }
  
}
