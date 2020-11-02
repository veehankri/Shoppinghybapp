package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.Propertyfile;
import pages.Loginpage;
import pages.Productblouse;

public class Prodblouse extends BaseTest {
@Test
public void findingblouse()
{
	Loginpage l=new Loginpage(driver);
	l.logincredentials(Propertyfile.getpropertyfiledata("email"), Propertyfile.getpropertyfiledata("password"));
	
	Productblouse p=new Productblouse(driver);
	p.blousename(Propertyfile.getpropertyfiledata("Prodname"));
	p.blouse();
	
}
}

