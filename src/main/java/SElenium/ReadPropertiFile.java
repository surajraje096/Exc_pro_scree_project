package SElenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertiFile {

	 static Properties pro;
	
	
	
	public static void main(String[] args) throws Exception {
	pro= new Properties();
	FileInputStream ip = new FileInputStream("D:\\SpringBoot API Projects\\DEmo_selenium\\src\\main\\java\\config\\config.properties");
	
		pro.load(ip);
		
		System.out.println(pro.getProperty("name"));
		
		
		
	}
	}


