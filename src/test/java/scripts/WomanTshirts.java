package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.Propertyfile;
import genericlib.Utilities;
import pages.Checkoutpage;
import pages.Confirmationpage;
import pages.Loginpage;
import pages.Paymentpage;
import pages.Proceedcheckout;
import pages.Termspage;
import pages.Tshirtsizepage;
import pages.Tshirtspage;
import pages.Womanclothes;

public class WomanTshirts extends BaseTest {
@Test
public void getwomantshirts()
{
  Loginpage l=new Loginpage(driver);
  l.logincredentials(Propertyfile.getpropertyfiledata("email"), Propertyfile.getpropertyfiledata("password"));
  
  Womanclothes w=new Womanclothes(driver);
  Utilities.mousehover(driver, w.getWomen());
  w.womantshirts();

  Tshirtspage t=new Tshirtspage(driver);
  t.selecttshirt();
  
Tshirtsizepage p=new Tshirtsizepage(driver);
  Utilities.dropdown(p.getShirtsize(), Propertyfile.getpropertyfiledata("shirtsize"));
  p.shirtsiz();
  
  Proceedcheckout c=new Proceedcheckout(driver);
  c.checkoutmethod();
  
  Checkoutpage k=new Checkoutpage(driver);
  k.proceedcheckout();
  
  
  Termspage g=new Termspage(driver);
  g.checkconditions();
  
  Paymentpage m=new Paymentpage(driver);
  m.payment();
  
  Confirmationpage f=new Confirmationpage(driver);
  f.confirmorder();
  
}
}
