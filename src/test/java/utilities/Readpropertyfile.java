package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;



public class Readpropertyfile {
  @Test
  
  public void propertyfile() throws IOException {
	  FileReader file = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");  
	  Properties pro = new Properties();
	  pro.load(file);
	  System.out.println(pro.getProperty("browser"));
	  System.out.println(pro.getProperty("testurl"));
  }
}
