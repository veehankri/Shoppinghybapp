package scripts.practicescripts1;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericlib.practice1.BaseTest;
import genericlib.practice1.Propertyfilepath1;
import pages.pagespractice1.Signinpage;

public class Signinpractice1 extends BaseTest{
	@Test
public void Test7()
{
Signinpage s=new Signinpage(driver);
s.signincredentials(Propertyfilepath1.getpropertyfiledata1("email"),Propertyfilepath1.getpropertyfiledata1("password"));
}

}
