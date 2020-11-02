package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
@FindBy(xpath="//span[.='Proceed to checkout']")
private WebElement checkout;

public Checkoutpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void proceedcheckout()
{
	checkout.click();
}
}
