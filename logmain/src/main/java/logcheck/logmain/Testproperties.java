package logcheck.logmain;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Testproperties {
	static Properties prop;
	static Logger log = Logger.getLogger("Testproperties");
	public static void loaddata() throws IOException{
		prop = new Properties();
		File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\configfiles\\config.properties");
		FileReader obj = new FileReader(f);
		prop.load(obj);
	}
	
	public static String nameofdata(String name) throws IOException{
		loaddata();
		String n = prop.getProperty(name);
		log.debug(name+": data was sent back from the config file");
		return n;
	}
}
