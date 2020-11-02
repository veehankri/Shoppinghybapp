package scripts.practicescripts1;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericlib.practice1.BaseTest;
import genericlib.practice1.Propertyfilepath1;
import pages.pagespractice1.Myaccountpage;
import pages.pagespractice1.Signinpage;

public class Myaccountpage1 extends BaseTest {
//public WebDriver driver;
@Test
public void Test8()
{
	Signinpage sp=new Signinpage(driver);
	sp.signincredentials(Propertyfilepath1.getpropertyfiledata1("email"), Propertyfilepath1.getpropertyfiledata1("password"));
	
	Myaccountpage mp=new Myaccountpage(driver);
	mp.getmyaccountpage();
	
}
}
