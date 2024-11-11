package group_exection;

import java.io.FileInputStream;
import java.util.Properties;

public class Data_utility {
	
	public String getDatafromProperties(String data) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium Folder\\credentials1.properties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
		return pobj.getProperty(data);
	}

}
