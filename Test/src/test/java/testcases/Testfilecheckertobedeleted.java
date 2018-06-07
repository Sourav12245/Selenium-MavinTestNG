package testcases;

import excelReader.Testdata;

public class Testfilecheckertobedeleted {
		public static void main(String[] args) throws Exception {
//			String s = Excelworks.readexceldata("C:\\Users\\sourav.e.ghosh\\Desktop\\HelloWorld.xlsx", 0, 1, 0);
//			System.out.println(s);
			Testdata td = new Testdata();
			
			String k = td.testdata("username_data");
			String j = td.testdata("password_data");
			System.out.println(k);
			System.out.println(j);
			
		}
}
