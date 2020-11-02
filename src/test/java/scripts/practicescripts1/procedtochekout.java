package scripts.practicescripts1;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericlib.practice1.BaseTest;
import genericlib.practice1.Propertyfilepath1;
import pages.pagespractice1.Checkout;
import pages.pagespractice1.Orderhistory1;
import pages.pagespractice1.Orderreference;
import pages.pagespractice1.Signinpage;

public class procedtochekout extends BaseTest {
@Test
public void Test15()
{
	Signinpage s=new Signinpage(driver);
	s.signincredentials(Propertyfilepath1.getpropertyfiledata1("email"),Propertyfilepath1.getpropertyfiledata1("password"));
	
	Orderhistory1 oh=new Orderhistory1(driver);
	oh.oderhistory();
	
	Orderreference rf=new Orderreference(driver);
	rf.Odernumber();
	
	Checkout ck=new Checkout(driver);
	ck.checout();
}
}
