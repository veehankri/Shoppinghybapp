package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.Propertyfile;
import pages.Loginpage;
import pages.Orderhistorypage;

public class Orderplacinghistory extends BaseTest {
@Test

public void placedorder()
{
	Loginpage l=new Loginpage(driver);
	l.logincredentials(Propertyfile.getpropertyfiledata("email"), Propertyfile.getpropertyfiledata("password"));
	
	Orderhistorypage o=new Orderhistorypage(driver);
	o.orderhistory();
}
}

	

