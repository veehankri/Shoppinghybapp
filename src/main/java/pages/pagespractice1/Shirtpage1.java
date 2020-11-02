package pages.pagespractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shirtpage1 {
@FindBy(xpath="(//a[@class='product-name'])[3]")
private WebElement shirtnamebtn;

public Shirtpage1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickonshirt()
{
	shirtnamebtn.click();
}
}