package genericlib.practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

import genericlib.Photo;
//import genericlib.Propertyfile;

public class BaseTest implements Autoconstant1
{
public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty(key, value);
	driver=new ChromeDriver();
	driver.get(Propertyfilepath1.getpropertyfiledata1("URL"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

@AfterMethod
public void closeapp(ITestResult r)
{
	int Status = r.getStatus();
	String name=r.getName();
	if(Status==2)
	{
		Photo.getphoto(driver, name);
	}
	driver.close();
}
}

