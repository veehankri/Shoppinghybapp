package genericlib.practice1;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;


public class Photopath implements Autoconstant1
{
public static void getphoto(WebDriver driver,String name)
{
	Date d=new Date();
	String date=d.toString().replaceAll(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(Photopath+name+date+ ".png");
	try
	{
	FileUtils.copyFile(src,dest);
	}
	catch(Exception e)
	{
	Reporter.log("photo can not be taken", true);
	}
}
}


