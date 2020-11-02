package genericlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

 public class Propertyfile implements Autoconstant
  {	
   public static String getpropertyfiledata(String keyvalue)
	{
		Properties p=new Properties();
		try
		{
		p.load(new FileInputStream(propertyfilepath));
		}
	catch(Exception e)
		{
			Reporter.log("Data is not taken from property file",true);
		}
		return p.getProperty(keyvalue);
	}
}




