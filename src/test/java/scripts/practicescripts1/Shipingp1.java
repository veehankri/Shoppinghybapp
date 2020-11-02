package scripts.practicescripts1;

import org.testng.annotations.Test;

import genericlib.practice1.BaseTest;
import genericlib.practice1.Propertyfilepath1;
import pages.pagespractice1.Checkout;
import pages.pagespractice1.Orderhistory1;
import pages.pagespractice1.Orderreference;
import pages.pagespractice1.Shippingpage;
import pages.pagespractice1.Signinpage;

public class Shipingp1 extends BaseTest {
@Test
public void Test14()
{
	Signinpage s=new Signinpage(driver);
	s.signincredentials(Propertyfilepath1.getpropertyfiledata1("email"),Propertyfilepath1.getpropertyfiledata1("password"));
	
	Orderhistory1 oh=new Orderhistory1(driver);
	oh.oderhistory();
	
	Orderreference rf=new Orderreference(driver);
	rf.Odernumber();
	
	Checkout ck=new Checkout(driver);
	ck.checout();
	
	Shippingpage sp=new Shippingpage(driver);
	sp.shipingpage(Propertyfilepath1.getpropertyfiledata1("message"));
	sp.ceckout();
	

}
}
