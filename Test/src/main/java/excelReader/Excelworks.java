package excelReader;

import java.io.File;
import java.io.FileInputStream;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author sourav.e.ghosh
 *
 */
public class Excelworks{
	/*
	 * Read excel data
	 * Attribute:
	 * Sheetnumber: Give the sheet number
	 * rownumber: Provide the row number to retrive the data
	 * colnumber: Provide the column number to retrive the data
	 */
		
		public ArrayList<Object> readexceldata(String fileloc,int Sheetnumber, int rownumber, int colnumber) throws Exception{
			File src = new File(fileloc);
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(Sheetnumber);
			String data = sheet.getRow(rownumber).getCell(colnumber).getStringCellValue(); 
			ArrayList<Object> ar = new ArrayList<Object>();
//			ar.add(data);
			System.out.println(data);
			return ar;
			
		}



}

