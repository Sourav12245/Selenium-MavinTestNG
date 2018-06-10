package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testfilecheckertobedeleted{
		public static void main(String[] args) throws Exception{
			
			System.out.println(testdata().get(0));
			System.out.println(testdata().get(1));
			System.out.println(testdata().get(2));
			System.out.println(testdata().get(3));
			System.out.println(testdata().get(4));
			System.out.println(testdata().get(5));
			System.out.println(testdata().get(6));
			System.out.println(testdata().get(7));
			System.out.println(testdata().get(8));
			System.out.println(testdata().get(9));
			System.out.println(testdata().get(10));
			
			
		}
		
		public static ArrayList<Object> readstuff(String loc,int Sheetnumber,int rownumber, int colnumber) throws Exception{
			
			File src = new File(loc);
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(Sheetnumber);
			ArrayList<Object> singleRows = new ArrayList<Object>();
			Cell s = sheet.getRow(rownumber).getCell(colnumber);
			if(sheet.getRow(rownumber).getCell(colnumber).getCellType() == 1){
				String data = sheet.getRow(rownumber).getCell(colnumber).getStringCellValue();
				singleRows.add(data);
			}
			else{
				if(DateUtil.isCellDateFormatted(s)){
					Date data = sheet.getRow(rownumber).getCell(colnumber).getDateCellValue();
					singleRows.add(data);
				}
				else{
					double data = sheet.getRow(rownumber).getCell(colnumber).getNumericCellValue();
					singleRows.add(data);
				}
				
			}
			fis.close();
			return singleRows;
		}
		
		@SuppressWarnings("unused")
		public static ArrayList<Object> testdata() throws Exception{
			String loca = "C:\\Users\\Sourav\\Desktop\\HelloTeam.xlsx";
			ArrayList<Object> sr = new ArrayList<Object>();
			Object name = sr.add(readstuff(loca,0,1,0));
			Object surname = sr.add(readstuff(loca,0,1,1));
			Object age = sr.add(readstuff(loca,0,1,2));
			Object sex = sr.add(readstuff(loca,0,1,3));
			Object phonenumber = sr.add(readstuff(loca,0,1,4));
			Object cardnumb = sr.add(readstuff(loca,0,1,5));
			Object place = sr.add(readstuff(loca,0,1,6));
			Object flatnumb = sr.add(readstuff(loca,0,1,7));
			Object grade = sr.add(readstuff(loca,0,1,8));
			Object marks = sr.add(readstuff(loca,0,1,9));
			Object date = sr.add(readstuff(loca,0,1,10));
			
			return sr;
		}
}
