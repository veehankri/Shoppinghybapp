package genericlib.practice1;

//import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//import org.openqa.selenium.OutputType;
import org.testng.Reporter;

public class Propertyfilepath1 implements Autoconstant1 {
public static String getpropertyfiledata1(String keyvalue)
{
Properties p=new Properties();
try
{
p.load(new FileInputStream(Propertyfilepath));
}
catch(Exception e)
{
Reporter.log("Data is not taken from the property file",true);
}
return p.getProperty(keyvalue);
}
}

