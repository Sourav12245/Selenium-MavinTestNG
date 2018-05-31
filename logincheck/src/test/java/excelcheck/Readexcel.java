package excelcheck;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readexcel {
	
	@Test
	public void readstuff() throws IOException{
		File src = new File("C:\\Users\\sourav.e.ghosh\\Desktop\\HelloWorld.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wna = new XSSFWorkbook(fis);
		XSSFSheet sheet = wna.getSheetAt(0);
		for(int i = 0;i<sheet.getLastRowNum();i++) {
			String data = sheet.getRow(i).getCell(0).getStringCellValue();
			String data2 = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data +" : " +data2);
		}
	}
}
