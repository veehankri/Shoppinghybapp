package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirtsizepage {
@FindBy(id="group_1")
private WebElement shirtsize;

public WebElement getShirtsize() {
	return shirtsize;
}

@FindBy(xpath="//span[.='Add to cart']")
private WebElement addcart;

@FindBy(xpath="//a[@title='Proceed to checkout']")
private WebElement checkout;

public Tshirtsizepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void shirtsiz()
{
  addcart.click();	
  checkout.click();
}
}
