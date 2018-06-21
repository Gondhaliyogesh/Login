package KD_Eassignment.Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadProperties
{

	public String getPropertiesData(String key) throws Exception
	{
		FileInputStream fi=new FileInputStream("E:\\BinaryBridge\\KeywordDriven\\Login\\conf.properties");
		Properties p=new Properties();
		p.load(fi);
		return p.getProperty(key);
			
	}

}
