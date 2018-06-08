package testcases;


import java.util.ArrayList;

import excelReader.Excelworks;

public class Testfilecheckertobedeleted{
		public static void main(String[] args) throws Exception{
			
			Excelworks ew = new Excelworks();
			ArrayList<Object> ob = new ArrayList<Object>();
//			ob.add(ew.readexceldata("C:\\Users\\sourav.e.ghosh\\Desktop\\HelloWorld.xlsx", 0, 1, 0));
//			ob.add(ew.readexceldata("C:\\Users\\sourav.e.ghosh\\Desktop\\HelloWorld.xlsx", 0, 1, 1));
//			ob.add(ew.readexceldata("C:\\Users\\sourav.e.ghosh\\Desktop\\HelloWorld.xlsx", 0, 1, 2));
			ob.add(ew.readexceldata("C:\\Users\\sourav.e.ghosh\\Desktop\\HelloWorld.xlsx", 0, 1, 2));
//			ob.add(ew.readexceldata("C:\\Users\\sourav.e.ghosh\\Desktop\\HelloWorld.xlsx", 0, 1, 4));
			
			
			System.out.println(ob.get(0));
//			System.out.println(ob.get(1));
//			System.out.println(ob.get(2));
//			System.out.println(ob.get(3));
//			System.out.println(ob.get(4));
		}
}
