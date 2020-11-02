package scripts;

	import org.testng.annotations.Test;

	import genericlib.BaseTest;
	import genericlib.Propertyfile;
	import pages.Homepage;
	import pages.Loginpage;

	import pages.Wishlistpage;

	public class Whishlistpage extends BaseTest {
	@Test
	public void Test2()
	{
		
	Loginpage l=new Loginpage(driver);
	l.logincredentials(Propertyfile.getpropertyfiledata("email") , Propertyfile.getpropertyfiledata("password"));

	Homepage h=new Homepage(driver);
	h.wishlistbutton();

    Wishlistpage w=new Wishlistpage(driver);
	w.savenamewishlist(Propertyfile.getpropertyfiledata("name"));
	}

}
