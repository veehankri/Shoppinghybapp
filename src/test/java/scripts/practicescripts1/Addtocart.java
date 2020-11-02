package scripts.practicescripts1;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericlib.practice1.BaseTest;
import genericlib.practice1.Propertyfilepath1;
//import genericlib.practice1.Utilities;
import pages.pagespractice1.Myaccountpage;
import pages.pagespractice1.Shirtpage1;
import pages.pagespractice1.Signinpage;

public class Addtocart extends BaseTest {
//public WebDriver driver;
@Test
public void Test10()
{
	Signinpage s2=new Signinpage(driver);
	s2.signincredentials(Propertyfilepath1.getpropertyfiledata1("email"), Propertyfilepath1.getpropertyfiledata1("password"));
    
	Myaccountpage mp=new Myaccountpage(driver);
	mp.getmyaccountpage();
	
	Shirtpage1 sp1=new Shirtpage1(driver);
	sp1.clickonshirt();
}
}
