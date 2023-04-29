package com.genvideo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src= new File("./Configuration/Config.properties");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getApplicationURL() {
		
		String url= pro.getProperty("baseUrl");
		return url;
	}
	
    public String getUserName() {
		
		String username= pro.getProperty("userName");
		return username ;
	}

    public String getPassword() {
		
		String password= pro.getProperty("pass");
		return password ;
	}

	

}
