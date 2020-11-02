package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.Propertyfile;
import pages.Loginpage;

public class Loginpage1 extends BaseTest {
	@Test
	public void loginpage()
	{
		Loginpage l=new Loginpage(driver);
		l.logincredentials(Propertyfile.getpropertyfiledata("email"),Propertyfile.getpropertyfiledata("password"));
		
		
	}
	

}
