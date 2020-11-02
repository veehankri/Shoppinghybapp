package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.Propertyfile;
import genericlib.Utilities;
import pages.Cartpage;
import pages.Homepage;
import pages.Loginpage;
import pages.Productpage;
//import pages.Productpage;

public class Addingproductcart extends BaseTest {
	@Test
	public void addingtocart() {
		Loginpage l = new Loginpage(driver);
		l.logincredentials(Propertyfile.getpropertyfiledata("email"), Propertyfile.getpropertyfiledata("password"));

		Homepage h = new Homepage(driver);
		h.searchProduct(Propertyfile.getpropertyfiledata("productname"));

        Productpage p = new Productpage(driver);
		Utilities.dropdown(p.getSort(), Propertyfile.getpropertyfiledata("productsort"));
		p.selectproduct();

		Cartpage c = new Cartpage(driver);
		c.plusbtn();
		Utilities.dropdown(c.getSizedd(), Propertyfile.getpropertyfiledata("size"));
		c.addingproductcart();

		Assert.assertEquals(driver.getTitle(), Propertyfile.getpropertyfiledata("proceedtocheckout"));
	}
}	

