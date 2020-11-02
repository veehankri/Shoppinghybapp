package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmationpage {
@FindBy(xpath="//span[.='I confirm my order']")
private WebElement confirm;

public Confirmationpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void confirmorder()
{
	confirm.click();
}
}
