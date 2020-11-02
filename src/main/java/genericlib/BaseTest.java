package genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;

public class BaseTest implements Autoconstant {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.get(Propertyfile.getpropertyfiledata("url"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeApp(ITestResult r)
	{
	    int status=r.getStatus();
	    String name=r.getName();
	    if(status==2)
	    {
	    	Photo.getphoto(driver, name);
	    }
		driver.close();
	}
}


