package utilities;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.codeborne.selenide.commands.TakeScreenshot;

import base.BaseTest;



public class Testutils extends BaseTest {
  @Test
  public void getscreenshots() throws IOException {
	  Date currentdate = new Date();
	  String ScreenshotfileName = currentdate.toString().replace(" ", ".").replace(":", "-");
	  System.out.println(ScreenshotfileName);
	  TakesScreenshot Capture = (TakesScreenshot) driver;
      File Screenshot = Capture.getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(Screenshot, new File(".//screenshot//" + ScreenshotfileName + ".png"));
	  
  }
}
