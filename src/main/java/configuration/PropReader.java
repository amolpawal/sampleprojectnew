package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
	
	
	public String getPropertyValue(String name) throws IOException{
	Properties p = new Properties();
	FileInputStream fis = new FileInputStream(".\\config");
	p.load(fis);
	String property = p.getProperty(name);
	return property;
	
	}
	

}
