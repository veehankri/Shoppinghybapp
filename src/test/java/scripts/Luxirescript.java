package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.Propertyfile;
import genericlib.Utilities;
import pages.Loginpage;
import pages.Luxireloginpage;
import pages.Luxiremyaccountpage;
import pages.Luxireregisteredcustomers;

public class Luxirescript extends BaseTest {
@Test
public void luxscr()
{
	Loginpage l=new Loginpage(driver);
	l.logincredentials(Propertyfile.getpropertyfiledata("email"), Propertyfile.getpropertyfiledata("password"));
	
	Luxireloginpage lx=new Luxireloginpage(driver);
	lx.Luxire1();
    Utilities.mousehover(driver,lx.getAccount());
	lx.Luxire1();

	Luxireregisteredcustomers lc=new Luxireregisteredcustomers(driver);
	lc.luxirecustomers(Propertyfile.getpropertyfiledata("email"),Propertyfile.getpropertyfiledata("password"));
	lc.luxirecustomers1();
	
	Luxiremyaccountpage ap=new Luxiremyaccountpage(driver);
	Utilities.mousehover(driver, ap.getAccountsignout());
	ap.luxaccount();
	
	
}
}
