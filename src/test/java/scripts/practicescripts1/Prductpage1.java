package scripts.practicescripts1;

import org.openqa.selenium.By;
import org.testng.Assert;
//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericlib.practice1.BaseTest;
import genericlib.practice1.Propertyfilepath1;
import genericlib.practice1.Utilities;
import pages.pagespractice1.Myaccountpage;
import pages.pagespractice1.Productpage;
import pages.pagespractice1.Shirtpage1;
import pages.pagespractice1.Signinpage;

public class Prductpage1 extends BaseTest{
@Test
public void Test11() throws InterruptedException
{
Signinpage sg=new Signinpage(driver);
sg.signincredentials(Propertyfilepath1.getpropertyfiledata1("email"), Propertyfilepath1.getpropertyfiledata1("password"));

Myaccountpage ma=new Myaccountpage(driver);
ma.getmyaccountpage();

Shirtpage1 sp1=new Shirtpage1(driver);
sp1.clickonshirt();

Productpage pg=new Productpage(driver);
Thread.sleep(10000);
driver.switchTo().frame(0);
Thread.sleep(5000);
for(int i=0;i<=2;i++)
{
//pg.plus();
	driver.findElement(By.xpath("//i[@class=\\\"icon-plus\\\"]")).click();
  
}

Utilities.dropdown(pg.getSizebtn(), Propertyfilepath1.getpropertyfiledata1("size"));
Assert.assertEquals(pg.getSizebtn(), Propertyfilepath1.getpropertyfiledata1("size"));
}
}






