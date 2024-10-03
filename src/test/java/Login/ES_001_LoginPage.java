package Login;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ES_001_LoginPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mvvsr\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 System.out.println("browser opened");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://feature-development.d3v768j7i3fu59.amplifyapp.com/");
		  driver.findElement(By.id("teamMemberButton")).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		          // Read data from Excel file
		          FileInputStream fis = new FileInputStream(new String("C:\\Users\\mvvsr\\OneDrive\\Desktop\\workspace\\easystreet-automation\\src\\test\\resources\\TestData\\TestData.xls"));
		          XSSFWorkbook workbook = new XSSFWorkbook(fis);
		          XSSFSheet sheet = workbook.getSheetAt(0); // Get the first sheet

		          // Loop through the rows in the Excel sheet
		          for (Row row : sheet) {
		              // Assuming the first column is for the name and the second for the email
		              String name = row.getCell(0).getStringCellValue();
		              String email = row.getCell(1).getStringCellValue();

		              // Navigate to the web form
		              

		              // Fill the form
		              WebElement nameField = driver.findElement(By.id("username")); // Adjust selector as necessary
		              WebElement emailField = driver.findElement(By.id("loginPassword")); // Adjust selector as necessary
		              nameField.sendKeys(name);
		              emailField.sendKeys(email);

		              // Submit the form
		              WebElement submitButton = driver.findElement(By.id("loginButton")); // Adjust selector as necessary
		              submitButton.click();

		              // Optionally wait for the response or next page to load
		              // Thread.sleep(2000); // Use WebDriverWait for better practice

		              // You may need to handle navigation back to the form, depending on the website behavior
		          }

		          // Close the workbook and the driver
		          workbook.close();
		          fis.close();
		          driver.quit();
		      }
		  

	}


