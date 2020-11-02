package pages.pagespractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.practice1.Autoconstant1;

public class Checkout implements Autoconstant1 {
@FindBy(xpath="(//a[@title=\"Proceed to checkout\"])[2]")
private WebElement proceedcheckout;

public Checkout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void checout()
{
	proceedcheckout.click();
}
}
