package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldeta {

	public static void main(String[] args) throws Throwable {
		
		
		File file = new File("./target/datanames.xlsx");
		
		//System.out.println(file.exists());
		
		FileInputStream stream = new FileInputStream(file);
		
	      XSSFWorkbook workbook = new XSSFWorkbook(stream);
	
	     XSSFSheet  sheet  =workbook.getSheet("Sheet1");
	     
	      sheet.getPhysicalNumberOfRows();
		
		

	}

}
