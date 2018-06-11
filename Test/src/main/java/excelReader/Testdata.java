package excelReader;

import java.util.ArrayList;

public class Testdata extends Excelworks{

	
	public static ArrayList<String> testdatalogin() throws Exception{
		String loc = "C:\\Users\\sourav.e.ghosh\\Desktop\\HelloWorld.xlsx";
		ArrayList<String> ao = new ArrayList<String>();
		ao.add(readexceldata(loc, 0, 1, 0));
		ao.add(readexceldata(loc, 0, 1, 1));
		return ao;
	}
	
}
