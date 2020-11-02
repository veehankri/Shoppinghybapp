package pages.pagespractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Autoconstant;

public class Shippingpage implements Autoconstant {
@FindBy(name="message")
private WebElement textbx;
	
@FindBy(name="processAddress")
private WebElement procedchekout2;

public Shippingpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void shipingpage(String message)
{
	textbx.sendKeys(message);
}

public void ceckout()
{
	procedchekout2.click();
}
}
