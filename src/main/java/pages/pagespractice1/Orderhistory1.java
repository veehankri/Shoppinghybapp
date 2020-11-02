package pages.pagespractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.practice1.Autoconstant1;

public class Orderhistory1 implements Autoconstant1 {
@FindBy(xpath="//span[.='Order history and details']")
private WebElement history;

public Orderhistory1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void oderhistory()
{
	history.click();
}
}
