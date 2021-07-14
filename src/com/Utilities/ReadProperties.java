package com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

	
public class ReadProperties {
	
	Properties prop;
	
	public ReadProperties() {
			
		try {
			
			FileInputStream	file1 = new FileInputStream (System.getProperty("user.dir")+ "\\src\\properties\\prop.properties");
			prop = new Properties();
			prop.load(file1);
		
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
			
	}
	
	public String getTestUrl(){
		
		String url = prop.getProperty("TEST_URL");
		return url;
	}
	
}
