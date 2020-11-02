package scripts.practicescripts1;

import org.testng.annotations.Test;

import genericlib.practice1.BaseTest;
import genericlib.practice1.Propertyfilepath1;
//import pages.pagespractice1.Myaccountpage;
import pages.pagespractice1.Orderhistory1;
//import pages.pagespractice1.Productpage;
//import pages.pagespractice1.Shirtpage1;
import pages.pagespractice1.Signinpage;

public class Orderhistory extends BaseTest {
@Test
public void Test12()
{
	Signinpage sp=new Signinpage(driver);
	sp.signincredentials(Propertyfilepath1.getpropertyfiledata1("email"),Propertyfilepath1.getpropertyfiledata1("password"));
	
	Orderhistory1 oh=new Orderhistory1(driver);
	oh.oderhistory();
}

}
