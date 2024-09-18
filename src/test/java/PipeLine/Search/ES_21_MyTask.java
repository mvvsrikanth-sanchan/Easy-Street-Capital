package PipeLine.Search;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ES_21_MyTask {
  @Test
  public void MyTask() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		 
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
	    
	   WebElement MyTask = driver.findElement(By.id("myTasks"));
	   
	    JavascriptExecutor Task = (JavascriptExecutor)driver; 
	    Task.executeScript("arguments[0].click();", MyTask);
	
	    Thread.sleep(3000);
	      WebElement  Create =  driver.findElement(By.className("create_btn"));
	  JavascriptExecutor CreateTask = (JavascriptExecutor)driver;
	  CreateTask.executeScript("arguments[0].click();", Create);
	    Thread.sleep(3000);
	   //CANCEL ADDING TASK
	    WebElement Cancel =  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div[7]/div/a"));
	    JavascriptExecutor Click = (JavascriptExecutor)driver;
	    Click.executeScript("arguments[0].click();", Cancel);
	    Thread.sleep(3000);
	    System.out.println("Displayed validations for Cancellation of task");
	  
	     WebElement  AddTask =  driver.findElement(By.className("create_btn"));
		  JavascriptExecutor Create_Tasks = (JavascriptExecutor)driver;
		  Create_Tasks.executeScript("arguments[0].click();", AddTask);
		 
	    // ADD TO TASK 
		  Thread.sleep(3000);
		  WebElement AddToTask =  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div[7]/div/button"));
		    JavascriptExecutor Task2 = (JavascriptExecutor)driver;
		    Task2.executeScript("arguments[0].click();", AddToTask);
		    Thread.sleep(3000);
	    
	    System.out.println("Validations for Add Task Displayed");
	   
	    // Assigned To Users
	    WebElement AssignedTo =driver.findElement(By.name("assignedTo"));
	    AssignedTo.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    AssignedTo.sendKeys("srikanth mvv");
	    AssignedTo.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    //default Assignment
	   WebElement DefaultsAssignments= driver.findElement(By.id("defaultAssignment"));
	   DefaultsAssignments.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	   DefaultsAssignments.sendKeys("Opener");
	   DefaultsAssignments.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	    //Due Date 
	   
	  WebElement DatePick = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div[2]/div/div[3]/div/div[1]/div/input"));
	   JavascriptExecutor Date = (JavascriptExecutor)driver;
	   Date.executeScript("arguments[0].click();", DatePick);
	   Thread.sleep(3000);
	   WebElement MonthPicker = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div/button"));
	   JavascriptExecutor Month_Picker = (JavascriptExecutor)driver;
	   Month_Picker.executeScript("arguments[0].click();", MonthPicker);
	   Thread.sleep(5000);
	   WebElement DatePicker = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div/div[3]/div/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/div[3]"));
	   JavascriptExecutor Date_Picker = (JavascriptExecutor)driver;
	   Date_Picker.executeScript("arguments[0].click();", DatePicker);
	   Thread.sleep(5000);
	
	    //Email On Task Completion
	 
	    WebElement   EmailId=driver.findElement(By.name("emailid"));
	    EmailId.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    EmailId.sendKeys("Underwriter");
	    EmailId.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    //Loan ID 
	    WebElement  LoanId = driver.findElement(By.id("task-loanid"));
	    JavascriptExecutor Loan_Id = (JavascriptExecutor)driver;
	    Loan_Id.executeScript("arguments[0].click();", LoanId);
	    Thread.sleep(3000);
	    LoanId.sendKeys("300200");
	    LoanId.sendKeys(Keys.ARROW_DOWN);
	    LoanId.sendKeys(Keys.ENTER);
	    Thread.sleep(3000); 
	    //TASK NOTES
	    WebElement  TaskNote = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div[6]/div/div/div[2]"));
	    JavascriptExecutor AddTask1 = (JavascriptExecutor)driver;
	    AddTask1.executeScript("arguments[0].click();", TaskNote);
	    Thread.sleep(3000);
	    TaskNote.sendKeys("Add Task");
	    Thread.sleep(3000);
	    WebElement SaveTask =  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div/div[2]/div/div[3]/div/div/div[2]/div/div[7]/div/button"));
	    JavascriptExecutor Save_Task = (JavascriptExecutor)driver;
	    Save_Task.executeAsyncScript("arguments[0].click();", SaveTask);
	    
  }


}

