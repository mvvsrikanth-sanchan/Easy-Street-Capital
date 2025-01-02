package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.testng.annotations.DataProvider;



public class ReadxlsData {

	/*public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ReadxlsData read = new ReadxlsData();
		read.getData("Login");
	}*/
	@DataProvider(name= "loginData") 
 public String[][] getData(Method m) throws EncryptedDocumentException, IOException {
	String excelSheetName = m.getName();
	 File f = new File (System.getProperty("user.dir") +"\\src\\test\\resources\\TestData\\TestData.xls");
	 FileInputStream fis = new FileInputStream(f);
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sheetName = wb.getSheet(excelSheetName);
	 
	 int totalRows = sheetName.getLastRowNum();
	// System.out.println(totalRows);
	 Row rowCells = sheetName.getRow(0);
	 int totalcols =rowCells.getLastCellNum();
	// System.out.println(totalcols);
	 
	 DataFormatter format = new DataFormatter();
	 String testData[][] = new String [totalRows][totalcols] ;
	 for (int i = 1; i<=totalRows;i++ )
		{
			for (int j=0;j<totalcols;j++) {
				testData [i-1][j] = format.formatCellValue(sheetName.getRow(i).getCell(j)) ;
			//	System.out.println(testData [i-1]  [j]);
			}
			}
		return testData;
		}
}

		 
 

