package pages.pagespractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderreference {
@FindBy(xpath="(//a[@class=\"color-myaccount\"])[2]")
private WebElement ordrrefnumber;

@FindBy(xpath="//a[@class=\"button btn btn-default button-medium pull-right\"]")
private WebElement reorder;

public Orderreference(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void Odernumber()
{
	ordrrefnumber.click();
	reorder.click();
}
}

