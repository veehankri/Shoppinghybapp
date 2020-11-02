package scripts.practicescripts1;

import org.testng.annotations.Test;

import genericlib.practice1.BaseTest;
import genericlib.practice1.Propertyfilepath1;
import genericlib.practice1.Utilities;
//import pages.pagespractice1.Checkout;
import pages.pagespractice1.Dressespage;
//import pages.pagespractice1.Orderhistory1;
//import pages.pagespractice1.Orderreference;
import pages.pagespractice1.Signinpage;

public class Dresespage1 extends BaseTest {
@Test
public void Test15()
{
	Signinpage s=new Signinpage(driver);
	s.signincredentials(Propertyfilepath1.getpropertyfiledata1("email"),Propertyfilepath1.getpropertyfiledata1("password"));
	
	Dressespage dp=new Dressespage(driver);
	Utilities.mousehover(driver,dp.getDreses());
}
}

