package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceedcheckout {
@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
private WebElement proceed;


public Proceedcheckout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void checkoutmethod()
{
	proceed.click();
}
}
