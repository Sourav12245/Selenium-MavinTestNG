package excelReader;

public class Testdata extends Excelworks{
	
	
	public String d;

	@SuppressWarnings("unused")
	public String testdata(String d) throws Exception{
		this.d = d;
		String loc = "C:\\Users\\sourav.e.ghosh\\Desktop\\HelloWorld.xlsx";
		String username_data = readexceldata(loc, 0, 1, 0);
		String password_data = readexceldata(loc, 0, 1, 1);
		return d;
	}
	
}
